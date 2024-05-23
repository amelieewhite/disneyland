
/**
 * Write a description of class park here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Park
{
    Weather w;
    static Lands[][] map = new Lands[3][3];
    Location currLocation;
    
    
    public Park()
    {
        currLocation = new Location();

 
        // entrance
        map[2][1] = new Lands("Entrance", "Main entrance to the park");

        // main street
        map[1][1] = new Lands("Main Street", "Main street USA, hub of shops");
        map[1][1].addStore((new Store("World of Disney")));
        map[1][1].addStore((new Store("The Mad Hatter")));
        map[1][1].addStore((new Store("Candy Palace")));
        // fantasyland
        map[0][1] = new Lands("Fantasyland", "fantasyland woo");
        map[0][1].addRide(new Ride("It's a Small World", 10, 5));
        map[0][1].addRide(new Ride("The Mad Hatter's Tea Party", 15, 10));
        map[0][1].addStore(new Store("Bibiti Bobiti Boutique"));
        map[0][1].addDining(new Dining("Carnation Cafe"));
        map[0][1].addRide(new Ride("It's a Small World", 10, 5));
        map[0][1].addEvent(new Activities("Meet the Princesses", 60, 20));

        // frontierland
        map[0][0] = new Lands("Frontierland", "A western themed area");
        

        // adventureland
        map[2][0] = new Lands("Adventureland", "Desc. here");

        // tomorrowland
        map[2][2] = new Lands("Tomorrowland", "desc");

        // toontown
        map[0][2] = new Lands("Toontown", "desc.");


        


        
    }

    public Lands[][] getMap()
    {
        return map;
    }
    public String getLandName(int row, int col)
    {
        return map[row][col].getName();
    }
    public String getLandDesc(int row, int col)
    {
        return map[row][col].getDescription();
    }
    public String getPartyLoc()
    {
        return map[currLocation.getRow()][currLocation.getCol()].getName();
    }
    public Lands getPartyLocation()
    {
        return map[currLocation.getRow()][currLocation.getCol()];
    }
    public void move(String where)
    {
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                if(map[i][j] != null && map[i][j].getName().equals(where))
                {
                    currLocation.move(i, j);
                }
            }
        }
        }
    
        

    }
    
    

