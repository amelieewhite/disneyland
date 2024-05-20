
/**
 * Write a description of class park here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Park
{
    Weather w;
    Lands[][] map = new Lands[3][3];
    
    
    public Park()
    {
        map[2][1] = new Lands("Entrance", "Main entrance to the park");
        map[1][1] = new Lands("Main Street", "Main street USA, hub of shops");
        map[0][1] = new Lands("Fantasyland", "fantasyland woo");
        
    }
}
