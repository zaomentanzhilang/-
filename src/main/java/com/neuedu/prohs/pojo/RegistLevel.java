package com.neuedu.prohs.pojo;


public class RegistLevel {

    private int id;
    private String registCode;
    private String registName;
    private double registFee;
    private int registQuota;
    private int sequenceNo;
    private int delmark;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode;
    }

    public String getRegistName() {
        return registName;
    }

    public void setRegistName(String registName) {
        this.registName = registName;
    }

    public double getRegistFee() {
        return registFee;
    }

    public void setRegistFee(double registFee) {
        this.registFee = registFee;
    }

    public int getRegistQuota() {
        return registQuota;
    }

    public void setRegistQuota(int registQuota) {
        this.registQuota = registQuota;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public int getDelmark() {
        return delmark;
    }

    public void setDelmark(int delmark) {
        this.delmark = delmark;
    }
}
