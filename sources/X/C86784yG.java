package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4yG  reason: invalid class name and case insensitive filesystem */
public final class C86784yG extends Drawable implements C39769Kzd {
    public ImageUrl A00;
    public final int A01;
    public final Bitmap A02;
    public final Canvas A03;
    public final Matrix A04;
    public final Paint A05;
    public final Rect A06 = C86134wK.A0D();
    public final Rect A07 = C86134wK.A0D();
    public final String A08;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            Rect rect = this.A07;
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = this.A06;
            int i = this.A01;
            rect2.set(0, 0, i, i);
            Matrix matrix = this.A04;
            C19587Ayn.A08(matrix, rect, rect2);
            this.A03.drawBitmap(bitmap, matrix, (Paint) null);
            C86124wJ.A1B(this.A02, this.A05);
            invalidateSelf();
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        float f = (float) getBounds().left;
        float f2 = (float) getBounds().top;
        canvas.translate(f, f2);
        float A012 = C86134wK.A01(this.A01);
        canvas.drawCircle(A012, A012, A012, this.A05);
        canvas.translate(-f, -f2);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void A00(ImageUrl imageUrl) {
        if (!C04220Ms.A0I(this.A00, imageUrl)) {
            this.A00 = imageUrl;
            this.A05.setShader((Shader) null);
            if (imageUrl != null) {
                C86144wL.A1K(this, C37744K2e.A01(), imageUrl, this.A08);
            }
        }
    }

    public final int getAlpha() {
        return this.A05.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A05.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86784yG(Matrix matrix, String str, int i) {
        this.A01 = i;
        this.A04 = matrix;
        this.A08 = str;
        Paint A0C = C86114wI.A0C(3);
        C86134wK.A13(A0C);
        this.A05 = A0C;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        this.A02 = createBitmap;
        this.A03 = new Canvas(createBitmap);
    }
}
