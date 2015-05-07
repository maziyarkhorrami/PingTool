/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pingtool.logic;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author mazy
 */
public class IpFieldWorker extends SwingWorker<Void, Integer> {

    private JLabel ipAdress;
    private JLabel ipAvailability;
    protected Geraete geraeteOne;
    protected Integer ipInterval;
    protected Integer ipSchwellwert;
    protected String ipName;
    protected Integer ipMaxSequentiality;
    protected Integer ipNotAvailableSeconds;
    protected Integer ipNotAvailableCounter;
    protected Integer ipAvailableCounter;
    protected Integer ipAvailableSeconds;
    protected Integer ipMaxAvailablity;
    protected Integer ipMaxNotAvailablity;
    protected double ipFontScale;
    protected String ipEMail;
    protected boolean clearFlag;
    protected HashMap<Double, Integer> hashMap = new HashMap<Double, Integer>();
    private volatile boolean stopRequested = false;
    
    

    public IpFieldWorker(JLabel ipIPAdress, JLabel ipAvailability, Integer ipIntervalValue,
            Integer ipSchwellwert, Integer ipMaxSequentiality, String ipName, String ipEMail) {
        this.ipAdress = ipIPAdress;
        this.ipInterval = ipIntervalValue;
        this.ipSchwellwert = ipSchwellwert;
        this.ipMaxSequentiality = ipMaxSequentiality;
        this.ipName = ipName;
        this.ipAvailability = ipAvailability;
        this.ipEMail = ipEMail;
    }

