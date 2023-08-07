public class Class_Object_Intro1 {
    public static void main(String[] args) {
        Student student_1 = new Student();
        System.out.println(student_1); //give some random value
        System.out.println(student_1.roll_no); //by default will give zero
        System.out.println(student_1.name); //by default will give null (default value of objects)
        System.out.println(student_1.marks); //by default will give 0.0
    }
}

//creating a class
class Student {
    int roll_no;
    String name;
    float marks;
}
