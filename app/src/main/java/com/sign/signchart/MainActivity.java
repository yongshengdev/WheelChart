package com.sign.signchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sign.signchart.nestscroll.NestScrollActivity;
import com.sign.wheelchart.Entry;
import com.sign.wheelchart.HorizontalWheelChartView;
import com.sign.wheelchart.Utils;
import com.sign.wheelchart.WheelChartLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private int mSelectIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WheelChartLayout wclBillStraight = findViewById(R.id.wcl_bill_straight);
        WheelChartLayout wclBillBezier = findViewById(R.id.wcl_bill_bezier);
        List<Entry> list = new ArrayList<>();
        initDemoList(list);
        //折线图
        float xLabelInterval1 = (Utils.getScreenWidth(this) - Utils.dp2px(this, 40)) / 4f;
        wclBillStraight.setXLabelInterval(xLabelInterval1);
        wclBillStraight.setInterceptTouchEvent(false);
        wclBillStraight.setSelectIndex(0);
        wclBillStraight.setData(list);
        wclBillStraight.setScrollBackListener(new HorizontalWheelChartView.ScrollBackListener() {
            @Override
            public void onScrollBack(int selectIndex) {
                Log.d(TAG, "onScrollBack   selectIndex === " + selectIndex);
                if (mSelectIndex != selectIndex) {
                    mSelectIndex = selectIndex;
                    Log.d(TAG, "selectIndex has change, can refresh. selectIndex === " + mSelectIndex);
                }
            }
        });
        //贝塞尔连接
        float xLabelInterval2 = Utils.getScreenWidth(this) / 4f;
        wclBillBezier.setXLabelInterval(xLabelInterval2);
        wclBillBezier.setInterceptTouchEvent(false);
        wclBillBezier.setSelectIndex(0);
        wclBillBezier.setData(list);
    }

    public void nestScroll(View view) {
        startActivity(new Intent(this, NestScrollActivity.class));
    }

    private void initDemoList(List<Entry> list) {
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
    }
}
