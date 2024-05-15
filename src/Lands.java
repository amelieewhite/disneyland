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
    ArrayList stores = new ArrayList<store>();
    ArrayList rides = new ArrayList<ride>();
    ArrayList events = new ArrayList<event>();
    
    public Lands()
    {
        name = "blank";
    }
    public void addStore(store s)
    {
        stores.add(s);
    }
    public void addRide(ride r)
    {
        rides.add(r);
    }
    public void addEvent(event e)
    {
        events.add(e);
    }

    System.out.println("HELLO");
}