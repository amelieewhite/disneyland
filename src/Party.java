import java.util.*;

public class Party
{
  private double budget;
  private ArrayList<Person> party;

public Party(ArrayList<Person> p)
{
  party = p;
  budget = p.size()*100;
}
public void addToParty(Person p)
{
  party.add(p);
}
public void removeFromParty(Person p)
{
  party.remove(p);
}
public void decreaseBudget(double howMuch)
{
  if(budget - howMuch >= 0)
  {
    budget -= howMuch;
  }
  else
  {
    budget = 0.0;
  }
}
public double getBudget()
{
  return budget;
  }
}


