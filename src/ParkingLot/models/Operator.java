package ParkingLot.models;

public class Operator {
    private int employee_id;
    private String name;
    private Gate Gate;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gate getGate() {
        return Gate;
    }

    public void setGate(Gate gate) {
        this.Gate = gate;
    }
}
