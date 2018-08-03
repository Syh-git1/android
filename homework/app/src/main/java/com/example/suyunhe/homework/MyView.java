package com.example.suyunhe.homework;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Point;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyView extends View {
/*    private float textHeight;
    private int value = 0;
    private TextPaint paint_ = new TextPaint();
    private float density = getResources().getDisplayMetrics().density;
//    public int getValue() {
//        return value;
//    }
    public MyView(Context context) {
        super(context);
        init(null, 0);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context,attrs);
        init(attrs,0);
    }

    public MyView(Context context,AttributeSet attrs,int defSytle) {
        super(context,attrs,defSytle);
        init(attrs,defSytle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        调用函数画出控件
//        drawAxis(canvas);
//        drawOval(canvas);
        drawArc(canvas);

    }


    public void setDrawMode() {
//        刷新界面，在工作者线程调用，刷新界面时主动调用onDraw方法
        postInvalidate();
    }

    // 用来设置画笔的属性
    private void init(AttributeSet attrs, int defSytle) {
        //paint的默认字体大小
        Log.i("iSpring", "默认字体大小: " + paint_.getTextSize() + "px");

        //paint的默认颜色
        Log.i("iSpring", "默认颜色: " + Integer.toString(paint_.getColor(), 16));

        //paint的默认style是FILL，即填充模式
        Log.i("iSpring", "默认style: " + paint_.getStyle().toString());

        //paint的默认cap是
        Log.i("iSpring", "默认cap: " + paint_.getStrokeCap().toString());

        //paint默认的strokeWidth
        Log.i("iSpring", "默认strokeWidth: " + paint_.getStrokeWidth() + "");

        //设置flag，抗锯齿形状
        paint_.setFlags(Paint.ANTI_ALIAS_FLAG);
        //写文字时文字大小
        paint_.setTextSize(16);
        textHeight = 16;
    }

    //绘制坐标系
    private void drawAxis(Canvas canvas) {
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();
        // 设置线条格式，只画轮廓线(描边)
        paint_.setStyle(Paint.Style.STROKE);
        // 设置笔触是圆形
        paint_.setStrokeCap(Paint.Cap.ROUND);
        // 设置笔刷粗细
        paint_.setStrokeWidth(6*density);

        //绿色画x轴，蓝色画y轴
        // 首次绘制
        paint_.setColor(Color.GREEN);
        canvas.drawLine(0,0,canvasWidth,0,paint_);
        paint_.setColor(Color.BLUE);
        canvas.drawLine(0,0,0,canvasHeight,paint_);

        //平移之后，第二次绘制
        //将绘图坐标系进行平移
        canvas.translate(canvasWidth/4,canvasHeight/4);
        paint_.setColor(Color.GREEN);
        canvas.drawLine(0,0,canvasWidth,0,paint_);
        paint_.setColor(Color.BLUE);
        canvas.drawLine(0,0,0,canvasHeight,paint_);

        // 平移旋转，进行第三次绘制
        canvas.translate(canvasHeight/4,canvasHeight/4);
        // 顺时针旋转30度
        canvas.rotate(30);
        paint_.setColor(Color.GREEN);
        canvas.drawLine(0,0,canvasWidth,0,paint_);
        paint_.setColor(Color.BLUE);
        canvas.drawLine(0,0,0,canvasHeight,paint_);
    }
    private void drawOval(Canvas canvas) {
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();
        float quarter = canvasHeight/4;
        float left = 10 * density;
        float top = 0;
        float right = canvasWidth - left;
        float bottom = quarter;
        RectF rectF = new RectF(left,top,right,bottom);

        // 绘制椭圆型轮廓线
        paint_.setStyle(Paint.Style.STROKE);//设置画笔线条模式
        paint_.setStrokeWidth(2*density);
        paint_.setColor(Color.BLACK);
        canvas.translate(0,quarter/4);
        canvas.drawOval(rectF,paint_);

        //绘制椭圆填充面
        paint_.setStyle(Paint.Style.FILL);
        paint_.setColor(Color.GREEN);
        canvas.translate(0,(quarter+quarter/4));//平移是在上次平移的基础上进行平移
        canvas.drawOval(rectF,paint_);
        // 两个椭圆 轮廓线和填充色不同
        canvas.translate(0,(quarter+quarter/4));
        //1、绘制填充色
        paint_.setStyle(Paint.Style.FILL);
        canvas.drawOval(rectF,paint_);
        //2、更换颜色绘制轮廓线
        paint_.setStyle(Paint.Style.STROKE);
        paint_.setColor(Color.BLUE);
        canvas.drawOval(rectF,paint_);
    }

    private void drawArc(Canvas canvas) {
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();
        float ovalHeight = canvasHeight/10;
        float left = 10 * density;
        float top = 0;
        float right = 2*canvasWidth - left;
        float bottom = canvasHeight-ovalHeight;
        RectF rectF = new RectF(left, top, right, bottom);

        paint_.setStrokeWidth(2*density);
        paint_.setColor(Color.BLACK);
        paint_.setStyle(Paint.Style.STROKE);
        canvas.translate(0 ,ovalHeight);

        //1、先画外边1/4的椭圆
        canvas.drawArc(rectF,180,80,false,paint_);
        RectF rectF1 = new RectF(left+50*density,top,right-50*density,bottom-100*density);

        canvas.translate(0,50*density);
        canvas.drawArc(rectF1,180,79,false,paint_);
//        canvas.translate(100*density,100*density);
//        canvas.drawArc(rectF,180,75,false,paint_);
    }
    private void drawPath(Canvas canvas){
        int canvasWidth = canvas.getWidth();
        int deltaX = canvasWidth / 4;
        int deltaY = (int)(deltaX * 0.75);

        paint_.setColor(0xff8bc5ba);//设置画笔颜色
        paint_.setStrokeWidth(4);//设置线宽

        *//*--------------------------用Path画填充面-----------------------------*//*
        paint_.setStyle(Paint.Style.FILL);//设置画笔为填充模式
        Path path = new Path();
        //向Path中加入Arc
        RectF arcRecF = new RectF(0, 0, deltaX, deltaY);
        path.addArc(arcRecF, 0, 135);
        //向Path中加入Oval
        RectF ovalRecF = new RectF(deltaX, 0, deltaX * 2, deltaY);
        path.addOval(ovalRecF, Path.Direction.CCW);
        //向Path中添加Circle
        path.addCircle((float)(deltaX * 2.5), deltaY / 2, deltaY / 2, Path.Direction.CCW);
        //向Path中添加Rect
        RectF rectF = new RectF(deltaX * 3, 0, deltaX * 4, deltaY);
        path.addRect(rectF, Path.Direction.CCW);
        canvas.drawPath(path, paint_);

        *//*--------------------------用Path画线--------------------------------*//*
        paint_.setStyle(Paint.Style.STROKE);//设置画笔为线条模式
        canvas.translate(0, deltaY * 2);
        Path path2 = path;
        canvas.drawPath(path2, paint_);

        *//*-----------------使用lineTo、arcTo、quadTo、cubicTo画线--------------*//*
        paint_.setStyle(Paint.Style.STROKE);//设置画笔为线条模式
        canvas.translate(0, deltaY * 2);
        Path path3 = new Path();
        //用pointList记录不同的path的各处的连接点
        List<Point> pointList = new ArrayList<Point>();
        //1. 第一部分，绘制线段
        path3.moveTo(0, 0);
        path3.lineTo(deltaX / 2, 0);//绘制线段
        pointList.add(new Point(0, 0));
        pointList.add(new Point(deltaX / 2, 0));
        //2. 第二部分，绘制椭圆右上角的四分之一的弧线
        RectF arcRecF1 = new RectF(0, 0, deltaX, deltaY);
        path3.arcTo(arcRecF1, 270, 90);//绘制圆弧
        pointList.add(new Point(deltaX, deltaY / 2));
        //3. 第三部分，绘制椭圆左下角的四分之一的弧线
        //注意，我们此处调用了path的moveTo方法，将画笔的移动到我们下一处要绘制arc的起点上
        path3.moveTo(deltaX * 1.5f, deltaY);
        RectF arcRecF2 = new RectF(deltaX, 0, deltaX * 2, deltaY);
        path3.arcTo(arcRecF2, 90, 90);//绘制圆弧
        pointList.add(new Point((int)(deltaX * 1.5), deltaY));
        //4. 第四部分，绘制二阶贝塞尔曲线
        //二阶贝塞尔曲线的起点就是当前画笔的位置，然后需要添加一个控制点，以及一个终点
        //再次通过调用path的moveTo方法，移动画笔
        path3.moveTo(deltaX * 1.5f, deltaY);
        //绘制二阶贝塞尔曲线
        path3.quadTo(deltaX * 2, 0, deltaX * 2.5f, deltaY / 2);
        pointList.add(new Point((int)(deltaX * 2.5), deltaY / 2));
        //5. 第五部分，绘制三阶贝塞尔曲线，三阶贝塞尔曲线的起点也是当前画笔的位置
        //其需要两个控制点，即比二阶贝赛尔曲线多一个控制点，最后也需要一个终点
        //再次通过调用path的moveTo方法，移动画笔
        path3.moveTo(deltaX * 2.5f, deltaY / 2);
        //绘制三阶贝塞尔曲线
        path3.cubicTo(deltaX * 3, 0, deltaX * 3.5f, 0, deltaX * 4, deltaY);
        pointList.add(new Point(deltaX * 4, deltaY));

        //Path准备就绪后，真正将Path绘制到Canvas上
        canvas.drawPath(path3, paint_);

        //最后绘制Path的连接点，方便我们大家对比观察
        paint_.setStrokeWidth(10);//将点的strokeWidth要设置的比画path时要大
        paint_.setStrokeCap(Paint.Cap.ROUND);//将点设置为圆点状
        paint_.setColor(0xff0000ff);//设置圆点为蓝色
        for(Point p : pointList){
            //遍历pointList，绘制连接点
            canvas.drawPoint(p.x, p.y, paint_);
        }
    }*/
    //获取手机属性
    private float density = getResources().getDisplayMetrics().density;
    private int screenWidth = getResources().getDisplayMetrics().widthPixels;
    private int screenHeight = getResources().getDisplayMetrics().heightPixels;

    //画笔
    private Paint mArcPaint;       //弧形画笔
    private Paint mArcPaintBg;     //弧形画笔背景
    private Paint mArcPaintProgress;//进度条画笔

    //扇环颜色
    private int mArcColor;
    private int mArcBgColor;
    private int mArcProgressColor;

    //数学参数
    private float left;
    private float top;
    private float right;
    private float bottom;
    private float mStrokeWidth;

    //进度
    private int mTotalProgress;//总进度
    private int mProgress;     //当前进度

    public MyView(Context context,AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context,attrs);
        initVariable();
    }
    //属性
    private void initAttrs(Context context,AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,R.styleable.MyView,0,0);
        left = typedArray.getDimension(R.styleable.MyView_left,10*density);
        top = typedArray.getDimension(R.styleable.MyView_top,0);
        right = typedArray.getDimension(R.styleable.MyView_right,screenWidth*2-10*density);
        bottom = typedArray.getDimension(R.styleable.MyView_bottom,4/5*screenHeight);
        mStrokeWidth = typedArray.getDimension(R.styleable.MyView_strokeWidth,50);
        mArcColor = typedArray.getColor(R.styleable.MyView_arcColor,Color.WHITE);
        mArcBgColor = typedArray.getColor(R.styleable.MyView_arcbgColor,Color.WHITE);
        mArcProgressColor = typedArray.getColor(R.styleable.MyView_arcprogressColor,Color.WHITE);
    }
    //画笔初始化
    private void initVariable() {
        //内环
        mArcPaint = new Paint();
        mArcPaint.setAntiAlias(true);
        mArcPaint.setColor(mArcColor);
        mArcPaint.setStyle(Paint.Style.STROKE);

        //外环背景
        mArcPaintBg = new Paint();
        mArcPaintBg.setAntiAlias(true);
        mArcPaintBg.setColor(mArcBgColor);
        mArcPaintBg.setStyle(Paint.Style.STROKE);
        mArcPaintBg.setStrokeWidth(mStrokeWidth);

        //外环
        mArcPaintProgress = new Paint();
        mArcPaintProgress.setAntiAlias(true);
        mArcPaintProgress.setColor(mArcProgressColor);
        mArcPaintProgress.setStyle(Paint.Style.STROKE);
        mArcPaintProgress.setStrokeWidth(mStrokeWidth);
    }
    //绘图
    @Override
    protected void onDraw(Canvas canvas){
        //内扇
        RectF oval1 = new RectF();
        oval1.left = left + 50;
        oval1.top = top + 50;
        oval1.right = right - 50;
        oval1.bottom = bottom - 50;
        canvas.drawArc(oval1,180,90,false,mArcPaint);

        //外背景
        RectF oval2 = new RectF();
        oval2.left = left;
        oval2.top = top;
        oval2.right = right;
        oval2.bottom = bottom;
        canvas.drawArc(oval2,180,90,false,mArcPaintBg);

        //外圆环
/*        if (mProgress > 0) {
            RectF oval3 = new RectF();
            oval3.left = left;
            oval3.top = top;
            oval3.right = right;
            oval3.bottom = bottom;
            canvas.drawArc(oval3,180,((float)mProgress/mTotalProgress)*90,false,mArcPaintProgress);
        }*/
    }
    //设置进度
    public void setmTotalProgress(int progress)  {
        mProgress = progress;
        postInvalidate();
    }
}
