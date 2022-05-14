package CRUD.Person;

public class Student extends Person{
    private double point;

    public Student(int id, String name, int age, String gender,double point) {
        super(id, name, age, gender);
        this.point = point;
    }
    public Student(){

    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: " + "id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", gender= " + getGender() +", salary= " + this.point;
    }
}
