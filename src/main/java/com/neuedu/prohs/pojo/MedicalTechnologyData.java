package com.neuedu.prohs.pojo;


public class MedicalTechnologyData {

    private int id;
    private int registerId;
    private String Objective;
    private String InspectionPosition;
    private String Remarks;
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegisterId() {
        return registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public String getInspectionPosition() {
        return InspectionPosition;
    }

    public void setInspectionPosition(String inspectionPosition) {
        InspectionPosition = inspectionPosition;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }
}
