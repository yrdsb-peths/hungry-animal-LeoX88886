import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Leo Xu
 * @version May 20 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungery Bear", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bear bear = new Bear();
        addObject(bear,431,100);
        bear.setLocation(298,84);

        Label label = new Label("Press <space_key> to play", 50);
        addObject(label,292,277);
        label.setLocation(342,251);

        Label label2 = new Label("Use <WASD> to move", 30);
        addObject(label2,292,281);
        label2.setLocation(320,304);

        Label label3 = new Label("Press <C_key> to sprint", 30);
        addObject(label3,279,344);
        label3.setLocation(389,234);

        
        label.setLocation(319,344);
        label.setLocation(344,242);
        label2.setLocation(317,306);
    }
}
