
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    String name;
    boolean isAdult;
    int hunger;
    int energy;

    public Person(String n)
    {
        name = n;
        isAdult = true;
        hunger = 0;
        energy = 0;
    }

    public void decreaseEnergy(int howMuch)
    {
        if(energy - howMuch >= 0)
        {
            energy -= howMuch;
        }
        else {
            energy = 0;
        }
    }

    public void increaseEnergy(int howMuch)
    {
        if(energy + howMuch <= 10)
        {
            energy += howMuch;
        }
        else {
            energy = 10;
        }
    }
}
