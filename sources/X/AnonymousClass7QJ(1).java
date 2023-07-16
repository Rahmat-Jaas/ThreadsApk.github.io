package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.style.LineBackgroundSpan;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7QJ  reason: invalid class name */
public final class AnonymousClass7QJ implements LineBackgroundSpan {
    public int A00 = -1;
    public int A01 = -1;
    public final int[] A02;

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        if (i != this.A00 || i2 != this.A01) {
            float f = ((float) (i + i2)) / 2.0f;
            float measureText = paint.measureText(charSequence.toString()) / 2.0f;
            paint.setShader(new LinearGradient(f - measureText, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f + measureText, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A02, (float[]) null, Shader.TileMode.CLAMP));
            this.A00 = i;
            this.A01 = i2;
        }
    }

    public AnonymousClass7QJ(int[] iArr) {
        this.A02 = iArr;
    }
}
