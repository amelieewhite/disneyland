
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private boolean isAdult;
    private double ticketPrice;

    public Person(String n, boolean iA)
    {
        name = n;
        isAdult = iA;
        if(isAdult)
        {
            ticketPrice = 170.0;
        }
        else
        {
            ticketPrice = 130.0;
            // prices are just place holders for now, will be updated 
        }
    }

    // getters
    public String getName()
    {
        return name;
    }
    public boolean getStatus()
    {
        return isAdult;
    }
    public void setStatus(boolean adult)
    {
        isAdult = adult;
    }
    public double getTicketPrice()
    {
        return ticketPrice;
    }
}
