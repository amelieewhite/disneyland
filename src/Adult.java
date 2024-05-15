
/**
 * Write a description of class adult here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adult extends Person
{
    String name;
    int hunger;
    int energy;
    public Adult(String n)
    {
        super(n);
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
