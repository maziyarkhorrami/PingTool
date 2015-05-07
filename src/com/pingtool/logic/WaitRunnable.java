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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author mazy
 */
public class WaitRunnable implements Runnable {

    private JLabel ipAdress;
    private JLabel ipAvailability;
    protected Geraete geraeteOne;
    protected Integer ipInterval;
    protected Integer ipSchwellwert;
    protected String ipName;
    protected Integer ipMaxSchwellwert;
    protected Integer ipNichtErreichbarSeconds;
    protected Integer ipErreichbarSeconds;
    protected Integer ipMaxAvailablity;
    protected Integer ipMaxNotAvailablity;
    protected double ipFontScale;
    protected String ipEMail;
    protected boolean clearFlag;
    protected HashMap<Double, Integer> hashMap = new HashMap<Double, Integer>();
    private volatile boolean stopRequested = false;

    public WaitRunnable(JLabel ipIPAdress, JLabel ipAvailability, Integer ipIntervalValue,
            Integer ipSchwellwert, Integer ipMaxSchwellwert, String ipName, String ipEMail) {
        this.ipAdress = ipIPAdress;
        this.ipInterval = ipIntervalValue;
        this.ipSchwellwert = ipSchwellwert;
        this.ipMaxSchwellwert = ipMaxSchwellwert;
        this.ipName = ipName;
        this.ipAvailability = ipAvailability;
        this.ipEMail = ipEMail;
    }

    @Override
    public void run() {

        Geraete geraeteOne = new Geraete();
        ipAdress.setText(geraeteOne.getIpAdresse());

        ipNichtErreichbarSeconds = 0;
        ipErreichbarSeconds = 0;
        ipMaxAvailablity = 0;
        ipMaxNotAvailablity = 0;

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

            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    ipNichtErreichbarSeconds = 0;
                    ipErreichbarSeconds = ipErreichbarSeconds + ipInterval;
                    //Change font with scale
                    if (ipErreichbarSeconds > ipMaxAvailablity) {
                        ipMaxAvailablity = ipErreichbarSeconds;
                    }
                    //Change Font Scale
                    changeFontScale(ipMaxAvailablity, ipErreichbarSeconds);

                    ipAvailability.setText("available : " + ipErreichbarSeconds.toString());
                    EventQueue.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            if (ipErreichbarSeconds >= ipSchwellwert) {
                                ipAdress.setBackground(Color.blue);
                                ipAvailability.setText(" CLEAR E-Mail !");
                                // Sending e-mail
                                String eMailTitle = " PingTool Clear !";
                                String eMailText = " The Tool \"" + ipName + "\" "
                                        + " with IP Adress : " + ipAdress.getText() + " was available for more or equal to threshold which is : " + ipErreichbarSeconds + " seconds ."
                                        + " The threshold is : " + ipSchwellwert
                                        + "  . \n\n\n Special Thanks  \n Admin ";
                                EMailSender errorMail = new EMailSender();
                                try {
                                    errorMail.send(ipEMail, eMailText, eMailTitle);
                                } catch (MessagingException ex) {
                                    Logger.getLogger(IpRunnable.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                System.out.println("blue");
                            } else {
                                ipAdress.setBackground(Color.WHITE);

                            }
                        }
                    });

                }

            });
            //Not Accesible
        } else {

            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    ipErreichbarSeconds = 0;
                    ipNichtErreichbarSeconds = ipNichtErreichbarSeconds + ipInterval;
                    ipAvailability.setText("not available : " + ipNichtErreichbarSeconds.toString());
                    if (ipNichtErreichbarSeconds > ipMaxNotAvailablity) {
                        ipMaxNotAvailablity = ipNichtErreichbarSeconds;
                    }
                    changeFontScale(ipMaxNotAvailablity, ipNichtErreichbarSeconds);
                    EventQueue.invokeLater(new Runnable() {

                        @Override
                        public void run() {

                            // mehrfach überschreiten des Schwellwerts
                            if (ipNichtErreichbarSeconds >= (ipMaxSchwellwert * ipSchwellwert)) {
                                ipAdress.setBackground(Color.red);
                                ipAvailability.setText(" ALARM E-Mail !");
                                // Sending e-mail
                                String eMailTitle = " PingTool Alarm !";
                                String eMailText = " The Tool \"" + ipName + "\" "
                                        + " with IP Adress : " + ipAdress.getText() + "  exeeds the threshold for " + ipNichtErreichbarSeconds
                                        + " seconds. \n The threshold is  :" + ipSchwellwert
                                        + " seconds. \n Maximum number of exeeding Threshold is :  " + ipMaxSchwellwert
                                        + " . \n\n\n Special Thanks  \n Admin ";
                                EMailSender errorMail = new EMailSender();
                                try {
                                    errorMail.send(ipEMail, eMailText, eMailTitle);
                                } catch (MessagingException ex) {
                                    Logger.getLogger(IpRunnable.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                System.out.println("red");
                            } else {
                                ipAdress.setBackground(Color.white);

                            }

                        }
                    });

                }
            });

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

    public void changeFontScale(final Integer ipMaxAvailablity, final Integer ipErreichbarSeconds) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                createHashMap();
                ipFontScale = (double) ipErreichbarSeconds / (double) ipMaxAvailablity;
                ipFontScale = round(ipFontScale, 1);
                System.out.println("font scale  " + ipFontScale);
                final Integer fontSize = (Integer) hashMap.get(ipFontScale);

                System.out.println("font scale value  " + hashMap.get(ipFontScale));
                Font ipOneAvailabiltylabelFont = ipAvailability.getFont();
                ipAvailability.setFont(new Font(ipOneAvailabiltylabelFont.getName(), Font.PLAIN, fontSize));
            }
        });

    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
