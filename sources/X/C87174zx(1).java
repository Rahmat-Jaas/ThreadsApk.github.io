package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;

/* renamed from: X.4zx  reason: invalid class name and case insensitive filesystem */
public class C87174zx extends ReplacementSpan implements Drawable.Callback {
    public View A00;
    public AnonymousClass0ZU A01;
    public final Resources A02;
    public final C142078dm A03;
    public final C87164zw A04;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        C18210wN.A1M(canvas, 0, paint2);
        this.A04.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C04220Ms.A0B(paint, 0);
        return this.A04.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C04220Ms.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C04220Ms.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.removeCallbacks(runnable);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        View view = this.A00;
        if (view != null) {
            view.invalidate();
        }
    }

    public /* synthetic */ C87174zx(Resources resources, C142078dm r2, C87164zw r3) {
        this.A02 = resources;
        this.A03 = r2;
        this.A04 = r3;
        ((Drawable) r2).setCallback(this);
    }
}
