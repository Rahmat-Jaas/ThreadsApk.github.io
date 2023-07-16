package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.4xk  reason: invalid class name and case insensitive filesystem */
public final class C86484xk extends Drawable {
    public final int A00;
    public final Bitmap A01;
    public final Matrix A02;
    public final Paint A03;
    public final AnonymousClass4y4 A04;

    public C86484xk(Context context, String str, List list, boolean z) {
        Bitmap bitmap;
        AnonymousClass4y4 r2 = new AnonymousClass4y4(context, C973468z.A03, list, z);
        this.A04 = r2;
        if (str != null) {
            bitmap = BitmapFactory.decodeFile(str);
        } else {
            bitmap = null;
        }
        this.A01 = bitmap;
        this.A02 = C86164wN.A0E();
        Paint A0F = C86144wL.A0F();
        A0F.setFlags(1);
        this.A03 = A0F;
        int A022 = r2.A0D + (C18240wQ.A02(context, 16) << 1);
        this.A00 = A022;
        if (bitmap == null) {
            int i = R.color.feed_sticker_background_top_light;
            int i2 = R.color.design_dark_default_color_on_background;
            if (z) {
                i = R.color.feed_sticker_background_bottom_dark;
                i2 = R.color.feed_sticker_background_bottom_dark;
            }
            A0F.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) A022, new int[]{context.getColor(i), context.getColor(i2)}, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            canvas.save();
            int width = bitmap.getWidth();
            int i = this.A00;
            canvas.translate(((float) (-(width - i))) / 2.0f, ((float) (-(bitmap.getHeight() - i))) / 2.0f);
            canvas.drawBitmap(bitmap, this.A02, this.A03);
            canvas.restore();
        } else {
            canvas.drawRect(getBounds(), this.A03);
        }
        this.A04.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        AnonymousClass4y4 r5 = this.A04;
        int intrinsicWidth = r5.getIntrinsicWidth();
        float f3 = ((float) intrinsicWidth) / 2.0f;
        float intrinsicHeight = ((float) r5.getIntrinsicHeight()) / 2.0f;
        r5.setBounds(AnonymousClass8bA.A02(f - f3), AnonymousClass8bA.A02(f2 - intrinsicHeight), AnonymousClass8bA.A02(f + f3), AnonymousClass8bA.A02(f2 + intrinsicHeight));
    }
}
