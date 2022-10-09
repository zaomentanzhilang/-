package com.neuedu.prohs.pojo;


public class Scheduling {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getWeekRule() {
        return weekRule;
    }

    public void setWeekRule(String weekRule) {
        this.weekRule = weekRule;
    }

    public int getDelmark() {
        return delmark;
    }

    public void setDelmark(int delmark) {
        this.delmark = delmark;
    }

    private int id;
    private String ruleName;
    private String weekRule;
    private int delmark;


}
