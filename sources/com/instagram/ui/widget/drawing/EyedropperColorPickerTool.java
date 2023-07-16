package com.instagram.ui.widget.drawing;

import X.AnonymousClass47S;
import X.C09760gd;
import X.C127237gm;
import X.C25812DsR;
import X.C29934Fwk;
import X.C63393hP;
import X.C86014w8;
import X.C86114wI;
import X.C86134wK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.rebound.IDxSListenerShape89S0100000_2_I2;
import com.facebook.redex.IDxProviderShape245S0100000_2_I2;

public class EyedropperColorPickerTool extends View {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public C86014w8 A04;
    public float A05;
    public final C127237gm A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;

    public void setColor(int i) {
        this.A09.setColor(i);
        ColorFilter A002 = C63393hP.A00(C09760gd.A08(i, -1));
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setColorFilter(A002);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setColorFilter(A002);
        }
        invalidate();
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new IDxSListenerShape89S0100000_2_I2(this, 7);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A0Y);
            this.A08 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(obtainStyledAttributes.getFloat(3, -1.0f), 1.0f));
            float dimension = obtainStyledAttributes.getDimension(5, 3.0f);
            this.A07 = dimension;
            this.A05 = obtainStyledAttributes.getDimension(4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            this.A02 = obtainStyledAttributes.getDrawable(1);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            obtainStyledAttributes.recycle();
            Paint A0C = C86114wI.A0C(1);
            this.A0A = A0C;
            A0C.setColor(-1);
            C86134wK.A12(A0C);
            A0C.setStrokeWidth(dimension);
            Paint A0C2 = C86114wI.A0C(1);
            this.A09 = A0C2;
            C86134wK.A13(A0C2);
            setColor(-1);
            this.A04 = new AnonymousClass47S(new IDxProviderShape245S0100000_2_I2((Object) this, 20));
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private float getButtonRadius() {
        return C86134wK.A01((getWidth() - getPaddingLeft()) - getPaddingRight()) + this.A07;
    }

    private void setIconBounds(Drawable drawable) {
        float buttonRadius = getButtonRadius() * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((buttonRadius * buttonRadius) / 2.0f))) - this.A05, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f = this.A01;
        float f2 = this.A00;
        drawable.setBounds((int) (f - min), (int) (f2 - min), (int) (f + min), (int) (f2 + min));
    }

    public final void onDraw(Canvas canvas) {
        float buttonRadius = getButtonRadius();
        float f = this.A01;
        float f2 = this.A00;
        float f3 = buttonRadius - this.A07;
        canvas.drawCircle(f, f2, f3, this.A09);
        canvas.drawCircle(this.A01, this.A00, f3, this.A0A);
        float f4 = (float) ((C25812DsR) this.A04.get()).A09.A00;
        Drawable drawable = this.A03;
        if (drawable != null) {
            canvas.save();
            canvas.rotate(-45.0f * f4, this.A01, this.A00);
            drawable.setAlpha((int) ((1.0f - f4) * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            canvas.save();
            canvas.rotate((1.0f - f4) * 45.0f, this.A01, this.A00);
            drawable2.setAlpha((int) (f4 * 255.0f));
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = C86134wK.A01(getWidth());
        this.A00 = (((float) getHeight()) - this.A01) - ((float) getPaddingBottom());
        Drawable drawable = this.A03;
        if (drawable != null) {
            setIconBounds(drawable);
            drawable.setAlpha(255);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            setIconBounds(drawable2);
            drawable2.setAlpha(0);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(C86134wK.A04((int) (((float) getResources().getDisplayMetrics().widthPixels) * this.A08)), i2);
    }

    public EyedropperColorPickerTool(Context context) {
        this(context, (AttributeSet) null);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
