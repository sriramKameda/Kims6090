package com.w2a.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomString {
	

	
	    public static String lastName() {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder(4);

	        for(int i = 0; i < 4; i++) {
	            sb.append(characters.charAt(random.nextInt(characters.length())));
	        }

	        System.out.println(sb.toString());
	        
	        String lastName= sb.toString();
	        
			return lastName;
	    }
	    
	    
	    
	    public static String DOCID() {
	    	
	    	String timestamp = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
			System.out.println(timestamp);
	    	
			return timestamp;
	   
	    }
	    
	}


