import greenfoot.*;

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Animals
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    
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
            getWorld().removeObject(this);
            Greenfoot.playSound("pacman_chomp.wav");
       }
    }
}
