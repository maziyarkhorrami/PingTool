/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pingtool.logic;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Ping  {

	protected boolean randomBoolean = false ;
	public boolean isRandomBoolean() {
		return randomBoolean;
	}

	public void setRandomBoolean(boolean randomBoolean) {
		this.randomBoolean = randomBoolean;
	}

	// Iterative function
	public void erreichbarkeit() {
		Random randomno = new Random();
		randomBoolean = randomno.nextBoolean();

	}
}
