import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{int score = 0;
    int n=10;
    int c=1;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 35, Color.GREEN, Color.GRAY));
          if (score== 104)
        {  World myWorld = getWorld();
            Win win = new Win();
           myWorld.addObject(win, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.stop(); 
        }
        
         if(score == (10+n))
             {
                 
                 randomApear();
                 n=n*c;
                 c++;
             }
    }    
    public void randomApear()
    {
        
            int a = Greenfoot.getRandomNumber(700);
            int b = Greenfoot.getRandomNumber(460);
            if(a < 700 && a > 20 && b <460 && b > 50)
            {
               World myWorld = getWorld();
                myWorld.addObject(new apple1(), a, b);
                
            }
        
            
    }
    public void addScore()
    {
        
        score++;
        
    }
    
}
