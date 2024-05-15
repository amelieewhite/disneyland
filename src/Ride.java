/**
 * Write a description of class ride here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ride
{
    double queueTime = 0.00;
    String name = "";
    boolean heightRq = false;
    
    public Ride(String n, double waitTime, boolean hR)
    {
        name = n;
        queueTime = waitTime;
        heightRq = hR;
    }
}
