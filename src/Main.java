import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Main
{
    private ArrayList<Person> party = new ArrayList<Person>();
    private double partyBudget;
    private double costs;

    for(Person p : party)
    {
        partyBudget += p.getBudget();
        costs += p.getTicketPrice();
    }
    
    public static void main(String[] args)
    {
        
    }
}
