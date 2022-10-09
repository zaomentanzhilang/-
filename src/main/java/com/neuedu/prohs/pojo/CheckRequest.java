package com.neuedu.prohs.pojo;


import java.sql.Timestamp;

public class CheckRequest {

    private int id;
    private int registerId;
    private int medicalTechnologyId;
    private String checkInfo;
    private String checkPosition;
    private java.sql.Timestamp creationTime;
    private int checkEmployeeId;
    private int inputcheckEmployeeId;
    private java.sql.Timestamp checkTime;
    private String checkResult;
    private String checkState;
    private String checkRemark;

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

    public int getMedicalTechnologyId() {
        return medicalTechnologyId;
    }

    public void setMedicalTechnologyId(int medicalTechnologyId) {
        this.medicalTechnologyId = medicalTechnologyId;
    }

    public String getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(String checkInfo) {
        this.checkInfo = checkInfo;
    }

    public String getCheckPosition() {
        return checkPosition;
    }

    public void setCheckPosition(String checkPosition) {
        this.checkPosition = checkPosition;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public int getCheckEmployeeId() {
        return checkEmployeeId;
    }

    public void setCheckEmployeeId(int checkEmployeeId) {
        this.checkEmployeeId = checkEmployeeId;
    }

    public int getInputcheckEmployeeId() {
        return inputcheckEmployeeId;
    }

    public void setInputcheckEmployeeId(int inputcheckEmployeeId) {
        this.inputcheckEmployeeId = inputcheckEmployeeId;
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }
}
