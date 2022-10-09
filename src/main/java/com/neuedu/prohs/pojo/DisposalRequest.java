package com.neuedu.prohs.pojo;


import java.sql.Timestamp;

public class DisposalRequest {

    private int id;
    private int registerId;
    private int medicalTechnologyId;
    private String disposalInfo;
    private String disposalPosition;
    private java.sql.Timestamp creationTime;
    private int disposalEmployeeId;
    private int inputdisposalEmployeeId;
    private java.sql.Timestamp disposalTime;
    private String disposalResult;
    private String disposalState;
    private String disposalRemark;

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

    public String getDisposalInfo() {
        return disposalInfo;
    }

    public void setDisposalInfo(String disposalInfo) {
        this.disposalInfo = disposalInfo;
    }

    public String getDisposalPosition() {
        return disposalPosition;
    }

    public void setDisposalPosition(String disposalPosition) {
        this.disposalPosition = disposalPosition;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public int getDisposalEmployeeId() {
        return disposalEmployeeId;
    }

    public void setDisposalEmployeeId(int disposalEmployeeId) {
        this.disposalEmployeeId = disposalEmployeeId;
    }

    public int getInputdisposalEmployeeId() {
        return inputdisposalEmployeeId;
    }

    public void setInputdisposalEmployeeId(int inputdisposalEmployeeId) {
        this.inputdisposalEmployeeId = inputdisposalEmployeeId;
    }

    public Timestamp getDisposalTime() {
        return disposalTime;
    }

    public void setDisposalTime(Timestamp disposalTime) {
        this.disposalTime = disposalTime;
    }

    public String getDisposalResult() {
        return disposalResult;
    }

    public void setDisposalResult(String disposalResult) {
        this.disposalResult = disposalResult;
    }

    public String getDisposalState() {
        return disposalState;
    }

    public void setDisposalState(String disposalState) {
        this.disposalState = disposalState;
    }

    public String getDisposalRemark() {
        return disposalRemark;
    }

    public void setDisposalRemark(String disposalRemark) {
        this.disposalRemark = disposalRemark;
    }
}
