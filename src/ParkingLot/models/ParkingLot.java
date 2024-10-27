package ParkingLot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int id;
    private List<Floor> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate>gates;

    public ParkingLot(int id, List<Floor> floors, ParkingLotStatus parkingLotStatus,
                      List<Gate> gates) {
        this.id = id;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.gates = gates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
