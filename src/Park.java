
/**
 * Write a description of class park here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Park
{
    Weather w;
    static Lands[][] map = new Lands[3][3];
    Location currLocation;
    
    
    public Park()
    {
        currLocation = new Location();

 
        // entrance
        map[2][1] = new Lands("Entrance", "Main entrance to the park");

        //  MS stores 
        Store s = new Store("World of Disney");
        s.addItem(new Item("hat", 12.50, "a hat"));

        Store c = new Store("The Mad Hatter");
        c.addItem(new Item("Lollipop", 4.50, "a sweet treat, yum!"));

        Store e = new Store("The Disneyland Emporium");
        e.addItem(new Item("minnie ears", 30.50, "cute minnie ear headband"));

        // MS dining
        Dining d = new Dining("Plaza Gardens");
        d.addItem(new Item("burger", 15.00, "A Burger."));

        Dining ch = new Dining("Churro Cart");
        ch.addItem(new Item("Churro", 3.00, "A sweet, cinnamon sugar churro."));

        Dining mb = new Dining("Main Street Bakery");
        mb.addItem(new Item("Mickey Waffles", 5.00, "Mickey shaped waffles!"));

        // main street

        map[1][1] = new Lands("Main Street", "Main street USA, hub of shops");
        map[1][1].addStore(s);
        map[1][1].addStore(c);
        map[1][1].addStore(e);
        map[1][1].addDining(d);
        map[1][1].addDining(ch);
        map[1][1].addDining(mb);
  
        //FL shops
        Store bbb = new Store("Bibbiddi Bobbiddi Boutique");
        bbb.addItem(new Item("tiara", 12.50, "a sparkly tiara"));

        Store ias = new Store("It's a Small Shop");
        ias.addItem(new Item("Disneyland Pin", 8.50, "a small pin"));


        // FL dining
         Dining pc = new Dining("Popcorn Cart");
        pc.addItem(new Item("Buttered Popcorn", 3.50, "Freshly popped!"));

        Dining rrt = new Dining("Red Rose Tavern");
        rrt.addItem(new Item("Pizza", 5.00, "Yummy!"));

        Dining mt = new Dining("Maurice's Treats");
        mt.addItem(new Item("Minnie Macarons", 5.00, "Mickey shaped macarons! How cute!"));

        // FL rides

        Ride mhtp = new Ride("The Mad Hatter's Tea Party", 10);
        Ride iasm = new Ride("It's a Small World", 15);
        Ride dfe = new Ride("Dumbo's Flying Elephants", 20);

        // FL EVENTS

        Activities mtp = new Activities("Meet the Princesses", "A meet and greet with your favourite disney princesses!");
        Activities wap = new Activities("Watch a parade", "Catch an iconic disney parade!");




        // fantasyland
        map[0][1] = new Lands("Fantasyland", "fantasyland woo");
        map[0][1].addRide(mhtp);
        map[0][1].addRide(iasm);
        map[0][1].addRide(dfe);
        map[0][1].addDining(mt);
        map[0][1].addDining(rrt);
        map[0][1].addDining(pc);
        map[0][1].addStore(bbb);
        map[0][1].addStore(ias);
      

        //FRL RIDES
        Ride btm = new Ride("Big Thunder Mountain", 30);

        //FRL EVENTS
        Activities mac = new Activities("Meet a Cowboy", "Meet a cowboy and practice your western accent!");
        Activities was = new Activities("Watch a Show", "Watch one of the many shows put on by cast members throughout the day!");

        //FRL DINING
        Dining hsc = new Dining("The Golden Horseshoe");
        hsc.addItem(new Item("Chicken Nuggets", 6.00, "Yummy, crispy chicken nuggets!"));
        hsc.addItem(new Item("Caesar Salad", 8.50, "A healthy and delicious choice!"));
        hsc.addItem(new Item("Hot Dog", 6.50, "A theme park classic!"));

        Dining tlc = new Dining("Turkey Leg Cart");
        tlc.addItem(new Item("Turkey Leg", 6.0, "A juicy turkey leg!"));
        tlc.addItem(new Item("Soda", 4.50, "Refreshing and tasty"));



        //FRL STORES

        Store pm = new Store("Pioneer Mercantile");
        pm.addItem(new Item("Cowboy hat", 9.00, "Yeehaw!"));
        pm.addItem(new Item("Souvenir Magnet", 5.50, "A sweet souvenir"));

        // frontierland
        map[0][0] = new Lands("Frontierland", "A western themed area");
        map[0][0].addRide(btm);
        map[0][0].addDining(hsc);
        map[0][0].addDining(tlc);
        map[0][0].addStore(pm);
        map[0][0].addEvent(was);
        map[0][0].addEvent(mac);
        
        // AL RIDES
        Ride ij = new Ride("Indiana Jones", 45);

        // AL DINING

        // AL EVENTS

        // AL STORES

        // adventureland
        map[2][0] = new Lands("Adventureland", "Desc. here");

        // tomorrowland
        map[2][2] = new Lands("Tomorrowland", "desc");

        // toontown
        map[0][2] = new Lands("Toontown", "desc.");


        


        
    }

    public Lands[][] getMap()
    {
        return map;
    }
    public String getLandName(int row, int col)
    {
        return map[row][col].getName();
    }
    public String getLandDesc(int row, int col)
    {
        return map[row][col].getDescription();
    }
    public String getPartyLoc()
    {
        return map[currLocation.getRow()][currLocation.getCol()].getName();
    }
    public Lands getPartyLocation()
    {
        return map[currLocation.getRow()][currLocation.getCol()];
    }
    public void move(String where)
    {
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                if(map[i][j] != null && map[i][j].getName().equals(where))
                {
                    currLocation.move(i, j);
                }
            }
        }
        }
    
        

    }
    
    

