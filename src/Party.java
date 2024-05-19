public class Party
{
  private double budget;
  private ArrayList<Person> party;

public Party(ArrayList<Person> p)
{
  party = p;
  budget = p.size()*100;
}
public addToParty(Person p)
{
  party.add(p);
}
public removeFromParty(Person p)
{
  party.remove(p);
}
public decreaseBudget(double howMuch)
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

