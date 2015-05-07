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
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author mazy
 */
public class IpRunnable implements Runnable {

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

    WaitRunnable waitRunnable;

    public IpRunnable(JLabel ipAdress, JLabel ipAvailability, Integer ipIntervalValue,
            Integer ipSchwellwert, Integer ipMaxSchwellwert, String ipName, String ipEMail) {
        this.ipAdress = ipAdress;
        this.ipInterval = ipIntervalValue;
        this.ipSchwellwert = ipSchwellwert;
        this.ipMaxSchwellwert = ipMaxSchwellwert;
        this.ipName = ipName;
        this.ipAvailability = ipAvailability;
        this.ipEMail = ipEMail;
    }

    public void intervalWaiter() throws InterruptedException {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

            }
        });
        waitRunnable = new WaitRunnable(ipAdress, ipAvailability, ipInterval, ipSchwellwert, ipMaxSchwellwert, ipName, ipEMail);
        Thread thread = new Thread(waitRunnable);
        thread.start();
        thread.join();

    }

    @Override
    public void run() {

        while (!stopRequested) {

            try {
                // Sleep Here In Another thread
                intervalWaiter();
            } catch (InterruptedException ex) {
                Logger.getLogger(IpRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void reqestStop() {
        stopRequested = true;
    }

    public void requestRun(boolean stopRequested) {
        this.stopRequested = stopRequested;
    }

}
