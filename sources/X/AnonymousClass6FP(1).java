package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6FP  reason: invalid class name */
public final class AnonymousClass6FP {
    public static BoringLayout A00(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2, boolean z) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, metrics, z, truncateAt, i2, true);
    }
}
