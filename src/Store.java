
/**
 * Write a description of class store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Store
{
   String name = "";
   String storeType = "";
   ArrayList items = new ArrayList<Item>();
   
   public Store(String n, String sT)
   {
       name = n;
       storeType = sT;
   }
}
