package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
      //get Target class obj having Dependent class obj
		Flipkart fpkt = FlipkartFactory.getInstance();
		//Invoke b.method
		String result = fpkt.shopping(new String[] {"shirt","trouser","watch"}, 
				                      new float[] {4000.0f,6000.0f,30000.0f});
		
		System.out.println(result);
	}

}/*
Flow of the application
***********************
*controller come to main method 
*Flipkart fpkt = FlipkartFactory.getInstance() //first class is loaded
*static block execute load properties file and load properties data.
*now controller come to getInstance method -> here properties FedEx -> fedEx object is created -> flipkart obj is created and fedEx is assign to
*flipkart. 
*/