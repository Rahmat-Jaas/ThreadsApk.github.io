package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4xJ  reason: invalid class name and case insensitive filesystem */
public final class C86274xJ extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Path A05 = C86144wL.A0G();
    public final boolean A06;

    public C86274xJ(Context context, int i, boolean z) {
        C04220Ms.A0B(context, 1);
        this.A06 = z;
        this.A00 = (float) C86114wI.A05(context);
        Paint A0C = C86114wI.A0C(3);
        A0C.setColor(i);
        C86134wK.A13(A0C);
        this.A03 = A0C;
        float A09 = (float) C86124wJ.A09(context);
        this.A01 = A09;
        int color = context.getColor(R.color.black_10_transparent);
        this.A02 = color;
        Paint A0C2 = C86114wI.A0C(3);
        A0C2.setColor(i);
        A0C2.setShadowLayer(A09, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, color);
        this.A04 = A0C2;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Path path = this.A05;
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) C86124wJ.A0A(this), (float) C86134wK.A08(this));
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        C86114wI.A10(canvas, this);
        if (this.A06) {
            canvas.drawPath(path, this.A04);
        }
        canvas.drawPath(path, this.A03);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        Paint paint = this.A04;
        paint.setAlpha(i);
        if (i == 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A02);
        }
    }
}
