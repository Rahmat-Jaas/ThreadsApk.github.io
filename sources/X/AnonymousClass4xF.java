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

/* renamed from: X.4xF  reason: invalid class name */
public final class AnonymousClass4xF extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Path path = this.A02;
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) C86124wJ.A0A(this), (float) C86134wK.A08(this));
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        C86114wI.A10(canvas, this);
        canvas.drawPath(path, this.A01);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4xF(Context context, boolean z) {
        this.A00 = (float) context.getResources().getDimensionPixelSize(z ? R.dimen.abc_action_bar_elevation_material : R.dimen.abc_button_inset_vertical_material);
        Paint A0C = C86114wI.A0C(3);
        C86104wH.A18(context, A0C, R.color.grey_2);
        C86134wK.A13(A0C);
        this.A01 = A0C;
        this.A02 = C86144wL.A0G();
    }
}
