package inheritance.types;

public class Person {
    private String name , tel;
    protected int age;

    public Person() {
        name = "Mohamed";
        tel = "+878";
        age = 45;
    }

    public Person(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //print information

    @Override
    public String toString() {
        return  "name: " + name + '\n' +
                "tel: " + tel + '\n' +
                "age: " + age ;
    }
}
