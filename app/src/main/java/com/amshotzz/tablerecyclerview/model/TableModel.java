package com.amshotzz.tablerecyclerview.model;

import java.io.Serializable;

public class TableModel implements Serializable {
    private String textArea = "";
    private String textMonthly = "";
    private String textQuaterly = "";
    private String textBiannually = "";
    private String textAnnually = "";
    private int itemType;

    public TableModel(String textArea, String textMonthly, String textQuaterly, String textBiannually, String textAnnually, int itemType) {
        this.textArea = textArea;
        this.textMonthly = textMonthly;
        this.textQuaterly = textQuaterly;
        this.textBiannually = textBiannually;
        this.textAnnually = textAnnually;
        this.itemType = itemType;
    }

    public String getTextArea() {
        return textArea;
    }

    public String getTextMonthly() {
        return textMonthly;
    }

    public String getTextQuaterly() {
        return textQuaterly;
    }

    public String getTextBiannually() {
        return textBiannually;
    }

    public String getTextAnnually() {
        return textAnnually;
    }

    public int getItemType() {
        return itemType;
    }
}
