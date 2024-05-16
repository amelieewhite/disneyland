
/**
 * Write a description of class weather here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weather
{
    private double temp;
    private String conditions;

    public Weather(double t, String c)
    {
        temp = t;
        conditions = c;
    }

    public void changeWeather()
    {
        int rand = (int) ((Math.random()*100) + 1);

        if(rand <= 10)
        {
            temp = 60.0;
            conditions = "Rainy";
        }
        else if(rand <= 20)
        {
            temp = 90.0;
            conditions = "Cloudy";
        }
        else if(rand <= 30)
        {
            temp = 75.0;
            conditions = "Sunny";
        }
        else if(rand <= 40)
        {
            temp = 57.0;
            conditions = "Partly Cloudy";
        }
        else if(rand <= 50)
        {
            temp = 85.5;
            conditions = "Temperate";
        }
        else if(rand <= 60)
        {
            temp = 100.00;
            conditions = "Very hot";
        }
        else if(rand <= 70)
        {
            temp = 55.00;
            conditions = "Chilly";
        }
        else 
        {
            temp = 75.0;
            conditions = "Sunny";
        }
    }
}

