package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11;

/* renamed from: X.4yK  reason: invalid class name */
public final class AnonymousClass4yK extends Drawable implements C39769Kzd, Drawable.Callback {
    public C28189F0m A00;
    public AnonymousClass5HO A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C04530Oa A08 = AnonymousClass0OY.A02(new KtLambdaShape31S0100000_I2_11(this, 2));
    public final C04530Oa A09 = AnonymousClass0OY.A02(new KtLambdaShape31S0100000_I2_11(this, 3));
    public final C04530Oa A0A = AnonymousClass0OY.A02(new KtLambdaShape31S0100000_I2_11(this, 4));
    public final C04530Oa A0B = AnonymousClass0OY.A02(new KtLambdaShape31S0100000_I2_11(this, 5));
    public final C04530Oa A0C = AnonymousClass0OY.A02(new KtLambdaShape31S0100000_I2_11(this, 6));

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A062 = C31176Gi6.A06(bitmap, i, i, 0, false);
            C04220Ms.A06(A062);
            F6Z f6z = new F6Z(this.A07.getResources(), A062);
            this.A00 = f6z;
            f6z.A02(this.A02);
            AnonymousClass5HO r0 = this.A01;
            this.A01 = new AnonymousClass5HO(r0.A03, r0.A00, r0.A01, true);
            invalidateDrawable(this);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        int i2;
        C04220Ms.A0B(canvas, 0);
        int i3 = this.A05;
        if (i3 > 0) {
            Drawable drawable2 = (Drawable) this.A0B.getValue();
            int i4 = this.A04 + i3;
            int i5 = (this.A06 - i4) >> 1;
            int i6 = i4 + i5;
            drawable2.setBounds(i5, i5, i6, i6);
            drawable2.draw(canvas);
        }
        if (this.A01.A02) {
            Drawable drawable3 = (Drawable) this.A09.getValue();
            if (drawable3 != null) {
                int i7 = this.A04;
                int i8 = (this.A06 - i7) >> 1;
                int i9 = i7 + i8;
                drawable3.setBounds(i8, i8, i9, i9);
                drawable3.draw(canvas);
            }
            drawable = this.A00;
            if (drawable != null) {
                i2 = this.A04;
                i = this.A06;
            } else {
                return;
            }
        } else {
            Drawable drawable4 = (Drawable) this.A0A.getValue();
            int i10 = this.A04;
            i = this.A06;
            int i11 = (i - i10) >> 1;
            int i12 = i10 + i11;
            drawable4.setBounds(i11, i11, i12, i12);
            drawable4.draw(canvas);
            Drawable drawable5 = (Drawable) this.A0C.getValue();
            if (drawable5 != null) {
                drawable5.setBounds(i11, i11, i12, i12);
                drawable5.draw(canvas);
            }
            drawable = (Drawable) this.A08.getValue();
            if (drawable != null) {
                i2 = this.A03;
            } else {
                return;
            }
        }
        int i13 = (i - i2) >> 1;
        int i14 = i2 + i13;
        drawable.setBounds(i13, i13, i14, i14);
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        Drawable drawable;
        if (this.A01.A01) {
            Drawable drawable2 = (Drawable) this.A09.getValue();
            if (drawable2 != null) {
                drawable2.setAlpha(i);
            }
            drawable = this.A00;
            if (drawable == null) {
                return;
            }
        } else {
            Drawable drawable3 = (Drawable) this.A08.getValue();
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            drawable = (Drawable) this.A0A.getValue();
        }
        drawable.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable;
        if (this.A01.A01) {
            Drawable drawable2 = (Drawable) this.A09.getValue();
            if (drawable2 != null) {
                drawable2.setColorFilter(colorFilter);
            }
            drawable = this.A00;
            if (drawable == null) {
                return;
            }
        } else {
            Drawable drawable3 = (Drawable) this.A08.getValue();
            if (drawable3 != null) {
                drawable3.setColorFilter(colorFilter);
            }
            drawable = (Drawable) this.A0A.getValue();
        }
        drawable.setColorFilter(colorFilter);
    }

    public AnonymousClass4yK(Context context, AnonymousClass5HO r5, int i) {
        this.A07 = context;
        this.A05 = i;
        this.A01 = r5;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A04 = dimensionPixelOffset;
        this.A02 = C86134wK.A01(dimensionPixelOffset);
        this.A03 = context.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_stacked_max_height);
        if (this.A01.A01) {
            C86144wL.A1K(this, C37744K2e.A01(), C18250wR.A0K(this.A01.A00), AnonymousClass000.A00(587));
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
