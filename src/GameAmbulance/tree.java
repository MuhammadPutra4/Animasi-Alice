import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends Objek
{
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      
    int speed = 3;
    public void act() 
    {
        tree a = new tree();
        Actor i = getOneIntersectingObject(tree.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
