package Oops.Interfaces;

public class CdPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Cdplayer start");
        
    }

    @Override
    public void stop() {
        System.out.println("Cdplayer stop");
        
    }
    
}
