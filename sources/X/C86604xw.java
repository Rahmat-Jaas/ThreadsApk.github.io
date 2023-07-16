package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xw  reason: invalid class name and case insensitive filesystem */
public final class C86604xw extends Drawable {
    public final float A00;
    public final float A01;
    public final Rect A02 = C86134wK.A0D();
    public final C86614xx A03;
    public final C86614xx A04;

    public final int getOpacity() {
        return -2;
    }

    public C86604xw(float f, float f2, float f3, int i) {
        C002801h.A03(C86124wJ.A1X((f > f2 ? 1 : (f == f2 ? 0 : -1))));
        this.A01 = f2;
        this.A00 = f;
        this.A03 = new C86614xx(855638016, f, f3);
        this.A04 = new C86614xx(i, f2, f3);
    }

    public static int A00(Context context, float f) {
        int alpha = Color.alpha(637534208);
        return Color.argb(Math.min(alpha, Math.round((f / C09860go.A03(context, 10)) * ((float) alpha))), Color.red(637534208), Color.green(637534208), Color.blue(637534208));
    }

    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A03.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = this.A02;
        rect2.set(rect);
        int round = Math.round(this.A01 - this.A00);
        rect2.inset(round, round);
        this.A03.setBounds(rect2);
        this.A04.setBounds(rect);
    }

    public final void setAlpha(int i) {
        this.A03.mutate().setAlpha(i);
        this.A04.mutate().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.mutate().setColorFilter(colorFilter);
        this.A04.mutate().setColorFilter(colorFilter);
    }
}
