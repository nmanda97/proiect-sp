import greenfoot.*;

/**
 * Write a description of class lemur1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lemur1 extends Animals
{ /**
     * Act - do whatever the lemur1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private int speed = 1;      // speed of lift
    private int syPos = 380;    // start position of lift
    private int eyPos = 50;     // end position of lift
    
    private int yPos;
    
   public lemur1()
    {
    }
    
    public lemur1(int aSpeed, int startPosition, int endPosition)
    {
        speed = aSpeed;     // set speed of lift
        syPos = startPosition;   // Start Position
        eyPos = endPosition;
        
    }
    
    
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
    checkPosition();
        moveUp();
    
   }
   
   
   public void checkPosition()
    {
        if(getY() < eyPos) {
            resetlemur1();
        }
    }
    
   
    public void resetlemur1()
    {
        setLocation(getX(), syPos);
    }
    
    
    public void moveUp()
    {
        setLocation(getX(), getY()-speed);
    }
    
   
    public int getYPos()
    {
        return getY();
    }
}
