package com.instagram.bugreporter;

import X.C09860go;
import X.C14030oh;
import X.C29934Fwk;
import X.C86134wK;
import X.C86144wL;
import X.C86164wN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class BugReporterDrawingView extends View {
    public float A00;
    public float A01;
    public Bitmap A02;
    public Bitmap A03;
    public Canvas A04;
    public Rect A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;

    public final void A01() {
        Bitmap bitmap = this.A02;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A02.recycle();
            this.A04 = null;
        }
        this.A08.reset();
    }

    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Rect rect = this.A05;
        rect.getClass();
        if (rect.width() > 0 && this.A05.height() > 0 && (bitmap = this.A02) != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.A05, this.A06);
        }
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = C86144wL.A0G();
        this.A09 = C86144wL.A0G();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C29934Fwk.A0A);
        float dimension = obtainStyledAttributes.getDimension(1, C09860go.A03(context2, 12));
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint A0F = C86144wL.A0F();
        this.A07 = A0F;
        A0F.setAntiAlias(true);
        A0F.setColor(color);
        C86134wK.A12(A0F);
        A0F.setStrokeJoin(Paint.Join.ROUND);
        A0F.setStrokeWidth(dimension);
        A0F.setStrokeCap(Paint.Cap.ROUND);
        Paint A0F2 = C86144wL.A0F();
        this.A06 = A0F2;
        A0F2.setAntiAlias(true);
        A0F2.setDither(true);
        A0F2.setFilterBitmap(true);
    }

    public static void A00(BugReporterDrawingView bugReporterDrawingView) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int width = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingLeft()) - bugReporterDrawingView.getPaddingRight();
        int height = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingTop()) - bugReporterDrawingView.getPaddingBottom();
        Bitmap bitmap = bugReporterDrawingView.A03;
        if (bitmap == null || width <= 0 || height <= 0) {
            paddingLeft = bugReporterDrawingView.getPaddingLeft();
            paddingRight = bugReporterDrawingView.getPaddingRight();
            paddingTop = bugReporterDrawingView.getPaddingTop();
            paddingBottom = bugReporterDrawingView.getPaddingBottom();
        } else {
            int width2 = bitmap.getWidth();
            float f = (float) width2;
            float height2 = (float) bugReporterDrawingView.A03.getHeight();
            float min = Math.min(((float) width) / f, ((float) height) / height2);
            int ceil = (int) Math.ceil((double) (f * min));
            int i = (width - ceil) >> 1;
            int ceil2 = (height - ((int) Math.ceil((double) (height2 * min)))) >> 1;
            paddingLeft = bugReporterDrawingView.getPaddingLeft() + i;
            paddingRight = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingRight()) - i;
            paddingTop = bugReporterDrawingView.getPaddingTop() + ceil2;
            paddingBottom = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingBottom()) - ceil2;
        }
        Rect A0F = C86164wN.A0F(paddingLeft, paddingTop, paddingRight, paddingBottom);
        bugReporterDrawingView.A05 = A0F;
        int width3 = A0F.width();
        int height3 = bugReporterDrawingView.A05.height();
        if (width3 <= 0 || height3 <= 0) {
            bugReporterDrawingView.A01();
            return;
        }
        bugReporterDrawingView.A01();
        Bitmap createBitmap = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
        bugReporterDrawingView.A02 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        bugReporterDrawingView.A04 = canvas;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (bugReporterDrawingView.A03 != null) {
            bugReporterDrawingView.A04.drawBitmap(bugReporterDrawingView.A03, (Rect) null, new Rect(0, 0, width3, height3), bugReporterDrawingView.A06);
        }
        bugReporterDrawingView.A05.getClass();
        Matrix A0E = C86164wN.A0E();
        Rect rect = bugReporterDrawingView.A05;
        A0E.postTranslate((float) (-rect.left), (float) (-rect.top));
        bugReporterDrawingView.A04.setMatrix(A0E);
    }

    public final void finalize() {
        super.finalize();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = C14030oh.A06(115765338);
        A00(this);
        C14030oh.A0D(816755891, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = C14030oh.A05(-765808055);
        Rect rect = this.A05;
        rect.getClass();
        if (rect.width() <= 0 || this.A05.height() <= 0) {
            i = -454054701;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A00 = motionEvent.getX();
                float y = motionEvent.getY();
                this.A01 = y;
                Path path = this.A08;
                float f = this.A00;
                path.addRect(f, y, f + 0.1f, y + 0.1f, Path.Direction.CW);
                Canvas canvas = this.A04;
                canvas.getClass();
                canvas.drawPoint(this.A00, this.A01, this.A07);
            } else if (actionMasked == 1) {
                Path path2 = this.A08;
                path2.moveTo(this.A00, this.A01);
                path2.lineTo(motionEvent.getX(), motionEvent.getY());
                Canvas canvas2 = this.A04;
                canvas2.getClass();
                canvas2.drawLine(this.A00, this.A01, motionEvent.getX(), motionEvent.getY(), this.A07);
            } else if (actionMasked != 2) {
                i = -1347218969;
            } else {
                Path path3 = this.A09;
                path3.reset();
                path3.moveTo(this.A00, this.A01);
                int historySize = motionEvent.getHistorySize();
                for (int i2 = 0; i2 < historySize; i2++) {
                    float historicalX = motionEvent.getHistoricalX(i2);
                    float historicalY = motionEvent.getHistoricalY(i2);
                    float f2 = this.A00;
                    float f3 = (historicalX + f2) / 2.0f;
                    float f4 = this.A01;
                    float f5 = (historicalY + f4) / 2.0f;
                    path3.quadTo(f2, f4, f3, f5);
                    this.A00 = f3;
                    this.A01 = f5;
                }
                float x = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f6 = this.A00;
                float f7 = (x + f6) / 2.0f;
                float f8 = this.A01;
                float f9 = (y2 + f8) / 2.0f;
                path3.quadTo(f6, f8, f7, f9);
                this.A00 = f7;
                this.A01 = f9;
                this.A08.addPath(path3);
                Canvas canvas3 = this.A04;
                canvas3.getClass();
                canvas3.drawPath(path3, this.A07);
            }
            invalidate();
            C14030oh.A0C(2082926856, A052);
            return true;
        }
        C14030oh.A0C(i, A052);
        return false;
    }

    public BugReporterDrawingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
