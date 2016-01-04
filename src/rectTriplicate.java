import java.awt.Rectangle;


public class rectTriplicate
{
   
   /**
    * @param args
    */
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
     int seedX = 0;
     int seedY = 0;
     int seedW = 5;
     int seedH = 10;
     Rectangle rectseed = new Rectangle(seedX, seedY, seedW, seedH);
     Rectangle rectll = rectseed;
     rectll.translate(0,-seedH);
     rectll.getLocation();
     System.out.println(rectll.getLocation());
     
   }
   
}
