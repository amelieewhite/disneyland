public class Ride
{
    private String name;
    private int waitTime
    private int moraleBoost;
    
    public Ride(String n, int time, int boost)
    {
        name = n;
        waitTime = time;
        moraleBoost = boost;
    }
//Getters
    public String getName()
    {
        return name;
    }
    public int getWaitTime()
    {
        return waitTime;
    }
    public int getMoraleBoost()
    {
        return moraleBoost;
    }
}
