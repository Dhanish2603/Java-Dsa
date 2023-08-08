package Oops.Constructors_1;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("rj",6,88.8f);
        s1.Name = "dhanish patel";
        System.out.println(s1.Name);
        Student s3 = new Student(s2);// copying the data from memory
        s3.Name = "kaju";
        System.out.println(s2.Name);// no change of value
        s3 = s2;//referring the same object in heap
        s3.Name = "kaju";
        System.out.println(s2.Name);// change of value
    }
    public static class Student{
        String Name; // this is an variable instance
        int rno;
        float marks;

        public  Student(){// default constructor
            Name = "dhanish";
            rno = 5;
            marks = 97.9f;
        }
        // constructor overlpading
       public Student(String Name ,int rno, float marks){// paramter  constructor
            this.Name = Name;// this keyword refer to the object instance variable
            this.rno = rno;
            this.marks = marks;
        }
        public Student(Student obj){// constructor of object
            this.Name = obj.Name;
            this.rno = obj.rno;
            this.marks = obj.marks;
        }
        
    }
    
}
