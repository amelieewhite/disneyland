
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item extends Store
{
    String name = "";
    double price = 0.00;
    String need = "";
    
    public Item(String n, double p, String nD)
    {
        name = n;
        price = p;
        need = nD;
    }
    public double getPrice()
    {
        return price;
    }
     public String getName()
    {
        return name;
    }
     public String getNeed()
    {
        return need;
    }
}
