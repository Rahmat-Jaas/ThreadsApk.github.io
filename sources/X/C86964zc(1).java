package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Pair;

/* renamed from: X.4zc  reason: invalid class name and case insensitive filesystem */
public final class C86964zc extends CharacterStyle implements UpdateAppearance {
    public long A00 = AnonymousClass7JK.A01;
    public Pair A01;
    public final float A02;
    public final C876753r A03;

    public C86964zc(C876753r r3, float f) {
        C04220Ms.A0B(r3, 1);
        this.A03 = r3;
        this.A02 = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        Shader A012;
        C04220Ms.A0B(textPaint, 0);
        float f = this.A02;
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(AnonymousClass8bA.A03(AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f), (float) 255));
        }
        long j = this.A00;
        if (j != AnonymousClass7JK.A01) {
            Pair pair = this.A01;
            if (pair == null || ((AnonymousClass7JK) pair.A00).A00 != j) {
                A012 = this.A03.A01(j);
            } else {
                A012 = (Shader) pair.A01;
            }
            textPaint.setShader(A012);
            this.A01 = C18180wK.A0p(new AnonymousClass7JK(this.A00), A012);
        }
    }
}
