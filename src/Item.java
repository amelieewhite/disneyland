
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item 
    {
    String name = "";
    String desc = "";
    double price = 0.00;

    public Item(String n, double p, String d) {
        name = n;
        price = p;
        desc = d;
    }

     public double getPrice()
    {
         return price;
    }
      public String getName()
    {
         return name;
    }

      public String getDescription()
    {
        return desc;
    }
}
