package Oops.InHeritance_3;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 12, 11);
        Box b3 = new Box(14);

        System.out.println(b1.h + " " + b2.w + " " + b3.l);
        // BoxWeight bw = new Box(12); this is not possible creating instance of parent
        // class and object of child class
        // this cant happen because Box dont know the child property weight

        Box h1 = new BoxWeight(12);
        System.out.println("box and box weight "+h1.h);

    }
}
