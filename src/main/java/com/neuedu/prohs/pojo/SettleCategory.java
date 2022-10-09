package com.neuedu.prohs.pojo;


public class SettleCategory {

    private int id;
    private String settleCode;
    private String settleName;
    private int sequenceNo;
    private int delmark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSettleCode() {
        return settleCode;
    }

    public void setSettleCode(String settleCode) {
        this.settleCode = settleCode;
    }

    public String getSettleName() {
        return settleName;
    }

    public void setSettleName(String settleName) {
        this.settleName = settleName;
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
