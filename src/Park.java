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
        

// *TOMORROWLAND**

// TOMORROWLAND ITEMS
Item alienAntenna = new Item("Alien Antenna Hat", 11.99, "An out-of-this-world hat");
Item spaceRangerPin = new Item("Space Ranger Pin", 8.99, "Welcome to star command, space ranger!");
Item helmet = new Item("Space Helmet", 15.99, "A must for an explorer such as yourself");
Item astronautIceCream = new Item("Astronaut Ice Cream", 14.99, "Freeze-dried ice cream!");
Item rocketBalloon = new Item("Rocket Balloon", 3.99, "It even flies!");

// TOMORROWLAND FOOD
Food alienMochi = new Food("Alien Mochi", 6.99, "Chewy and sweet!");
Food salad = new Food("'Starfield Salad", 9.99, "Galactic goodness!");
Food turkey = new Food("Turkey Leg", 5.99, "A delicious turkey leg");
Food orangeOribit = new Food("Orange Orbit Soda", 4.99, "Orange soda with popping boba");
Food rocketPop = new Food("Rocket Pop", 3.99, "A rocket-shaped popsicle");

// TOMORROWLAND RIDES

Ride tomorrowRide1 = new Ride("Space Mountain", 45);
Ride tomorrowRide2 = new Ride("Autopia", 15);
Ride tomorrowRide3 = new Ride("Buzz Lightyear's Astro Blasters", 20);

// TOMORROWLAND STORES

//TOMORROWLAND STORE 1
Store tomorrowStore1 = new Store("Star Traders");
tomorrowStore1.addItem(hoodie);
tomorrowStore1.addItem(rocketBalloon);
tomorrowStore1.addItem(cap);
tomorrowStore1.addItem(key);
tomorrowStore1.addItem(helmet);


// TOMORRROWLAND STORE 2
Store tomorrowStore2 = new Store("The Space Place");
tomorrowStore2.addItem(ears);
tomorrowStore2.addItem(bubbles);
tomorrowStore2.addItem(alienAntenna);
tomorrowStore2.addItem(key);
tomorrowStore2.addItem(astronautIceCream);

// TOMORROWLAND STORE 3
Store tomorrowStore3 = new Store("Light & Power Co.");
tomorrowStore3.addItem(spaceRangerPin);
tomorrowStore3.addItem(rocketBalloon);
tomorrowStore3.addItem(mug);
tomorrowStore3.addItem(globe);
tomorrowStore3.addItem(ears);

// TOMORROWLAND DINING

// TOMORROWLAND DINING 1
Dining tomorrowDining1 = new Dining("Pizza Planet");
tomorrowDining1.addItem(pZ);
tomorrowDining1.addItem(salad);
tomorrowDining1.addItem(orangeOribit);
tomorrowDining1.addItem(fries);
tomorrowDining1.addItem(soda);


//TOMORROWLAND DINING 2
Dining tomorrowDining2 = new Dining("Galactic Grill");
fantasyDining2.addItem(burger);
fantasyDining2.addItem(fries);
fantasyDining2.addItem(cupcake);
fantasyDining2.addItem(alienMochi);
fantasyDining2.addItem(rocketPop);

//TOMORROWLAND DINING 3
Dining tomorrowDining3 = new Dining("Turkey Leg Cart");
fantasyDining3.addItem(turkey);
fantasyDining3.addItem(pret);
fantasyDining3.addItem(soda);

// TOMORROWLAND ACTIVITIES

Activities tomorrowLandAct1 = new Activities("Stargaze", "Find hidden stars around tomorrowland!");
Activities tomorrowLandAct2 = new Activities("Search for aliens", "You never know!");
Activities tomorrowLandAct3 = new Activities("Meet Buzz Lightyear", "Meet the one and only Buzz!");
        

// *FRONTIERLAND**

// FRONTIERLAND ITEMS
Item cowboyHat = new Item("Cowboy Hat", 11.99, "Yeehaw!");
Item sherriffStar = new Item("Sherriff Badge", 8.99, "Howdy, Sherriff!");
Item journal = new Item("Journal", 7.99, "A leather journal");
Item cowboyMug = new Item("Cowboy Mug",9.99, "A cowboy-boot shaped mug!");
Item westernJigsaw = new Item("Jigsaw", 8.99, "A western themed jigsaw puzzle");

// FRONTIERLAND FOOD
Food funnelCake = new Food("Funnel Cake", 6.99, "A theme park classic!");
Food cowboyBark = new Food("Cowboy Bark", 4.99, "Chocolate bark loaded with nuts, pretzels, and candies, perfect for satisfying your sweet tooth!");
Food fruitPunch = new Food("Frontierland Fruit Punch", 5.99, "A delicious and fruity beverage");
Food nachos = new Food("Nachos", 11.99, "Warm and fresh nachos");
Food tenders = new Food("Chicken Tenders", 9.99, "Crispy chicken tenders");

