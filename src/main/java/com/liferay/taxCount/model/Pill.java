package com.liferay.taxCount.model;

import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by lenovo on 2017-03-29.
 */
public class Pill extends BasicGoods{
    private String pillName;
    private String function;
    private String origin;
    private String ingredient;
    private Date date;

    public String getPillName() {
        return pillName;
    }

    public void setPillName(String pillName) {
        this.pillName = pillName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
