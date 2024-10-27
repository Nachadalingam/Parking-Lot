package ParkingLot.Repository;

import ParkingLot.models.Vechile;

import java.util.HashMap;
import java.util.Map;

public class VechileRepository {

    Map<String, Vechile> vechileMap=new HashMap<>();

    public Vechile findByNumber(String vechileNumber)
    {
        if(vechileMap.containsKey(vechileNumber))
        {
            return vechileMap.get(vechileNumber);
        }
        return null;
    }

    public void save(Vechile vechile) {
        vechileMap.put(vechile.getVechileNo(), vechile);
    }

    public Map<String, Vechile> getVechileMap() {
        return vechileMap;
    }

    public void setVechileMap(Map<String, Vechile> vechileMap) {
        this.vechileMap = vechileMap;
    }
}
