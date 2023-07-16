package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.barcelona.R;

/* renamed from: X.4yP  reason: invalid class name */
public final class AnonymousClass4yP extends Drawable implements C33680HsR {
    public float A00;
    public final Paint A01;
    public final RectF A02 = C86134wK.A0E();
    public final F10 A03;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A02;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
        this.A03.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        C86164wN.A16(this.A02, this);
        F10 f10 = this.A03;
        f10.A0G(rect.width());
        int i = f10.A04;
        int i2 = f10.A07;
        int height = rect.top + ((rect.height() - i) >> 1);
        int width = rect.left + ((rect.width() - i2) >> 1);
        f10.setBounds(C86164wN.A0F(width, height, i2 + width, i + height));
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final float AZz() {
        return this.A00;
    }

    public final void CjT(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public AnonymousClass4yP(Context context, float f) {
        Paint A0F = C86144wL.A0F();
        C86104wH.A18(context, A0F, R.color.black_60_transparent);
        this.A01 = A0F;
        F10 A0T = C86164wN.A0T(context, 0);
        A0T.A0B(f);
        A0T.A0O(context.getResources().getString(2131837977));
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        this.A03 = A0T;
    }
}
