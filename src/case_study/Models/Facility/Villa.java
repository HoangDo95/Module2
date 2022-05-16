package case_study.Models.Facility;

public class Villa extends Facility {
    private String roomType;
    private int poolArea;
    private int floor;

    public Villa() {

    }

    public Villa(String serviceName, int usableArea, double rentalCosts, int maxNumberOfPeople, String roomType, int poolArea, int floor) {
        super(serviceName, usableArea, rentalCosts, maxNumberOfPeople);
        this.roomType = roomType;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCosts=" + getRentalCosts() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", roomType='" + roomType + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
