package com.sign.signchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WheelChartLayout chartBillLayout = findViewById(R.id.cbl_bill);
        List<Entry> list = new ArrayList<>();
        list.add(new Entry("Jan", 200));
        list.add(new Entry("Feb", 200));
        list.add(new Entry("Mar", 5000));
        list.add(new Entry("Apr", 5000));
        list.add(new Entry("May", 300));
        list.add(new Entry("Jun", 3000));
        list.add(new Entry("Jul", 5000));
        list.add(new Entry("Aug", 3000));
        list.add(new Entry("Sept", 4500));
        list.add(new Entry("Oct", 2500));
        list.add(new Entry("Nov", 3000));
        list.add(new Entry("Dec", 200));
        float xLabelInterval = Utils.getScreenWidth(this) / 4f;
        double minValue = list.get(0).getYValue(), maxValue = list.get(0).getYValue();
        for (Entry entry : list) {
            if (entry.getYValue() < minValue) {
                minValue = entry.getYValue();
            }
            if (entry.getYValue() > maxValue) {
                maxValue = entry.getYValue();
            }
        }
        chartBillLayout.setYMinValue(minValue);
        chartBillLayout.setYMaxValue(maxValue);
        chartBillLayout.setXLabelInterval(xLabelInterval);
        chartBillLayout.setInterceptTouchEvent(false);
        chartBillLayout.setSelectIndex(0);
        chartBillLayout.setData(list);
    }
}
