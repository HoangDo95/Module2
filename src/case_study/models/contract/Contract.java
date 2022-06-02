package case_study.models.contract;

import case_study.models.booking.Booking;
import case_study.models.person.Customer;

public class Contract {
    private String idContract;
    private Booking idBooking;
    private String prepay; // trả trước
    private String paymentAmount;// trả hết
    private Customer idCustomer;

    public Contract() {
    }

    public Contract(String idContract, Booking idBooking, String prepay, String paymentAmount, Customer idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.prepay = prepay;
        this.paymentAmount = paymentAmount;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public String getPrepay() {
        return prepay;
    }

    public void setPrepay(String prepay) {
        this.prepay = prepay;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + prepay +
                ", paymentAmount=" + paymentAmount +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
