public class Dining
  {
    Arraylist<Food> menu = new ArrayList<Food>();

    public void buyItem(Food f)
    {
      budget -= f.getPrice();
      energy += f.getEnergy();
    }
  }
      
    
