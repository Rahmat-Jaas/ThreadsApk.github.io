package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.4yF  reason: invalid class name and case insensitive filesystem */
public final class C86774yF extends Drawable implements C39769Kzd {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final GradientDrawable A07;
    public final Interpolator A08 = new AccelerateInterpolator(1.0f);
    public final Interpolator A09 = new DecelerateInterpolator(1.0f);
    public final List A0A;
    public final List A0B = AnonymousClass0wJ.A0v();
    public final AnonymousClass0ZU A0C;

    public C86774yF(Context context, List list, AnonymousClass0ZU r7, int i, int i2, int i3, int i4) {
        this.A06 = context;
        this.A03 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0A = list;
        this.A0C = r7;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, C29929Fwf.A06);
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(C86134wK.A01(i));
        this.A07 = gradientDrawable;
        this.A0B.clear();
        this.A00 = 0;
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mS(this, list));
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A062 = C31176Gi6.A06(bitmap, i, i, 0, false);
            C04220Ms.A06(A062);
            int i2 = this.A03;
            int i3 = i2 + this.A02;
            C13760oG.A00(A062);
            Bitmap createBitmap = Bitmap.createBitmap(A062, (i - i3) >> 1, ((i - i2) >> 1) - this.A05, i3, i3);
            Bitmap A042 = C31176Gi6.A04(createBitmap, i3, i3);
            if (A042 != null) {
                createBitmap.recycle();
                this.A0B.add(new ScaleDrawable(new BitmapDrawable(this.A06.getResources(), A042), 17, 1.0f, 1.0f));
                int i4 = this.A00 + 1;
                this.A00 = i4;
                if (i4 == this.A0A.size()) {
                    this.A01 = true;
                    invalidateSelf();
                    AnonymousClass0ZU r0 = this.A0C;
                    if (r0 != null) {
                        r0.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        if (this.A01) {
            GradientDrawable gradientDrawable = this.A07;
            int i = this.A02 >> 1;
            int i2 = i + this.A03;
            gradientDrawable.setBounds(i, i, i2, i2);
            gradientDrawable.draw(canvas);
            List list = this.A0B;
            int currentTimeMillis = (int) ((System.currentTimeMillis() / 1500) % ((long) list.size()));
            Drawable drawable = (Drawable) list.get(currentTimeMillis);
            if (currentTimeMillis == 0) {
                currentTimeMillis = list.size();
            }
            Drawable drawable2 = (Drawable) list.get(currentTimeMillis - 1);
            drawable.setBounds(i, i, i2, i2);
            drawable2.setBounds(i, i, i2, i2);
            long currentTimeMillis2 = System.currentTimeMillis() % 1500;
            if (0 > currentTimeMillis2 || currentTimeMillis2 >= 280) {
                drawable.setAlpha(255);
                drawable.setLevel(10000);
            } else {
                if (currentTimeMillis2 < 200) {
                    float A012 = AnonymousClass0hF.A01((float) currentTimeMillis2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 200.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    Interpolator interpolator = this.A08;
                    drawable2.setLevel((int) AnonymousClass0hF.A01(interpolator.getInterpolation(A012), 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 10000.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                    drawable2.setAlpha((int) AnonymousClass0hF.A01(interpolator.getInterpolation(A012), 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 255.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                    drawable2.draw(canvas);
                } else {
                    drawable2.setAlpha(0);
                }
                float A013 = AnonymousClass0hF.A01((float) currentTimeMillis2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 280.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                Interpolator interpolator2 = this.A09;
                drawable.setLevel((int) AnonymousClass0hF.A01(interpolator2.getInterpolation(A013), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 10000.0f));
                drawable.setAlpha((int) AnonymousClass0hF.A01(interpolator2.getInterpolation(A013), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 255.0f));
            }
            drawable.draw(canvas);
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A03 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03 + this.A02;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        for (Drawable alpha : this.A0B) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        for (Drawable colorFilter2 : this.A0B) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }
}
