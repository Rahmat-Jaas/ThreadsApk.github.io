package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4xX  reason: invalid class name and case insensitive filesystem */
public final class C86354xX extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public C86354xX(Context context, int i) {
        this.A01 = i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_grid_height_offset);
        this.A00 = dimensionPixelSize;
        Paint A0C = C86114wI.A0C(1);
        this.A02 = A0C;
        C86134wK.A13(A0C);
        A0C.setDither(true);
        A0C.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) dimensionPixelSize, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, new int[]{context.getColor(R.color.black_40_transparent), 0}, (float[]) null, Shader.TileMode.CLAMP));
        setBounds(0, 0, i, dimensionPixelSize);
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.drawRect(getBounds(), this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
