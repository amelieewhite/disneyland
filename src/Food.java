public class Food
  {
    private String name;
    private int energy;
    private double price;
    

    public Food(String n, int e, double p)
    {
      name = n;
      energy = e;
      price = p;
    }

    public String getName()
    {
      return name;
    }
    public int getEnergy()
    {
      return energy;
    }
    public double getPrice()
    {
      return price;
    }
  }
