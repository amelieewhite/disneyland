
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
        disneyland.getPartyLoc();
        System.out.println("What would you like to do?");
        while(!b)
        {
            System.out.println("Shop \n Dine \n Go on a ride \n See activities \n leave");
            String choice = scan.nextLine();
            if(choice.equals("Shop"))
            {
                System.out.println("You have chosen shop. Here is a list of shops in _.");
                System.out.println("shop 1 \n shop 2 \n shop 3");
                System.out.println("Which would you like to explore?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("shop 1"))
                {
                    System.out.println("testing");

                }
                }
            else if(choice.equals("Dine"))
            {
                System.out.println("You have chosen dine. Here is a list of restaurants in _.");
                System.out.println("dine 1 \n dine 2 \n dine 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("dine 1"))
                {
                    System.out.println("testing");
                }

            }
            else if(choice.equals("Go on a ride"))
            {
                System.out.println("You have chosen ride. Here is a list of rides in _.");
                System.out.println("ride 1 \n ride 2 \n ride 3");
                System.out.println("Which would you like to go on?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("ride 1"))
                {
                    System.out.println("testing");
                }

            }
            else if(choice.equals("See activities"))
            {
                System.out.println("You have chosen see activities. Here is a list of events in _.");
                System.out.println("event 1 \n event 2 \n event 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("event 1"))
                {
                    System.out.println("testing");
                }

            }
            else if(choice.equals("leave"))
            {
                System.out.println("Are you sure? If you leave, you cannot reenter and the game will end.");
                String nextChoice = scan.nextLine();
                if(nextChoice.equals("yes"))
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
            boolean isAdult; 
            while(name.equals(""))
            {
                System.out.println("What is person " + i + "'s name?");
                name = scan.nextLine();
            }
            System.out.println("Are they over 18? \n Yes \n No");
            if(scan.nextLine().equals("Yes") || scan.nextLine().equals("yes"))
            {
                isAdult = true;
            }
            else{
                isAdult = false;
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

