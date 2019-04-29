package com.sign.signchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sign.signchart.nestscroll.NestScrollActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private int mSelectIndex = -1;

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
        chartBillLayout.setScrollBackListener(new HorizontalWheelChartView.ScrollBackListener() {
            @Override
            public void onScrollBack(int selectIndex) {
                Log.d(TAG,"onScrollBack   selectIndex === "+selectIndex);
                if (mSelectIndex != selectIndex) {
                    mSelectIndex = selectIndex;
                    Log.d(TAG,"selectIndex has change, can refresh. selectIndex === "+mSelectIndex);
                }
            }
        });
    }

    public void nestScroll(View view) {
        startActivity(new Intent(this, NestScrollActivity.class));
    }
}
