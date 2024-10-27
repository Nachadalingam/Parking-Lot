package ParkingLot.Dto;

import ParkingLot.models.AssignParkingSpot;
import ParkingLot.models.VechileType;

public class RequestTicket {
         private String vechileNo;
         private VechileType vechileType;
         private String Ownername;
         private int gateId;

         private int parkingLotId;
         private AssignParkingSpot assignParkingSpotStretegey;

    public String getVechileNo() {
        return vechileNo;
    }

    public void setVechileNo(String vechileNo) {
        this.vechileNo = vechileNo;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public String getOwnername() {
        return Ownername;
    }

    public void setOwnername(String ownername) {
        Ownername = ownername;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public RequestTicket(String vechileNo, VechileType vechileType, String ownername,
                         int gateId, int parkingLotId,AssignParkingSpot assignParkingSpotStretegey) {
        this.vechileNo = vechileNo;
        this.vechileType = vechileType;
        Ownername = ownername;
        this.gateId = gateId;
        this.parkingLotId = parkingLotId;
        this.assignParkingSpotStretegey=assignParkingSpotStretegey;
    }

    public AssignParkingSpot getAssignParkingSpotStretegey() {
        return assignParkingSpotStretegey;
    }

    public void setAssignParkingSpotStretegey(AssignParkingSpot assignParkingSpotStretegey) {
        this.assignParkingSpotStretegey = assignParkingSpotStretegey;
    }
}
