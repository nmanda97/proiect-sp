import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class proiectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class proiectil extends Actor
{
    /**
     * Act - do whatever the proiectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int y = getY();
       y = y-2;
       
       setLocation(getX(), y);
       
       if (getY() == 0) {
           destroy();
        }
       
    }    
    
    private void destroy() {
        World myWorld = getWorld();
           Baie baie = (Baie)myWorld;
        getWorld().removeObject(this);
    }
}
