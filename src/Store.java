import java.util.*;
public class Store
{
   private String name;
   String storeType = "";
   ArrayList items = new ArrayList<Item>();
   
   public Store(String n, String sT)
   {
       name = n;
       storeType = sT;
   }
}
