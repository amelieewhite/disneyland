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
    public String runRide()
    {
        int rand = (int) Math.random()*10;
        if(rand == 0)
        {
            return "Whee! That was fun! Morale + " + moraleBoost + "!";
            morale += moraleBoost;
        }
        if(rand == 1)
        {
            return "Oh no! You got motion sick :(. Morale - " + moraleBoost + "!";
            morale -= moraleBoost;
        }
        if(rand == 2)
        {
            return "Front row! That was awesome! Morale + " + moraleBoost*2 + "!";
            morale += moraleBoost*2;
        }
        if(rand == 3)
        {
            return "Uh oh, " + name + " got stuck! 15 minutes lost. Morale - " + moraleBoost*2 + "!";
        }
        if(rand == 4)
        {
            return "Again, again! Morale + " + moraleBoost + "!";
            morale += moraleBoost;
        }
        if(rand == 5)
        {
            return "";
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
