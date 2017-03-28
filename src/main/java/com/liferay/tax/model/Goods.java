package com.liferay.tax.model;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2017-03-27.
 */
public class Goods {
    private String name;
    private String printName;
    private BigDecimal beforeTaxPrice;
    private String kind;
    private BigDecimal taxPercent;
    private BigDecimal taxPaid;
    private BigDecimal afterTaxPrice;

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }




    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public BigDecimal getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(BigDecimal taxPaid) {
        this.taxPaid = taxPaid;
    }

    public BigDecimal getAfterTaxPrice() {
        return afterTaxPrice;
    }

    public void setAfterTaxPrice(BigDecimal afterTaxPrice) {
        this.afterTaxPrice = afterTaxPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBeforeTaxPrice() {
        return beforeTaxPrice;
    }

    public void setBeforeTaxPrice(BigDecimal beforeTaxPrice) {
        this.beforeTaxPrice = beforeTaxPrice;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
