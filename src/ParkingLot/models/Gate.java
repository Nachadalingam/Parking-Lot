package ParkingLot.models;

public class Gate {
    private Integer gateNo;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(int gateNo,GateType gateType,GateStatus gateStatus)
    {
        this.gateNo=gateNo;
        this.gateType=gateType;
        this.operator=null;
        this.gateStatus=gateStatus;
    }

    public Integer getGateNo() {
        return gateNo;
    }

    public void setGateNo(Integer gateNo) {
        this.gateNo = gateNo;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }


    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
