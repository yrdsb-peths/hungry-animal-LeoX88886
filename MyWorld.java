import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Bear b = new Bear();
        addObject(b, 200, 200);
        
      
        //addObject(ban, 400, 500);
        
        spawnBanana();
        spawnBanana();
        spawnBanana();
        
    }
    
    public void spawnBanana()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Banana ban = new Banana();
        addObject(ban, x, y);
    }
}
