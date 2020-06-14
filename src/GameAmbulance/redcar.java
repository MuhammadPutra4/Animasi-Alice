import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class redcar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redcar extends Objek
{
    /**
     * Act - do whatever the redcar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        
    int speed = -5;
    public void act() 
    {
        redcar a = new redcar();
        Actor i = getOneIntersectingObject(bluecar.class);
        move(speed);
        checkdouble(i);
        end();          
    }
}
