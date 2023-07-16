package com.instagram.ui.text.fittingtextview;

import X.AnonymousClass006;
import X.C18250wR;
import X.C29934Fwk;
import X.C86124wJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgView;

public class FittingTextView extends IgView {
    public float A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public StaticLayout A07;
    public Integer A08;
    public final TextPaint A09;

    private int getMeasuredTextWidth() {
        return (int) this.A09.measureText(this.A04);
    }

    public int getMinWidth() {
        return Math.min(this.A03.getIntrinsicWidth(), getMeasuredTextWidth());
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setText(String str) {
        this.A04 = str;
        A00();
        requestLayout();
    }

    public FittingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 0;
        this.A08 = AnonymousClass006.A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0k, 0, 0);
        if (!obtainStyledAttributes.hasValue(3) || !obtainStyledAttributes.hasValue(1) || !obtainStyledAttributes.hasValue(2)) {
            obtainStyledAttributes.recycle();
            throw C18250wR.A0V("Fitting text, icon, and maximum width required.");
        }
        this.A03 = obtainStyledAttributes.getDrawable(1);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.A04 = context.getString(resourceId);
        }
        this.A00 = obtainStyledAttributes.getDimension(7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A05 = obtainStyledAttributes.getBoolean(4, false);
        this.A02 = obtainStyledAttributes.getColor(5, -1);
        this.A06 = obtainStyledAttributes.getBoolean(6, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId2 != 0) {
            setContentDescription(context.getString(resourceId2));
        }
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        float f = this.A00;
        textPaint.setTextSize(f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? (float) getResources().getDimensionPixelSize(R.dimen.account_section_text_line_height) : f);
        textPaint.setColor(this.A02);
        if (this.A06) {
            textPaint.setShadowLayer(7.2f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, getContext().getColor(R.color.black_25_transparent));
        }
        if (this.A05) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.A09 = textPaint;
        A00();
    }

    private void A00() {
        int measuredTextWidth = getMeasuredTextWidth();
        String str = this.A04;
        this.A07 = new StaticLayout(str, 0, str.length(), this.A09, measuredTextWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int intValue = this.A08.intValue();
        if (intValue == 0) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.A07.draw(canvas);
            canvas.restore();
        } else if (intValue == 1) {
            Drawable drawable = this.A03;
            C86124wJ.A1C(drawable);
            drawable.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        Integer num;
        int intrinsicWidth;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        if (this.A07.getWidth() + paddingLeft > this.A01) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A00;
        }
        this.A08 = num;
        if (num == AnonymousClass006.A00) {
            intrinsicWidth = this.A07.getWidth() + paddingLeft;
        } else {
            intrinsicWidth = this.A03.getIntrinsicWidth();
        }
        setMeasuredDimension(intrinsicWidth, View.MeasureSpec.getSize(i2));
    }

    public FittingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public FittingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
