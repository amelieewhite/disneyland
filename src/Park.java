import java.util.ArrayList;

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

// ITEMS, STORES, DINING, ACTIVITIES, RIDES

// *MAINSTREET*

// MAINSTREET ITEMS (COULD ALSO BE GENERAL)

Item ears = new Item("Minnie Mouse Ears", 12.99, "A disneyland staple!");
Item pin = new Item("Souvenir Pin", 8.99, "Collect them all!");
Item hoodie = new Item("Hoodie", 24.99, "Make all your friends jealous with this stylish hoodie");
Item cap = new Item("Mickey Baseball Cap", 17.99, "For all the dads out there");
Item bubbles = new Item("Bubble Wand", 11.99, "Pop, pop, pop!");
Item backpack = new Item("Backpack", 19.99, "For all your carrying needs");
Item globe = new Item("Snow Globe", 8.99, "Who doesn't love a snow globe?");
Item magnet = new Item("Castle-Shaped Fridge Magnet", 12.99, "The perfect souvenir");
Item mug = new Item("Mug", 14.99, "Convenient and cute");
Item key = new Item("Keychain", 6.99, "Show off your trip with this cool keychain!");

// MAINSTREET FOOD

Food p = new Food("Popcorn", 3.99, "Buttery and delicious");
Food sC = new Food("Sugar Cookie", 4.99, "A Mickey-shaped sugary cookie!");
Food mW = new Food("Mickey Waffles", 9.99, "Delicious waffles!");
Food lP = new Food("Lollipop", 3.99, "A swirly lollipop");
Food pZ = new Food("Pizza Slice", 7.99, "Cheesy and yummy!");
Food soda = new Food("Soda", 3.99, "Refreshing and bubbly");
Food burger = new Food("Burger", 11.99, "A classic burger");
Food cupcake = new Food("Cupcake", 6.99, "The perfect treat");
Food pret = new Food("Pretzel", 6.99, "Salty and delicious");
Food fries = new Food("Fries", 8.99, "Delightfully salty");

// MAINSTREET STORES

// store 1
Store mainStore1 = new Store("World of Disney");
mainStore1.addItem(ears);
mainStore1.addItem(magnet);
mainStore1.addItem(mug);
mainStore1.addItem(hoodie);
mainStore1.addItem(key);

// store 2
Store mainStore2 = new Store("The Mad Hatter");
mainStore2.addItem(globe);
mainStore2.addItem(bubbles);
mainStore2.addItem(cap);
mainStore2.addItem(magnet);
mainStore2.addItem(hoodie);

// store 3
Store mainStore3 = new Store("The Disneyland Emporium");
mainStore3.addItem(backpack);
mainStore3.addItem(key);
mainStore3.addItem(bubbles);
mainStore3.addItem(cap);
mainStore3.addItem(ears);


// MAINSTREET DINING

//dining 1
Dining mainDining1 = new Dining("Popcorn Cart");
mainDining1.addItem(p);
mainDining1.addItem(soda);
mainDining1.addItem(pret);

// dining 2
Dining mainDining2 = new Dining("Main Street Bakery");
mainDining2.addItem(cupcake);
mainDining2.addItem(sC);
mainDining2.addItem(lP);
mainDining2.addItem(mW);

// dining 3
Dining mainDining3 = new Dining("Plaza Gardens");
mainDining3.addItem(pZ);
mainDining3.addItem(fries);
mainDining3.addItem(burger);
mainDining3.addItem(soda);


// MAINSTREET EVENTS

Activities mainEvent1 = new Activities("Parade", "A celebration all can enjoy!");
Activities mainEvent2 = new Activities("Take a photo in front of the castle", "Say cheese!");
Activities mainEvent3 = new Activities("Admire Disneyland!", "Wow, it sure is nice here");


// *FANTASYLAND**

// FANTASYLAND ITEMS
Item tiara = new Item("Tiara", 14.99, "Princess perfection!");
Item princessDress = new Item("Princess Dress", 29.99, "Look like the princess you are!");
Item wand = new Item("Magic Wand", 13.99, "Bibbidi Bobbidi Who?");
Item fairyWings = new Item("Fairy Wings", 14.99, "Channel your inner tinkerbell!");
Item bow = new Item("Hair Bow", 8.99, "A cute accessory akin to Minnie's classic bows!");

// FANTASYLAND FOOD
Food slush = new Food("Elsa's Frozen Slush", 6.99, "Brr!");
Food poisonApple = new Food("'Poison' Candy Apple", 4.99, "Crispy, sweet, and..poison?");
Food beignets = new Food("Tiana's Man-Catching Beignets", 8.99, "Delicious pillowy beignets");
Food macaron = new Food("Minnie Macaron", 4.99, "A delightfully Minnie-shaped macaron!");
Food churro = new Food("Churro", 7.99, "Delicious cinnamony churro!");

// FANTASYLAND RIDES

Ride fantasyRide1 = new Ride("It's a Small World", 15);
Ride fantasyRide2 = new Ride("The Mad Hatter's Tea Party", 10);
Ride fantasyRide3 = new Ride("Dumbo's Flying Elephants", 20);

