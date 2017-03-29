package com.liferay.taxCount.model;

import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by lenovo on 2017-03-29.
 */
public class CD extends BasicGoods{
    private String singerName;
    private int number;
    private Date date;

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
