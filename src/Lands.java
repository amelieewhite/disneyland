/**
 * Write a description of class Lands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lands
{
    private String name;
    private ArrayList<Store> stores;
    private ArrayList<Ride> rides;
    private ArrayList<Event> events;
    private ArrayList<Dining> dining;
    private String description;

    public Lands(String n)
    {
        name = n;
        stores = new ArrayList<Store>();
        rides = new ArrayList<Ride>();
        events = new ArrayList<Event>();
        dining = new ArrayList<Dining>();
    }
    
    public Lands()
    {
        name = "blank";
    }

    public addDescription(String d){
        description = d;
    }

    public String getDescription(){
        return description;
    }

    public void addStore(Store s)
    {
        Stores.add(s);
    }
    public void addRide(Ride r)
    {
        Rides.add(r);
    }
    public void addEvent(Event e)
    {
        Events.add(e);
    }
}
