/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pingtool.logic;

import java.util.Random;

/**
 *
 * @author mazy
 */
public class Geraete {
    	protected String ipAdresse = createIPAdresse();
	protected String name = null;
	protected Integer interval = 0; // how often (seconds) do we call this ip
	protected Integer schwellwert = 0; // how many second after not responding must we								// alarm
	public Integer maxSchwellwert = 0; // how many times we passed the threshold an									// we have to react
	public String eMail = null;
	

	public String getIpAdresse() {
		return ipAdresse;
	}
	public void setIpAdresse(String ipAdresse) {
		this.ipAdresse = ipAdresse;
	}

	
	public static String createIPAdresse(){
		Integer ipFirstPart = randInt(1, 254);
		Integer ipSecondPart = randInt(1, 254);
		Integer ipThirdPart = randInt(1, 254);
		Integer ipFourthPart = randInt(1, 254);
		String ipAdresse = ipFirstPart+"."+ipSecondPart+"."+ipThirdPart+"."+ipFourthPart;
		return ipAdresse;
	}
	
	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
