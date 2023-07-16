package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.0xA  reason: invalid class name and case insensitive filesystem */
public final class C18420xA extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        float f = (float) this.A01;
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) ((int) (this.A00 * f)), f, this.A02);
    }

    public C18420xA(Context context, float f, int i) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(context.getColor(R.color.igds_secondary_text));
        this.A01 = i;
        this.A00 = f;
    }
}
