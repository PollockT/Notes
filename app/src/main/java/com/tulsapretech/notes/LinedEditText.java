/*
   Author: Theodore Pollock
   Contact: Theodore.Pollock86@Gmail.com
   File Name: LinedEditText
 */

package com.tulsapretech.notes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class LinedEditText extends AppCompatEditText {
   private Rect mRect;
   private Paint mPaint;
   private static final String TAG = "LinedEditText";

    /**
     * constructor
     * @param context of the class
     */
    public LinedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        mRect = new Rect();
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(0xFFFFD966);

    }

    /**
     * Call calculates how many lines need to be drawn and then draws them onto the view
     * @param canvas parameter is the entire bottom view that the lines are drawn on
     */
    @Override
    protected void onDraw(Canvas canvas) {

        int height = ((View)this.getParent()).getHeight();//takes entire height of the view
        int lineHeight = getLineHeight();//counts the space between each line drawn
        int numberOfLines = height / lineHeight; // tells how many lines need to be drawn

        Rect r = mRect;
        Paint paint = mPaint;

        int baseline = getLineBounds(0, r);

        for(int i = 0; i < numberOfLines; i++){
            canvas.drawLine(r.left,baseline +1, r.right, baseline+1, paint);
            baseline+=lineHeight;
            Log.d(TAG,"baseline number "+baseline+" drawn by "+lineHeight+" height");
        }

        super.onDraw(canvas);
    }
}
