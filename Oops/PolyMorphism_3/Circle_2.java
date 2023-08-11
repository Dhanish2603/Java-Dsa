package Oops.PolyMorphism_3;

public class Circle_2 extends Shapes_1{
    //note if we make shapes final then we cannot use this extends to shapes
    @Override
    void area(){
        System.out.println("area of circle");
    }
}
