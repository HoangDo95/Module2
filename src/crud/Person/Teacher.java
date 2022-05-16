package crud.Person;

public class Teacher extends Person {
    private double salary;

    public Teacher(int id, String name, int age, String gender, double salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher: " + "id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", gender= " + getGender() + ", salary= " + this.salary;
    }


}
