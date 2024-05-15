
/**
 * Write a description of class kid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kid extends Person
{
    String name;
    int hunger;
    int energy;

    public Kid(String n)
    {
        super(n);
        hunger = 0;
        energy = 10;
    }

    public void decreaseEnergy(int howMuch)
    {
        super.decreaseEnergy(howMuch);
    }

    public void increaseEnergy(int howMuch)
    {
        super.increaseEnergy(howMuch);
    }
}