# WheelChart
**Usage**

```implementation 'com.sign.wheelchart:wheelchart:1.1.0'```

```
<com.sign.wheelchart.WheelChartLayout
    android:id="@+id/wcl_straight"
    android:layout_width="match_parent"
    android:layout_height="150dp"
    app:linkLineType="straight"
    app:xLabelGravity="top"
    app:xLabelLineColor="@color/blue" />
```

**Features** 
- 绘制横向图表  
- 可拖动并处理惯性滚动事件  
- 拖动或惯性滚动结束后，自动选中离中心最近的下标   
- 点击图表，根据点击区域选中离点击区域最近的下标  
- 处理嵌套滚动  

**blog**

https://blog.csdn.net/SS_S1gn/article/details/89599605

**Screens**

![](https://github.com/SilenceBurst/WheelChart/blob/master/gif/example.gif)

**Contributing**

Yes:) If you found a bug, have an idea how to improve library or have a question, please create new issue or comment existing one. If you would like to contribute code fork the repository and send a pull request.

**Email**

3328019207@qq.com

**Special Thanks**  

[hencoder](https://hencoder.com/)  
https://github.com/totond/BooheeRuler

**bug fix**

1.1.0 修复sumsung s6滚动完毕不能回滚到中心区域的bug
