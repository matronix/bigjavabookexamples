package com.yankeemikeaviation.measure;
import java.awt.Rectangle;

public class RectangleTester
{
   
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 10, 10, 10);
      Rectangle r2 = new Rectangle(0, 20, 20, 20);
      Rectangle r3 = new Rectangle(0, 5, 5, 5);
      
      Measurer rm = new Measurer()
     {
         public double measure(Object anObject)
         {
            Rectangle aRectangle = (Rectangle) anObject;
            double area = aRectangle.getWidth() * aRectangle.getHeight();
            return area;
         }
      };
      
      System.out.println("Area1: \n" + rm.measure(r1));
      System.out.println("Area2: \n" + rm.measure(r2));
      System.out.println("Area3: \n" + rm.measure(r3));
      
      DataSet d = new DataSet(rm);
      
      d.add(r1);
      d.add(r2);
      d.add(r3);
      
      System.out.println("Average: \n" + d.getAverage() );
      System.out.println("Maximum: \n" + d.getMaximum());
      
      
   }
   
}
