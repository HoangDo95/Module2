package case_study.models.person;

public class Employee extends Person {
    private String email;
    private String level; // trình độ
    private String workingPosition; // vị trí làm việc
    private double salary;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", super.getId(),
                super.getName(),
                super.getDayOfBirth(),
                super.getGender(),
                super.getAddress(),
                super.getPhoneNumber(),
                getEmail(), getLevel(), getWorkingPosition(), getSalary());
    }

    public Employee(int id, String name, String dayOfBirth, String gender, String address, int phoneNumber, String email, String level, String workingPosition, double salary) {
        super(name, dayOfBirth, gender, id, address, phoneNumber);
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
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth=" + getDayOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                "email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
