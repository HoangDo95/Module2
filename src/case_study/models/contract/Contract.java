package case_study.models.contract;

public class Contract {
    private String idContract;
    private String idBooking;
    private String prepay; // trả trước
    private String paymentAmount;// trả hết
    private String idCustomer;


    public Contract() {
    }

    public Contract(String idContract, String idBooking, String prepay, String paymentAmount, String idCustomer) {
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

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
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
