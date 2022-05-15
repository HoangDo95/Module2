package Case_Study.Models.Peron;

public abstract class Person {
    private int id;
    private String name;
    private int dayOfBirth;
    private String gender;
    private String address;
    private int phoneNumber;

    public Person() {

    }

    public Person(int id, String name, int dayOfBirth, String gender, String address,int phoneNumber) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
