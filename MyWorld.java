import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel = new Label(0, 80);
    int level = 1;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Bear b = new Bear();
        addObject(b, 200, 200);
        
        addObject(scoreLabel, 50,50);
      
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
        ban.setSpeed(level);
        
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level+=1;
        }
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
        
    }

}