    @Override
    protected Void doInBackground() throws Exception {

        ipNotAvailableSeconds = 0;
        ipAvailableSeconds = 0;
        ipMaxAvailablity = 0;
        ipMaxNotAvailablity = 0;
        ipNotAvailableCounter = 0;
        ipAvailableCounter = 0 ; 
        
        

        for (int i = 0 ; i < 200 ; i++) {
            
            IpFieldWorker.failIfInterrupted();

            try {
                Thread.sleep(ipInterval * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Ping pingONE = new Ping();
            pingONE.erreichbarkeit();
            boolean ping1result = pingONE.isRandomBoolean();
            //Accesible

            if (ping1result == true) {
                ipAvailableCounter++;
                ipNotAvailableSeconds = 0;
                ipNotAvailableCounter = 0 ; 
                ipAvailableSeconds = ipAvailableSeconds + ipInterval;
                //Change font with scale
                if (ipAvailableSeconds > ipMaxAvailablity) {
                    ipMaxAvailablity = ipAvailableSeconds;
                }
                // Change Font Scale , second element in the list
                Integer availableFontScale = changeFontScale(ipMaxAvailablity, ipAvailableSeconds);
                
                // ip was Available (ipMaxSequentiality) sequentially AND the Threshold time
                if (ipAvailableCounter == ipMaxSequentiality && ipAvailableSeconds <= ipSchwellwert) {
                    // send CLEAR email ; Update ipAvailability's text to "CLEAR email" ; Change ipAdress Color to Blue
                    publish(1, availableFontScale, 1);
                     sendClearEmail();
                    System.out.println("green");
                } else {
                    // Update ipAvailability's text to ipErreichbarSeconds's variable ; Change ipAdress Color to White
                    publish(2, availableFontScale, 1);

                }

                //Not Accesible
            } else {
                ipNotAvailableCounter++;
                ipAvailableSeconds = 0;
                ipAvailableCounter = 0; 
                ipNotAvailableSeconds = ipNotAvailableSeconds + ipInterval;
               
                if (ipNotAvailableSeconds > ipMaxNotAvailablity) {
                    ipMaxNotAvailablity = ipNotAvailableSeconds;
                }
                Integer notAvailableFontScale = changeFontScale(ipMaxNotAvailablity, ipNotAvailableSeconds);

                // mehrfach (ipMaxNotAvailableSeq) nicht erreichbar ODER überschreiten des Schwellwerts
                if(ipNotAvailableCounter == ipMaxSequentiality || ipNotAvailableSeconds > ipSchwellwert){
                    // send ALARM email ; Update ipAvailability's text to "ALARM email" ; Change ipAdress Color to Red
                    publish(0, notAvailableFontScale, 0);
                    System.out.println("red");
                    sendAlarmEmail();
                }
                else {
                    // Update ipAvailability's text to ipNichtErreichbarSeconds's variable ; Change ipAdress Color to White
                    ipAdress.setBackground(Color.white);
                    publish(2, notAvailableFontScale, 0);
                }

            }
//            setProgress((i + 1) * 100 / 200);
        }
        return null;
    }

    protected void process(final List<Integer> chunks) {
        // Updates the ip Field with color, size and 

        Integer firstElement = chunks.get(0);
        Integer secondElement = chunks.get(1);
        Integer thirdElement = chunks.get(2);

        
        if (firstElement == 1 && thirdElement == 1) {
            // send CLEAR email ; Update ipAvailability's text to "CLEAR email" ; Change ipAdress Color to Blue
            //1st element is 1 then Change ipAdress Color to Blue
            ipAdress.setBackground(Color.green);
            //2nd digit in the list will be passed for  font size
            Font ipOneAvailabiltylabelFont = ipAvailability.getFont();
            ipAvailability.setFont(new Font(ipOneAvailabiltylabelFont.getName(), Font.PLAIN, secondElement));
            
            //3rd element in the list if it is 1 -> CLEAR! ,
            ipAvailability.setText(" CLEAR E-Mail !");
            
            
        }
                
        if (firstElement == 2 && thirdElement == 1) {
            // Update ipAvailability's text to ipErreichbarSeconds's variable ; Change ipAdress Color to White
            ipAvailability.setText("available : " + ipAvailableSeconds.toString());
            ipAdress.setBackground(Color.white);
            // 2nd digit in the list will be passed for  font size
            Font ipOneAvailabiltylabelFont = ipAvailability.getFont();
            ipAvailability.setFont(new Font(ipOneAvailabiltylabelFont.getName(), Font.PLAIN, secondElement));
        }
        
        if (firstElement == 2 && thirdElement == 0) {
            // Update ipAvailability's text to ipNichtErreichbarSeconds's variable ; Change ipAdress Color to White
            ipAvailability.setText("not available : " + ipNotAvailableSeconds.toString());
            ipAdress.setBackground(Color.white);
            // 2nd digit in the list will be passed for  font size
            Font ipAvailabiltylabelFont = ipAvailability.getFont();
            ipAvailability.setFont(new Font(ipAvailabiltylabelFont.getName(), Font.PLAIN, secondElement));
        }

             if (firstElement == 0 && thirdElement == 0) {
            //1st element is 1 then change the color to blue
            // send ALARM email ; Update ipAvailability's text to "ALARM email" ; Change ipAdress Color to Red
              ipAdress.setBackground(Color.red);
              ipAvailability.setText(" ALARM E-Mail !");
             
            // 2nd digit in the list will be passed for  font size
             Font ipAvailabiltylabelFont = ipAvailability.getFont();
             ipAvailability.setFont(new Font(ipAvailabiltylabelFont.getName(), Font.PLAIN, secondElement));
           
            
        }


    }

    public void sendAlarmEmail() {
        String eMailTitle = " PingTool Alarm !";
        String eMailText = " The Tool \"" + ipName + "\" "
                + " with IP Adress : " + ipAdress.getText() + "  was not available for " + ipNotAvailableSeconds
                + " seconds. The reason could be one of the follwoing : "
                + " \n It was unavailable for : " + ipSchwellwert
                + " seconds or \n It was unavailable for :  " + ipMaxSequentiality
                + " times sequentially. \n\n\n Special Thanks  \n Admin ";
        EMailSender errorMail = new EMailSender();
        try {
            errorMail.send(ipEMail, eMailText, eMailTitle);
        } catch (MessagingException ex) {
            Logger.getLogger(IpFieldWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sendClearEmail() {
        String eMailTitle = " PingTool Clear !";
        String eMailText = " The Tool \"" + ipName + "\" "
                + " with IP Adress : " + ipAdress.getText() + " was available in for : " + ipAvailableSeconds + " seconds ."
                + " \n It means that it was available for "+ipMaxSequentiality
                + " times in equal or less than The threshold, which is : " + ipSchwellwert
                + "  . \n\n\n Special Thanks  \n Admin ";
        EMailSender errorMail = new EMailSender();
        try {
            errorMail.send(ipEMail, eMailText, eMailTitle);
        } catch (MessagingException ex) {
            Logger.getLogger(IpFieldWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createHashMap() {

        hashMap.put(0.1, 11);
        hashMap.put(0.2, 12);
        hashMap.put(0.3, 13);
        hashMap.put(0.4, 14);
        hashMap.put(0.5, 15);
        hashMap.put(0.6, 16);
        hashMap.put(0.7, 17);
        hashMap.put(0.8, 18);
        hashMap.put(0.9, 19);
        hashMap.put(1.0, 20);
    }

    public Integer changeFontScale(final Integer ipMaxAvailablity, final Integer ipErreichbarSeconds) {

        createHashMap();
        ipFontScale = (double) ipErreichbarSeconds / (double) ipMaxAvailablity;
        ipFontScale = round(ipFontScale, 1);
        System.out.println("font scale  " + ipFontScale);
        final Integer fontSize = (Integer) hashMap.get(ipFontScale);

        // put it in process unction
        System.out.println("font scale value  " + hashMap.get(ipFontScale));

        return fontSize;

    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private static void failIfInterrupted() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException("Interrupted while changing...");
        }
    }
}
