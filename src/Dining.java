public class Dining
  {
    private String name;
    private Arraylist<Food> menu;

    public Dining(String n)
    {
      name = n;
      menu = new Arraylist<Food>();
    }

    public void buyItem(Food f)
    {
      budget -= f.getPrice();
      energy += f.getEnergy();
    }
  }
      
    
