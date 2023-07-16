package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4yE  reason: invalid class name and case insensitive filesystem */
public final class C86764yE extends Drawable implements C39769Kzd {
    public Bitmap A00;
    public final int A01;
    public final int A02;
    public final Paint A03 = C86114wI.A0C(3);
    public final Runnable A04 = new AnonymousClass803(this);
    public final Path A05;

    public C86764yE(String str, float f, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        Path A0G = C86144wL.A0G();
        this.A05 = A0G;
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, (float) i2);
        float[] fArr = new float[8];
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        C86114wI.A11(A0G, rectF, fArr, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        C86144wL.A1K(this, C37744K2e.A01(), C18250wR.A0K(str), AnonymousClass000.A00(1274));
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            int i = this.A02;
            int i2 = this.A01;
            C13760oG.A00(bitmap);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            C04220Ms.A06(createScaledBitmap);
            this.A00 = createScaledBitmap;
            C86124wJ.A1B(createScaledBitmap, this.A03);
            C63643hy.A04(this.A04);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        C86134wK.A11(canvas, C86114wI.A0D(this, canvas));
        canvas.drawPath(this.A05, this.A03);
    }
}
