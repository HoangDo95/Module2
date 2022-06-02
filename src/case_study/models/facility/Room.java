package case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idFacility, String serviceName, int usableArea, double rentalCosts, int maxNumberOfPeople, String freeService) {
        super(idFacility,serviceName, usableArea, rentalCosts, maxNumberOfPeople);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idFacility=" + getIdFacility() +
                " serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getServiceName() +
                ", rentalCosts=" + getRentalCosts() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", freeService=" + freeService +
                '}';
    }
}
