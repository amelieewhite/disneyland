public class Activities
  {
    private String activityName;
    private int duration;
    private int mBoost;

    public Activities(String n, int d, int boost)
    {
      activityName = n;
      duration = d;
      mBoost = boost;
    }

    //getters
    public String getName()
    {
      return activityName;
    }
    public int getDuration()
    {
      return duration;
    }
    public int getMBoost()
    {
      return mBoost;
    }
  }
