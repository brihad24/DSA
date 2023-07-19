public class main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5]; // 'new' allocates memory at runtime

        // Student brihad = new Student();

        Student brihad = new Student(15, "abc", 85.4f); // this calls the 2nd constructor
        Student random = new Student(); // this calls the 1st constructor

        // brihad.rno = 54;
        // brihad.name = "Brihad";
        // brihad.marks = 81.1f;

        System.out.println(brihad.rno);
        System.out.println(brihad.name);
        System.out.println(brihad.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks = 90;

    Student() { 
        // this is a constructor
        // constructor stores the default values that any object referencing the class will have
        this.rno = 54;
        this.name = "Brihad";
        this.marks = 81.1f;

        // 'this' acts as a temporary name for the object name to access it
        // at runtime 'this' is replaced with whatever reference variable name is
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, 'this' will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Constructor overloading
    // if we call a class with 0 values, it will call the 1st constructor
    // if we call a class with 3 values, it will call the 2nd constructor
}