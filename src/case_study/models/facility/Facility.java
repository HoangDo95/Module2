package case_study.models.facility;

import java.util.Objects;

public class Facility {
    private String idFacility;
    private String serviceName ;
    private int usableArea;
    private double rentalCosts;
    private int maxNumberOfPeople;
    public Facility(){

    }
    public Facility(String idFacility, String serviceName, int usableArea, double rentalCosts, int maxNumberOfPeople) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility=" + idFacility +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(idFacility, facility.idFacility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFacility);
    }
}
