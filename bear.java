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
    private GreenfootImage[] rightImages;
    private GreenfootImage[] leftImages;
    private SimpleTimer actionTimer;
    private int delay = 0;
    private boolean isFacingRight = true;
        
    public Bear()
    {
            //GreenfootImage image = new GreenfootImage("images/elephant_idle/idle0.png");
        rightImages = new GreenfootImage[8];
        leftImages = new GreenfootImage[8];
        for(int i = 0; i < rightImages.length; i++)
        {
             rightImages[i] = new GreenfootImage("images/totalbear/idle" + i + ".png");
             rightImages[i].scale(150, 125);
             
             leftImages[i] = new GreenfootImage("images/totalbear/idle" + i + ".png");
             leftImages[i].mirrorHorizontally();
             leftImages[i].scale(150, 125);
        }
        setImage(rightImages[0]);
        
        actionTimer = new SimpleTimer();
        actionTimer.mark();
    }
    
    int curIndex = 0;
    public void idleAction()
    {
        if(actionTimer.millisElapsed() > 100)
        {
            if (isFacingRight)
            {
                setImage(rightImages[curIndex]);
            }
            else
            {
                setImage(leftImages[curIndex]);
            }
            curIndex++;
            curIndex %= 8;
            actionTimer.mark();
        }
    }
    
    
    public void act()
    {
        // Add your action code here.
        
        
       
        if(Greenfoot.isKeyDown("d"))
        {
            isFacingRight = true;
            move(5);
            if(Greenfoot.isKeyDown("c"))
            {
                isFacingRight = true;
                move(10);
            }
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            isFacingRight = false;
            move(-5);
            
            if(Greenfoot.isKeyDown("c"))
            {
                isFacingRight = false;
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
