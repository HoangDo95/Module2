package Case_Study.Models.Peron;

public class Employee extends Person{
    private String email;
    private String level;
    private String workingPosition;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int dayOfBirth, String gender, String address, int phoneNumber, String email, String level, String workingPosition, double salary) {
        super(id, name, dayOfBirth, gender, address, phoneNumber);
        this.email = email;
        this.level = level;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