// FANTASYLAND STORES

//FANTASYLAND STORE 1
Store fantasyStore1 = new Store("Bibiddi Bobiddi Boutique");
fantasyStore1.addItem(tiara);
fantasyStore1.addItem(mug);
fantasyStore1.addItem(princessDress);
fantasyStore1.addItem(magnet);
fantasyStore1.addItem(wand);


// FANTASYLAND STORE 2
Store fantasyStore2 = new Store("It's a Small Store");
fantasyStore2.addItem(fairyWings);
fantasyStore2.addItem(cap);
fantasyStore2.addItem(bow);
fantasyStore2.addItem(key);
fantasyStore2.addItem(hoodie);

// FANTASYLAND STORE 3
Store fantasyStore3 = new Store("Fairy Tale Treasures");
fantasyStore3.addItem(bubbles);
fantasyStore3.addItem(tiara);
fantasyStore3.addItem(wand);
fantasyStore3.addItem(globe);
fantasyStore3.addItem(ears);

// FANTASYLAND DINING

// FANTASYLAND DINING 1
Dining fantasyDining1 = new Dining("Churro Cart");
fantasyDining1.addItem(churro);
fantasyDining1.addItem(soda);
fantasyDining1.addItem(sC);


//FANTASYLAND DINING 2
Dining fantasyDining2 = new Dining("Red Rose Tavern");
fantasyDining2.addItem(pZ);
fantasyDining2.addItem(fries);
fantasyDining2.addItem(beignets);
fantasyDining2.addItem(mW);
fantasyDining2.addItem(slush);

//FANTASYLAND DINING 3
Dining fantasyDining3 = new Dining("Maurice's Treats");
fantasyDining3.addItem(macaron);
fantasyDining3.addItem(poisonApple);
fantasyDining3.addItem(cupcake);
fantasyDining3.addItem(sC);

// FANTASYLAND ACTIVITIES

Activities fantasyLandAct1 = new Activities("Meet the princesses", "A meet and greet with all of your favourite princesses!");
Activities fantasyLandAct2 = new Activities("Get made-over at the Bibbidi Bobbidi Boutique", "Get dressed up with your own personal fairy godmother!");
Activities fantasyLandAct3 = new Activities("Walk through the castle", "Take a tour of Sleeping Beauty's castle!");
        



        // entrance
        map[2][1] = new Lands("Entrance", "Main entrance to the park");

        //  MS stores 

        
       

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
        Ride jc = new Ride("Jungle Cruise", 25);
        Ride sm = new Ride("Splash Mountain", 40);
        Ride potc = new Ride("Pirates of the Carribean", 20);
        Ride hm = new Ride("Haunted Mansion", 30);
        // AL DINING
        Dining tp = new Dining("Tiana's Palace");
        tp.addItem(new Item("Gumbo", 15.5, "Tiana's famous gumbo"));
        tp.addItem(new Item("Hamburger", 10.99, "A classic!"));
        tp.addItem(new Item("Beignets", 9.99, "Delicious and soft!"));

        Dining bbbq = new Dining("Bengal BBQ");
        bbbq.addItem(new Item("Chicken Skewers", 8.99, "Yummy, spicy chicken skewers!"));
        bbbq.addItem(new Item("Fries", 5.50, "Crispy and salty"));
        bbbq.addItem(new Item("Chopped Salad", 11.50, "A refreshing salad."));

        Dining th = new Dining("Tiki Hut");
        th.addItem(new Item("Dole Whip", 7.50, "Frozen pineapple sorbet!"));

        // AL EVENTS
        Activities mp = new Activities("Meet a Pirate", "Meet a pirate and practice your pirate-speak!");

        // AL STORES
        Store tsam = new Store("Trader Sam's");
        tsam.addItem(new Item("Pirate hat", 14.99, "Channel your inner pirate!"));
        tsam.addItem(new Item("Indiana Jones Figurine", 9.99, "Neat!"));
        tsam.addItem(new Item("Bubble wand", 15.00, "Pop, pop, pop!"));

        Store mc = new Store("Merch Cart");
        mc.addItem(new Item("Mickey Mouse Hat", 20.00, "Who doesn't want to be like Mickey?"));
        mc.addItem(new Item("Disneyland Sweatshirt", 30.00, "Make all your friend's jealous with this comfy and stylish sweatshirt!"));
        mc.addItem(new Item("Annual Pass", 999.99, "Cmon, you know you want to"));

        // adventureland
        map[2][0] = new Lands("Adventureland", "Home of all things adventuring!");
        map[2][0].addDining(bbbq);
        map[2][0].addDining(th);
        map[2][0].addDining(tp);
        map[2][0].addRide(sm);
        map[2][0].addRide(potc);
        map[2][0].addRide(jc);
        map[2][0].addRide(ij);
        map[2][0].addRide(hm);
        map[2][0].addEvent(mp);
        map[2][0].addStore(tsam);
        map[2][0].addStore(mc);


        // TL RIDES

        // TL DINING

        // TL STORES

        // TL EVENTS

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
    
    

