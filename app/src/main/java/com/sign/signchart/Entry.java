package com.sign.signchart;

/**
 * Created by CaoYongSheng
 * on 2019-04-23
 *
 * @author admin
 */
public class Entry {
    private String month;
    private double money;

    public Entry(String month, double money) {
        this.month = month;
        this.money = money;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
