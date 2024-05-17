import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
public class Main
{
    private ArrayList<Person> party = new ArrayList<Person>();
    private double partyBudget;
    private double costs;

    JFrame mainFrame = new JFrame("Disneyland Game");
    mainFrame.setBounds(700,700);
    mainFrame.setLayout(null);
    mainFrame.setVisibility(true);

    for(Person p : party)
    {
        partyBudget += p.getBudget();
        costs += p.getTicketPrice();
    }

    public void displayMenu()
    {
        JPanel pan = new JPanel();
        pan.setBackground(Color.blue);
    }
        

    public static void main(String[] args)
    {
        
    }
}
