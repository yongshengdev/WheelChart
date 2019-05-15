package com.sign.wheelchart;

/**
 * Created by CaoYongSheng
 * on 2019-04-23
 *
 * @author admin
 */
public class Entry {
    private String xLabel;
    private double yValue;

    public Entry(String xLabel, double yValue) {
        this.xLabel = xLabel;
        this.yValue = yValue;
    }

    public String getXLabel() {
        return xLabel;
    }

    public void setXLabel(String xLabel) {
        this.xLabel = xLabel;
    }

    public double getYValue() {
        return yValue;
    }

    public void setYValue(double yValue) {
        this.yValue = yValue;
    }
}
