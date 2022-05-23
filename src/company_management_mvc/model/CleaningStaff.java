package company_management_mvc.model;

public class CleaningStaff extends Person {
    private int workDay;

    public CleaningStaff(int workDay) {
        this.workDay = workDay;
    }

    public CleaningStaff(String name, String dayOfBirth, String address, int workDay) {
        super(name, dayOfBirth, address);
        this.workDay = workDay;
    }

    public CleaningStaff() {
    }

    @Override
    public int tienluong() {
        return workDay * 120000;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public String toString() {
        return "CleaningStaff{" +
                "name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", workDay=" + workDay +
                ", salary=" + tienluong() +
                '}';
    }
}
