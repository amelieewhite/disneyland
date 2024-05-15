/**
 * Write a description of class Lands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lands
{
    String name = "";
    ArrayList Stores = new ArrayList<Store>();
    ArrayList Rides = new ArrayList<Ride>();
    ArrayList Events = new ArrayList<Event>();
    
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