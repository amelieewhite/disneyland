/**
 * Write a description of class world here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class World
{
   Lands[][] map = new Lands[3][3];
   int row = 2;
   int col = 1;
   public void moveUp()
   {
       if(row-1 >= 0)
       {
           row -= 1;
       }
       else {
           System.out.println("Out of bounds");
       }
   }
   public void moveDown()
   {
       if(row+1 <= 2)
       {
           row += 1;
       }
       else if((row+=1) == 2 && col == 1)
       {
           System.out.println("Exit only. If you would like to exit the park, return to the menu and select 'Exit'. Thank you.");
       }
       else {
           System.out.println("Out of bounds");
       }

   }
   public void goRight()
   {
       if(col+1 <= 2)
       {
           col += 1;
       }
       else {
           System.out.println("Out of bounds");
       }
   }
   public void goLeft()
   {
       if(col-1 >= 0)
       {
           row -= 1;
       }
       else {
           System.out.println("Out of bounds");
       }
   }
}
