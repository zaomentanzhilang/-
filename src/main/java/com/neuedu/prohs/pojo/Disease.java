package com.neuedu.prohs.pojo;


import java.io.Serializable;

public class Disease implements Serializable {

    private int id;
    private String diseaseCode;
    private String diseaseName;
    private String diseaseIcd;
    private String diseaseCategory;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }


    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }


    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd;
    }


    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(String diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
    }

}
