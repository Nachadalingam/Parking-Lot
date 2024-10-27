package ParkingLot.models;

import ParkingLot.Exception.ParkingSpotException;

public interface AssignParkingSpot {
    public ParkingSpot assignSpot(VechileType vechileType,ParkingLot parkingLot) throws ParkingSpotException;

}
