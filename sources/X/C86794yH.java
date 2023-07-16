package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4yH  reason: invalid class name and case insensitive filesystem */
public final class C86794yH extends Drawable implements C39769Kzd {
    public boolean A00;
    public final int A01;
    public final Paint A02;
    public final int A03;
    public final int A04;
    public final Matrix A05;
    public final Paint A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Runnable A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C86794yH(ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A05 = C86164wN.A0E();
        Paint A0C2 = C86114wI.A0C(3);
        this.A02 = A0C2;
        boolean z2 = true;
        Paint A0C3 = C86114wI.A0C(1);
        this.A06 = A0C3;
        this.A07 = C86114wI.A0C(3);
        Paint A0C4 = C86114wI.A0C(1);
        this.A0A = A0C4;
        Paint A0C5 = C86114wI.A0C(1);
        this.A09 = A0C5;
        Paint A0C6 = C86114wI.A0C(1);
        this.A0B = A0C6;
        Paint A0C7 = C86114wI.A0C(1);
        this.A08 = A0C7;
        this.A0C = new C135697zu(this);
        this.A0E = z;
        this.A04 = i2;
        this.A03 = i4;
        this.A01 = i;
        Paint.Style style = Paint.Style.FILL;
        A0C2.setStyle(style);
        A0C4.setStyle(style);
        A0C4.setStrokeWidth((float) i2);
        A0C4.setColor(i3);
        A0C5.setStyle(style);
        A0C5.setStrokeWidth((float) i4);
        A0C5.setColor(i5);
        A0C6.setStyle(style);
        A0C6.setStrokeWidth((float) 0);
        A0C6.setColor(0);
        int i7 = i6;
        this.A0D = C18180wK.A1V(i7);
        A0C3.setStyle(style);
        A0C3.setColor(i7);
        C86144wL.A18(A0C7, PorterDuff.Mode.CLEAR);
        A0C7.setStyle(style);
        this.A0F = (i3 != 0 || i2 <= 0) ? false : z2;
        if (imageUrl != null) {
            C86144wL.A1K(this, C37744K2e.A01(), imageUrl, str);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -1;
    }

    public static void A00(Bitmap bitmap, C86794yH r6) {
        int i = r6.A01 - ((r6.A04 + r6.A03) << 1);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, i, i);
        Matrix matrix = r6.A05;
        C19587Ayn.A08(matrix, rect, rect2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, r6.A07);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        r6.A02.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        C63643hy.A04(r6.A0C);
    }

    public final void A01(Bitmap bitmap) {
        if (bitmap == null) {
            C10450iM.A03("CircularUrlDrawable#setBitmap with null bitmap", "");
        } else if (this.A0E) {
            AnonymousClass0gN.A00().AKp(new AnonymousClass61A(bitmap, this));
        } else {
            A00(bitmap, this);
        }
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        A01((Bitmap) ktCSuperShape0S2101000_I2.A01);
    }

    public final int getAlpha() {
        return this.A02.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A06.setAlpha(i);
        this.A0A.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        C86134wK.A11(canvas, getBounds());
        int i = this.A01;
        int i2 = i >> 1;
        if (this.A0F) {
            float f = (float) i2;
            canvas.drawCircle(f, f, f, this.A08);
        }
        int i3 = this.A03;
        if (i3 > 0 && (this.A0D || this.A00)) {
            float f2 = (float) i2;
            canvas.drawCircle(f2, f2, f2, this.A09);
        }
        int i4 = this.A04;
        if (i4 > 0 && (this.A0D || this.A00)) {
            float f3 = (float) i2;
            canvas.drawCircle(f3, f3, (float) (i2 - i3), this.A0A);
        }
        int i5 = i4 + i3;
        int i6 = (i - (i5 << 1)) >> 1;
        canvas.save();
        float f4 = (float) i5;
        canvas.translate(f4, f4);
        if (this.A0D) {
            float f5 = (float) i6;
            canvas.drawCircle(f5, f5, f5, this.A06);
        }
        if (this.A00) {
            float f6 = (float) i6;
            canvas.drawCircle(f6, f6, f6, this.A02);
        }
        canvas.restoreToCount(save);
    }

    public C86794yH(ImageUrl imageUrl, String str, int i, int i2, int i3, int i4) {
        this(imageUrl, str, i, i2, i3, 0, 0, i4, false);
    }
}
