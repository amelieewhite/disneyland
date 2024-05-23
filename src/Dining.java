
import java.util.*;
public class Dining
  {
    private String name;
    private ArrayList<Food> menu;
    double totalCost;
    double totalEnergy;

    public Dining(String n)
    {
      name = n;
      menu = new ArrayList<Food>();
    }

    public void buyItem(Food f)
    {
      totalCost += f.getPrice();
      totalEnergy += f.getEnergy();
    }
    public String getName()
    {
      return name;
    }
    public double getTC()
    {
      return totalCost;
    }
    public double getTE()
    {
      return totalEnergy;
    }
    }
  
      
    
