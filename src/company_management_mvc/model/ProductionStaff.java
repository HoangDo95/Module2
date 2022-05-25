package company_management_mvc.model;

import company_management_mvc.service.ITimeKeepingService;

public class ProductionStaff extends Person implements ITimeKeepingService {
    private int productsNumber;

    public ProductionStaff(int productsNumber) {
        this.productsNumber = productsNumber;
    }

    public ProductionStaff(String name, String dayOfBirth, String address, int productsNumber) {
        super(name, dayOfBirth, address);
        this.productsNumber = productsNumber;
    }

    public ProductionStaff() {
    }

    @Override
    public int tienluong() {
        return productsNumber * 50000;
    }

    @Override
    public String timeKeeping() {
        return "Có";
    }

    public int getProductsNumber() {
        return productsNumber;
    }

    public void setProductsNumber(int productsNumber) {
        this.productsNumber = productsNumber;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" +
                "name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", productsNumber=" + productsNumber +
                ", salary=" + tienluong() +
                ", timeKeeping=" + timeKeeping() +
                '}';
    }
}
