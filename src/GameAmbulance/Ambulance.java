import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Actor
{
    /**
     * Act - do whatever the Ambulance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int score = 0;
    public void act() 
    {
        getWorld().showText("Score : " + score, 70, 30);
        checkKey();        
        end();
        addscore();
    } 
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 100){
                setLocation(getX() -2, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 398){
                setLocation(getX() +2, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){        
               setLocation(getX(), getY() -2);            
        }
        if(Greenfoot.isKeyDown("down")){        
               setLocation(getX(), getY() +2);            
        }
    }
    
   public void end(){
       if(isTouching(bluecar.class)||isTouching(redcar.class)){
           getWorld().showText("Game Over\n Score : " + score, 250, 300);
           Greenfoot.stop();
        }
    }
    
    public void addscore(){
        if(isTouching(pizza.class)){
           score = score +10;
           removeTouching(pizza.class);
       }
    }
}

