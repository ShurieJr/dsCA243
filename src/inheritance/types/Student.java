package inheritance.types;

public class Student extends Person{
    protected String studentId;

    public Student() {
        //this("C112160");
    studentId = "C112160";
        System.out.println("no-arg student constructor");
    }
//    public Student(String stdid){
//        studentId = stdid;
//        System.out.println("1-param constructor student constructor");
//    }
    public Student(String name , String tel , int age , String studentId){
        super(name , tel , age);
        this.studentId = studentId;
        System.out.println("4-param-constructor student constructor");
    }
}
