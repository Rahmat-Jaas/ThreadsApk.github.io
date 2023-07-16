package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7QP  reason: invalid class name */
public final class AnonymousClass7QP implements LineHeightSpan {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final float A05;
    public final float A06;
    public final boolean A07;
    public final boolean A08;
    public final int A09;

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        float f;
        C04220Ms.A0B(fontMetricsInt, 5);
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        int i9 = i7 - i8;
        if (i9 > 0) {
            boolean z = true;
            boolean A1T = AnonymousClass0wJ.A1T(i, 0);
            if (i2 != this.A09) {
                z = false;
            }
            if (!A1T) {
                i5 = this.A00;
            } else if (!z || !this.A07 || !this.A08) {
                int A032 = C86124wJ.A03(this.A05);
                int i10 = A032 - i9;
                float f2 = this.A06;
                if (f2 == -1.0f) {
                    f2 = Math.abs((float) i8) / ((float) i9);
                }
                float f3 = (float) i10;
                if (i10 <= 0) {
                    f = f3 * f2;
                } else {
                    f = f3 * (1.0f - f2);
                }
                int A033 = i7 + C86124wJ.A03(f);
                this.A01 = A033;
                i5 = A033 - A032;
                this.A00 = i5;
                if (this.A07) {
                    i5 = i8;
                }
                if (this.A08) {
                    A033 = i7;
                }
                this.A03 = A033;
                this.A02 = i8 - i5;
                this.A04 = A033 - i7;
            } else {
                return;
            }
            fontMetricsInt.ascent = i5;
            if (z) {
                i6 = this.A03;
            } else {
                i6 = this.A01;
            }
            fontMetricsInt.descent = i6;
        }
    }

    public AnonymousClass7QP(float f, float f2, int i, boolean z, boolean z2) {
        this.A05 = f;
        this.A09 = i;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = f2;
        if ((BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw C18180wK.A0a("topRatio should be in [0..1] range or -1");
        }
    }
}
