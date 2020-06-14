import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bluecar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bluecar extends Objek
{
    /**
     * Act - do whatever the bluecar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      
    int speed = 3;    
    public void act() 
    {
        bluecar a = new bluecar();
        Actor i = getOneIntersectingObject(bluecar.class);
        move(speed);
        checkdouble(i);
        end();
    }   
}
