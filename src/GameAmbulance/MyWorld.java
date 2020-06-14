import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        Ambulance ambulance = new Ambulance();
        addObject(ambulance,245,510);
    }
       
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new bluecar(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new redcar(), Greenfoot.getRandomNumber(200) + 200, 600);
        }
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(new tree(), Greenfoot.getRandomNumber(70), 0);
            addObject(new tree(), Greenfoot.getRandomNumber(90) + 450, 0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
            addObject(new pizza(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
