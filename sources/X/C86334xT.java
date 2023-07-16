package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xT  reason: invalid class name and case insensitive filesystem */
public final class C86334xT extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final RectF A05 = C86134wK.A0E();
    public final C86604xw A06;

    public C86334xT(Context context, boolean z) {
        C86604xw r0;
        Resources resources = context.getResources();
        this.A03 = C18250wR.A00(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin);
        this.A02 = dimensionPixelSize;
        float A012 = C86134wK.A01(dimensionPixelSize);
        this.A01 = A012;
        this.A00 = resources.getDimension(R.dimen.abc_control_corner_material);
        Paint A0F = C86144wL.A0F();
        this.A04 = A0F;
        C86104wH.A18(context, A0F, C86104wH.A0G(context, R.attr.fastScrubberDotColor).resourceId);
        A0F.setAntiAlias(true);
        if (z) {
            float dimension = resources.getDimension(R.dimen.abc_control_corner_material);
            r0 = new C86604xw(C09860go.A03(context, 1), dimension, A012, C86604xw.A00(context, dimension));
        } else {
            r0 = null;
        }
        this.A06 = r0;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        C86604xw r0 = this.A06;
        if (r0 != null) {
            r0.draw(canvas);
        }
        RectF rectF = this.A05;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float centerX = (float) rect.centerX();
        float f = ((float) this.A03) / 2.0f;
        float centerY = (float) rect.centerY();
        float f2 = ((float) this.A02) / 2.0f;
        rectF.set(centerX - f, centerY - f2, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f2);
        C86604xw r2 = this.A06;
        if (r2 != null) {
            float f3 = rectF.left;
            float f4 = this.A00;
            AnonymousClass8bA.A05(rectF, r2, f3, f4, f4);
        }
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        C86604xw r0 = this.A06;
        if (r0 != null) {
            r0.mutate().setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        C86604xw r0 = this.A06;
        if (r0 != null) {
            r0.mutate().setColorFilter(colorFilter);
        }
        invalidateSelf();
    }
}
