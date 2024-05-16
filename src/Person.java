
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private boolean isAdult;
    private int morale;
    private int energy;

    public Person(String n, boolean iA)
    {
        name = n;
        isAdult = iA;
        morale = 100;
        energy = 100;
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
        if(energy + howMuch <= 100)
        {
            energy += howMuch;
        }
        else {
            energy = 100;
        }
    }
    public void increaseMorale(int howMuch)
    {
        if(morale + howMuch <= 100)
        {
            morale += howMuch;
        }
        else {
            morale = 100;
        }
    }
    public void decreaseMorale(int howMuch)
    {
         if(morale - howMuch >= 0)
        {
            morale -= howMuch;
        }
        else {
            morale = 0;
        }
    }

    // getters
    public String getName()
    {
        return name;
    }
    public boolean getStatus()
    {
        return isAdult;
    }
    public int getEnergyLvl()
    {
        return energy;
    }
    public int getMoraleLvl()
    {
        return morale;
    }
}
