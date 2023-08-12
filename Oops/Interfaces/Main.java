package Oops.Interfaces;

public class Main  {
    public static void main(String[] args) {
        Engine c = new Car();
        c.start();
        c.acc();
        // c.brake(); this cannot be run because we have variable of engine and methods of car
        c.stop();


        Media carMedia = new Car();
        carMedia.stop();//this will stop engine instead of media



        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradedEngine(new PowerEngine() );
    }
}
