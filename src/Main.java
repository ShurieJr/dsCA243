public class Main {

    static void main(String[] args) {
//        //create an object
        Student student1 = new Student();
        Student student2 = new Student("Hawa mohamed",
                "C11213", "+278687", 3.8, true);

        student1 = student2;

        System.out.println(student1);
        System.out.println(student2);


    }
}
