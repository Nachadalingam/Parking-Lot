package ParkingLot.models;

import ParkingLot.Exception.ParkingSpotException;

public class NearByEmptySpotAssignStretegy implements AssignParkingSpot{
    @Override
    public ParkingSpot assignSpot(VechileType vechileType, ParkingLot parkingLot) throws ParkingSpotException {
             for(Floor floor: parkingLot.getFloors())
             {
                 for(ParkingSpot parkingSpot:floor.getParkingSpotList())
                 {
                     if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.Empty)) {

                         parkingSpot.setParkingSpotStatus(ParkingSpotStatus.Filled);
                         return parkingSpot;
                     }

                 }
             }
             throw new ParkingSpotException();
    }
}
