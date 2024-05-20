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
}
