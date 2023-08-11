package Oops.InHeritance_3;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight(double w, double h, double l, double weight) {
        super(w, h, l);// this will call constructor of parent class
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        super(weight);
        this.weight = weight;
    }

}
