package case_study.Models.Facility;

public class House extends Facility {
    public String roomType;
    public int floor;

    public House() {
    }

    public House(String idFacility, String serviceName, int usableArea, double rentalCosts, int maxNumberOfPeople, String roomType, int floor) {
        super(idFacility,serviceName, usableArea, rentalCosts, maxNumberOfPeople);
        this.roomType = roomType;
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "idFacility=" + getIdFacility() +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getServiceName() +
                ", rentalCosts=" + getRentalCosts() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", roomType='" + roomType + '\'' +
                ", floor=" + floor +
                '}';
    }
}
