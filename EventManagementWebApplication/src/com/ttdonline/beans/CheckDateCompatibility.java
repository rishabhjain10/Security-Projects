package com.ttdonline.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CheckDateCompatibility {
    public boolean checkDateCompatibility(String s) {
    boolean flag=true;
        try{
    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        	Calendar c1=new GregorianCalendar();
                c1.add(Calendar.DAY_OF_MONTH,5);
                Date min=c1.getTime();
                             
                Calendar c=new GregorianCalendar();
                c.add(Calendar.DAY_OF_MONTH,90);
                Date max=c.getTime();
                
                Date bookDate=sdf.parse(s);
                
            
                
        	if(bookDate.after(min) && bookDate.before(max)){
        		//System.out.println("bookDate between min and max");
                   return flag;
                }
                else{
                    //System.out.println("bookDate not allowed");
                    return !flag;
                }
        	
    	}catch(ParseException ex){
    		ex.printStackTrace();
    	}
    return flag;
    }
   
    
}