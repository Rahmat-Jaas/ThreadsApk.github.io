package com.instagram.ui.widget.triangleshape;

import X.AnonymousClass2LX;
import X.C09860go;
import X.C14030oh;
import X.C29934Fwk;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.C971668e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

public class TriangleShape extends View {
    public View A00 = this;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Path A04;
    public Path A05;
    public C971668e A06 = C971668e.NORTH;
    public int[] A07;

    public TriangleShape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A2I);
        int color = obtainStyledAttributes.getColor(1, -1);
        this.A01 = obtainStyledAttributes.getColor(2, 0);
        if (!TextUtils.isEmpty(AnonymousClass2LX.A00(context, obtainStyledAttributes, 0))) {
            this.A06 = (C971668e) C971668e.A01.get(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
        this.A07 = new int[2];
        Paint A0C = C86114wI.A0C(1);
        this.A02 = A0C;
        A0C.setColor(color);
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint A0C2 = C86114wI.A0C(1);
        this.A03 = A0C2;
        A0C2.setColor(this.A01);
        C86134wK.A12(this.A03);
        this.A03.setStrokeWidth(1.0f);
        Path A0G = C86144wL.A0G();
        this.A04 = A0G;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        A0G.setFillType(fillType);
        Path A0G2 = C86144wL.A0G();
        this.A05 = A0G2;
        A0G2.setFillType(fillType);
    }

    public final void draw(Canvas canvas) {
        int A032 = C14030oh.A03(-1455847097);
        int height = getHeight();
        this.A00.getLocationInWindow(this.A07);
        int width = this.A07[0] + ((int) ((((float) this.A00.getWidth()) * this.A00.getScaleX()) / 2.0f));
        getLocationInWindow(this.A07);
        int i = width - this.A07[0];
        this.A04.reset();
        this.A05.reset();
        C971668e r3 = this.A06;
        C971668e r2 = C971668e.SOUTH;
        Path path = this.A04;
        float f = (float) (i - height);
        if (r3 == r2) {
            path.moveTo(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f2 = (float) (i + height);
            this.A04.lineTo(f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f3 = (float) i;
            float f4 = (float) height;
            this.A04.lineTo(f3, f4);
            if (this.A01 != 0) {
                this.A05.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A05.lineTo(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A05.lineTo(f3, f4);
                this.A05.lineTo(f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A05.lineTo((float) C09860go.A08(getContext()), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        } else {
            float f5 = (float) height;
            path.moveTo(f, f5);
            float f6 = (float) (height + i);
            this.A04.lineTo(f6, f5);
            float f7 = (float) i;
            this.A04.lineTo(f7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (this.A01 != 0) {
                this.A05.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5);
                this.A05.lineTo(f, f5);
                this.A05.lineTo(f7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A05.lineTo(f6, f5);
                this.A05.lineTo((float) C09860go.A08(getContext()), f5);
            }
        }
        this.A04.close();
        canvas.drawPath(this.A04, this.A02);
        canvas.drawPath(this.A05, this.A03);
        C14030oh.A0A(-238294174, A032);
    }

    public void setDirection(C971668e r1) {
        this.A06 = r1;
    }

    public void setNotchCenterXOn(View view) {
        this.A00 = view;
    }

    public TriangleShape(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    public TriangleShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }
}
