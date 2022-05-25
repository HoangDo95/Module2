package case_study.Models.Peron;

public class Customer extends Person{
    private String classify;

    public Customer() {
    }

    public Customer(int id, String name, String dayOfBirth, String gender, String address, int phoneNumber, String classify) {
        super(name, dayOfBirth, gender, id, address, phoneNumber);
        this.classify = classify;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth=" + getDayOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", typeCustomer='" + classify + '\'' +
                '}';
    }
}
