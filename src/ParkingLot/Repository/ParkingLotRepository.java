package ParkingLot.Repository;

import ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    Map<Integer, ParkingLot>parkingLotMap=new HashMap<>();
    public ParkingLot findByParkingLot(int parkingLotId)
    {
        if(parkingLotMap.containsKey(parkingLotId))
        {
            parkingLotMap.get(parkingLotId);
        }
        return null;
    }

    public Map<Integer, ParkingLot> getParkingLotMap() {
        return parkingLotMap;
    }

    public void setParkingLotMap(Map<Integer, ParkingLot> parkingLotMap) {
        this.parkingLotMap = parkingLotMap;
    }
}
