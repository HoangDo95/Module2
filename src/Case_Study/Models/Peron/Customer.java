package Case_Study.Models.Peron;

public class Customer extends Person{
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id, String name, int dayOfBirth, String gender, String address, int phoneNumber, String typeCustomer) {
        super(id, name, dayOfBirth, gender, address, phoneNumber);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}
