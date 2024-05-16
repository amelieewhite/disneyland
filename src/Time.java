public class Time
  {
    private int hours;
    private int minutes;

    public Time()
    {
      hours = 8;
      minutes = 0;
    }

    public void advanceTime(int h, int m)
    {
      int count = 0;

      // method to make sure minutes don't go over 59? like if its 11:30 and you add an hour 45 you want it to be 1:15 not 12:75

      if(minutes >= 60)
      {
        hours += (minutes/60);
        minutes += (minutes%60);
      }
      else
      {
        hours += h;
        minutes += m;
      }
    }
  }
