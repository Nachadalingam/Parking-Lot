package ParkingLot.models;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpotList;
    private GateType gateType;
    private FloorStatus floorStatus;

    public Floor(int floorNumber,GateType gateType)
    {
        this.floorNumber=floorNumber;
        this.parkingSpotList=new ArrayList<>();
        this.gateType=gateType;
        this.floorStatus=FloorStatus.Opened;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
