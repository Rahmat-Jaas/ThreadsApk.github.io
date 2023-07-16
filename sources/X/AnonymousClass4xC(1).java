package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xC  reason: invalid class name */
public final class AnonymousClass4xC extends Drawable {
    public final Paint A00;
    public final RectF A01 = C86134wK.A0E();

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass4xC(int i) {
        Paint A0F = C86144wL.A0F();
        this.A00 = A0F;
        A0F.setAntiAlias(true);
        A0F.setColor(i);
    }

    public final void draw(Canvas canvas) {
        float A08 = (float) C86134wK.A08(this);
        float f = A08 / 2.0f;
        RectF rectF = this.A01;
        rectF.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.top = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = (float) C86124wJ.A0A(this);
        rectF.bottom = A08;
        canvas.drawRoundRect(rectF, f, f, this.A00);
    }

    public final void setAlpha(int i) {
        throw C18240wQ.A0j();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw C18240wQ.A0j();
    }
}
