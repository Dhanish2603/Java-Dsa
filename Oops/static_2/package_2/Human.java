package Oops.static_2.package_2;

public class Human {
    String name;
    int age;
    int salary;
    static long population;
    
    static void message(){
        // System.out.println(this.age); this is not possible due to function static
    }

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        // this.population+=1; avoid this
        Human.population +=1;// this is common for all the objects 
        //also we write Human.population this is the best way
        Human.message();
    }

}
