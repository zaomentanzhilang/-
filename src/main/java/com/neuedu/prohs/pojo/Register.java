package com.neuedu.prohs.pojo;


import java.sql.Date;

public class Register {
    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", caseNumber='" + caseNumber + '\'' +
                ", realName='" + realName + '\'' +
                ", gender='" + gender + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", ageType='" + ageType + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", visitDate=" + visitDate +
                ", noon='" + noon + '\'' +
                ", deptmentId=" + deptmentId +
                ", employeeId=" + employeeId +
                ", registLevelId=" + registLevelId +
                ", settleCategoryId=" + settleCategoryId +
                ", isBook='" + isBook + '\'' +
                ", registMethod='" + registMethod + '\'' +
                ", visitState=" + visitState +
                ", registMoney=" + registMoney +
                '}';
    }

    private int id;
    private String caseNumber;
    private String realName;
    private String gender;
    private String cardNumber;
    private java.sql.Date birthday;
    private int age;
    private String ageType;
    private String homeAddress;
    private String visitDate;
    private String noon;
    private int deptmentId;
    private int employeeId;
    private int registLevelId;
    private int settleCategoryId;
    private String isBook;
    private String registMethod;
    private int visitState;
    private double registMoney;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public int getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(int deptmentId) {
        this.deptmentId = deptmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getRegistLevelId() {
        return registLevelId;
    }

    public void setRegistLevelId(int registLevelId) {
        this.registLevelId = registLevelId;
    }

    public int getSettleCategoryId() {
        return settleCategoryId;
    }

    public void setSettleCategoryId(int settleCategoryId) {
        this.settleCategoryId = settleCategoryId;
    }

    public String getIsBook() {
        return isBook;
    }

    public void setIsBook(String isBook) {
        this.isBook = isBook;
    }

    public String getRegistMethod() {
        return registMethod;
    }

    public void setRegistMethod(String registMethod) {
        this.registMethod = registMethod;
    }

    public int getVisitState() {
        return visitState;
    }

    public void setVisitState(int visitState) {
        this.visitState = visitState;
    }

    public double getRegistMoney() {
        return registMoney;
    }

    public void setRegistMoney(double registMoney) {
        this.registMoney = registMoney;
    }
}
