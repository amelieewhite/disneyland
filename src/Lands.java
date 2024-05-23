/**
 * Write a description of class Lands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lands
{
    private ArrayList<Store> stores;
    private ArrayList<Ride> rides;
    private ArrayList<Activities> events;
    private ArrayList<Dining> dining;
    private String description;
    private String landName;

    public Lands(String n, String d)
    {
        landName = n;
        description = d;
        stores = new ArrayList<Store>();
        rides = new ArrayList<Ride>();
        events = new ArrayList<Activities>();
        dining = new ArrayList<Dining>();
    }
    public String getDescription(){
        return description;
    }
    public String getName()
    {
        return landName;
    }

    public void addStore(Store s)
    {
        stores.add(s);
    }
    public void addRide(Ride r)
    {
        rides.add(r);
    }
    public void addEvent(Activities e)
    {
        events.add(e);
    }
    public void addDining(Dining d)
    {
        dining.add(d);
    }
    public ArrayList<Store> getStores()
    {
        return stores;
    }
    public String[] getStoreNames(){
        String [] names = new String[stores.size()];
        for (int i = 0 ; i < stores.size() ; i++){
            names[i] = stores.get(i).getName();
        }
        return names;
    }
    public ArrayList<Dining> getDining()
    {
        return dining;
    }

    public String[] getDiningNames(){
        String [] names = new String[dining.size()];
        for (int i = 0 ; i < dining.size() ; i++){
            names[i] = dining.get(i).getName();
        }
        return names;
    }
    public ArrayList<Activities> getActivities()
    {
        return events;
    }
    public ArrayList<Ride> getRides()
    {
        return rides;
    }
}
