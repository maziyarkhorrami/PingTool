/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pingtol.gui;

import com.pingtool.logic.Geraete;
import com.pingtool.logic.IpFieldWorker;
import com.pingtool.logic.Ping;
import com.pingtool.logic.IpRunnable;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author mazy
 */
public class PingToolUI extends javax.swing.JFrame {
    
    ExecutorService threadPool = Executors.newFixedThreadPool(20);

    

    public Geraete geraeteOne;
    protected Integer ipOneInterval;
    protected Integer ipOneSchwellwert;
    protected Integer ipOneMaxSchwellwert;
    protected String ipOneName;
    protected Integer ipOneMaxSchwellwertListValue;
    protected String ipOneEMail;
    protected IpFieldWorker ipOneFieldWorker;
    
    
    
    // 2
    public Geraete geraete2;
    protected Integer ip2Interval;
    protected Integer ip2Schwellwert;
    protected Integer ip2MaxSchwellwert;
    protected String ip2Name;
    protected Integer ip2maxSchwellwertListValue;
    protected String ip2EMail;
    protected IpFieldWorker ip2FieldWorker;
    
    //3
    public Geraete geraete3;
    protected Integer ip3Interval;
    protected Integer ip3Schwellwert;
    protected Integer ip3MaxSchwellwert;
    protected String ip3Name;
    protected Integer ip3maxSchwellwertListValue;
    protected String ip3EMail;
    protected IpFieldWorker ip3FieldWorker;
    
        //4
    public Geraete geraete4;
    protected Integer ip4Interval;
    protected Integer ip4Schwellwert;
    protected Integer ip4MaxSchwellwert;
    protected String ip4Name;
    protected Integer ip4maxSchwellwertListValue;
    protected String ip4EMail;
    protected IpFieldWorker ip4FieldWorker;
    
    //5
    public Geraete geraete5;
    protected Integer ip5Interval;
    protected Integer ip5Schwellwert;
    protected Integer ip5MaxSchwellwert;
    protected String ip5Name;
    protected Integer ip5maxSchwellwertListValue;
    protected String ip5EMail;
    protected IpFieldWorker ip5FieldWorker;
    
    //6
    public Geraete geraete6;
    protected Integer ip6Interval;
    protected Integer ip6Schwellwert;
    protected Integer ip6MaxSchwellwert;
    protected String ip6Name;
    protected Integer ip6maxSchwellwertListValue;
    protected String ip6EMail;
    protected IpFieldWorker ip6FieldWorker;
    
    //7
    public Geraete geraete7;
    protected Integer ip7Interval;
    protected Integer ip7Schwellwert;
    protected Integer ip7MaxSchwellwert;
    protected String ip7Name;
    protected Integer ip7maxSchwellwertListValue;
    protected String ip7EMail;
    protected IpFieldWorker ip7FieldWorker;
    
       //8
    public Geraete geraete8;
    protected Integer ip8Interval;
    protected Integer ip8Schwellwert;
    protected Integer ip8MaxSchwellwert;
    protected String ip8Name;
    protected Integer ip8maxSchwellwertListValue;
    protected String ip8EMail;
    protected IpFieldWorker ip8FieldWorker;
    
    //9
    public Geraete geraete9;
    protected Integer ip9Interval;
    protected Integer ip9Schwellwert;
    protected Integer ip9MaxSchwellwert;
    protected String ip9Name;
    protected Integer ip9maxSchwellwertListValue;
    protected String ip9EMail;
    protected IpFieldWorker ip9FieldWorker;
    
     //10
    public Geraete geraete10;
    protected Integer ip10Interval;
    protected Integer ip10Schwellwert;
    protected Integer ip10MaxSchwellwert;
    protected String ip10Name;
    protected Integer ip10maxSchwellwertListValue;
    protected String ip10EMail;
    protected IpFieldWorker ip10FieldWorker;
    
     //11
    public Geraete geraete11;
    protected Integer ip11Interval;
    protected Integer ip11Schwellwert;
    protected Integer ip11MaxSchwellwert;
    protected String ip11Name;
    protected Integer ip11maxSchwellwertListValue;
    protected String ip11EMail;
    protected IpFieldWorker ip11FieldWorker;
    
         //12
    public Geraete geraete12;
    protected Integer ip12Interval;
    protected Integer ip12Schwellwert;
    protected Integer ip12MaxSchwellwert;
    protected String ip12Name;
    protected Integer ip12maxSchwellwertListValue;
    protected String ip12EMail;
    protected IpFieldWorker ip12FieldWorker;
    
     //13
    public Geraete geraete13;
    protected Integer ip13Interval;
    protected Integer ip13Schwellwert;
    protected Integer ip13MaxSchwellwert;
    protected String ip13Name;
    protected Integer ip13maxSchwellwertListValue;
    protected String ip13EMail;
    protected IpFieldWorker ip13FieldWorker;
    
        
     //14
    public Geraete geraete14;
    protected Integer ip14Interval;
    protected Integer ip14Schwellwert;
    protected Integer ip14MaxSchwellwert;
    protected String ip14Name;
    protected Integer ip14maxSchwellwertListValue;
    protected String ip14EMail;
    protected IpFieldWorker ip14FieldWorker;
        
     //15
    public Geraete geraete15;
    protected Integer ip15Interval;
    protected Integer ip15Schwellwert;
    protected Integer ip15MaxSchwellwert;
    protected String ip15Name;
    protected Integer ip15maxSchwellwertListValue;
    protected String ip15EMail;
    protected IpFieldWorker ip15FieldWorker;
        
     //16
    public Geraete geraete16;
    protected Integer ip16Interval;
    protected Integer ip16Schwellwert;
    protected Integer ip16MaxSchwellwert;
    protected String ip16Name;
    protected Integer ip16maxSchwellwertListValue;
    protected String ip16EMail;
    protected IpFieldWorker ip16FieldWorker;
        
     //17
    public Geraete geraete17;
    protected Integer ip17Interval;
    protected Integer ip17Schwellwert;
    protected Integer ip17MaxSchwellwert;
    protected String ip17Name;
    protected Integer ip17maxSchwellwertListValue;
    protected String ip17EMail;
    protected IpFieldWorker ip17FieldWorker;
        
     //18
    public Geraete geraete18;
    protected Integer ip18Interval;
    protected Integer ip18Schwellwert;
    protected Integer ip18MaxSchwellwert;
    protected String ip18Name;
    protected Integer ip18maxSchwellwertListValue;
    protected String ip18EMail;
    protected IpFieldWorker ip18FieldWorker;

        
     //19
    public Geraete geraete19;
    protected Integer ip19Interval;
    protected Integer ip19Schwellwert;
    protected Integer ip19MaxSchwellwert;
    protected String ip19Name;
    protected Integer ip19maxSchwellwertListValue;
    protected String ip19EMail;
    protected IpFieldWorker ip19FieldWorker;
    
        
     //20
    public Geraete geraete20;
    protected Integer ip20Interval;
    protected Integer ip20Schwellwert;
    protected Integer ip20MaxSchwellwert;
    protected String ip20Name;
    protected Integer ip20maxSchwellwertListValue;
    protected String ip20EMail;
    protected IpFieldWorker ip20FieldWorker;
    
//    final int corePoolSize = 100;
//    final int maximumPoolSize = 100;
//    final long keepAliveTime = 100000;
//    final TimeUnit unit = TimeUnit.SECONDS;
//    final BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(maximumPoolSize);
//
//    sun.awt.AppContext.getAppContext ().put(SwingWorker.class, new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue));
//    
 

