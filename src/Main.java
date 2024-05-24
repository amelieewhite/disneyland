
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Park disneyland = new Park();
    static int partySize = 0;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> party = new ArrayList<Person>();

    /*
     * Method for selecting from choices
     */
    public static String ChooseOptions(String[] options, String msg) {
        System.out.println(msg);
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ". " + options[i]);
        }
        String chosen = "";
        while (chosen == "") {
            String choice = scan.nextLine();
            for (int i = 0; i < options.length; i++) {
                if (choice.toLowerCase().equals(options[i].toLowerCase())) {
                    chosen = choice;
                }
            }
            if (chosen == "") {
                System.out.println("Option " + choice + " not recognized, please try again\n");
            }
        }
        return chosen;
    }

    public static void displayMenu() {
        boolean b = false;
        disneyland.move("Main Street");

        while (!b) {
            String[] options = { "Shop", "Dine", "Ride", "Activities", "Leave" };
            Lands loc = disneyland.getPartyLocation();
            String choice = ChooseOptions(options,
                    "You are currently in " + loc.getName() + ". What would you like to do?");
            if (choice.equals("Shop")) {
                String[] shopOptions = loc.getStoreNames();
                String shop = ChooseOptions(shopOptions, "Which of these stores would you like to go in?");
                for (int i = 0; i < loc.getStores().size(); i++) {
                    if (shop.equals(loc.getStores().get(i).getName()))
                        ;
                    {
                        displayStoreMenu(loc.getStores().get(i));
                    }
                }

            } else if (choice.equals("Dine")) {
                System.out.println("You have chosen dine. Here is a list of restaurants in _.");
                System.out.println("dine 1 \n dine 2 \n dine 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if (nextChoice.equals("dine 1")) {
                    System.out.println("testing");
                }

            } else if (choice.equals("Go on a ride")) {
                System.out.println("You have chosen ride. Here is a list of rides in _.");
                System.out.println("ride 1 \n ride 2 \n ride 3");
                System.out.println("Which would you like to go on?");
                String nextChoice = scan.nextLine();
                if (nextChoice.equals("ride 1")) {
                    System.out.println("testing");
                }

            } else if (choice.equals("See activities")) {
                System.out.println("You have chosen see activities. Here is a list of events in _.");
                System.out.println("event 1 \n event 2 \n event 3");
                System.out.println("Which would you like to go to?");
                String nextChoice = scan.nextLine();
                if (nextChoice.equals("event 1")) {
                    System.out.println("testing");
                }

            } else if (choice.equals("leave")) {
                System.out.println("Are you sure? If you leave, you cannot reenter and the game will end.");
                String nextChoice = scan.nextLine();
                if (nextChoice.equals("yes")) {
                    System.out.println("Thank you for playing");
                    b = true;
                } else {
                    displayMenu();
                }
            } else {
                System.out.println("Sorry, I didn't get that. Please try again.");
            }

        }
    }

    public static void displayStoreMenu(Store s)
    {
        boolean b = false;

        while (!b) {
            String[] options = {"Browse Items", "Purchase Items", "Leave"};
            String choice = ChooseOptions(options, "Welcome to " + s.getName() + "! How can I help you?");
            if (choice.equals("Browse Items")) {
                String[] moreOptions = s.getItemList();
                String selectedItem = ChooseOptions(moreOptions, "What would you like to look at?");
                for(int i = 0; i < s.getItems().size(); i++)
                {
                    if(s.getItems().get(i).getName().equals(selectedItem))
                    {
                        System.out.println("You have selected " + selectedItem +". Here are some details:");
                        for(Item j : s.getItems())
                        {
                            if(j.getName().equals(selectedItem))
                            {
                                System.out.println(j.getName());
                                System.out.println(j.getDescrip());
                                System.out.println(j.getPrice());
                            }
        
                        }
                        String[] yetMoreOptions = {"Add to basket", "Go back"};
                        String selectedItem2 = ChooseOptions(yetMoreOptions, "What would you like to do?");
                        if(selectedItem2.equals("Add to basket"))
                        {
                            for(int k = 0; k < s.getItems().size(); k++)
                            {
                                if(s.getItems().get(k).getName().equals(selectedItem2)
                                {
                                    s.addToBasket(s.getItems().get(k));
                                    System.out.println("Added to basket.");
                                    displayStoreMenu(s);

                                }
                            }
                            
                        }
                        else if(selectedItem2.equals("Go back"))
                        {
                            displayStoreMenu(s);
                        }

                    }
                }
            }
            else if (choice.equals("Purchase Items")) {
                if(s.getBasketTotal() > 0)
                {
                    String[] options2 = {"Buy", "Never mind"};
                    String choice2 = ChooseOptions(options2, "Your total will be " + s.getBasketTotal() + ". Proceed? \n Yes \n No");
                    {
                        if(choice2.toLowerCase().equals("yes"))
                        {
                            part.decreaseBudget(s.getBasketTotal());
                            System.out.println("Thank you for shopping at " + s.getName());
                            displayMenu();
                        }
                        else if(choice2.toLowerCase().equals("never mind"))
                        {
                            System.out.println("Okay, back to menu.");
                            displayStoreMenu(s);
                        }
                    }
                }
                else{
                    System.out.println("Sorry, your basket is empty. Add something and try again");
                }
            }
            else if (choice.equals("Leave"))
            {
                System.out.println("Thank you for shopping at " + s.getName());
                displayMenu();
            }

        }

    }

    public static void main(String[] args) {
        if (debug == true) {
            disneyland.getPartyLoc();
            partySize = 2;
            Person p = new Person("hat", true);
            party.add(p);
            Person o = new Person("bat", true);
            party.add(o);
            Party part = new Party(party);
            displayMenu();
        }
        disneyland.getPartyLoc();
        System.out.println("Hello and welcome to Disneyland! How many in your party?");
        partySize = scan.nextInt();
        while (partySize > 8) {
            System.out.println("I'm sorry, parties may only have 8 people maximum. Please reenter your party size");
            partySize = scan.nextInt();
        }
        System.out.println("Great, " + partySize + " people. Now, let's get some details.");

        for (int i = 1; i <= partySize; i++) {
            String name = "";
            boolean isAdult = false;
            while (name.equals("")) {
                System.out.println("What is person " + i + "'s name?");
                name = scan.nextLine();
            }
            System.out.println("Are they over 18? \n True \n False");
            if (scan.nextBoolean()) {
                isAdult = true;
            }
            System.out.println("Great, person " + i + "'s name is " + name + ", and adult: " + isAdult);
            Person p = new Person(name, isAdult);
            party.add(p);
        }

        Party part = new Party(party);

        System.out.println("Great! Your party's budget for the day will be $" + part.getBudget() + ". Good luck!");
        /*
         * for(int i = 0; i < part.getSize(); i++)
         * {
         * System.out.println(party.get(i).getName());
         * 
         * }
         */
        displayMenu();

    }

}
