package com.facebookpay.widget.accessibility;

import X.AnonymousClass55u;
import X.C006702y;
import X.C04220Ms;
import X.C110876mQ;
import X.C146308m1;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AccessibleTextView extends TextView implements C146308m1 {
    public final AnonymousClass55u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        AnonymousClass55u r2 = new AnonymousClass55u(this);
        this.A00 = r2;
        AnonymousClass55u.A04 = -1;
        r2.A00 = false;
        C006702y.A0C(this, r2);
    }

    public final void A00(String str) {
        AnonymousClass55u r0 = this.A00;
        AnonymousClass55u.A01(r0);
        List list = r0.A03;
        if (0 < list.size()) {
            ((C110876mQ) list.get(0)).A04 = str;
        }
    }

    public float getTextSize() {
        Layout layout = getLayout();
        if (layout == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float textSize = layout.getPaint().getTextSize();
        if (textSize > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return textSize;
        }
        throw C18180wK.A0a("Check failed.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ AccessibleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