// FRONTIERLAND RIDES

Ride frontierlandRide1 = new Ride("Big Thunder Mountain", 45);
Ride frontierlandRide2 = new Ride("Splash Mountain", 20);
Ride frontierlandRide3 = new Ride("Mark Twain Riverboat", 15);

// FRONTIERLAND STORES

//FRONTIERLAND STORE 1
Store frontierlandStore1 = new Store("Pioneer Mercantile");
frontierlandStore1.addItem(hoodie);
frontierlandStore1.addItem(cowboyHat);
frontierlandStore1.addItem(key);
frontierlandStore1.addItem(bubbles);
frontierlandStore1.addItem(sherriffStar);


// FRONTIERLAND STORE 2
Store frontierlandStore2 = new Store("Silver Spur Supplies");
frontierlandStore2.addItem(ears);
frontierlandStore2.addItem(journal);
frontierlandStore2.addItem(cowboyMug);
frontierlandStore2.addItem(globe);
frontierlandStore2.addItem(westernJigsaw);

// FRONTIERLAND STORE 3
Store frontierlandStore3 = new Store("Bonanza Outfitters");
frontierlandStore3.addItem(backpack);
frontierlandStore3.addItem(cowboyMug);
frontierlandStore3.addItem(journal);
frontierlandStore3.addItem(hoodie);
frontierlandStore3.addItem(ears);

// FRONTIERLAND DINING

// FRONTIERLAND DINING 1
Dining frontierLandDining1 = new Dining("Golden Horseshoe");
frontierLandDining1.addItem(nachos);
frontierLandDining1.addItem(tenders);
frontierLandDining1.addItem(soda);
frontierLandDining1.addItem(fries);
frontierLandDining1.addItem(burger);


//FRONTIERLAND DINING 2
Dining frontierLandDining2 = new Dining("Stage Door Café");
frontierLandDining2.addItem(funnelCake);
frontierLandDining2.addItem(fruitPunch);
frontierLandDining2.addItem(cupcake);
frontierLandDining2.addItem(mW);
frontierLandDining2.addItem(pret);

//FRONTIERLAND DINING 3
Dining frontierLandDining3 = new Dining("Frontierland Food Cart");
frontierLandDining3.addItem(cowboyBark);
frontierLandDining3.addItem(p);
frontierLandDining3.addItem(soda);

// FRONTIERLAND ACTIVITIES

Activities frontierLandAct1 = new Activities("Tom Sawyer Island", "Take a raft to Tom Sawyer Island and explore!");
Activities frontierLandAct2 = new Activities("Sailing Ship Columbia Voyage", "Set sail on sailing ship Columbia");
Activities frontierLandAct3 = new Activities("Meet Sherriff Woody", "Meet the one and only Woody!");


// *TOONTOWN**

// TOONTOWN ITEMS
Item mickeyPlush = new Item("Mickey Mouse Plush", 24.99, "Your own mickey mouse!");
Item donaldDuckPoster = new Item("Donald Duck Poster", 11.99, "Donald Duck wall decoration");
Item goofyPin = new Item("Goofy Pin", 7.99, "A Goofy pin");
Item daisyDuckDuffelBag = new Item("Daisy Duck Duffel Bag",14.99, "A purple Daisy themed duffel bag!");
Item minnieFigurine = new Item("Minnie Mouse Figurine", 9.99, "A perfect addition to any mantlepiece");

// TOONTOWN FOOD
Food strawberryLemonade = new Food("Strawberry Lemonade", 6.99, "A refreshing treat");
Food cottonCandy = new Food("Cotton Candy", 4.99, "Sweet and fluffy cotton candy");
Food hotDog = new Food("Hot Diggity Dog", 9.99, "A classic hotdog");
Food milkshake = new Food("Clarabelle's Milkshake", 7.99, "A delicious cold milkshake");
Food fruit = new Food("Minnie's Fresh Fruit", 9.99, "A cup of fresh fruit");

// TOONTOWN RIDES

Ride toontownRide1 = new Ride("Gadget's Go Coaster", 25);
Ride toontownRide2 = new Ride("Donald's Boat", 15);
Ride toontownRide3 = new Ride("Roger Rabbit's Car Toon Spin", 5);

// TOONTOWN STORES

//TOONTOWN STORE 1
Store toontownStore1 = new Store("Toontown Five & Dime");
toontownStore1.addItem(hoodie);
toontownStore1.addItem(pin);
toontownStore1.addItem(key);
toontownStore1.addItem(mickeyPlush);
toontownStore1.addItem(donaldDuckPoster);


// TOONTOWN STORE 2
Store toontownStore2 = new Store("Toontown Supply Co.");
toontownStore2.addItem(ears);
toontownStore2.addItem(minnieFigurine);
toontownStore2.addItem(daisyDuckDuffelBag);
toontownStore2.addItem(globe);
toontownStore2.addItem(cap);

