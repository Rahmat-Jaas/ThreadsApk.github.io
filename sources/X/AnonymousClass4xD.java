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

/* renamed from: X.4xD  reason: invalid class name */
public final class AnonymousClass4xD extends Drawable {
    public final Paint A00;
    public final Path A01;

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        canvas.drawPath(this.A01, this.A00);
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass4xD(Context context, float f, float f2) {
        Paint A0C = C86114wI.A0C(3);
        this.A00 = A0C;
        Path A0G = C86144wL.A0G();
        this.A01 = A0G;
        float A03 = C09860go.A03(context, 12);
        A0C.setColor(-1);
        C86134wK.A13(A0C);
        A0C.setShadowLayer(14.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.black_15_transparent));
        A0G.addRoundRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2), A03, A03, Path.Direction.CW);
    }
}
