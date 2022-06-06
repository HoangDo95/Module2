package giai_de.congty_abc.model;

public class Production extends Person {
    private String productNumber;
    private String productPrice;

    public Production() {
    }

    public Production(String productNumber, String productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public Production(int id, String employeeCode, String name, String dayOfBirth, String address, String productNumber, String productPrice) {
        super(id, employeeCode, name, dayOfBirth, address);
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }


    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", super.getId(),
                super.getEmployeeCode(),
                super.getName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getProductNumber(), getProductPrice());
    }

    @Override
    public String toString() {
        return "Production{" + getInfo() + '}';
    }
}
