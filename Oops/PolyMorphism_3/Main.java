package Oops.PolyMorphism_3;

public class Main {
    public static void main(String[] args) {
        
        Shapes_1 shape = new Shapes_1();
        Shapes_1 circle = new Circle_2();
        Shapes_1 square = new Square_3();
        shape.area();//this 3 are run time polymorphism due to overriding
        circle.area();
        square.area();

        //child also can use parent class methods
        circle.area(10);
        shape.area(10);//this is method overloading works at compile time polymorphism
        // over riding toString method

        //this will be override method
        System.out.println(shape.toString());
    }
}
