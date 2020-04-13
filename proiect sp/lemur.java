import greenfoot.*;

/**
 * Write a description of class lemur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lemur extends Animals
{
    /**
     * Act - do whatever the lemur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {if (Greenfoot.isKeyDown("w")) setLocation(getX(), getY()-2);
       if (Greenfoot.isKeyDown("s")) setLocation(getX(), getY()+2);
     if (Greenfoot.isKeyDown("a"))
     {
       move(-4);  
     }
     if (Greenfoot.isKeyDown("d"))
     {
       move(4);
     }
       if(Greenfoot.isKeyDown("backspace"))
     {
          getImage().setTransparency(255);
     }
     checkCollision();
    }
    private void checkCollision()
      {
        Actor wombat = getOneIntersectingObject(wombat.class);
        
        if (wombat != null) 
        { 
           World myWorld = getWorld();
           
           Baie baie = (Baie)myWorld;
            Counter counter = baie.getCounter();
            counter.addScore();
           
            apple apple = new apple();
            wombat.getImage().setTransparency(0);
            
           
        
        }
        moveAround();
     }
    private int direction = 3;
    private void moveAround()  
    {  
     if ((direction == -3 && getX() <= 5) || (direction == 3 && getX() >= getWorld().getWidth()-5))  
        {  
            direction = -direction;  
            
        }  
        setLocation(getX()+direction, getY());  
    } 
}
