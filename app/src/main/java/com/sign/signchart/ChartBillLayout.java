package com.sign.signchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.IntDef;
import android.util.AttributeSet;
import android.view.ViewGroup;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CaoYongSheng
 * on 2019-04-22
 *
 * @author admin
 */
public class ChartBillLayout extends ViewGroup {
    private Context mContext;
    private ChartBillView mChartBillView;

    //x轴标签位置定义
    public static final int X_TOP = 1, X_BOTTOM = 2;

    @IntDef({X_TOP, X_BOTTOM})
    @Retention(RetentionPolicy.SOURCE)
    private @interface XLabelGravity {
    }

    private @ChartBillLayout.XLabelGravity
    int mXLabelGravity = X_TOP;

    //x轴标签之间间距 单位px
    private float mXLabelInterval = 50;
    //x轴标签未选中文字大小
    private float mXLabelTextNormalSize = 14;
    //x轴标签未选中文字颜色
    @ColorInt
    private int mXLabelTextNormalColor = getResources().getColor(R.color.colorGray);
    //x轴标签选中文字大小
    private float mXLabelTextSelectSize = 14;
    //x轴标签选中文字颜色
    @ColorInt
    private int mXLabelTextSelectColor = getResources().getColor(R.color.blue);
    //x轴标签和轴线之间的间距 单位dp
    private float mXLabelTextLineInterval = 5;
    //x轴轴线的宽度
    private float mXLabelLineWidth = 1;
    //x轴轴线的颜色
    @ColorInt
    private int mXLabelLineColor = getResources().getColor(R.color.blue);
    //x轴轴线 若为虚线 线长 单位px
    private float mXLabelLineLength = 5;
    //x轴轴线 若为虚线 线间距 单位px
    private float mXLabelLineDashLength = 2;
    //坐标之间连线的宽度
    private float mLinkLineWidth = 2;
    //坐标之间连线的颜色
    @ColorInt
    private int mLinkLineColor = getResources().getColor(R.color.blue);

    //坐标之间的连线类型定义
    public static final int STRAIGHT = 1, BEZIER = 2;

    @IntDef({STRAIGHT, BEZIER})
    @Retention(RetentionPolicy.SOURCE)
    private @interface LinkLineType {
    }

    private @ChartBillLayout.LinkLineType
    int mLinkLineType = STRAIGHT;
    //坐标值未选中时的背景
    private Drawable mNormalValueDrawable;
    //坐标值未选中时的字体大小
    private float mNormalValueTextSize = 12;
    //坐标值未选中时的字体颜色
    @ColorInt
    private int mNormalValueTextColor = getResources().getColor(R.color.colorGray);
    //坐标值选中时的背景
    private Drawable mSelectValueDrawable;
    //坐标值选中时的字体大小
    private float mSelectValueTextSize = 14;
    //坐标值选中时的字体颜色
    @ColorInt
    private int mSelectValueTextColor = getResources().getColor(R.color.colorBlack);
    //坐标点的颜色
    @ColorInt
    private int mValuePointColor = getResources().getColor(R.color.blue);
    //Y轴的最大值
    private double mYMaxValue = 0;
    //Y轴的最小值
    private double mYMinValue = 0;
    //左端和右端的padding值
    private float mPaddingLeftAndRight = 0;
    //顶端和底端的padding值
    private float mPaddingTopAndBottom = 5;
    //数据源
    private List<Entry> mData = new ArrayList<>();

    public ChartBillLayout(Context context) {
        super(context);
        initChartView(context);
    }

