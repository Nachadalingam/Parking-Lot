package ParkingLot.models;

public class ParkingSpot {
    private int spotNumber;
    private ParkingSpotType parkingSpotType;
    private VechileType vechileType;
    private ParkingSpotStatus parkingSpotStatus;
    private Floor floor;

    public ParkingSpot(int spotNumber, ParkingSpotType parkingSpotType,
                       VechileType vechileType,
                       ParkingSpotStatus parkingSpotStatus, Floor floor) {
        this.spotNumber = spotNumber;
        this.vechileType = vechileType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.floor = floor;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {

        this.parkingSpotType = parkingSpotType;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

}
