
/**
 * Write a description of class Lands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Lands {
    private Map<String, Store> stores;
    private ArrayList<Ride> rides;
    private ArrayList<Activities> events;
    private ArrayList<Dining> dining;
    private String landName;

    public Lands(String n) {
        landName = n;
        stores = new HashMap<String, Store>();
        rides = new ArrayList<Ride>();
        events = new ArrayList<Activities>();
        dining = new ArrayList<Dining>();
    }

    public String getName() {
        return landName;
    }

    public void addStore(Store s) {
        stores.put(s.getName(), s);
    }

    public void addRide(Ride r) {
        rides.add(r);
    }

    public void addEvent(Activities e) {
        events.add(e);
    }

    public void addDining(Dining d) {
        dining.add(d);
    }

    public Store getStore(String s) {
        return stores.get(s);
    }

    public String[] getStoreNames() {
        Set<String> keys = stores.keySet();
        String[] names = new String[keys.size()];
        int index = 0;
        for (String str : keys)
            names[index++] = str;
        return names;
    }

    public ArrayList<Dining> getDining() {
        return dining;
    }

    public String[] getDiningNames() {
        String[] names = new String[dining.size()];
        for (int i = 0; i < dining.size(); i++) {
            names[i] = dining.get(i).getName();
        }
        return names;
    }

    public ArrayList<Activities> getActivities() {
        return events;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }
}
