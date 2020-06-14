import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza extends Objek
{
    /**
     * Act - do whatever the pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 3;
    public void act() 
    {
        pizza a = new pizza();
        Actor i = getOneIntersectingObject(pizza.class);
        move(speed);
        checkdouble(i);
        end();
    }   
}
