package com.ttdonline.beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDaysBasedOnDate {
    public String getDayBaseOnDate(String date) throws ParseException{
        String day="";
  SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yyyy");
  Date dt1=format1.parse(date);
  DateFormat format2=new SimpleDateFormat("EEEE"); 
   day=format2.format(dt1);
        return day.toUpperCase();
    }
}