// TOONTOWN STORE 3
Store toontownStore3 = new Store("Toontown Cartoons");
toontownStore3.addItem(backpack);
toontownStore3.addItem(goofyPin);
toontownStore3.addItem(mickeyPlush);
toontownStore3.addItem(hoodie);
toontownStore3.addItem(ears);

// TOONTOWN DINING

// TOONTOWN DINING 1
Dining toontownDining1 = new Dining("Daisy's Diner");
toontownDining1.addItem(burger);
toontownDining1.addItem(cottonCandy);
toontownDining1.addItem(soda);
toontownDining1.addItem(strawberryLemonade);
toontownDining1.addItem(burger);


//TOONTOWN DINING 2
Dining toontownDining2 = new Dining("Clarabelle's Hand-Scooped Ice Cream");
toontownDining2.addItem(milkshake);
toontownDining2.addItem(soda);
toontownDining2.addItem(cupcake);
toontownDining2.addItem(sC);
toontownDining2.addItem(fruit);

//TOONTOWN DINING 3
Dining toontownDining3 = new Dining("Hot Dog Cart");
toontownDining3.addItem(hotDog);
toontownDining3.addItem(p);
toontownDining3.addItem(soda);

// TOONTOWN ACTIVITIES

Activities toontownAct1 = new Activities("Meet Minnie Mousw", "Meet Minnie!");
Activities toontownAct2 = new Activities("Interactive Play Areas", "Perfect for kids");
Activities toontownAct3 = new Activities("Toontown Photo Ops", "Capture magical memories with themed photo opportunities");



// *ADVENTURELAND**

// ADVENTURELAND ITEMS
Item pirateHat = new Item("Pirate Hat", 13.99, "Channel your inner pirate!");
Item safariKit = new Item("Safari Kit", 16.99, "A kit full of all you need to survive a deadly safari");
Item jacket = new Item("Indiana Jones' Jacket", 32.99, "Live out your dreams of becoming Indiana Jones!");
Item simbaPlush = new Item("Simba Plush",19.99, "The lion king himself!");
Item binoculars = new Item("Binoculars", 9.99, "A must for adventurers");

// ADVENTURELAND FOOD
Food doleWhip = new Food("Dole Whip", 6.99, "A delicious frozen pineapple treat");
Food skewer = new Food("Chicken Skewers", 11.99, "Tangy and tasty chicken skewers");
Food gumbo = new Food("Gumbo", 12.99, "Tiana's iconic gumbo");
Food lumpia = new Food("Lumpia", 7.99, "Crispy and savory lumpia");
Food smoothie = new Food("Mango Smoothie", 5.99, "A tasty treat for all");

// ADVENTURELAND RIDES

Ride adventureLandRide1 = new Ride("Pirates of the Carribean", 20);
Ride adventureLandRide2 = new Ride("Jungle Cruise", 15);
Ride adventureLandRide3 = new Ride("Indiana Jones Adventure", 30);

// ADVENTURELAND STORES

//ADVENTURELAND STORE 1
Store adventureLandStore1 = new Store("Bengal Bazaar");
adventureLandStore1.addItem(pin);
adventureLandStore1.addItem(safariKit);
adventureLandStore1.addItem(key);
adventureLandStore1.addItem(binoculars);
adventureLandStore1.addItem(bubbles);


// ADVENTURELAND STORE 2
Store adventureLandStore2 = new Store("Adventure Outpost");
adventureLandStore2.addItem(ears);
adventureLandStore2.addItem(jacket);
adventureLandStore2.addItem(pirateHat);
adventureLandStore2.addItem(globe);
adventureLandStore2.addItem(cap);

// ADVENTURELAND STORE 3
Store adventureLandStore3 = new Store("Tropical Imports");
adventureLandStore3.addItem(backpack);
adventureLandStore3.addItem(binoculars);
adventureLandStore3.addItem(simbaPlush);
adventureLandStore3.addItem(pirateHat);
adventureLandStore3.addItem(key);

// ADVENTURELAND DINING

// ADVENTURELAND DINING 1
Dining adventureLandDining1 = new Dining("Bengal BBQ");
adventureLandDining1.addItem(skewer);
adventureLandDining1.addItem(fries);
adventureLandDining1.addItem(smoothie);
adventureLandDining1.addItem(pZ);
adventureLandDining1.addItem(burger);


//ADVENTURELAND DINING 2
Dining adventureLandDining2 = new Dining("Enchanted Tiki Bar");
adventureLandDining2.addItem(doleWhip);
adventureLandDining2.addItem(soda);
adventureLandDining2.addItem(lumpia);
adventureLandDining2.addItem(pret);
adventureLandDining2.addItem(smoothie);

