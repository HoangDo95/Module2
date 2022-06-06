package giai_de.congty_abc.model;

public class Management extends Person {
    private String salaryBasic;
    private String salaryFactor;

    public Management() {
    }

    public Management(String salaryBasic, String salaryFactor) {
        this.salaryBasic = salaryBasic;
        this.salaryFactor = salaryFactor;
    }

    public Management(int id, String employeeCode, String name, String dayOfBirth, String address, String salaryBasic, String salaryFactor) {
        super(id, employeeCode, name, dayOfBirth, address);
        this.salaryBasic = salaryBasic;
        this.salaryFactor = salaryFactor;
    }

    public String getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(String salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public String getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(String salaryFactor) {
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
