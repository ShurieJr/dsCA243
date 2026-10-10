package inheritance.types;

public class PostGraduate extends Student{
   private String level;

    public PostGraduate(){
        level = "Master";
        System.out.println("no-arg PostGrad constructor");
    }
    public PostGraduate(String name , String tel ,
                        int age , String stdid , String level){
        this.level = level;
        super(name , tel , age , stdid);
        System.out.println("param Postgrad constructor");
    }

}
