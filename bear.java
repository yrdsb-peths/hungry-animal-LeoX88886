import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images;
        
    public Bear()
    {
            //GreenfootImage image = new GreenfootImage("images/elephant_idle/idle0.png");
        images = new GreenfootImage[8];
        images[0] = new GreenfootImage("images/totalbear/idle0.png");
        for(int i = 0; i < images.length; i++)
        {
             images[i] = new GreenfootImage("images/totalbear/idle" + i + ".png");
        }
        setImage(images[3]);
    }
    
    int curIndex = 0;
    public void idleAction()
    {
        setImage(images[curIndex]);
        curIndex++;
        curIndex %= 8;
    }
    
    
    public void act()
    {
        // Add your action code here.
        
        
       
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            if(Greenfoot.isKeyDown("c"))
            {
                move(10);
            }
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            if(Greenfoot.isKeyDown("c"))
            {
                move(-10);
            }
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y -5);
            if(Greenfoot.isKeyDown("c"))
            {
                
                setLocation(x, y -10);   
            }
            

        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y + 5);
              if(Greenfoot.isKeyDown("c"))
            {
                
                setLocation(x, y + 10);   
            }
        }
        
        pac();
        idleAction();
        

    }
    
    public void pac()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            Greenfoot.playSound("sounds/smw_coin.wav");
            MyWorld world = (MyWorld) getWorld();
            world.spawnBanana();
            world.increaseScore();
        }
    }
}