    public ChartBillLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initChartView(context);
        initAttrs(context, attrs);
    }

    public ChartBillLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initChartView(context);
        initAttrs(context, attrs);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ChartBillLayout, 0, 0);
        mXLabelGravity = typedArray.getInt(R.styleable.ChartBillLayout_xLabelGravity, mXLabelGravity);
        mXLabelInterval = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelInterval, mXLabelInterval);
        mXLabelTextNormalSize = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelTextNormalSize, Utils.sp2px(context, mXLabelTextNormalSize));
        mXLabelTextNormalColor = typedArray.getColor(R.styleable.ChartBillLayout_xLabelTextNormalColor, mXLabelTextNormalColor);
        mXLabelTextSelectSize = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelTextNormalSize, Utils.sp2px(context, mXLabelTextSelectSize));
        mXLabelTextSelectColor = typedArray.getColor(R.styleable.ChartBillLayout_xLabelTextSelectColor, mXLabelTextSelectColor);
        mXLabelTextLineInterval = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelTextLineInterval, Utils.dp2px(context, mXLabelTextLineInterval));
        mXLabelLineWidth = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelLineWidth, Utils.dp2px(context, mXLabelLineWidth));
        mXLabelLineColor = typedArray.getColor(R.styleable.ChartBillLayout_xLabelLineColor, mXLabelLineColor);
        mXLabelLineLength = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelLineLength, mXLabelLineLength);
        mXLabelLineDashLength = typedArray.getDimension(R.styleable.ChartBillLayout_xLabelLineDashLength, mXLabelLineDashLength);
        mLinkLineWidth = typedArray.getDimension(R.styleable.ChartBillLayout_linkLineWidth, Utils.dp2px(context, mLinkLineWidth));
        mLinkLineColor = typedArray.getColor(R.styleable.ChartBillLayout_linkLineColor, mLinkLineColor);
        mLinkLineType = typedArray.getInt(R.styleable.ChartBillLayout_linkLineType, mLinkLineType);
        mNormalValueDrawable = typedArray.getDrawable(R.styleable.ChartBillLayout_normalValueDrawable);
        if (mNormalValueDrawable == null) {
            mNormalValueDrawable = getResources().getDrawable(R.drawable.shape_value_normal);
        }
        mNormalValueTextSize = typedArray.getDimension(R.styleable.ChartBillLayout_normalValueTextSize, Utils.sp2px(context, mNormalValueTextSize));
        mNormalValueTextColor = typedArray.getColor(R.styleable.ChartBillLayout_normalValueTextColor, mNormalValueTextColor);
        mSelectValueDrawable = typedArray.getDrawable(R.styleable.ChartBillLayout_selectValueDrawable);
        if (mSelectValueDrawable == null) {
            mSelectValueDrawable = getResources().getDrawable(R.drawable.shape_value_select);
        }
        mSelectValueTextSize = typedArray.getDimension(R.styleable.ChartBillLayout_selectValueTextSize, Utils.sp2px(context, mSelectValueTextSize));
        mSelectValueTextColor = typedArray.getColor(R.styleable.ChartBillLayout_selectValueTextColor, mSelectValueTextColor);
        mValuePointColor = typedArray.getColor(R.styleable.ChartBillLayout_valuePointColor, mValuePointColor);
        mPaddingLeftAndRight = typedArray.getDimension(R.styleable.ChartBillLayout_paddingLeftAndRight, Utils.dp2px(context, mPaddingLeftAndRight));
        mPaddingTopAndBottom = typedArray.getDimension(R.styleable.ChartBillLayout_paddingTopAndBottom, Utils.dp2px(context, mPaddingTopAndBottom));
        typedArray.recycle();
    }

    private void initChartView(Context context) {
        mContext = context;
        mChartBillView = new ChartBillView(context, this);
        LayoutParams layoutParams = new ViewGroup.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        mChartBillView.setLayoutParams(layoutParams);
        addView(mChartBillView);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (changed) {
            mChartBillView.layout((int) mPaddingLeftAndRight, (int) (t + mPaddingTopAndBottom), r - l - (int) mPaddingLeftAndRight, (int) (b - mPaddingTopAndBottom));
        }
    }

    public void setData(List<Entry> data) {
        mData = data;
        mChartBillView.init(mContext);
        mChartBillView.refreshSize();
    }

    public List<Entry> getData() {
        return mData;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public int getXLabelGravity() {
        return mXLabelGravity;
    }

    public void setXLabelGravity(int mXLabelGravity) {
        this.mXLabelGravity = mXLabelGravity;
    }

    public float getXLabelInterval() {
        return mXLabelInterval;
    }

    public void setXLabelInterval(float mXLabelInterval) {
        this.mXLabelInterval = mXLabelInterval;
    }

    public float getXLabelTextNormalSize() {
        return mXLabelTextNormalSize;
    }

    public void setXLabelTextNormalSize(float mXLabelTextNormalSize) {
        this.mXLabelTextNormalSize = mXLabelTextNormalSize;
    }

    public int getXLabelTextNormalColor() {
        return mXLabelTextNormalColor;
    }

    public void setXLabelTextNormalColor(int mXLabelTextNormalColor) {
        this.mXLabelTextNormalColor = mXLabelTextNormalColor;
    }

    public float getXLabelTextSelectSize() {
        return mXLabelTextSelectSize;
    }

    public void setXLabelTextSelectSize(float mXLabelTextSelectSize) {
        this.mXLabelTextSelectSize = mXLabelTextSelectSize;
    }

    public int getXLabelTextSelectColor() {
        return mXLabelTextSelectColor;
    }

    public void setXLabelTextSelectColor(int mXLabelTextSelectColor) {
        this.mXLabelTextSelectColor = mXLabelTextSelectColor;
    }

    public float getXLabelTextLineInterval() {
        return mXLabelTextLineInterval;
    }

    public void setXLabelTextLineInterval(float mXLabelTextLineInterval) {
        this.mXLabelTextLineInterval = mXLabelTextLineInterval;
    }

    public float getXLabelLineWidth() {
        return mXLabelLineWidth;
    }

    public void setXLabelLineWidth(float mXLabelLineWidth) {
        this.mXLabelLineWidth = mXLabelLineWidth;
    }

    public int getXLabelLineColor() {
        return mXLabelLineColor;
    }

    public void setXLabelLineColor(int mXLabelLineColor) {
        this.mXLabelLineColor = mXLabelLineColor;
    }

    public float getXLabelLineLength() {
        return mXLabelLineLength;
    }

    public void setXLabelLineLength(float mXLabelLineLength) {
        this.mXLabelLineLength = mXLabelLineLength;
    }

    public float getXLabelLineDashLength() {
        return mXLabelLineDashLength;
    }

    public void setXLabelLineDashLength(float mXLabelLineDashLength) {
        this.mXLabelLineDashLength = mXLabelLineDashLength;
    }

    public float getLinkLineWidth() {
        return mLinkLineWidth;
    }

    public void setLinkLineWidth(float mLinkLineWidth) {
        this.mLinkLineWidth = mLinkLineWidth;
    }

    public int getLinkLineColor() {
        return mLinkLineColor;
    }

    public void setLinkLineColor(int mLinkLineColor) {
        this.mLinkLineColor = mLinkLineColor;
    }

    public int getLinkLineType() {
        return mLinkLineType;
    }

    public void setLinkLineType(int mLinkLineType) {
        this.mLinkLineType = mLinkLineType;
    }

    public Drawable getNormalValueDrawable() {
        return mNormalValueDrawable;
    }

    public void setNormalValueDrawable(Drawable mNormalValueDrawable) {
        this.mNormalValueDrawable = mNormalValueDrawable;
    }

    public float getNormalValueTextSize() {
        return mNormalValueTextSize;
    }

    public void setNormalValueTextSize(float mNormalValueTextSize) {
        this.mNormalValueTextSize = mNormalValueTextSize;
    }

    public int getNormalValueTextColor() {
        return mNormalValueTextColor;
    }

    public void setNormalValueTextColor(int mNormalValueTextColor) {
        this.mNormalValueTextColor = mNormalValueTextColor;
    }

    public Drawable getSelectValueDrawable() {
        return mSelectValueDrawable;
    }

    public void setSelectValueDrawable(Drawable mSelectValueDrawable) {
        this.mSelectValueDrawable = mSelectValueDrawable;
    }

    public float getSelectValueTextSize() {
        return mSelectValueTextSize;
    }

    public void setSelectValueTextSize(float mSelectValueTextSize) {
        this.mSelectValueTextSize = mSelectValueTextSize;
    }

    public int getSelectValueTextColor() {
        return mSelectValueTextColor;
    }

    public void setSelectValueTextColor(int mSelectValueTextColor) {
        this.mSelectValueTextColor = mSelectValueTextColor;
    }

    public double getYMaxValue() {
        return mYMaxValue;
    }

    public void setYMaxValue(double mYMaxValue) {
        this.mYMaxValue = mYMaxValue;
    }

    public double getYMinValue() {
        return mYMinValue;
    }

    public void setYMinValue(double mYMinValue) {
        this.mYMinValue = mYMinValue;
    }

    public int getValuePointColor() {
        return mValuePointColor;
    }

    public void setValuePointColor(int mValuePointColor) {
        this.mValuePointColor = mValuePointColor;
    }
}
