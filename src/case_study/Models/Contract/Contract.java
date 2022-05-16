package case_study.Models.Contract;

public class Contract {
    private int idContract;
    private int idBooking;
    private double deposit;
    private double paymentAmount;
    private int idCustomer;

    public Contract() {
    }

    public Contract(int idContract, int idBooking, double deposit, double paymentAmount, int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.paymentAmount = paymentAmount;
        this.idCustomer = idCustomer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", paymentAmount=" + paymentAmount +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
