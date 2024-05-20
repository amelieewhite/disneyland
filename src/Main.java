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
    mainFrame.setSize(700,700);
    mainFrame.setLayout(null);
    mainFrame.setVisibility(true);

    for(Person p : party)
    {
        partyBudget += p.getBudget();
        costs += p.getTicketPrice();
    }

    public void displayMenuBar()
    {
        JPanel pan = new JPanel();
        pan.setBounds(0,0,700,200);
        pan.setBackground(Color.blue);
    }
        

    public static void main(String[] args)
    {
        
    }
}
