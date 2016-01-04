import java.awt.Rectangle; 

public class MoveTester
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      Rectangle origbox = new Rectangle(5, 10, 20, 30);
      Rectangle sqrbox = new Rectangle(90, 110, 20, 20);
      Rectangle sqrtest = new Rectangle(20, 20);
      sqrtest.translate(90, 90);
      boolean result = sqrbox.contains(sqrtest);
      

      // Move the rectangle
      box.translate(15, 25);
      
      

      // Print information about the moved rectangle
      //System.out.println("After moving, the top-left corner is:");
      /*System.out.println(box.toString());
      System.out.println(box.getCenterX()); 
      System.out.println(box.getCenterY()); 
      System.out.println(sqrbox.toString());
      System.out.println(sqrbox.getCenterX());
      System.out.println(sqrbox.getY()); */
      System.out.println("result:");
      System.out.println(result);
      //System.out.printf(sqrbox.getCenterX(), sqrbox.getCenterY());
   }
}
