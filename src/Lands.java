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
    ArrayList<Store> Stores = new ArrayList<Store>();
    ArrayList<Ride> Rides = new ArrayList<Ride>();
    ArrayList<Event> Events = new ArrayList<Event>();
    
    public Lands()
    {
        name = "blank";
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
