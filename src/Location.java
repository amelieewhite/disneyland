public class Location 
{
    int row; 
    int col;

    public Location()
    {
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
    public void move(int r, int c)
    {
        row = r;
        col = c;
    }
    

}
