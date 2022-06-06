package giai_de.congty_abc.model;

public class Management extends Person {
    private Double salaryBasic;
    private Double salaryFactor;

    public Management() {
    }

    public Management(Double salaryBasic, Double salaryFactor) {
        this.salaryBasic = salaryBasic;
        this.salaryFactor = salaryFactor;
    }

    public Management(int id, String employeeCode, String name, String dayOfBirth, String address, Double salaryBasic, Double salaryFactor) {
        super(id, employeeCode, name, dayOfBirth, address);
        this.salaryBasic = salaryBasic;
        this.salaryFactor = salaryFactor;
    }

    public Double getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(Double salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public Double getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(Double salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", super.getId(),
                super.getEmployeeCode(),
                super.getName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getSalaryBasic(), getSalaryFactor());
    }

    @Override
    public String toString() {
        return "Management{" + getInfo() + '}';
    }
}
