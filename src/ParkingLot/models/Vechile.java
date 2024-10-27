package ParkingLot.models;

public class Vechile {
    private String vechileNo;
    private String OwnerName;
    private VechileType vechileType;

    public Vechile(String vechileNo, String ownerName, VechileType vechileType) {
        this.vechileNo = vechileNo;
        OwnerName = ownerName;
        this.vechileType = vechileType;
    }

    public String getVechileNo() {
        return vechileNo;
    }

    public void setVechileNo(String vechileNo) {
        this.vechileNo = vechileNo;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
