package com.liferay.taxCount.model;

import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by lenovo on 2017-03-29.
 */
public class Chocolate extends BasicGoods{
    private String chocolateName;
    private String smell;
    private String origin;
    private int guaranteePeriod;
    private Date date;

    public String getChocolateName() {
        return chocolateName;
    }

    public void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
