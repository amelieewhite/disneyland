import java.util.*;

public class Store {
   private String name;
   private ArrayList<Item> items;
   private ArrayList<Item> basket;

   public Store(String n) {
      name = n;
      items = new ArrayList<Item>();
      basket = new ArrayList<Item>();
   }

   public String getName() {
      return name;
   }

   public String[] getItemList() {
      String[] opts = new String[items.size()];
      for (int i = 0; i < items.size(); i++) {
         opts[i] = items.get(i).getName();
      }
      return opts;
   }

   public void addItem(Item i) {
      items.add(i);
   }

   public ArrayList<Item> getItems() {
      return items;
   }

   public void addToBasket(Item i) {
      basket.add(i);
   }

   public double getBasketTotal() {
      double price = 0.0;
      for (int i = 0; i < basket.size(); i++) {
         price += basket.get(i).getPrice();

      }
      return price;
   }

   public void purchaseBasket() {

   }
}
