package namage_mvc.model;

public class ManagementStaff extends Person{
    private double salaryBasic;
    private double coefficientSalary;

    public ManagementStaff(double salaryBasic, double coefficient) {
        this.salaryBasic = salaryBasic;
        this.coefficientSalary = coefficient;
    }

    public ManagementStaff(String name, String dayOfBirth, String address, double salaryBasic, double coefficientSalary) {
        super(name, dayOfBirth, address);
        this.salaryBasic = salaryBasic;
        this.coefficientSalary = coefficientSalary;
    }

    public ManagementStaff() {
    }

    @Override
    public int tienluong() {
        return (int) (salaryBasic*coefficientSalary);
    }

    @Override
    public String timeKeeping() {
        return "Có";
    }

    public double getSalary() {
        return salaryBasic;
    }

    public void setSalary(double salary) {
        this.salaryBasic = salary;
    }

    public double getCoefficient() {
        return coefficientSalary;
    }

    public void setCoefficient(double coefficient) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public String toString() {
        return "ManagementStaff{" +
                "name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", salaryBasic=" + salaryBasic +
                ", coefficient=" + coefficientSalary +
                ", salary=" + tienluong() +
                ", timeKeeping=" +timeKeeping() +
                '}';
    }
}
