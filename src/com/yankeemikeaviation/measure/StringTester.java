package com.yankeemikeaviation.measure;

public class StringTester
{
   
   public static void main(String[] args)
   {
      String s1 = new String("Hello World");
      String s2 = new String("A whole new world");
      String s3 = new String("World of sweets");
      
      StringMeasurer sm = new StringMeasurer();
      
      //System.out.println("Length1: " + sm.measure(s1) + "\n");
      
      DataSet d = new DataSet(sm);
      
      d.add(s1);
      d.add(s2);
      d.add(s3);
      
      System.out.println("Avg. Length: " + d.getAverage() + "\n");
      //DataSet returns an object which holds the maximum value of the measured objects.
      System.out.println("Max. Length String: " + d.getMaximum() + "\n");
      //Since DataSet returns an "Object" we have to cast it to the object we want, which is String in this case so we can 
      //use the length() method of Strings.
      System.out.println("Max. Length: " + ((String) d.getMaximum()).length() + "\n");
      
   }
   
}
