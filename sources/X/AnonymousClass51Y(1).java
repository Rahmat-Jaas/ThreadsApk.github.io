package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.51Y  reason: invalid class name */
public abstract class AnonymousClass51Y extends FrameLayout {
    public static final C25757DrU A06 = C25757DrU.A01(60.0d, 5.0d);
    public static final C25757DrU A07 = C25757DrU.A01(250.0d, 16.0d);
    public static final C25757DrU A08 = C25757DrU.A01(40.0d, 9.0d);
    public int A00;
    public Drawable A01;
    public C25812DsR A02;
    public C25812DsR A03;
    public boolean A04 = false;
    public int A05;

    public abstract Drawable getStrokeDrawable();

    public int getDisabledAlpha() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.A05;
        setPadding(i3, i3, i3, i3);
        super.onMeasure(i, i2);
    }

    public void setSelected(boolean z) {
        C25812DsR dsR;
        double d;
        Drawable drawable = this.A01;
        if (z) {
            drawable.setAlpha(255);
            dsR = this.A02;
            d = 255.0d;
        } else {
            drawable.setAlpha(0);
            dsR = this.A02;
            d = 0.0d;
        }
        dsR.A0A(d);
        dsR.A09(d);
        invalidate();
        requestLayout();
    }

    public AnonymousClass51Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        COK A002 = AnonymousClass0hJ.A00();
        C25812DsR A022 = A002.A02();
        A022.A00 = 0.01d;
        A022.A0E(new C90795f4(this));
        this.A03 = A022;
        C25812DsR A023 = A002.A02();
        A023.A06 = true;
        A023.A0D(A06);
        A023.A0E(new C90805f5(this));
        this.A02 = A023;
        Drawable strokeDrawable = getStrokeDrawable();
        this.A01 = strokeDrawable;
        strokeDrawable.setAlpha(0);
        this.A05 = C86124wJ.A08(getContext());
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.draw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = C14030oh.A06(-20356303);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01.setBounds(0, 0, getWidth(), getHeight());
        C14030oh.A0D(130997185, A062);
    }

    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A04) {
            C25812DsR dsR = this.A03;
            if (z) {
                dsR.A0D(A07);
                d = 1.0d;
            } else {
                dsR.A0D(A08);
                d = 0.0d;
            }
            dsR.A0A(d);
        }
    }

    public void setAnimatePress(boolean z) {
        this.A04 = z;
    }

    public void setDisabledAlpha(int i) {
        this.A00 = i;
    }

    public AnonymousClass51Y(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass51Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
