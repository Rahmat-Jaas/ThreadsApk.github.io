package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xG  reason: invalid class name */
public final class AnonymousClass4xG extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final C28189F0m A03;

    public AnonymousClass4xG(Context context, Bitmap bitmap, float f, int i) {
        this.A00 = f;
        this.A01 = i;
        Paint A0C = C86114wI.A0C(1);
        this.A02 = A0C;
        C86104wH.A18(context, A0C, R.color.black_15_transparent);
        C86134wK.A12(A0C);
        A0C.setStrokeWidth(AnonymousClass0h7.A00(context, 1.0f));
        F6Z f6z = new F6Z(context.getResources(), bitmap);
        f6z.A02(f);
        f6z.A09.setAntiAlias(true);
        f6z.invalidateSelf();
        this.A03 = f6z;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        int i = getBounds().left;
        int i2 = this.A01;
        int i3 = i + i2;
        int i4 = getBounds().top + i2;
        int i5 = getBounds().right - i2;
        int i6 = getBounds().bottom - i2;
        C28189F0m f0m = this.A03;
        f0m.setBounds(C86164wN.A0F(i3, i4, i5, i6));
        f0m.draw(canvas);
        RectF rectF = new RectF((float) i3, (float) i4, (float) i5, (float) i6);
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
