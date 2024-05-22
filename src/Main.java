
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    static Park disneyland = new Park();
    static int partySize = 0;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> party = new ArrayList<Person>();

    
    

    public static void displayMenu()
    {
        boolean b = false;
        disneyland.move("Main Street");
        System.out.println("You are currently in " + disneyland.getPartyLoc() + ". What would you like to do?");
        while(!b)
        {
            System.out.println("1. Shop \n 2. Dine \n 3. Go on a ride \n 4. See activities \n 5. Move to another land \n 6. Leave");
            int choice = scan.nextInt();
            if(choice == 1)
            {
                /*
                 *   System.out.println("shop 1 \n shop 2 \n shop 3");
                System.out.println("Which would you like to explore?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("shop 1"))
                {
                    System.out.println("testing");

                }
                 */
                displayShopMenu();
              
                }
            else if(choice == 2)
            {
                /*
                 *  System.out.println("You have chosen dine. Here is a list of restaurants in " + disneyland.getPartyLoc());
                System.out.println("dine 1 \n dine 2 \n dine 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("dine 1"))
                {
                    System.out.println("testing");
                }

                 */
                displayDineMenu();
               
            }
            else if(choice == 3)
            {
                /*
                 * System.out.println("You have chosen ride. Here is a list of rides in " + disneyland.getPartyLoc());
                System.out.println("ride 1 \n ride 2 \n ride 3");
                System.out.println("Which would you like to go on?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("ride 1"))
                {
                    System.out.println("testing");
                }
                 */
                displayRidesMenu();

            }
            else if(choice == 4)
            {
                /*
                 * System.out.println("You have chosen see activities. Here is a list of events in " + disneyland.getPartyLoc());
                System.out.println("event 1 \n event 2 \n event 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("event 1"))
                {
                    System.out.println("testing");
                }
                 */
                
                 displayActivitiesMenu();

            }
            else if(choice == 5)
            {
                 /*
                     int counter = 1;
                System.out.println("You have chosen move to another land. Here is a list of lands you may move to:" );
                for(int i = 0; i < disneyland.getMap().length; i++)
                {
                    for(int j = 0; j < (disneyland.getMap())[i].length; j++)
                    {
                        if(disneyland.getMap()[i][j] != null && !(disneyland.getMap()[i][j].getName().equals(disneyland.getPartyLoc())))
                        {
                            System.out.println(counter + ". " + disneyland.getMap()[i][j].getName());
                            counter++;

                        }
                }
                System.out.println("Keep in mind that this will take energy. Where would you like to go?");
                int nextNextChoice = scan.nextInt();
                if(nextNextChoice == 1)
                {
                    System.out.println("testing");
                }


                */

                displayLandsMenu();
                
            }
            else if(choice == 6)
            {
               
                System.out.println("Are you sure? If you leave, you cannot reenter and the game will end. \n 1. Yes \n 2. No");
                int nextChoice = scan.nextInt();
                if(nextChoice == 1)
                {
                    System.out.println("Thank you for playing");
                    b = true;
                }
                else 
                {
                    displayMenu();
                }
                }
                else
                {
                    System.out.println("Sorry, I didn't get that. Please try again.");
                }

            }
        }
    
        public static void displayShopMenu()
        {
            System.out.println("You have chosen shop. Here is a list of shops in " + disneyland.getPartyLoc());
            disneyland.getPartyLocation().showStores();

        }
    public static void displayDineMenu()
        {
            System.out.println("You have chosen dine. Here is a list of dining options in " + disneyland.getPartyLoc());
            disneyland.getMap()[disneyland.getPartyLocation().getRow()][disneyland.getPartyLocation().getCol()].showDining();

        }
    public static void displayActivitiesMenu()
        {
            System.out.println("You have chosen activities. Here is a list of activities in " + disneyland.getPartyLoc());
            disneyland.getMap()[disneyland.getPartyLocation().getRow()][disneyland.getPartyLocation().getCol()].showEvents();

        }
        public static void displayRidesMenu()
        {
            System.out.println("You have chosen to go on a ride. Here is a list of rides in " + disneyland.getPartyLoc());
            disneyland.getMap()[disneyland.getPartyLocation().getRow()][disneyland.getPartyLocation().getCol()].showRides();

        }
    public static void displayLandsMenu()
        {
            int counter = 0;
            System.out.println("You have chosen move to another land. Here is a list of lands you may move to from " + disneyland.getPartyLoc());
             for(int i = 0; i < disneyland.getMap().length; i++)
                {
                    for(int j = 0; j < (disneyland.getMap())[i].length; j++)
                    {
                        if(disneyland.getMap()[i][j] != null && !(disneyland.getMap()[i][j].getName().equals(disneyland.getPartyLoc())))
                        {
                            System.out.println(counter + ". " + disneyland.getMap()[i][j].getName());
                            counter++;

                        }
                }
                System.out.println("Keep in mind that this will take energy. Where would you like to go?");
                int nextNextChoice = scan.nextInt();
                if(nextNextChoice == 1)
                {
                    System.out.println("testing");
                }
        

        }


    public static void main(String[] args)
    {
        disneyland.getPartyLoc();
        System.out.println("Hello and welcome to Disneyland! How many in your party?");
        partySize = scan.nextInt();
        while(partySize > 8)
        {
            System.out.println("I'm sorry, parties may only have 8 people maximum. Please reenter your party size");
            partySize = scan.nextInt();
        }
        System.out.println("Great, " + partySize + " people. Now, let's get some details.");

        for(int i = 1; i <= partySize; i++)
        {
            String name = "";
            boolean isAdult = false; 
            while(name.equals(""))
            {
                System.out.println("What is person " + i + "'s name?");
                name = scan.nextLine();
            }
            System.out.println("Are they over 18? \n True \n False");
            if(scan.nextBoolean())
            {
                isAdult = true;
            }
            System.out.println("Great, person " + i + "'s name is " + name + ", and adult: " + isAdult);
            Person p = new Person(name, isAdult);
            party.add(p);
            }

            Party part = new Party(party);

            System.out.println("Great! Your party's budget for the day will be $" + part.getBudget() + ". Good luck!");
            /*  for(int i = 0; i < part.getSize(); i++)
            {
                System.out.println(party.get(i).getName());

            } */
            displayMenu();
           

    
        }

       


    }

