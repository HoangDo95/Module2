package giai_de.congty_abc.model;

public class Production extends Person {
    private int productNumber;
    private int productPrice;

    public Production() {
    }

    public Production(int productNumber, int productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public Production(int id, String employeeCode, String name, String dayOfBirth, String address, int productNumber, int productPrice) {
        super(id, employeeCode, name, dayOfBirth, address);
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
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
