package Oops.static_2.package_2;

public class StaticExample {
    public static void main(String[] args) {// note in same folder two files are accessible without import
        Human dhanish = new Human("dhanish", 20, 80000);
        System.out.println(dhanish.name);
        Human raju = new Human("raju", 22, 90000);
        System.out.println(raju.name);
        // System.out.println(dhanish.population);
        // System.out.println(raju.population);this two will show correct but not good practice
        System.out.println(Human.population);// this is right way to write
    }
}
