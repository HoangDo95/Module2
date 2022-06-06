package giai_de.congty_abc.model;

public abstract class Person {
    private int id;
    private String employeeCode;
    private String name;
    private String dayOfBirth;
    private String address;

    public Person() {
    }

    public Person(int id, String employeeCode, String name, String dayOfBirth, String address) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
