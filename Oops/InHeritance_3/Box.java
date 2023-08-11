package Oops.InHeritance_3;

public class Box {
    double w;
    double h;
    double l;

    public Box(double w, double h, double l) {
        this.w = w;
        this.h = h;
        this.l = l;
    }

    public Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box() {
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }
}