    /**
     * Creates new form PingToolUI
     */
    public PingToolUI() {
        initComponents();

        

    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ip2IPAdress = new javax.swing.JLabel();
        ip2SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip2SchwellwertListjLable = new javax.swing.JLabel();
        ip2NamesListjLable = new javax.swing.JLabel();
        ip2NamesListjComboBox = new javax.swing.JComboBox();
        ip2MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip2MaxSequentialityListjLable = new javax.swing.JLabel();
        ip2EMailjTextFieldValue = new javax.swing.JTextField();
        ip2AvailabilityjLableValue = new javax.swing.JLabel();
        ip2EMailjLabel = new javax.swing.JLabel();
        ip2jLabelCaption = new javax.swing.JLabel();
        ip2AvailabilityjLabel = new javax.swing.JLabel();
        ip2IntervaljLabel = new javax.swing.JLabel();
        ip2IntervaljComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        ipOneStopjButton = new javax.swing.JButton();
        startjButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ipOneIPAdress = new javax.swing.JLabel();
        ipOneSchwellwertListjComboBox = new javax.swing.JComboBox();
        ipOneSchwellwertListjLable = new javax.swing.JLabel();
        ipOneNamesListjLable = new javax.swing.JLabel();
        ipOneNamesListjComboBox = new javax.swing.JComboBox();
        ipOneMaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ipOneMaxSequentialityListjLable = new javax.swing.JLabel();
        ipOneEMailjTextFieldValue = new javax.swing.JTextField();
        ipOneAvailabilityjLableValue = new javax.swing.JLabel();
        ipOneEMailjLabel = new javax.swing.JLabel();
        ipOnejLabelCaption = new javax.swing.JLabel();
        ipONEavailabilityjLabel = new javax.swing.JLabel();
        ip1IntervaljLabel = new javax.swing.JLabel();
        ipOneIntervaljComboBox = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        ip5IPAdress = new javax.swing.JLabel();
        ip5SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip5SchwellwertListjLable = new javax.swing.JLabel();
        ip5NamesListjLable = new javax.swing.JLabel();
        ip5NamesListjComboBox = new javax.swing.JComboBox();
        ip5MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip5MaxSequentialityListjLable = new javax.swing.JLabel();
        ip5EMailjTextFieldValue = new javax.swing.JTextField();
        ip5AvailabilityjLableValue = new javax.swing.JLabel();
        ip5EMailjLabel = new javax.swing.JLabel();
        ip5jLabelCaption = new javax.swing.JLabel();
        ip5availabilityjLabel = new javax.swing.JLabel();
        ip5IntervaljLabel = new javax.swing.JLabel();
        ip5IntervaljComboBox = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        ip3IPAdress = new javax.swing.JLabel();
        ip3SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip3SchwellwertListjLable3 = new javax.swing.JLabel();
        ipOneNamesListjLable3 = new javax.swing.JLabel();
        ip3NamesListjComboBox = new javax.swing.JComboBox();
        ip3MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip3MaxSequentialityListjLable = new javax.swing.JLabel();
        ip3EMailjTextFieldValue = new javax.swing.JTextField();
        ip3AvailabilityjLableValue = new javax.swing.JLabel();
        ip3EMailjLabel = new javax.swing.JLabel();
        ip3jLabelCaption = new javax.swing.JLabel();
        ip3AvailabilityjLabel3 = new javax.swing.JLabel();
        ip3IntervaljLabel = new javax.swing.JLabel();
        ip3IntervaljComboBox = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        ip4IPAdress = new javax.swing.JLabel();
        ip4SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip4SchwellwertListjLable = new javax.swing.JLabel();
        ip4NamesListjLable = new javax.swing.JLabel();
        ip4NamesListjComboBox = new javax.swing.JComboBox();
        ip4MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip4MaxSequentialityListjLable = new javax.swing.JLabel();
        ip4EMailjTextFieldValue = new javax.swing.JTextField();
        ip4AvailabilityjLableValue = new javax.swing.JLabel();
        ip4EMailjLabel = new javax.swing.JLabel();
        ip4jLabelCaption = new javax.swing.JLabel();
        ip4availabilityjLabel = new javax.swing.JLabel();
        ip4IntervaljLabel = new javax.swing.JLabel();
        ip4IntervaljComboBox = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        ip7IPAdress = new javax.swing.JLabel();
        ip7SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip7SchwellwertListjLable = new javax.swing.JLabel();
        ip7NamesListjLable = new javax.swing.JLabel();
        ip7NamesListjComboBox = new javax.swing.JComboBox();
        ip7MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip7MaxSequentialityListjLable = new javax.swing.JLabel();
        ip7EMailjTextFieldValue = new javax.swing.JTextField();
        ip7AvailabilityjLableValue = new javax.swing.JLabel();
        ip7EMailjLabel = new javax.swing.JLabel();
        ip7jLabelCaption = new javax.swing.JLabel();
        ip7availabilityjLabel = new javax.swing.JLabel();
        ip7IntervaljLabel = new javax.swing.JLabel();
        ip7IntervaljComboBox = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        ip6IPAdress = new javax.swing.JLabel();
        ip6SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip6SchwellwertListjLable = new javax.swing.JLabel();
        ip6NamesListjLable = new javax.swing.JLabel();
        ip6NamesListjComboBox = new javax.swing.JComboBox();
        ip6MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip6MaxSequentialityListjLable = new javax.swing.JLabel();
        ip6EMailjTextFieldValue = new javax.swing.JTextField();
        ip6AvailabilityjLableValue = new javax.swing.JLabel();
        ip6EMailjLabel = new javax.swing.JLabel();
        ip6jLabelCaption = new javax.swing.JLabel();
        ip6availabilityjLabel = new javax.swing.JLabel();
        ip6IntervaljLabel = new javax.swing.JLabel();
        ip6IntervaljComboBox = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        ip9IPAdress = new javax.swing.JLabel();
        ip9SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip9SchwellwertListjLable = new javax.swing.JLabel();
        ip9NamesListjLable = new javax.swing.JLabel();
        ip9NamesListjComboBox = new javax.swing.JComboBox();
        ip9MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip9MaxSequentialityListjLable = new javax.swing.JLabel();
        ip9EMailjTextFieldValue = new javax.swing.JTextField();
        ip9AvailabilityjLableValue = new javax.swing.JLabel();
        ip9EMailjLabel = new javax.swing.JLabel();
        ip9jLabelCaption = new javax.swing.JLabel();
        ip9availabilityjLabel = new javax.swing.JLabel();
        ip9IntervaljLabel = new javax.swing.JLabel();
        ip9IntervaljComboBox = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        ip8IPAdress = new javax.swing.JLabel();
        ip8SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip8SchwellwertListjLable = new javax.swing.JLabel();
        ip8NamesListjLable = new javax.swing.JLabel();
        ip8NamesListjComboBox = new javax.swing.JComboBox();
        ip8MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip8MaxSequentialityListjLable = new javax.swing.JLabel();
        ip8EMailjTextFieldValue = new javax.swing.JTextField();
        ip8AvailabilityjLableValue = new javax.swing.JLabel();
        ip8EMailjLabel = new javax.swing.JLabel();
        ip8jLabelCaption = new javax.swing.JLabel();
        ip8availabilityjLabel = new javax.swing.JLabel();
        ip8IntervaljLabel = new javax.swing.JLabel();
        ip8IntervaljComboBox = new javax.swing.JComboBox();
        jPanel13 = new javax.swing.JPanel();
        ip10IPAdress = new javax.swing.JLabel();
        ip10SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip10SchwellwertListjLable = new javax.swing.JLabel();
        ip10NamesListjLable = new javax.swing.JLabel();
        ip10NamesListjComboBox = new javax.swing.JComboBox();
        ip10MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip10MaxSequentialityListjLable = new javax.swing.JLabel();
        ip10EMailjTextFieldValue = new javax.swing.JTextField();
        ip10AvailabilityjLableValue = new javax.swing.JLabel();
        ip10EMailjLabel1 = new javax.swing.JLabel();
        ip10jLabelCaption = new javax.swing.JLabel();
        ip10availabilityjLabel = new javax.swing.JLabel();
        ip10IntervaljLabel = new javax.swing.JLabel();
        ip10IntervaljComboBox = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        ip11IPAdress = new javax.swing.JLabel();
        ip11SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip11SchwellwertListjLable = new javax.swing.JLabel();
        ip11NamesListjLable = new javax.swing.JLabel();
        ip11NamesListjComboBox = new javax.swing.JComboBox();
        ip11MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip11MaxSequentialityListjLable = new javax.swing.JLabel();
        ip11EMailjTextFieldValue = new javax.swing.JTextField();
        ip11AvailabilityjLableValue = new javax.swing.JLabel();
        ip11EMailjLabel = new javax.swing.JLabel();
        ip11jLabelCaption = new javax.swing.JLabel();
        ip11availabilityjLabel = new javax.swing.JLabel();
        ip11IntervaljLabel = new javax.swing.JLabel();
        ip11IntervaljComboBox = new javax.swing.JComboBox();
        jPanel15 = new javax.swing.JPanel();
        ip12IPAdress = new javax.swing.JLabel();
        ip12SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip12SchwellwertListjLable = new javax.swing.JLabel();
        ip12NamesListjLable = new javax.swing.JLabel();
        ip12NamesListjComboBox = new javax.swing.JComboBox();
        ip12MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip12MaxSequentialityListjLable = new javax.swing.JLabel();
        ip12EMailjTextFieldValue = new javax.swing.JTextField();
        ip12AvailabilityjLableValue = new javax.swing.JLabel();
        ip12EMailjLabel = new javax.swing.JLabel();
        ip12jLabelCaption = new javax.swing.JLabel();
        ip12availabilityjLabel = new javax.swing.JLabel();
        ip12IntervaljLabel = new javax.swing.JLabel();
        ip12IntervaljComboBox = new javax.swing.JComboBox();
        jPanel16 = new javax.swing.JPanel();
        ip13IPAdress = new javax.swing.JLabel();
        ip13SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip13SchwellwertListjLable = new javax.swing.JLabel();
        ip13NamesListjLable = new javax.swing.JLabel();
        ip13NamesListjComboBox = new javax.swing.JComboBox();
        ip13MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip13MaxSequentialityListjLable = new javax.swing.JLabel();
        ip13EMailjTextFieldValue = new javax.swing.JTextField();
        ip13AvailabilityjLableValue = new javax.swing.JLabel();
        ip13EMailjLabe = new javax.swing.JLabel();
        ip13jLabelCaption = new javax.swing.JLabel();
        ip13availabilityjLabel = new javax.swing.JLabel();
        ip13IntervaljLabel = new javax.swing.JLabel();
        ip13IntervaljComboBox = new javax.swing.JComboBox();
        jPanel17 = new javax.swing.JPanel();
        ip14IPAdress = new javax.swing.JLabel();
        ip14SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip14SchwellwertListjLable = new javax.swing.JLabel();
        ip14NamesListjLable = new javax.swing.JLabel();
        ip14NamesListjComboBox = new javax.swing.JComboBox();
        ip14MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip14MaxSequentialityListjLable = new javax.swing.JLabel();
        ip14EMailjTextFieldValue = new javax.swing.JTextField();
        ip14AvailabilityjLableValue = new javax.swing.JLabel();
        ip14EMailjLabel = new javax.swing.JLabel();
        ip14jLabelCaption = new javax.swing.JLabel();
        ip14availabilityjLabel = new javax.swing.JLabel();
        ip14IntervaljLabel = new javax.swing.JLabel();
        ip14IntervaljComboBox = new javax.swing.JComboBox();
        jPanel18 = new javax.swing.JPanel();
        ip15IPAdress = new javax.swing.JLabel();
        ip15SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip15SchwellwertListjLable = new javax.swing.JLabel();
        ip15NamesListjLable = new javax.swing.JLabel();
        ip15NamesListjComboBox = new javax.swing.JComboBox();
        ip15MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip15MaxSequentialityListjLable = new javax.swing.JLabel();
        ip15EMailjTextFieldValue = new javax.swing.JTextField();
        ip15AvailabilityjLableValue = new javax.swing.JLabel();
        ip15EMailjLabel = new javax.swing.JLabel();
        ip15jLabelCaption = new javax.swing.JLabel();
        ip15availabilityjLabel = new javax.swing.JLabel();
        ip15IntervaljLabel = new javax.swing.JLabel();
        ip15IntervaljComboBox = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        ip16IPAdress = new javax.swing.JLabel();
        ip16SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip16SchwellwertListjLable = new javax.swing.JLabel();
        ip16NamesListjLable = new javax.swing.JLabel();
        ip16NamesListjComboBox = new javax.swing.JComboBox();
        ip16MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip16MaxSequentialityListjLable = new javax.swing.JLabel();
        ip16EMailjTextFieldValue = new javax.swing.JTextField();
        ip16AvailabilityjLableValue = new javax.swing.JLabel();
        ip16EMailjLabel = new javax.swing.JLabel();
        ip16jLabelCaption = new javax.swing.JLabel();
        ip16availabilityjLabel = new javax.swing.JLabel();
        ip16IntervaljLabel = new javax.swing.JLabel();
        ip16IntervaljComboBox = new javax.swing.JComboBox();
        jPanel20 = new javax.swing.JPanel();
        ip17IPAdress = new javax.swing.JLabel();
        ip17SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip17SchwellwertListjLable = new javax.swing.JLabel();
        ip17NamesListjLable = new javax.swing.JLabel();
        ip17NamesListjComboBox = new javax.swing.JComboBox();
        ip17MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip17MaxSequentialityListjLable = new javax.swing.JLabel();
        ip17EMailjTextFieldValue = new javax.swing.JTextField();
        ip17AvailabilityjLableValue = new javax.swing.JLabel();
        ip17EMailjLabel = new javax.swing.JLabel();
        ip17jLabelCaption = new javax.swing.JLabel();
        ip17availabilityjLabel = new javax.swing.JLabel();
        ip17IntervaljLabel = new javax.swing.JLabel();
        ip17IntervaljComboBox = new javax.swing.JComboBox();
        jPanel21 = new javax.swing.JPanel();
        ip18IPAdress = new javax.swing.JLabel();
        ip18SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip18SchwellwertListjLable = new javax.swing.JLabel();
        ip18NamesListjLable = new javax.swing.JLabel();
        ip18NamesListjComboBox = new javax.swing.JComboBox();
        ip18MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip18MaxSequentialityListjLable = new javax.swing.JLabel();
        ip18EMailjTextFieldValue = new javax.swing.JTextField();
        ip18AvailabilityjLableValue = new javax.swing.JLabel();
        ip18EMailjLabel = new javax.swing.JLabel();
        ip18jLabelCaption = new javax.swing.JLabel();
        ip18availabilityjLabel = new javax.swing.JLabel();
        ip18IntervaljLabel = new javax.swing.JLabel();
        ip18IntervaljComboBox = new javax.swing.JComboBox();
        jPanel22 = new javax.swing.JPanel();
        ip19IPAdress = new javax.swing.JLabel();
        ip19SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip19SchwellwertListjLable = new javax.swing.JLabel();
        ip19NamesListjLable = new javax.swing.JLabel();
        ip19NamesListjComboBox = new javax.swing.JComboBox();
        ip19MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip19MaxSequentialityListjLable = new javax.swing.JLabel();
        ip19EMailjTextFieldValue = new javax.swing.JTextField();
        ip19AvailabilityjLableValue = new javax.swing.JLabel();
        ip19EMailjLabel = new javax.swing.JLabel();
        ip19jLabelCaption = new javax.swing.JLabel();
        ip19availabilityjLabel = new javax.swing.JLabel();
        ip19IntervaljLabel = new javax.swing.JLabel();
        ip19IntervaljComboBox = new javax.swing.JComboBox();
        jPanel23 = new javax.swing.JPanel();
        ip20IPAdress = new javax.swing.JLabel();
        ip20SchwellwertListjComboBox = new javax.swing.JComboBox();
        ip20SchwellwertListjLable = new javax.swing.JLabel();
        ip20NamesListjLable = new javax.swing.JLabel();
        ip20NamesListjComboBox = new javax.swing.JComboBox();
        ip20MaxSchwellwertListjComboBox = new javax.swing.JComboBox();
        ip20MaxSequentialityListjLable = new javax.swing.JLabel();
        ip20EMailjTextFieldValue = new javax.swing.JTextField();
        ip20AvailabilityjLableValue = new javax.swing.JLabel();
        ip20EMailjLabel = new javax.swing.JLabel();
        ip20jLabelCaption = new javax.swing.JLabel();
        ip20availabilityjLabel = new javax.swing.JLabel();
        ip20IntervaljLabel = new javax.swing.JLabel();
        ip20IntervaljComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 2000));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 2000));

        ip2IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip2IPAdress.setText("255.255.255.255");

        ip2SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip2SchwellwertListjLable.setText("threshold :");

        ip2NamesListjLable.setText("tool name:");

        ip2NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip2MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip2MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip2EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip2AvailabilityjLableValue.setText(" - - -");

        ip2EMailjLabel.setText("your E-Mail :");

        ip2jLabelCaption.setText("IP 2:");

        ip2AvailabilityjLabel.setText("IP 2 Availability (Sec)");

        ip2IntervaljLabel.setText("IP Interval :");

        ip2IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip2NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip2EMailjLabel)
                                    .addComponent(ip2IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip2AvailabilityjLabel)
                                    .addComponent(ip2IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip2IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2jLabelCaption)
                                .addComponent(ip2NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip2SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip2jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2AvailabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip2AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip2NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip2MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip2IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip2EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip2jLabelCaption.getAccessibleContext().setAccessibleName("IP 2:");

        ipOneStopjButton.setText("Stop Pinging");
        ipOneStopjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipOneStopjButtonActionPerformed(evt);
            }
        });

        startjButton.setText("Start Ping");
        startjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(startjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ipOneStopjButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipOneStopjButton)
                    .addComponent(startjButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ipOneIPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ipOneIPAdress.setText("255.255.255.255");

        ipOneSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ipOneSchwellwertListjLable.setText("threshold :");

        ipOneNamesListjLable.setText("tool name:");

        ipOneNamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ipOneMaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ipOneMaxSequentialityListjLable.setText("MAX Sequentiality :");

        ipOneEMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ipOneAvailabilityjLableValue.setText(" - - -");

        ipOneEMailjLabel.setText("your E-Mail :");

        ipOnejLabelCaption.setText("IP 1:");

        ipONEavailabilityjLabel.setText("IP 1 Availability (Sec)");

        ip1IntervaljLabel.setText("IP Interval :");

        ipOneIntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ipOneNamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ipOneEMailjLabel)
                                    .addComponent(ip1IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ipONEavailabilityjLabel)
                                    .addComponent(ipOneIntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ipOneIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOnejLabelCaption)
                                .addComponent(ipOneNamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneMaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneMaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneEMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneAvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipOneSchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ipOnejLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipONEavailabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ipOneAvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ipOneNamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneNamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneSchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ipOneMaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneMaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip1IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneIntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneEMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ipOneEMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip5IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip5IPAdress.setText("255.255.255.255");

        ip5SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip5SchwellwertListjLable.setText("threshold :");

        ip5NamesListjLable.setText("tool name:");

        ip5NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip5MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip5MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip5EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip5AvailabilityjLableValue.setText(" - - -");

        ip5EMailjLabel.setText("your E-Mail :");

        ip5jLabelCaption.setText("IP 5:");

        ip5availabilityjLabel.setText("IP 5 Availability (Sec)");

        ip5IntervaljLabel.setText("IP Interval :");

        ip5IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip5NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip5EMailjLabel)
                                    .addComponent(ip5IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip5availabilityjLabel)
                                    .addComponent(ip5IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip5IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5jLabelCaption)
                                .addComponent(ip5NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip5SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip5jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip5AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip5NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip5MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip5IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip5EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip3IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip3IPAdress.setText("255.255.255.255");

        ip3SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip3SchwellwertListjLable3.setText("threshold :");

        ipOneNamesListjLable3.setText("tool name:");

        ip3NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip3MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip3MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip3EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip3AvailabilityjLableValue.setText(" - - -");

        ip3EMailjLabel.setText("your E-Mail :");

        ip3jLabelCaption.setText("IP 3:");

        ip3AvailabilityjLabel3.setText("IP 3 Availability (Sec)");

        ip3IntervaljLabel.setText("IP Interval :");

        ip3IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ipOneNamesListjLable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip3EMailjLabel)
                                    .addComponent(ip3IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip3AvailabilityjLabel3)
                                    .addComponent(ip3IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip3IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3jLabelCaption)
                                .addComponent(ip3NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip3SchwellwertListjLable3))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip3jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3AvailabilityjLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(ip3AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ipOneNamesListjLable3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3SchwellwertListjLable3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip3MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip3IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip3EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip4IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip4IPAdress.setText("255.255.255.255");

        ip4SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip4SchwellwertListjLable.setText("threshold :");

        ip4NamesListjLable.setText("tool name:");

        ip4NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip4MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip4MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip4EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip4AvailabilityjLableValue.setText(" - - -");

        ip4EMailjLabel.setText("your E-Mail :");

        ip4jLabelCaption.setText("IP 4:");

        ip4availabilityjLabel.setText("IP 4 Availability (Sec)");

        ip4IntervaljLabel.setText("IP Interval :");

        ip4IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip4NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip4EMailjLabel)
                                    .addComponent(ip4IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip4availabilityjLabel)
                                    .addComponent(ip4IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip4IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4jLabelCaption)
                                .addComponent(ip4NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip4SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip4jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip4AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip4NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip4MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip4IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip4EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip7IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip7IPAdress.setText("255.255.255.255");

        ip7SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip7SchwellwertListjLable.setText("threshold :");

        ip7NamesListjLable.setText("tool name:");

        ip7NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip7MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip7MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip7EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip7AvailabilityjLableValue.setText(" - - -");

        ip7EMailjLabel.setText("your E-Mail :");

        ip7jLabelCaption.setText("IP 7:");

        ip7availabilityjLabel.setText("IP 7 Availability (Sec)");

        ip7IntervaljLabel.setText("IP Interval :");

        ip7IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip7NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip7EMailjLabel)
                                    .addComponent(ip7IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip7availabilityjLabel)
                                    .addComponent(ip7IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip7IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7jLabelCaption)
                                .addComponent(ip7NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip7SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip7jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip7AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip7NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip7MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip7IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip7EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip6IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip6IPAdress.setText("255.255.255.255");

        ip6SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip6SchwellwertListjLable.setText("threshold :");

        ip6NamesListjLable.setText("tool name:");

        ip6NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip6MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip6MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip6EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip6AvailabilityjLableValue.setText(" - - -");

        ip6EMailjLabel.setText("your E-Mail :");

        ip6jLabelCaption.setText("IP 6:");

        ip6availabilityjLabel.setText("IP 6 Availability (Sec)");

        ip6IntervaljLabel.setText("IP Interval :");

        ip6IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip6NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip6EMailjLabel)
                                    .addComponent(ip6IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip6availabilityjLabel)
                                    .addComponent(ip6IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip6IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6jLabelCaption)
                                .addComponent(ip6NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip6SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip6jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip6AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip6NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip6MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip6IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip6EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip9IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip9IPAdress.setText("255.255.255.255");

        ip9SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip9SchwellwertListjLable.setText("threshold :");

        ip9NamesListjLable.setText("tool name:");

        ip9NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip9MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip9MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip9EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip9AvailabilityjLableValue.setText(" - - -");

        ip9EMailjLabel.setText("your E-Mail :");

        ip9jLabelCaption.setText("IP 9:");

        ip9availabilityjLabel.setText("IP 9 Availability (Sec)");

        ip9IntervaljLabel.setText("IP Interval :");

        ip9IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip9NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip9EMailjLabel)
                                    .addComponent(ip9IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip9availabilityjLabel)
                                    .addComponent(ip9IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip9IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9jLabelCaption)
                                .addComponent(ip9NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip9SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip9jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip9AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip9NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip9MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip9IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip9EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip8IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip8IPAdress.setText("255.255.255.255");

        ip8SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip8SchwellwertListjLable.setText("threshold :");

        ip8NamesListjLable.setText("tool name:");

        ip8NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip8MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip8MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip8EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip8AvailabilityjLableValue.setText(" - - -");

        ip8EMailjLabel.setText("your E-Mail :");

        ip8jLabelCaption.setText("IP 8:");

        ip8availabilityjLabel.setText("IP 8 Availability (Sec)");

        ip8IntervaljLabel.setText("IP Interval :");

        ip8IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip8NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip8EMailjLabel)
                                    .addComponent(ip8IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip8availabilityjLabel)
                                    .addComponent(ip8IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip8IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8jLabelCaption)
                                .addComponent(ip8NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip8SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip8jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip8AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip8NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip8MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip8IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip8EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip10IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip10IPAdress.setText("255.255.255.255");

        ip10SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip10SchwellwertListjLable.setText("threshold :");

        ip10NamesListjLable.setText("tool name:");

        ip10NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip10MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip10MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip10EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip10AvailabilityjLableValue.setText(" - - -");

        ip10EMailjLabel1.setText("your E-Mail :");

        ip10jLabelCaption.setText("IP 10:");

        ip10availabilityjLabel.setText("IP 10 Availability (Sec)");

        ip10IntervaljLabel.setText("IP Interval :");

        ip10IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip10NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip10EMailjLabel1)
                                    .addComponent(ip10IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip10availabilityjLabel)
                                    .addComponent(ip10IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip10IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10jLabelCaption)
                                .addComponent(ip10NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip10SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip10jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip10AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip10NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip10MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip10IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10EMailjLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip10EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip11IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip11IPAdress.setText("255.255.255.255");

        ip11SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip11SchwellwertListjLable.setText("threshold :");

        ip11NamesListjLable.setText("tool name:");

        ip11NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip11MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip11MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip11EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip11AvailabilityjLableValue.setText(" - - -");

        ip11EMailjLabel.setText("your E-Mail :");

        ip11jLabelCaption.setText("IP 11:");

        ip11availabilityjLabel.setText("IP 11 Availability (Sec)");

        ip11IntervaljLabel.setText("IP Interval :");

        ip11IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip11NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip11EMailjLabel)
                                    .addComponent(ip11IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip11availabilityjLabel)
                                    .addComponent(ip11IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip11IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11jLabelCaption)
                                .addComponent(ip11NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip11SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip11jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip11AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip11NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip11MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip11IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip11EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip12IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip12IPAdress.setText("255.255.255.255");

        ip12SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip12SchwellwertListjLable.setText("threshold :");

        ip12NamesListjLable.setText("tool name:");

        ip12NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip12MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip12MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip12EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip12AvailabilityjLableValue.setText(" - - -");

        ip12EMailjLabel.setText("your E-Mail :");

        ip12jLabelCaption.setText("IP 12:");

        ip12availabilityjLabel.setText("IP 12 Availability (Sec)");

        ip12IntervaljLabel.setText("IP Interval :");

        ip12IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip12NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip12EMailjLabel)
                                    .addComponent(ip12IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip12availabilityjLabel)
                                    .addComponent(ip12IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip12IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12jLabelCaption)
                                .addComponent(ip12NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip12SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip12jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip12AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip12NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip12MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip12IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip12EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip13IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip13IPAdress.setText("255.255.255.255");

        ip13SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip13SchwellwertListjLable.setText("threshold :");

        ip13NamesListjLable.setText("tool name:");

        ip13NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip13MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip13MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip13EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip13AvailabilityjLableValue.setText(" - - -");

        ip13EMailjLabe.setText("your E-Mail :");

        ip13jLabelCaption.setText("IP 13:");

        ip13availabilityjLabel.setText("IP 13 Availability (Sec)");

        ip13IntervaljLabel.setText("IP Interval :");

        ip13IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip13NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip13EMailjLabe)
                                    .addComponent(ip13IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip13availabilityjLabel)
                                    .addComponent(ip13IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip13IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13jLabelCaption)
                                .addComponent(ip13NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip13SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip13jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip13AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip13NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip13MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip13IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13EMailjLabe)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip13EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip14IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip14IPAdress.setText("255.255.255.255");

        ip14SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip14SchwellwertListjLable.setText("threshold :");

        ip14NamesListjLable.setText("tool name:");

        ip14NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip14MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip14MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip14EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip14AvailabilityjLableValue.setText(" - - -");

        ip14EMailjLabel.setText("your E-Mail :");

        ip14jLabelCaption.setText("IP 14:");

        ip14availabilityjLabel.setText("IP 14 Availability (Sec)");

        ip14IntervaljLabel.setText("IP Interval :");

        ip14IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip14NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip14EMailjLabel)
                                    .addComponent(ip14IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip14availabilityjLabel)
                                    .addComponent(ip14IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip14IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14jLabelCaption)
                                .addComponent(ip14NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip14SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip14jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip14AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip14NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip14MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip14IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip14EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip15IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip15IPAdress.setText("255.255.255.255");

        ip15SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip15SchwellwertListjLable.setText("threshold :");

        ip15NamesListjLable.setText("tool name:");

        ip15NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip15MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip15MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip15EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip15AvailabilityjLableValue.setText(" - - -");

        ip15EMailjLabel.setText("your E-Mail :");

        ip15jLabelCaption.setText("IP 15:");

        ip15availabilityjLabel.setText("IP 15 Availability (Sec)");

        ip15IntervaljLabel.setText("IP Interval :");

        ip15IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip15NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip15EMailjLabel)
                                    .addComponent(ip15IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip15availabilityjLabel)
                                    .addComponent(ip15IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip15IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15jLabelCaption)
                                .addComponent(ip15NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip15SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip15jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip15AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip15NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip15MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip15IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip15EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip16IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip16IPAdress.setText("255.255.255.255");

        ip16SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip16SchwellwertListjLable.setText("threshold :");

        ip16NamesListjLable.setText("tool name:");

        ip16NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip16MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip16MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip16EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip16AvailabilityjLableValue.setText(" - - -");

        ip16EMailjLabel.setText("your E-Mail :");

        ip16jLabelCaption.setText("IP 16:");

        ip16availabilityjLabel.setText("IP 16 Availability (Sec)");

        ip16IntervaljLabel.setText("IP Interval :");

        ip16IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip16NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip16EMailjLabel)
                                    .addComponent(ip16IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip16availabilityjLabel)
                                    .addComponent(ip16IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip16IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16jLabelCaption)
                                .addComponent(ip16NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip16SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip16jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip16AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip16NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip16MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip16IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip16EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip17IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip17IPAdress.setText("255.255.255.255");

        ip17SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip17SchwellwertListjLable.setText("threshold :");

        ip17NamesListjLable.setText("tool name:");

        ip17NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip17MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip17MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip17EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip17AvailabilityjLableValue.setText(" - - -");

        ip17EMailjLabel.setText("your E-Mail :");

        ip17jLabelCaption.setText("IP 17:");

        ip17availabilityjLabel.setText("IP 17 Availability (Sec)");

        ip17IntervaljLabel.setText("IP Interval :");

        ip17IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip17NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip17EMailjLabel)
                                    .addComponent(ip17IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip17availabilityjLabel)
                                    .addComponent(ip17IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip17IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17jLabelCaption)
                                .addComponent(ip17NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip17SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip17jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip17AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip17NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip17MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip17IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip17EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip18IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip18IPAdress.setText("255.255.255.255");

        ip18SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip18SchwellwertListjLable.setText("threshold :");

        ip18NamesListjLable.setText("tool name:");

        ip18NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip18MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip18MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip18EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip18AvailabilityjLableValue.setText(" - - -");

        ip18EMailjLabel.setText("your E-Mail :");

        ip18jLabelCaption.setText("IP 18:");

        ip18availabilityjLabel.setText("IP 18 Availability (Sec)");

        ip18IntervaljLabel.setText("IP Interval :");

        ip18IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip18NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip18EMailjLabel)
                                    .addComponent(ip18IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip18availabilityjLabel)
                                    .addComponent(ip18IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip18IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18jLabelCaption)
                                .addComponent(ip18NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip18SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip18jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip18AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip18NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip18MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip18IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip18EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip19IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip19IPAdress.setText("255.255.255.255");

        ip19SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip19SchwellwertListjLable.setText("threshold :");

        ip19NamesListjLable.setText("tool name:");

        ip19NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip19MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip19MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip19EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip19AvailabilityjLableValue.setText(" - - -");

        ip19EMailjLabel.setText("your E-Mail :");

        ip19jLabelCaption.setText("IP 19:");

        ip19availabilityjLabel.setText("IP 1 Availability (Sec)");

        ip19IntervaljLabel.setText("IP Interval :");

        ip19IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip19NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip19EMailjLabel)
                                    .addComponent(ip19IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip19availabilityjLabel)
                                    .addComponent(ip19IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip19IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19jLabelCaption)
                                .addComponent(ip19NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip19SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip19jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip19AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip19NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip19MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip19IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip19EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ip20IPAdress.setBackground(new java.awt.Color(255, 255, 255));
        ip20IPAdress.setText("255.255.255.255");

        ip20SchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));

        ip20SchwellwertListjLable.setText("threshold :");

        ip20NamesListjLable.setText("tool name:");

        ip20NamesListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titan", "Enceladus", "Dione", "Hyperion", "Iapetus", "Mimas", "Rhea", "Tethys", "Erriapus", "Phoebe", "Janus", "Epimetheus", "Helene", "Telesto", "Calypso", "Kiviuq", "Atlas", "Prometheus", "Pandora", "Pan", " ", " " }));

        ip20MaxSchwellwertListjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ip20MaxSequentialityListjLable.setText("MAX Sequentiality :");

        ip20EMailjTextFieldValue.setText("pingtoolmaziyarkhorrami@gmail.com");

        ip20AvailabilityjLableValue.setText(" - - -");

        ip20EMailjLabel.setText("your E-Mail :");

        ip20jLabelCaption.setText("IP 20:");

        ip20availabilityjLabel.setText("IP 20 Availability (Sec)");

        ip20IntervaljLabel.setText("IP Interval :");

        ip20IntervaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ip20NamesListjLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip20EMailjLabel)
                                    .addComponent(ip20IntervaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ip20availabilityjLabel)
                                    .addComponent(ip20IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ip20IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20jLabelCaption)
                                .addComponent(ip20NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20MaxSequentialityListjLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ip20SchwellwertListjLable))
                            .addGap(57, 57, 57)))
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ip20jLabelCaption)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20IPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20availabilityjLabel)
                    .addGap(18, 18, 18)
                    .addComponent(ip20AvailabilityjLableValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(ip20NamesListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20NamesListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20SchwellwertListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20SchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ip20MaxSequentialityListjLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20MaxSchwellwertListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ip20IntervaljLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20IntervaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20EMailjLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ip20EMailjTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1982, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startjButtonActionPerformed
        ipOneFieldWorker = new IpFieldWorker(ipOneIPAdress, ipOneAvailabilityjLableValue, ipOneInterval, ipOneSchwellwert, ipOneMaxSchwellwert, ipOneName, ipOneEMail);
        ip2FieldWorker = new IpFieldWorker(ip2IPAdress, ip2AvailabilityjLableValue, ip2Interval, ip2Schwellwert, ip2MaxSchwellwert, ip2Name, ip2EMail);
        ip3FieldWorker = new IpFieldWorker(ip3IPAdress, ip3AvailabilityjLableValue, ip3Interval, ip3Schwellwert, ip3MaxSchwellwert, ip3Name, ip3EMail);
        ip4FieldWorker = new IpFieldWorker(ip4IPAdress, ip4AvailabilityjLableValue, ip4Interval, ip4Schwellwert, ip4MaxSchwellwert, ip4Name, ip4EMail);
        ip5FieldWorker = new IpFieldWorker(ip5IPAdress, ip5AvailabilityjLableValue, ip5Interval, ip5Schwellwert, ip5MaxSchwellwert, ip5Name, ip5EMail);
        ip6FieldWorker = new IpFieldWorker(ip6IPAdress, ip6AvailabilityjLableValue, ip6Interval, ip6Schwellwert, ip6MaxSchwellwert, ip6Name, ip6EMail);
        ip7FieldWorker = new IpFieldWorker(ip7IPAdress, ip7AvailabilityjLableValue, ip7Interval, ip7Schwellwert, ip7MaxSchwellwert, ip7Name, ip7EMail);
        ip8FieldWorker = new IpFieldWorker(ip8IPAdress, ip8AvailabilityjLableValue, ip8Interval, ip8Schwellwert, ip8MaxSchwellwert, ip8Name, ip8EMail);
        ip9FieldWorker = new IpFieldWorker(ip9IPAdress, ip9AvailabilityjLableValue, ip9Interval, ip9Schwellwert, ip9MaxSchwellwert, ip9Name, ip9EMail);
        ip10FieldWorker = new IpFieldWorker(ip10IPAdress, ip10AvailabilityjLableValue, ip10Interval, ip10Schwellwert, ip10MaxSchwellwert, ip10Name, ip10EMail);
        ip11FieldWorker = new IpFieldWorker(ip11IPAdress, ip11AvailabilityjLableValue, ip11Interval, ip11Schwellwert, ip11MaxSchwellwert, ip11Name, ip11EMail);
        ip12FieldWorker = new IpFieldWorker(ip12IPAdress, ip12AvailabilityjLableValue, ip12Interval, ip12Schwellwert, ip12MaxSchwellwert, ip12Name, ip12EMail);
        ip13FieldWorker = new IpFieldWorker(ip13IPAdress, ip13AvailabilityjLableValue, ip13Interval, ip13Schwellwert, ip13MaxSchwellwert, ip13Name, ip13EMail);
        ip14FieldWorker = new IpFieldWorker(ip14IPAdress, ip14AvailabilityjLableValue, ip14Interval, ip14Schwellwert, ip14MaxSchwellwert, ip14Name, ip14EMail);
        ip15FieldWorker = new IpFieldWorker(ip15IPAdress, ip15AvailabilityjLableValue, ip15Interval, ip15Schwellwert, ip15MaxSchwellwert, ip15Name, ip15EMail);
        ip16FieldWorker = new IpFieldWorker(ip16IPAdress, ip16AvailabilityjLableValue, ip16Interval, ip16Schwellwert, ip16MaxSchwellwert, ip16Name, ip16EMail);
        ip17FieldWorker = new IpFieldWorker(ip17IPAdress, ip17AvailabilityjLableValue, ip17Interval, ip17Schwellwert, ip17MaxSchwellwert, ip17Name, ip17EMail);
        ip18FieldWorker = new IpFieldWorker(ip18IPAdress, ip18AvailabilityjLableValue, ip18Interval, ip18Schwellwert, ip18MaxSchwellwert, ip18Name, ip18EMail);
        ip19FieldWorker = new IpFieldWorker(ip19IPAdress, ip19AvailabilityjLableValue, ip19Interval, ip19Schwellwert, ip19MaxSchwellwert, ip19Name, ip19EMail);
        ip20FieldWorker = new IpFieldWorker(ip20IPAdress, ip20AvailabilityjLableValue, ip20Interval, ip20Schwellwert, ip20MaxSchwellwert, ip20Name, ip20EMail);
        
        threadPool.submit(ipOneFieldWorker);
        threadPool.submit(ip2FieldWorker);
        threadPool.submit(ip3FieldWorker);
        threadPool.submit(ip4FieldWorker);
        threadPool.submit(ip5FieldWorker);
        threadPool.submit(ip6FieldWorker);
        threadPool.submit(ip7FieldWorker);
        threadPool.submit(ip8FieldWorker);
        threadPool.submit(ip9FieldWorker);
        threadPool.submit(ip10FieldWorker);
        threadPool.submit(ip11FieldWorker);
        threadPool.submit(ip12FieldWorker);
        threadPool.submit(ip13FieldWorker);
        threadPool.submit(ip14FieldWorker);
        threadPool.submit(ip15FieldWorker);
        threadPool.submit(ip16FieldWorker);

        
        Geraete geraeteOne = new Geraete();
        ipOneIPAdress.setText(geraeteOne.getIpAdresse());
        ipOneInterval = Integer.valueOf((String) ipOneIntervaljComboBox.getSelectedItem());
        ipOneSchwellwert = Integer.valueOf((String) ipOneSchwellwertListjComboBox.getSelectedItem());
        ipOneMaxSchwellwert = Integer.valueOf((String) ipOneMaxSchwellwertListjComboBox.getSelectedItem());
        ipOneName = (String) ipOneNamesListjComboBox.getSelectedItem();
        ipOneEMail = ipOneEMailjTextFieldValue.getText();
        ipOneIPAdress.setOpaque(true);
        Font ipOneAvailabiltylabelFont = ipOneAvailabilityjLableValue.getFont();
        ipOneAvailabilityjLableValue.setFont(new Font(ipOneAvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ipOneFiledWorkerEngine();

        Geraete geraete2 = new Geraete();
        ip2IPAdress.setText(geraete2.getIpAdresse());
        ip2Interval = Integer.valueOf((String) ip2IntervaljComboBox.getSelectedItem());
        ip2Schwellwert = Integer.valueOf((String) ip2SchwellwertListjComboBox.getSelectedItem());
        ip2MaxSchwellwert = Integer.valueOf((String) ip2MaxSchwellwertListjComboBox.getSelectedItem());
        ip2Name = (String) ip2NamesListjComboBox.getSelectedItem();
        ip2EMail = ip2EMailjTextFieldValue.getText();
        ip2IPAdress.setOpaque(true);
        Font ip2AvailabiltylabelFont = ip2AvailabilityjLableValue.getFont();
        ip2AvailabilityjLableValue.setFont(new Font(ip2AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip2FiledWorkerEngine();
        
        Geraete geraete3 = new Geraete();
        ip3IPAdress.setText(geraete3.getIpAdresse());
        ip3Interval = Integer.valueOf((String) ip3IntervaljComboBox.getSelectedItem());
        ip3Schwellwert = Integer.valueOf((String) ip3SchwellwertListjComboBox.getSelectedItem());
        ip3MaxSchwellwert = Integer.valueOf((String) ip3MaxSchwellwertListjComboBox.getSelectedItem());
        ip3Name = (String) ip3NamesListjComboBox.getSelectedItem();
        ip3EMail = ip3EMailjTextFieldValue.getText();
        ip3IPAdress.setOpaque(true);
        Font ip3AvailabiltylabelFont = ip3AvailabilityjLableValue.getFont();
        ip3AvailabilityjLableValue.setFont(new Font(ip3AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip3FiledWorkerEngine();
        
        Geraete geraete4 = new Geraete();
        ip4IPAdress.setText(geraete4.getIpAdresse());
        ip4Interval = Integer.valueOf((String) ip4IntervaljComboBox.getSelectedItem());
        ip4Schwellwert = Integer.valueOf((String) ip4SchwellwertListjComboBox.getSelectedItem());
        ip4MaxSchwellwert = Integer.valueOf((String) ip4MaxSchwellwertListjComboBox.getSelectedItem());
        ip4Name = (String) ip4NamesListjComboBox.getSelectedItem();
        ip4EMail = ip4EMailjTextFieldValue.getText();
        ip4IPAdress.setOpaque(true);
        Font ip4AvailabiltylabelFont = ip4AvailabilityjLableValue.getFont();
        ip4AvailabilityjLableValue.setFont(new Font(ip4AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip4FiledWorkerEngine();
        
        Geraete geraete5 = new Geraete();
        ip5IPAdress.setText(geraete5.getIpAdresse());
        ip5Interval = Integer.valueOf((String) ip5IntervaljComboBox.getSelectedItem());
        ip5Schwellwert = Integer.valueOf((String) ip5SchwellwertListjComboBox.getSelectedItem());
        ip5MaxSchwellwert = Integer.valueOf((String) ip5MaxSchwellwertListjComboBox.getSelectedItem());
        ip5Name = (String) ip5NamesListjComboBox.getSelectedItem();
        ip5EMail = ip5EMailjTextFieldValue.getText();
        ip5IPAdress.setOpaque(true);
        Font ip5AvailabiltylabelFont = ip5AvailabilityjLableValue.getFont();
        ip5AvailabilityjLableValue.setFont(new Font(ip5AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip5FiledWorkerEngine();
        
        Geraete geraete6 = new Geraete();
        ip6IPAdress.setText(geraete6.getIpAdresse());
        ip6Interval = Integer.valueOf((String) ip6IntervaljComboBox.getSelectedItem());
        ip6Schwellwert = Integer.valueOf((String) ip6SchwellwertListjComboBox.getSelectedItem());
        ip6MaxSchwellwert = Integer.valueOf((String) ip6MaxSchwellwertListjComboBox.getSelectedItem());
        ip6Name = (String) ip6NamesListjComboBox.getSelectedItem();
        ip6EMail = ip6EMailjTextFieldValue.getText();
        ip6IPAdress.setOpaque(true);
        Font ip6AvailabiltylabelFont = ip6AvailabilityjLableValue.getFont();
        ip6AvailabilityjLableValue.setFont(new Font(ip6AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip6FiledWorkerEngine();
        
        Geraete geraete7 = new Geraete();
        ip7IPAdress.setText(geraete7.getIpAdresse());
        ip7Interval = Integer.valueOf((String) ip7IntervaljComboBox.getSelectedItem());
        ip7Schwellwert = Integer.valueOf((String) ip7SchwellwertListjComboBox.getSelectedItem());
        ip7MaxSchwellwert = Integer.valueOf((String) ip7MaxSchwellwertListjComboBox.getSelectedItem());
        ip7Name = (String) ip7NamesListjComboBox.getSelectedItem();
        ip7EMail = ip7EMailjTextFieldValue.getText();
        ip7IPAdress.setOpaque(true);
        Font ip7AvailabiltylabelFont = ip7AvailabilityjLableValue.getFont();
        ip7AvailabilityjLableValue.setFont(new Font(ip7AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip7FiledWorkerEngine();
        
         Geraete geraete8 = new Geraete();
        ip8IPAdress.setText(geraete8.getIpAdresse());
        ip8Interval = Integer.valueOf((String) ip8IntervaljComboBox.getSelectedItem());
        ip8Schwellwert = Integer.valueOf((String) ip8SchwellwertListjComboBox.getSelectedItem());
        ip8MaxSchwellwert = Integer.valueOf((String) ip8MaxSchwellwertListjComboBox.getSelectedItem());
        ip8Name = (String) ip8NamesListjComboBox.getSelectedItem();
        ip8EMail = ip8EMailjTextFieldValue.getText();
        ip8IPAdress.setOpaque(true);
        Font ip8AvailabiltylabelFont = ip8AvailabilityjLableValue.getFont();
        ip8AvailabilityjLableValue.setFont(new Font(ip8AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip8FiledWorkerEngine();
        
         Geraete geraete9 = new Geraete();
        ip9IPAdress.setText(geraete9.getIpAdresse());
        ip9Interval = Integer.valueOf((String) ip9IntervaljComboBox.getSelectedItem());
        ip9Schwellwert = Integer.valueOf((String) ip9SchwellwertListjComboBox.getSelectedItem());
        ip9MaxSchwellwert = Integer.valueOf((String) ip9MaxSchwellwertListjComboBox.getSelectedItem());
        ip9Name = (String) ip9NamesListjComboBox.getSelectedItem();
        ip9EMail = ip9EMailjTextFieldValue.getText();
        ip9IPAdress.setOpaque(true);
        Font ip9AvailabiltylabelFont = ip9AvailabilityjLableValue.getFont();
        ip9AvailabilityjLableValue.setFont(new Font(ip9AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip9FiledWorkerEngine();
        
         Geraete geraete10 = new Geraete();
        ip10IPAdress.setText(geraete10.getIpAdresse());
        ip10Interval = Integer.valueOf((String) ip10IntervaljComboBox.getSelectedItem());
        ip10Schwellwert = Integer.valueOf((String) ip10SchwellwertListjComboBox.getSelectedItem());
        ip10MaxSchwellwert = Integer.valueOf((String) ip10MaxSchwellwertListjComboBox.getSelectedItem());
        ip10Name = (String) ip10NamesListjComboBox.getSelectedItem();
        ip10EMail = ip10EMailjTextFieldValue.getText();
        ip10IPAdress.setOpaque(true);
        Font ip10AvailabiltylabelFont = ip10AvailabilityjLableValue.getFont();
        ip10AvailabilityjLableValue.setFont(new Font(ip10AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip10FiledWorkerEngine();
        
         Geraete geraete11 = new Geraete();
        ip11IPAdress.setText(geraete11.getIpAdresse());
        ip11Interval = Integer.valueOf((String) ip11IntervaljComboBox.getSelectedItem());
        ip11Schwellwert = Integer.valueOf((String) ip11SchwellwertListjComboBox.getSelectedItem());
        ip11MaxSchwellwert = Integer.valueOf((String) ip11MaxSchwellwertListjComboBox.getSelectedItem());
        ip11Name = (String) ip11NamesListjComboBox.getSelectedItem();
        ip11EMail = ip11EMailjTextFieldValue.getText();
        ip11IPAdress.setOpaque(true);
        Font ip11AvailabiltylabelFont = ip11AvailabilityjLableValue.getFont();
        ip11AvailabilityjLableValue.setFont(new Font(ip11AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip11FiledWorkerEngine();
        
         Geraete geraete12 = new Geraete();
        ip12IPAdress.setText(geraete12.getIpAdresse());
        ip12Interval = Integer.valueOf((String) ip12IntervaljComboBox.getSelectedItem());
        ip12Schwellwert = Integer.valueOf((String) ip12SchwellwertListjComboBox.getSelectedItem());
        ip12MaxSchwellwert = Integer.valueOf((String) ip12MaxSchwellwertListjComboBox.getSelectedItem());
        ip12Name = (String) ip12NamesListjComboBox.getSelectedItem();
        ip12EMail = ip12EMailjTextFieldValue.getText();
        ip12IPAdress.setOpaque(true);
        Font ip12AvailabiltylabelFont = ip12AvailabilityjLableValue.getFont();
        ip12AvailabilityjLableValue.setFont(new Font(ip12AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip12FiledWorkerEngine();
        
        Geraete geraete13 = new Geraete();
        ip13IPAdress.setText(geraete13.getIpAdresse());
        ip13Interval = Integer.valueOf((String) ip13IntervaljComboBox.getSelectedItem());
        ip13Schwellwert = Integer.valueOf((String) ip13SchwellwertListjComboBox.getSelectedItem());
        ip13MaxSchwellwert = Integer.valueOf((String) ip13MaxSchwellwertListjComboBox.getSelectedItem());
        ip13Name = (String) ip13NamesListjComboBox.getSelectedItem();
        ip13EMail = ip13EMailjTextFieldValue.getText();
        ip13IPAdress.setOpaque(true);
        Font ip13AvailabiltylabelFont = ip13AvailabilityjLableValue.getFont();
        ip13AvailabilityjLableValue.setFont(new Font(ip13AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip13FiledWorkerEngine();
        
        Geraete geraete14 = new Geraete();
        ip14IPAdress.setText(geraete14.getIpAdresse());
        ip14Interval = Integer.valueOf((String) ip14IntervaljComboBox.getSelectedItem());
        ip14Schwellwert = Integer.valueOf((String) ip14SchwellwertListjComboBox.getSelectedItem());
        ip14MaxSchwellwert = Integer.valueOf((String) ip14MaxSchwellwertListjComboBox.getSelectedItem());
        ip14Name = (String) ip14NamesListjComboBox.getSelectedItem();
        ip14EMail = ip14EMailjTextFieldValue.getText();
        ip14IPAdress.setOpaque(true);
        Font ip14AvailabiltylabelFont = ip14AvailabilityjLableValue.getFont();
        ip14AvailabilityjLableValue.setFont(new Font(ip14AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip14FiledWorkerEngine();
        
              Geraete geraete15 = new Geraete();
        ip15IPAdress.setText(geraete15.getIpAdresse());
        ip15Interval = Integer.valueOf((String) ip15IntervaljComboBox.getSelectedItem());
        ip15Schwellwert = Integer.valueOf((String) ip15SchwellwertListjComboBox.getSelectedItem());
        ip15MaxSchwellwert = Integer.valueOf((String) ip15MaxSchwellwertListjComboBox.getSelectedItem());
        ip15Name = (String) ip15NamesListjComboBox.getSelectedItem();
        ip15EMail = ip15EMailjTextFieldValue.getText();
        ip15IPAdress.setOpaque(true);
        Font ip15AvailabiltylabelFont = ip15AvailabilityjLableValue.getFont();
        ip15AvailabilityjLableValue.setFont(new Font(ip15AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip15FiledWorkerEngine();
        
         Geraete geraete16 = new Geraete();
        ip16IPAdress.setText(geraete16.getIpAdresse());
        ip16Interval = Integer.valueOf((String) ip16IntervaljComboBox.getSelectedItem());
        ip16Schwellwert = Integer.valueOf((String) ip16SchwellwertListjComboBox.getSelectedItem());
        ip16MaxSchwellwert = Integer.valueOf((String) ip16MaxSchwellwertListjComboBox.getSelectedItem());
        ip16Name = (String) ip16NamesListjComboBox.getSelectedItem();
        ip16EMail = ip16EMailjTextFieldValue.getText();
        ip16IPAdress.setOpaque(true);
        Font ip16AvailabiltylabelFont = ip16AvailabilityjLableValue.getFont();
        ip16AvailabilityjLableValue.setFont(new Font(ip16AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip16FiledWorkerEngine();
        
        
        Geraete geraete17 = new Geraete();
        ip17IPAdress.setText(geraete17.getIpAdresse());
        ip17Interval = Integer.valueOf((String) ip17IntervaljComboBox.getSelectedItem());
        ip17Schwellwert = Integer.valueOf((String) ip17SchwellwertListjComboBox.getSelectedItem());
        ip17MaxSchwellwert = Integer.valueOf((String) ip17MaxSchwellwertListjComboBox.getSelectedItem());
        ip17Name = (String) ip17NamesListjComboBox.getSelectedItem();
        ip17EMail = ip17EMailjTextFieldValue.getText();
        ip17IPAdress.setOpaque(true);
        Font ip17AvailabiltylabelFont = ip17AvailabilityjLableValue.getFont();
        ip17AvailabilityjLableValue.setFont(new Font(ip17AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip17FiledWorkerEngine();
        
        Geraete geraete18 = new Geraete();
        ip18IPAdress.setText(geraete18.getIpAdresse());
        ip18Interval = Integer.valueOf((String) ip18IntervaljComboBox.getSelectedItem());
        ip18Schwellwert = Integer.valueOf((String) ip18SchwellwertListjComboBox.getSelectedItem());
        ip18MaxSchwellwert = Integer.valueOf((String) ip18MaxSchwellwertListjComboBox.getSelectedItem());
        ip18Name = (String) ip18NamesListjComboBox.getSelectedItem();
        ip18EMail = ip18EMailjTextFieldValue.getText();
        ip18IPAdress.setOpaque(true);
        Font ip18AvailabiltylabelFont = ip18AvailabilityjLableValue.getFont();
        ip18AvailabilityjLableValue.setFont(new Font(ip18AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip18FiledWorkerEngine();
        
         Geraete geraete19 = new Geraete();
        ip19IPAdress.setText(geraete19.getIpAdresse());
        ip19Interval = Integer.valueOf((String) ip19IntervaljComboBox.getSelectedItem());
        ip19Schwellwert = Integer.valueOf((String) ip19SchwellwertListjComboBox.getSelectedItem());
        ip19MaxSchwellwert = Integer.valueOf((String) ip19MaxSchwellwertListjComboBox.getSelectedItem());
        ip19Name = (String) ip19NamesListjComboBox.getSelectedItem();
        ip19EMail = ip19EMailjTextFieldValue.getText();
        ip19IPAdress.setOpaque(true);
        Font ip19AvailabiltylabelFont = ip19AvailabilityjLableValue.getFont();
        ip19AvailabilityjLableValue.setFont(new Font(ip19AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip19FiledWorkerEngine();
        
         Geraete geraete20 = new Geraete();
        ip20IPAdress.setText(geraete20.getIpAdresse());
        ip20Interval = Integer.valueOf((String) ip20IntervaljComboBox.getSelectedItem());
        ip20Schwellwert = Integer.valueOf((String) ip20SchwellwertListjComboBox.getSelectedItem());
        ip20MaxSchwellwert = Integer.valueOf((String) ip20MaxSchwellwertListjComboBox.getSelectedItem());
        ip20Name = (String) ip20NamesListjComboBox.getSelectedItem();
        ip20EMail = ip20EMailjTextFieldValue.getText();
        ip20IPAdress.setOpaque(true);
        Font ip20AvailabiltylabelFont = ip20AvailabilityjLableValue.getFont();
        ip20AvailabilityjLableValue.setFont(new Font(ip20AvailabiltylabelFont.getName(), Font.PLAIN, 20));
        ip20FiledWorkerEngine();

    }//GEN-LAST:event_startjButtonActionPerformed

    private void ipOneStopjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipOneStopjButtonActionPerformed

        ipOneFieldWorker.cancel(true);
        ip2FieldWorker.cancel(true);
        ip3FieldWorker.cancel(true);
        ip4FieldWorker.cancel(true);
        ip5FieldWorker.cancel(true);
        ip6FieldWorker.cancel(true);
        ip7FieldWorker.cancel(true);
        ip8FieldWorker.cancel(true);
        ip9FieldWorker.cancel(true);
        ip10FieldWorker.cancel(true);
        ip11FieldWorker.cancel(true);
        ip12FieldWorker.cancel(true);
        ip13FieldWorker.cancel(true);
        ip14FieldWorker.cancel(true);
        ip15FieldWorker.cancel(true);
        ip16FieldWorker.cancel(true);
        ip17FieldWorker.cancel(true);
        ip18FieldWorker.cancel(true);
        ip19FieldWorker.cancel(true);
        ip20FieldWorker.cancel(true);

    }//GEN-LAST:event_ipOneStopjButtonActionPerformed

    public void ipOneFiledWorkerEngine(){
//        ipOneFieldWorker = new IpFieldWorker(ipOneIPAdress, ipOneAvailabilityjLableValue, ipOneInterval, ipOneSchwellwert, ipOneMaxSchwellwert, ipOneName, ipOneEMail);
        ipOneFieldWorker.execute();
    }
    
     public void ip2FiledWorkerEngine(){
        
        ip2FieldWorker.execute();
    }
     
    public void ip3FiledWorkerEngine() {
        
        ip3FieldWorker.execute();
    }

    public void ip4FiledWorkerEngine() {
//        ip4FieldWorker = new IpFieldWorker(ip4IPAdress, ip4AvailabilityjLableValue, ip4Interval, ip4Schwellwert, ip4MaxSchwellwert, ip4Name, ip4EMail);
        ip4FieldWorker.execute();
    }

    public void ip5FiledWorkerEngine() {
//        ip5FieldWorker = new IpFieldWorker(ip5IPAdress, ip5AvailabilityjLableValue, ip5Interval, ip5Schwellwert, ip5MaxSchwellwert, ip5Name, ip5EMail);
        ip5FieldWorker.execute();
    }
    
     public void ip6FiledWorkerEngine() {
//        ip6FieldWorker = new IpFieldWorker(ip6IPAdress, ip6AvailabilityjLableValue, ip6Interval, ip6Schwellwert, ip6MaxSchwellwert, ip6Name, ip6EMail);
        ip6FieldWorker.execute();
    }
     
    public void ip7FiledWorkerEngine() {
//        ip7FieldWorker = new IpFieldWorker(ip7IPAdress, ip7AvailabilityjLableValue, ip7Interval, ip7Schwellwert, ip7MaxSchwellwert, ip7Name, ip7EMail);
        ip7FieldWorker.execute();
    }
    
     public void ip8FiledWorkerEngine() {
//        ip8FieldWorker = new IpFieldWorker(ip8IPAdress, ip8AvailabilityjLableValue, ip8Interval, ip8Schwellwert, ip8MaxSchwellwert, ip8Name, ip8EMail);
        ip8FieldWorker.execute();
    }
     
    public void ip9FiledWorkerEngine() {
//        ip9FieldWorker = new IpFieldWorker(ip9IPAdress, ip9AvailabilityjLableValue, ip9Interval, ip9Schwellwert, ip9MaxSchwellwert, ip9Name, ip9EMail);
        ip9FieldWorker.execute();
    }
    
       public void ip10FiledWorkerEngine() {
//        ip10FieldWorker = new IpFieldWorker(ip10IPAdress, ip10AvailabilityjLableValue, ip10Interval, ip10Schwellwert, ip10MaxSchwellwert, ip10Name, ip10EMail);
        ip10FieldWorker.execute();
    }
       
     public void ip11FiledWorkerEngine() {
//        ip11FieldWorker = new IpFieldWorker(ip11IPAdress, ip11AvailabilityjLableValue, ip11Interval, ip11Schwellwert, ip11MaxSchwellwert, ip11Name, ip11EMail);
        ip11FieldWorker.execute();
    }
     
       public void ip12FiledWorkerEngine() {
//        ip12FieldWorker = new IpFieldWorker(ip12IPAdress, ip12AvailabilityjLableValue, ip12Interval, ip12Schwellwert, ip12MaxSchwellwert, ip12Name, ip12EMail);
        ip12FieldWorker.execute();
    }
    
        public void ip13FiledWorkerEngine() {
//        ip13FieldWorker = new IpFieldWorker(ip13IPAdress, ip13AvailabilityjLableValue, ip13Interval, ip13Schwellwert, ip13MaxSchwellwert, ip13Name, ip13EMail);
        ip13FieldWorker.execute();
    }
       public void ip14FiledWorkerEngine() {
//        ip14FieldWorker = new IpFieldWorker(ip14IPAdress, ip14AvailabilityjLableValue, ip14Interval, ip14Schwellwert, ip14MaxSchwellwert, ip14Name, ip14EMail);
        ip14FieldWorker.execute();
    }

    public void ip15FiledWorkerEngine() {
//        ip15FieldWorker = new IpFieldWorker(ip15IPAdress, ip15AvailabilityjLableValue, ip15Interval, ip15Schwellwert, ip15MaxSchwellwert, ip15Name, ip15EMail);
        ip15FieldWorker.execute();
    }

    public void ip16FiledWorkerEngine() {
//        ip16FieldWorker = new IpFieldWorker(ip16IPAdress, ip16AvailabilityjLableValue, ip16Interval, ip16Schwellwert, ip16MaxSchwellwert, ip16Name, ip16EMail);
        ip16FieldWorker.execute();
    }

    public void ip17FiledWorkerEngine() {
//        ip17FieldWorker = new IpFieldWorker(ip17IPAdress, ip17AvailabilityjLableValue, ip17Interval, ip17Schwellwert, ip17MaxSchwellwert, ip17Name, ip17EMail);
        ip17FieldWorker.execute();
    }

    public void ip18FiledWorkerEngine() {
//        ip18FieldWorker = new IpFieldWorker(ip18IPAdress, ip18AvailabilityjLableValue, ip18Interval, ip18Schwellwert, ip18MaxSchwellwert, ip18Name, ip18EMail);
        ip18FieldWorker.execute();
    }
        public void ip19FiledWorkerEngine() {
//        ip19FieldWorker = new IpFieldWorker(ip19IPAdress, ip19AvailabilityjLableValue, ip19Interval, ip19Schwellwert, ip19MaxSchwellwert, ip19Name, ip19EMail);
        ip19FieldWorker.execute();
    }
        public void ip20FiledWorkerEngine() {
//        ip20FieldWorker = new IpFieldWorker(ip20IPAdress, ip20AvailabilityjLableValue, ip20Interval, ip20Schwellwert, ip20MaxSchwellwert, ip20Name, ip20EMail);
        ip20FieldWorker.execute();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PingToolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PingToolUI().setVisible(true);
            }
        });
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ip10AvailabilityjLableValue;
    private javax.swing.JLabel ip10EMailjLabel1;
    private javax.swing.JTextField ip10EMailjTextFieldValue;
    private javax.swing.JLabel ip10IPAdress;
    private javax.swing.JComboBox ip10IntervaljComboBox;
    private javax.swing.JLabel ip10IntervaljLabel;
    private javax.swing.JComboBox ip10MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip10MaxSequentialityListjLable;
    private javax.swing.JComboBox ip10NamesListjComboBox;
    private javax.swing.JLabel ip10NamesListjLable;
    private javax.swing.JComboBox ip10SchwellwertListjComboBox;
    private javax.swing.JLabel ip10SchwellwertListjLable;
    private javax.swing.JLabel ip10availabilityjLabel;
    private javax.swing.JLabel ip10jLabelCaption;
    private javax.swing.JLabel ip11AvailabilityjLableValue;
    private javax.swing.JLabel ip11EMailjLabel;
    private javax.swing.JTextField ip11EMailjTextFieldValue;
    private javax.swing.JLabel ip11IPAdress;
    private javax.swing.JComboBox ip11IntervaljComboBox;
    private javax.swing.JLabel ip11IntervaljLabel;
    private javax.swing.JComboBox ip11MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip11MaxSequentialityListjLable;
    private javax.swing.JComboBox ip11NamesListjComboBox;
    private javax.swing.JLabel ip11NamesListjLable;
    private javax.swing.JComboBox ip11SchwellwertListjComboBox;
    private javax.swing.JLabel ip11SchwellwertListjLable;
    private javax.swing.JLabel ip11availabilityjLabel;
    private javax.swing.JLabel ip11jLabelCaption;
    private javax.swing.JLabel ip12AvailabilityjLableValue;
    private javax.swing.JLabel ip12EMailjLabel;
    private javax.swing.JTextField ip12EMailjTextFieldValue;
    private javax.swing.JLabel ip12IPAdress;
    private javax.swing.JComboBox ip12IntervaljComboBox;
    private javax.swing.JLabel ip12IntervaljLabel;
    private javax.swing.JComboBox ip12MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip12MaxSequentialityListjLable;
    private javax.swing.JComboBox ip12NamesListjComboBox;
    private javax.swing.JLabel ip12NamesListjLable;
    private javax.swing.JComboBox ip12SchwellwertListjComboBox;
    private javax.swing.JLabel ip12SchwellwertListjLable;
    private javax.swing.JLabel ip12availabilityjLabel;
    private javax.swing.JLabel ip12jLabelCaption;
    private javax.swing.JLabel ip13AvailabilityjLableValue;
    private javax.swing.JLabel ip13EMailjLabe;
    private javax.swing.JTextField ip13EMailjTextFieldValue;
    private javax.swing.JLabel ip13IPAdress;
    private javax.swing.JComboBox ip13IntervaljComboBox;
    private javax.swing.JLabel ip13IntervaljLabel;
    private javax.swing.JComboBox ip13MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip13MaxSequentialityListjLable;
    private javax.swing.JComboBox ip13NamesListjComboBox;
    private javax.swing.JLabel ip13NamesListjLable;
    private javax.swing.JComboBox ip13SchwellwertListjComboBox;
    private javax.swing.JLabel ip13SchwellwertListjLable;
    private javax.swing.JLabel ip13availabilityjLabel;
    private javax.swing.JLabel ip13jLabelCaption;
    private javax.swing.JLabel ip14AvailabilityjLableValue;
    private javax.swing.JLabel ip14EMailjLabel;
    private javax.swing.JTextField ip14EMailjTextFieldValue;
    private javax.swing.JLabel ip14IPAdress;
    private javax.swing.JComboBox ip14IntervaljComboBox;
    private javax.swing.JLabel ip14IntervaljLabel;
    private javax.swing.JComboBox ip14MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip14MaxSequentialityListjLable;
    private javax.swing.JComboBox ip14NamesListjComboBox;
    private javax.swing.JLabel ip14NamesListjLable;
    private javax.swing.JComboBox ip14SchwellwertListjComboBox;
    private javax.swing.JLabel ip14SchwellwertListjLable;
    private javax.swing.JLabel ip14availabilityjLabel;
    private javax.swing.JLabel ip14jLabelCaption;
    private javax.swing.JLabel ip15AvailabilityjLableValue;
    private javax.swing.JLabel ip15EMailjLabel;
    private javax.swing.JTextField ip15EMailjTextFieldValue;
    private javax.swing.JLabel ip15IPAdress;
    private javax.swing.JComboBox ip15IntervaljComboBox;
    private javax.swing.JLabel ip15IntervaljLabel;
    private javax.swing.JComboBox ip15MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip15MaxSequentialityListjLable;
    private javax.swing.JComboBox ip15NamesListjComboBox;
    private javax.swing.JLabel ip15NamesListjLable;
    private javax.swing.JComboBox ip15SchwellwertListjComboBox;
    private javax.swing.JLabel ip15SchwellwertListjLable;
    private javax.swing.JLabel ip15availabilityjLabel;
    private javax.swing.JLabel ip15jLabelCaption;
    private javax.swing.JLabel ip16AvailabilityjLableValue;
    private javax.swing.JLabel ip16EMailjLabel;
    private javax.swing.JTextField ip16EMailjTextFieldValue;
    private javax.swing.JLabel ip16IPAdress;
    private javax.swing.JComboBox ip16IntervaljComboBox;
    private javax.swing.JLabel ip16IntervaljLabel;
    private javax.swing.JComboBox ip16MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip16MaxSequentialityListjLable;
    private javax.swing.JComboBox ip16NamesListjComboBox;
    private javax.swing.JLabel ip16NamesListjLable;
    private javax.swing.JComboBox ip16SchwellwertListjComboBox;
    private javax.swing.JLabel ip16SchwellwertListjLable;
    private javax.swing.JLabel ip16availabilityjLabel;
    private javax.swing.JLabel ip16jLabelCaption;
    private javax.swing.JLabel ip17AvailabilityjLableValue;
    private javax.swing.JLabel ip17EMailjLabel;
    private javax.swing.JTextField ip17EMailjTextFieldValue;
    private javax.swing.JLabel ip17IPAdress;
    private javax.swing.JComboBox ip17IntervaljComboBox;
    private javax.swing.JLabel ip17IntervaljLabel;
    private javax.swing.JComboBox ip17MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip17MaxSequentialityListjLable;
    private javax.swing.JComboBox ip17NamesListjComboBox;
    private javax.swing.JLabel ip17NamesListjLable;
    private javax.swing.JComboBox ip17SchwellwertListjComboBox;
    private javax.swing.JLabel ip17SchwellwertListjLable;
    private javax.swing.JLabel ip17availabilityjLabel;
    private javax.swing.JLabel ip17jLabelCaption;
    private javax.swing.JLabel ip18AvailabilityjLableValue;
    private javax.swing.JLabel ip18EMailjLabel;
    private javax.swing.JTextField ip18EMailjTextFieldValue;
    private javax.swing.JLabel ip18IPAdress;
    private javax.swing.JComboBox ip18IntervaljComboBox;
    private javax.swing.JLabel ip18IntervaljLabel;
    private javax.swing.JComboBox ip18MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip18MaxSequentialityListjLable;
    private javax.swing.JComboBox ip18NamesListjComboBox;
    private javax.swing.JLabel ip18NamesListjLable;
    private javax.swing.JComboBox ip18SchwellwertListjComboBox;
    private javax.swing.JLabel ip18SchwellwertListjLable;
    private javax.swing.JLabel ip18availabilityjLabel;
    private javax.swing.JLabel ip18jLabelCaption;
    private javax.swing.JLabel ip19AvailabilityjLableValue;
    private javax.swing.JLabel ip19EMailjLabel;
    private javax.swing.JTextField ip19EMailjTextFieldValue;
    private javax.swing.JLabel ip19IPAdress;
    private javax.swing.JComboBox ip19IntervaljComboBox;
    private javax.swing.JLabel ip19IntervaljLabel;
    private javax.swing.JComboBox ip19MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip19MaxSequentialityListjLable;
    private javax.swing.JComboBox ip19NamesListjComboBox;
    private javax.swing.JLabel ip19NamesListjLable;
    private javax.swing.JComboBox ip19SchwellwertListjComboBox;
    private javax.swing.JLabel ip19SchwellwertListjLable;
    private javax.swing.JLabel ip19availabilityjLabel;
    private javax.swing.JLabel ip19jLabelCaption;
    private javax.swing.JLabel ip1IntervaljLabel;
    private javax.swing.JLabel ip1IntervaljLabel9;
    private javax.swing.JLabel ip20AvailabilityjLableValue;
    private javax.swing.JLabel ip20EMailjLabel;
    private javax.swing.JTextField ip20EMailjTextFieldValue;
    private javax.swing.JLabel ip20IPAdress;
    private javax.swing.JComboBox ip20IntervaljComboBox;
    private javax.swing.JLabel ip20IntervaljLabel;
    private javax.swing.JComboBox ip20MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip20MaxSequentialityListjLable;
    private javax.swing.JComboBox ip20NamesListjComboBox;
    private javax.swing.JLabel ip20NamesListjLable;
    private javax.swing.JComboBox ip20SchwellwertListjComboBox;
    private javax.swing.JLabel ip20SchwellwertListjLable;
    private javax.swing.JLabel ip20availabilityjLabel;
    private javax.swing.JLabel ip20jLabelCaption;
    private javax.swing.JLabel ip2AvailabilityjLabel;
    private javax.swing.JLabel ip2AvailabilityjLableValue;
    private javax.swing.JLabel ip2EMailjLabel;
    private javax.swing.JTextField ip2EMailjTextFieldValue;
    private javax.swing.JLabel ip2IPAdress;
    private javax.swing.JComboBox ip2IntervaljComboBox;
    private javax.swing.JLabel ip2IntervaljLabel;
    private javax.swing.JComboBox ip2MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip2MaxSequentialityListjLable;
    private javax.swing.JComboBox ip2NamesListjComboBox;
    private javax.swing.JLabel ip2NamesListjLable;
    private javax.swing.JComboBox ip2SchwellwertListjComboBox;
    private javax.swing.JLabel ip2SchwellwertListjLable;
    private javax.swing.JLabel ip2jLabelCaption;
    private javax.swing.JLabel ip3AvailabilityjLabel3;
    private javax.swing.JLabel ip3AvailabilityjLableValue;
    private javax.swing.JLabel ip3EMailjLabel;
    private javax.swing.JTextField ip3EMailjTextFieldValue;
    private javax.swing.JLabel ip3IPAdress;
    private javax.swing.JComboBox ip3IntervaljComboBox;
    private javax.swing.JLabel ip3IntervaljLabel;
    private javax.swing.JComboBox ip3MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip3MaxSequentialityListjLable;
    private javax.swing.JComboBox ip3NamesListjComboBox;
    private javax.swing.JComboBox ip3SchwellwertListjComboBox;
    private javax.swing.JLabel ip3SchwellwertListjLable3;
    private javax.swing.JLabel ip3jLabelCaption;
    private javax.swing.JLabel ip4AvailabilityjLableValue;
    private javax.swing.JLabel ip4EMailjLabel;
    private javax.swing.JTextField ip4EMailjTextFieldValue;
    private javax.swing.JLabel ip4IPAdress;
    private javax.swing.JComboBox ip4IntervaljComboBox;
    private javax.swing.JLabel ip4IntervaljLabel;
    private javax.swing.JComboBox ip4MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip4MaxSequentialityListjLable;
    private javax.swing.JComboBox ip4NamesListjComboBox;
    private javax.swing.JLabel ip4NamesListjLable;
    private javax.swing.JComboBox ip4SchwellwertListjComboBox;
    private javax.swing.JLabel ip4SchwellwertListjLable;
    private javax.swing.JLabel ip4availabilityjLabel;
    private javax.swing.JLabel ip4jLabelCaption;
    private javax.swing.JLabel ip5AvailabilityjLableValue;
    private javax.swing.JLabel ip5EMailjLabel;
    private javax.swing.JTextField ip5EMailjTextFieldValue;
    private javax.swing.JLabel ip5IPAdress;
    private javax.swing.JComboBox ip5IntervaljComboBox;
    private javax.swing.JLabel ip5IntervaljLabel;
    private javax.swing.JComboBox ip5MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip5MaxSequentialityListjLable;
    private javax.swing.JComboBox ip5NamesListjComboBox;
    private javax.swing.JLabel ip5NamesListjLable;
    private javax.swing.JComboBox ip5SchwellwertListjComboBox;
    private javax.swing.JLabel ip5SchwellwertListjLable;
    private javax.swing.JLabel ip5availabilityjLabel;
    private javax.swing.JLabel ip5jLabelCaption;
    private javax.swing.JLabel ip6AvailabilityjLableValue;
    private javax.swing.JLabel ip6EMailjLabel;
    private javax.swing.JTextField ip6EMailjTextFieldValue;
    private javax.swing.JLabel ip6IPAdress;
    private javax.swing.JComboBox ip6IntervaljComboBox;
    private javax.swing.JLabel ip6IntervaljLabel;
    private javax.swing.JComboBox ip6MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip6MaxSequentialityListjLable;
    private javax.swing.JComboBox ip6NamesListjComboBox;
    private javax.swing.JLabel ip6NamesListjLable;
    private javax.swing.JComboBox ip6SchwellwertListjComboBox;
    private javax.swing.JLabel ip6SchwellwertListjLable;
    private javax.swing.JLabel ip6availabilityjLabel;
    private javax.swing.JLabel ip6jLabelCaption;
    private javax.swing.JLabel ip7AvailabilityjLableValue;
    private javax.swing.JLabel ip7EMailjLabel;
    private javax.swing.JTextField ip7EMailjTextFieldValue;
    private javax.swing.JLabel ip7IPAdress;
    private javax.swing.JComboBox ip7IntervaljComboBox;
    private javax.swing.JLabel ip7IntervaljLabel;
    private javax.swing.JComboBox ip7MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip7MaxSequentialityListjLable;
    private javax.swing.JComboBox ip7NamesListjComboBox;
    private javax.swing.JLabel ip7NamesListjLable;
    private javax.swing.JComboBox ip7SchwellwertListjComboBox;
    private javax.swing.JLabel ip7SchwellwertListjLable;
    private javax.swing.JLabel ip7availabilityjLabel;
    private javax.swing.JLabel ip7jLabelCaption;
    private javax.swing.JLabel ip8AvailabilityjLableValue;
    private javax.swing.JLabel ip8EMailjLabel;
    private javax.swing.JTextField ip8EMailjTextFieldValue;
    private javax.swing.JLabel ip8IPAdress;
    private javax.swing.JComboBox ip8IntervaljComboBox;
    private javax.swing.JLabel ip8IntervaljLabel;
    private javax.swing.JComboBox ip8MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip8MaxSequentialityListjLable;
    private javax.swing.JComboBox ip8NamesListjComboBox;
    private javax.swing.JLabel ip8NamesListjLable;
    private javax.swing.JComboBox ip8SchwellwertListjComboBox;
    private javax.swing.JLabel ip8SchwellwertListjLable;
    private javax.swing.JLabel ip8availabilityjLabel;
    private javax.swing.JLabel ip8jLabelCaption;
    private javax.swing.JLabel ip9AvailabilityjLableValue;
    private javax.swing.JLabel ip9EMailjLabel;
    private javax.swing.JTextField ip9EMailjTextFieldValue;
    private javax.swing.JLabel ip9IPAdress;
    private javax.swing.JComboBox ip9IntervaljComboBox;
    private javax.swing.JLabel ip9IntervaljLabel;
    private javax.swing.JComboBox ip9MaxSchwellwertListjComboBox;
    private javax.swing.JLabel ip9MaxSequentialityListjLable;
    private javax.swing.JComboBox ip9NamesListjComboBox;
    private javax.swing.JLabel ip9NamesListjLable;
    private javax.swing.JComboBox ip9SchwellwertListjComboBox;
    private javax.swing.JLabel ip9SchwellwertListjLable;
    private javax.swing.JLabel ip9availabilityjLabel;
    private javax.swing.JLabel ip9jLabelCaption;
    private javax.swing.JLabel ipONEavailabilityjLabel;
    private javax.swing.JLabel ipONEavailabilityjLabel9;
    private javax.swing.JLabel ipOneAvailabilityjLableValue;
    private javax.swing.JLabel ipOneAvailabilityjLableValue9;
    private javax.swing.JLabel ipOneEMailjLabel;
    private javax.swing.JLabel ipOneEMailjLabel9;
    private javax.swing.JTextField ipOneEMailjTextFieldValue;
    private javax.swing.JTextField ipOneEMailjTextFieldValue9;
    private javax.swing.JLabel ipOneIPAdress;
    private javax.swing.JLabel ipOneIPAdress9;
    private javax.swing.JComboBox ipOneIntervaljComboBox;
    private javax.swing.JComboBox ipOneIntervaljComboBox9;
    private javax.swing.JComboBox ipOneMaxSchwellwertListjComboBox;
    private javax.swing.JComboBox ipOneMaxSchwellwertListjComboBox9;
    private javax.swing.JLabel ipOneMaxSequentialityListjLable;
    private javax.swing.JLabel ipOneMaxSequentialityListjLable9;
    private javax.swing.JComboBox ipOneNamesListjComboBox;
    private javax.swing.JComboBox ipOneNamesListjComboBox9;
    private javax.swing.JLabel ipOneNamesListjLable;
    private javax.swing.JLabel ipOneNamesListjLable3;
    private javax.swing.JLabel ipOneNamesListjLable9;
    private javax.swing.JComboBox ipOneSchwellwertListjComboBox;
    private javax.swing.JComboBox ipOneSchwellwertListjComboBox9;
    private javax.swing.JLabel ipOneSchwellwertListjLable;
    private javax.swing.JLabel ipOneSchwellwertListjLable9;
    private javax.swing.JButton ipOneStopjButton;
    private javax.swing.JLabel ipOnejLabelCaption;
    private javax.swing.JLabel ipOnejLabelCaption9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton startjButton;
    // End of variables declaration//GEN-END:variables
}
