package com.yankeemikeaviation.measure;


public class StringMeasurer implements Measurer
{

   /**
   Computes the measure of an object.
   @param anObject the object to be measured
   @return the measure
*/
    public double measure(Object anObject){
       
       String aString = (String) anObject;
       
       return aString.length();
       
    }


}
