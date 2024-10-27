package ParkingLot.Repository;

import ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Integer, Gate> gateMap=new HashMap<>();

    public Gate findById(int id)
    {
        if(gateMap.containsKey(id))
        {
            gateMap.get(id);
        }
        return null;
    }

    public Map<Integer, Gate> getGateMap() {
        return gateMap;
    }

    public void setGateMap(Map<Integer, Gate> gateMap) {
        this.gateMap = gateMap;
    }
}
