import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
public class Game
{
    private Party party;
    private double partyBudget;
    private double costs;

    public Game()
    {
        party = new Party();
        partyBudget = 0;
        costs = 0;
    }
    Scanner myScanner = new Scanner();
    JFrame mainFrame = new JFrame("Disneyland Game");
    mainFrame.setSize(700,700);
    mainFrame.setLayout(null);
    mainFrame.setVisibility(true);
    public void enterInfo()
        {
            int numPpl = 0;
            System.out.println("How many people in your party?");
            int answer = myScanner.nextLine();
            while (answer > 8)
            {
                
            
    public void createBudget()
    {
        for(Person p : party)
        {
            partyBudget += p.getBudget();
            costs += p.getTicketPrice();
        }
    }

    public void displayMenuBar()
    {
        JPanel pan = new JPanel();
        pan.setBounds(0,0,700,200);
        pan.setBackground(Color.blue);
    }
        
    public static void main(String[] args)
    {
        Game one = new Game();
        
    }
}
