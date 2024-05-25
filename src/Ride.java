public class Ride
{
    private String name;
    private int waitTime;


    
    public Ride(String n, int time)
    {
        name = n;
        waitTime = time;

    }
    public String runRide()
    {
        int rand = (int) Math.random()*6;
        if(rand == 0)
        {
            return "Whee! That was fun!";
        }
        else if(rand == 1)
        {
            return "Oh no! You got motion sick :(!";
        }
        else if(rand == 2)
        {
            return "Front row! That was awesome!!";
        }
        else if(rand == 3)
        {
            return "Uh oh, " + name + " got stuck! How boring!";
        }
        else if(rand == 4)
        {
            return "Again, again!";
        }
        else
        {
            return "Woah, that was fast!";
        }

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
}
