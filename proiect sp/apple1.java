import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple1 extends Actor
{
    /**
     * Act - do whatever the apple1 wants to do. This method is called whenever
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
            counter.randomApear();
            getWorld().removeObject(this);
       }
    }
}
