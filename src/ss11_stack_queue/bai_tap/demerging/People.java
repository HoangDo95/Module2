package ss11_stack_queue.bai_tap.demerging;

public class People {
    private String name;
    private boolean gender;
    private String birthday;

    public People() {
    }

    public People(String name, boolean gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'';
    }
}
