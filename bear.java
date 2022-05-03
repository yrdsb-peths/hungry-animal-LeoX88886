import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bear extends Actor
{
    /**
     * Act - do whatever the bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        /*move(1);
        turn(1);
        */
       
        if(isTouching(banana.class))
        {
            removeTouching(banana.class);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
        int x = getX();
        int y = getY();
        setLocation(x, y -5);

        }
        
        if(Greenfoot.isKeyDown("s"))
        {
        int x = getX();
        int y = getY();
        setLocation(x, y + 5);
        }

    }
}
