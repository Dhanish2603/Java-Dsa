package Oops.PolyMorphism_4;

// final public class Shapes_1 {
    // also static methods cannot be over ride or ovel loaded due to reason is
    // overrride dependent on objects and static not depends on object
public class Shapes_1 {
    void area(){
        System.out.println("area of shapes");
    }
    void area(double length){
        System.out.println(length);
    }
@Override
    public String toString(){
        return "Area is 10 of shape";
    }
}
