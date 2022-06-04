package case_study.models.booking;

public class Booking {
    private Integer idBooking;
    private String starDate;
    private String endDate;
    private String idCustomer;
    private String idFacility;


    public Booking() {
    }

    public Booking(Integer idBooking, String starDate, String endDate, String idCustomer, String idFacility) {
        this.idBooking = idBooking;
        this.starDate = starDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", starDate='" + starDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idFacility='" + idFacility + '\'' +
                '}';
    }
}