//ADVENTURELAND DINING 3
Dining adventureLandDining3 = new Dining("Blue Bayou Restaurant");
adventureLandDining3.addItem(pZ);
adventureLandDining3.addItem(fries);
adventureLandDining3.addItem(soda);
adventureLandDining3.addItem(lumpia);

// ADVENTURELAND ACTIVITIES

Activities adventureLandAct1 = new Activities("Explore Tarzan's Treehouse", "Embark on an adventure through the treetops in Tarzan's Treehouse");
Activities adventureLandAct2 = new Activities("Meet Jack Sparrow", "Convene with the swashbuckler himself!");
Activities adventureLandAct3 = new Activities("Find Hidden Mickeys", "Adventureland is filled with hidden Mickey Mouse symbols scattered throughout the land. ");


// *STAR WARS LAND**

// STAR WARS LAND ITEMS
Item lightSaber = new Item("Lightsaber", 24.99, "Use the force wisely!");
Item r2d2 = new Item("R2D2 Plush", 16.99, "A olush of everyone's favorite droid");
Item jediRobes = new Item("Jedi Robes", 19.99, "Geek out in these Jedi robes!");
Item blaster = new Item("Toy Blaster",9.99, "A toy blaster!");
Item yodaHat = new Item("Yoda Hat", 12.99, "Wear hat you will!");

// STAR WARS LAND FOOD
Food blueMilk = new Food("Blue Milk", 5.99, "Made from a blend of coconut and rice milk, flavored with tropical and fruity notes");
Food rontoWrap = new Food("Ronto Wrap", 11.99, "A savory grilled sausage wrapped in a warm pita bread");
Food tipYip = new Food("Endorian Tip-yip", 12.99, "Crispy chicken served with roasted vegetables and mashed potatoes");
Food moofJuice = new Food("Moof Juice", 7.99, "A refreshing fruit beverage, featuring a blend of tropical fruit juices and flavors.");
Food outpostMix = new Food("Outpost Mix", 6.99, "A colorful blend of sweet and savory popcorn");

// STAR WARS LAND RIDES

Ride starWarsLandRide1 = new Ride("Rise of the Resistance", 20);
Ride starWarsLandRide2 = new Ride("Smuggler's Run", 35);

// STAR WARS LAND STORES

//STAR WARS LAND STORE 1
Store starWarsLandStore1 = new Store("Droid Depot");
starWarsLandStore1.addItem(r2d2);
starWarsLandStore1.addItem(pin);
starWarsLandStore1.addItem(key);
starWarsLandStore1.addItem(jacket);
starWarsLandStore1.addItem(lightSaber);


// STAR WARS LAND STORE 2
Store starWarsLandStore2 = new Store("First Order Cargo");
starWarsLandStore2.addItem(cap);
starWarsLandStore2.addItem(blaster);
starWarsLandStore2.addItem(hoodie);
starWarsLandStore2.addItem(globe);
starWarsLandStore2.addItem(yodaHat);

// STAR WARS LAND STORE 3
Store starWarsLandStore3 = new Store("Resistance Supply");
starWarsLandStore3.addItem(backpack);
starWarsLandStore3.addItem(jediRobes);
starWarsLandStore3.addItem(lightSaber);
starWarsLandStore3.addItem(key);
starWarsLandStore3.addItem(mug);

// STAR WARS LAND DINING

// STAR WARS LAND DINING 1
Dining starWarsLandDining1 = new Dining("Ronto Roasters");
starWarsLandDining1.addItem(rontoWrap);
starWarsLandDining1.addItem(fries);
starWarsLandDining1.addItem(soda);
starWarsLandDining1.addItem(tipYip);
starWarsLandDining1.addItem(burger);


//STAR WARS LAND DINING 2
Dining starWarsLandDining2 = new Dining("Docking Bay 7 Food and Cargo");
starWarsLandDining2.addItem(moofJuice);
starWarsLandDining2.addItem(soda);
starWarsLandDining2.addItem(tipYip);
starWarsLandDining2.addItem(pret);
starWarsLandDining2.addItem(pZ);

//STAR WARS LAND DINING 3
Dining starWarsLandDining3 = new Dining("Milk Stand");
starWarsLandDining3.addItem(blueMilk);
starWarsLandDining3.addItem(outpostMix);
starWarsLandDining3.addItem(soda);

// STAR WARS LAND ACTIVITIES

Activities starWarsLandAct1 = new Activities("Build a Custom Lightsaber", "Assemble a unique lightsaber, complete with hilt, blade, and activation ceremony.");
Activities starWarsLandAct2 = new Activities("Decode Messages", "Reveal secrets and stories about the inhabitants of Batuu.");
Activities starWarsLandAct3 = new Activities("Meet Darth Vader", "Come face to face with the notorious Darth Vader");




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
    
    

