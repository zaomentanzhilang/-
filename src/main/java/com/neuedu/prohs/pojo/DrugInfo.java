package com.neuedu.prohs.pojo;


public class DrugInfo {

    private int id;
    private String drugCode;
    private String drugName;
    private String drugFormat;
    private String drugUnit;
    private String manufacturer;
    private String drugDosage;
    private String drugType;
    private double drugPrice;
    private String mnemonicCode;
    private java.sql.Date creationDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }


    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }


    public String getDrugFormat() {
        return drugFormat;
    }

    public void setDrugFormat(String drugFormat) {
        this.drugFormat = drugFormat;
    }


    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }


    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }


    public double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(double drugPrice) {
        this.drugPrice = drugPrice;
    }


    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }


    public java.sql.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.sql.Date creationDate) {
        this.creationDate = creationDate;
    }

}
