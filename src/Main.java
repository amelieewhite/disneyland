
import java.util.Scanner;
public class Main
{
    Park disney = new Park();
    Scanner scan;

    public static void main(String[] args)
    {
        System.out.println("Hello and welcome to Disneyland! How many in your party?");
        scan.nextInt();

        if(scan.nextInt() > 8)
        {
            System.out.println("Sorry, party limit is 8. How many in your party?");
        }



    }

}