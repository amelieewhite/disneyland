public class Location 
{
    int row; 
    int col;
    Park disney;
    Lands[][] map;

    public Location()
    {
        disney = new Park();
        map = disney.getMap();
        row = 2;
        col = 1;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public void getLocation()
    {
        System.out.println("You are currently in: " + map[row][col].getName());
    }
    

}
