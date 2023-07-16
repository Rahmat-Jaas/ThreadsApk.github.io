package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0n1  reason: invalid class name and case insensitive filesystem */
public final class C13110n1 implements AnonymousClass0h9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Layout.Alignment A02;
    public final /* synthetic */ TextPaint A03;
    public final /* synthetic */ String A04;

    public C13110n1(Layout.Alignment alignment, TextPaint textPaint, String str, int i, int i2) {
        this.A03 = textPaint;
        this.A04 = str;
        this.A01 = i;
        this.A02 = alignment;
        this.A00 = i2;
    }

    public final boolean ACi(float f) {
        TextPaint textPaint = this.A03;
        textPaint.setTextSize(f);
        if (new StaticLayout(this.A04, textPaint, this.A01, this.A02, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true).getLineCount() <= this.A00) {
            return true;
        }
        return false;
    }
}
