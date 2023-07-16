package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.barcelona.R;

/* renamed from: X.0xC  reason: invalid class name and case insensitive filesystem */
public final class C18440xC extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = new Paint();

    public C18440xC(Resources.Theme theme, Integer num) {
        int i;
        switch (num.intValue()) {
            case 0:
                i = R.attr.actionBarPressedColor;
                break;
            case 1:
                i = R.attr.clearActionBarForegroundPressedColor;
                break;
            default:
                i = R.attr.highlightActionBarForegroundPressedColor;
                break;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        this.A03 = typedValue.data;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A01 = -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.A00) {
            Paint paint = this.A06;
            paint.setColor(this.A03);
            int i4 = this.A02;
            Canvas canvas2 = canvas;
            if (i4 == -1 || (i = this.A04) == -1 || (i2 = this.A05) == -1 || (i3 = this.A01) == -1) {
                canvas.drawRect(getBounds(), paint);
            } else {
                canvas2.drawRect((float) i4, (float) i2, (float) i, (float) i3, paint);
            }
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z = this.A00;
        this.A00 = false;
        boolean z2 = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (iArr[i] == 16842919) {
                this.A00 = true;
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z == z2) {
            return false;
        }
        invalidateSelf();
        return true;
    }
}
