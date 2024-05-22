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
    public void showStores()
    {
        for(int i =0; i < stores.size(); i++)
        {
            System.out.println((i+1) + ". " + stores.get(i).getName());
        }
    }
    public void showDining()
    {
        for(int i =0; i < dining.size(); i++)
        {
            System.out.println((i+1) + ". " + dining.get(i).getName());
        }
    }
    public void showRides()
    {
        for(int i =0; i < rides.size(); i++)
        {
            System.out.println((i+1) + ". " + rides.get(i).getName());
        }
    }
    public void showEvents()
    {
        for(int i =0; i < events.size(); i++)
        {
            System.out.println((i+1) + ". " + events.get(i).getName());
        }
    }
}
