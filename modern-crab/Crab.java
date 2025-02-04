import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }
     
    public void moveAndTurn()
    {
       if(Greenfoot.isKeyDown("left"))
       {
           move(4);
           turn(-4);
       }
       if(Greenfoot.isKeyDown("right"))
       {
           move(4);
           turn(4);
       }
    }
    
    public void eat(){
       Actor worm;
       worm = getOneObjectAtOffset(0,0,Worm.class);
       if (worm != null)
       {
           World world;
           world = getWorld();
           world.removeObject(worm);
           Greenfoot.playSound("eating.wav");
       }
    }    
}
