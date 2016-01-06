
package com.yankeemikeaviation.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTesterAbstract
{
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
   
   public static void main(String[] args)
   {
      
      JFrame frame = new JFrame();
      JButton button = new JButton("Click me!");
      frame.add(button);
      
      //tell the button what do do when its clicked by defining the actionPerformed method
      //of ActionListener. I do this by using the abstract class syntax.
      //Important Syntax Note
      //Here the closing parenthesis are placed after the end of the abstract class definition.
      //Compare with abstract class used in RectangleTester2.java in the timer package.
      
      button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            System.out.println("I was clicked.");
         }            
      });
      
    
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      
   }
   
}
