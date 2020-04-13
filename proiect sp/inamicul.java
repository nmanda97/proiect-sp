import greenfoot.*;

/**
 * Write a description of class inamicul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inamicul extends Actor
{
    /**
     * Act - do whatever the inamicul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
    }    
    public void moveAround()
    {
        move(2);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
       if(getX()<=5  ||getY()>=getWorld().getWidth()-5)
       { 
           turn (180);
        }
        if(getY()<=5||getY()>=getWorld().getHeight()-5)
        {
            turn(180);
        }
        checkCollision2();
    }
  private void checkCollision2()
      {
        Actor wombat = getOneIntersectingObject(wombat.class);
        
        if (wombat != null) 
        { 
           World myWorld = getWorld();
           Baie baie = (Baie)myWorld;
            Counter counter = baie.getCounter();
            counter.addScore();
            getWorld().removeObject(wombat);
            GameOver Gameover = new GameOver();
           myWorld.addObject(Gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
           
           Greenfoot.stop();          
        
        }
     }
}