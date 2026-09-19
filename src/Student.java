public class Student {
    //data fields - variables
    private String name;
    private String ID;
    private String tel;
    private double gpa;
    private boolean status;

    //constructors
    Student() {
        name = "Mohamed abdullahi";
        ID = "C112160";
        tel = "+2526152948";
        gpa = 3.9;
        status = true;
    }

    Student(String newName, String newID,
            String newTel, double newGpa, boolean newStatus) {
        name = newName;
        ID = newID;
        tel = newTel;
        gpa = newGpa;
        status = newStatus;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getID() {
        return ID;
    }

    public String getTel() {
        return tel;
    }

    public boolean getStatus() {
        return status;
    }

    //Setters

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setGpa(double gpa) {
        if(gpa >= 0 && gpa <= 4)
            this.gpa = gpa;
        else
            System.out.println("gpa must between 0-4");
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    void display() {
        System.out.println("ID: " + ID);
        System.out.println("name: " + name);
        System.out.println("tel: " + tel);
        System.out.println("gpa: " + gpa);
        System.out.println("status: " + status);
    }
}
