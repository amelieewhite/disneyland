import java.util.*;
public class Store
{
   private String name;
   private ArrayList<Item> items;
   
   public Store(String n)
   {
      name = n;
      items = new ArrayList<Item>();
   }

   public String getName()
   {
    return name;
   }
}
