
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    Park disney = new Park();
    static int partySize = 0;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> party = new ArrayList<Person>();

    public static void main(String[] args)
    {
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
            while(name.equals(""))
            {
                System.out.println("What is person " + i + "'s name?");
                name = scan.nextLine();
            }
            System.out.println("Are they over 18?");
            boolean isAdult = scan.nextBoolean();
            System.out.println("Great, person " + i + "'s name is " + name + ", and adult: " + isAdult);
            Person p = new Person(name, isAdult);
            party.add(p);
            }

            Party part = new Party(party);

            System.out.println("Great! Your party's budget for the day will be $" + part.getBudget() + ". Good luck!");
            for(int i = 0; i < part.getSize(); i++)
            {
                System.out.println(party.get(i).getName());

            }
    
        }

       


    }

