package com.liferay.taxCount.model;

import java.math.RoundingMode;
import java.util.Date;

/**
 * Created by lenovo on 2017-03-29.
 */
public class Book extends BasicGoods{
    private String bookName;
    private int page;
    private String size;
    private Date date;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
