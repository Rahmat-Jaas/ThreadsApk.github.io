package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xy  reason: invalid class name and case insensitive filesystem */
public final class C86624xy extends Drawable {
    public Drawable A00;
    public Drawable A01;
    public final int A02;
    public final Context A03;
    public final Paint A04;
    public final RectF A05;
    public final Drawable A06;
    public final String A07;
    public final String A08;

    public C86624xy(Context context, String str, String str2, int i, int i2, int i3) {
        C04220Ms.A0B(context, 1);
        this.A03 = context;
        this.A02 = i2;
        this.A07 = str;
        this.A08 = str2;
        Paint A0C = C86114wI.A0C(1);
        A0C.setColor(i);
        C86134wK.A13(A0C);
        this.A04 = A0C;
        Drawable drawable = context.getDrawable(i3);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C04220Ms.A06(mutate);
            this.A06 = mutate;
            this.A05 = C86134wK.A0E();
            mutate.setTint(i2);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.drawRect(this.A05, this.A04);
        this.A06.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        int i;
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A05.set(rect);
        Context context = this.A03;
        int A022 = AnonymousClass8bA.A02(C09860go.A00(context, 15.0f));
        int A023 = AnonymousClass8bA.A02(C09860go.A00(context, 10.0f));
        String str = this.A08;
        if (str != null) {
            F10 A0T = C86164wN.A0T(context, (rect.width() * 3) >> 2);
            A0T.A0H(this.A02);
            A0T.A0B(C09860go.A00(A0T.A0P, 12.0f));
            A0T.A0K(Typeface.DEFAULT_BOLD);
            A0T.A0O(str);
            this.A01 = A0T;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight() + A023;
        } else {
            i = 0;
        }
        F10 A0T2 = C86164wN.A0T(context, (rect.width() * 3) >> 2);
        A0T2.A0H(this.A02);
        A0T2.A0B(C09860go.A00(A0T2.A0P, 12.0f));
        A0T2.A0D(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.2f);
        A0T2.A0O(this.A07);
        this.A00 = A0T2;
        Drawable drawable2 = this.A06;
        int centerX = rect.centerX();
        A00(drawable2, rect.centerY() - ((((drawable2.getIntrinsicHeight() + i) + A022) + A0T2.A04) >> 1), centerX);
        int i2 = drawable2.getBounds().bottom + A022;
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            A00(drawable3, i2, centerX);
            i2 = drawable3.getBounds().bottom + A023;
        }
        A00(A0T2, i2, centerX);
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        this.A06.setAlpha(i);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public static final void A00(Drawable drawable, int i, int i2) {
        int intrinsicWidth = i2 - (drawable.getIntrinsicWidth() >> 1);
        drawable.setBounds(intrinsicWidth, i, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + i);
    }
}
