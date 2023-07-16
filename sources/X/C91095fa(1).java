package X;

import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.5fa  reason: invalid class name and case insensitive filesystem */
public final class C91095fa extends RCTextView {
    public AnonymousClass75U A00;

    public final float getSpanXPadding() {
        AnonymousClass75U r0 = this.A00;
        if (r0 != null) {
            return r0.A00;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float getSpanYPadding() {
        AnonymousClass75U r0 = this.A00;
        if (r0 != null) {
            return r0.A01;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public C91095fa(Context context) {
        super(context);
    }

    public final void setController(AnonymousClass75U r1) {
        this.A00 = r1;
    }
}
