import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuUtama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuUtama extends World
{
    /**
     * Constructor for objects of class MenuUtama.
     * 
     */
    public MenuUtama()
    {    
        super(500, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Play play = new Play();
        addObject(play,145,59);
        play.setLocation(127,61);
    }     
}
