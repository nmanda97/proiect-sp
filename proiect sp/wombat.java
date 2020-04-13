import greenfoot.*;

/**
 * Write a description of class wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wombat extends Animals
{int n;
    /**
     * Act - do whatever the wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    
        
         if (Greenfoot.isKeyDown("up"))
         {
           setLocation(getX(), getY()-2);
           checkObstacle3();
         }
         if (Greenfoot.isKeyDown("down"))
         {
           setLocation(getX(), getY()+2);
           checkObstacle2();
         }
         if (Greenfoot.isKeyDown("left"))
         {
           move(-4);  
           checkObstacle1();
         }
         if (Greenfoot.isKeyDown("right"))
         {
           move(4);
           checkObstacle();
        }
        if (Greenfoot.isKeyDown("w") && ((Baie) getWorld()).CanShoot()) {
            getWorld().addObject(new proiectil(), getX(), getY()-10);
            ((Baie) getWorld()).ShootSet(0);
            
        }   
        if (Greenfoot.isKeyDown("space") && ((Baie) getWorld()).CanShoot()) {
            getWorld().addObject(new proiectil(), getX(), getY()+10);
            ((Baie) getWorld()).ShootSet(0);
            
        }  
        if (Greenfoot.isKeyDown("a") && ((Baie) getWorld()).CanShoot()) {
            getWorld().addObject(new proiectil(), getX()-10, getY());
            ((Baie) getWorld()).ShootSet(0);
            
        }   
        if (Greenfoot.isKeyDown("d") && ((Baie) getWorld()).CanShoot()) {
            getWorld().addObject(new proiectil(), getX()+10, getY());
            ((Baie) getWorld()).ShootSet(0);
            
        }   
        
        checkCollision2();
  

    
    }          
    private void space()
    {                   
         checkCollision();
         checkCollision1();
    }
     private void checkCollision()
      {
        Actor lemur = getOneIntersectingObject(lemur.class);
       
        if (lemur != null) 
        { 
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
           Baie baie = (Baie)myWorld;
            Counter counter = baie.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            GameOver Gameover = new GameOver();
           myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        
           Greenfoot.stop();          
        
        }
    }
     private void checkCollision1()
      {
        Actor lemur1 = getOneIntersectingObject(lemur1.class);
        
        if (lemur1 != null) 
        { 
           World myWorld = getWorld();
           Baie baie = (Baie)myWorld;
            Counter counter = baie.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            GameOver Gameover = new GameOver();
           myWorld.addObject(Gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
          
           Greenfoot.stop();          
        
        }
     }
     
     public void checkObstacle()
        { 
            Actor wallsegment = getOneIntersectingObject(wallsegment.class);
        
         if(wallsegment!=null) 
         {move(-4);
         }
  
    
    }
     public void checkObstacle1()
    { 
            Actor wallsegment = getOneIntersectingObject(wallsegment.class);
        
         if(wallsegment!=null) 
         {move(4);
         }
      
    
    }
    public void checkObstacle2()
        { 
            Actor wallsegment = getOneIntersectingObject(wallsegment.class);
        
         if(wallsegment!=null) 
         {setLocation(getX(), getY()-2);
         }
  
    
    }
     public void checkObstacle3()
        { 
            Actor wallsegment = getOneIntersectingObject(wallsegment.class);
        
         if(wallsegment!=null) 
         {setLocation(getX(), getY()+2);
         }
  
    
    }
    private void checkCollision2()
    {
        Actor apple1 = getOneIntersectingObject(apple1.class);
       
        if (apple1 != null) 
        { 
           World myWorld = getWorld();
           Baie baie = (Baie)myWorld;
            getWorld().removeObject(apple1);
             
        
        }
    }
   
}
