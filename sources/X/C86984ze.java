package X;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4ze  reason: invalid class name and case insensitive filesystem */
public final class C86984ze extends CharacterStyle implements UpdateAppearance {
    public float A00 = -1.0f;
    public int A01 = Integer.MAX_VALUE;
    public Shader.TileMode A02 = Shader.TileMode.CLAMP;
    public String A03;
    public float A04 = -1.0f;
    public int A05;
    public Shader A06;
    public final Rect A07 = C86134wK.A0D();
    public final float[] A08;
    public final int[] A09;

    public final void updateDrawState(TextPaint textPaint) {
        LinearGradient linearGradient;
        String str = this.A03;
        int min = Math.min(this.A01, str.length());
        Rect rect = this.A07;
        textPaint.getTextBounds(str, 0, min, rect);
        int width = rect.width();
        if (!(width == this.A05 && this.A00 == this.A04)) {
            this.A05 = width;
            float f = this.A00;
            this.A04 = f;
            if (f != -1.0f) {
                float A012 = C86134wK.A01(width);
                linearGradient = new LinearGradient(f - A012, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f + A012, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A09, this.A08, this.A02);
            } else {
                linearGradient = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) width, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A09, this.A08, this.A02);
            }
            this.A06 = linearGradient;
        }
        Shader shader = this.A06;
        if (shader != null) {
            textPaint.setShader(shader);
        }
    }

    public C86984ze(CharSequence charSequence, float[] fArr, int[] iArr) {
        this.A09 = iArr;
        this.A08 = fArr;
        this.A03 = charSequence.toString();
    }
}
