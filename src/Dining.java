public class Dining
  {
    Arraylist<Food> menu = new ArrayList<Food>();

    public void sellItem(Food f)
    {
      budget -= f.getPrice();
      
    
