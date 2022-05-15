package Case_Study.Models.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String serviceName, int usableArea, double rentalCosts, int maxNumberOfPeople, String freeService) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople);
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
                "serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getServiceName() +
                ", rentalCosts=" + getRentalCosts() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", freeService=" + freeService +
                '}';
    }
}
