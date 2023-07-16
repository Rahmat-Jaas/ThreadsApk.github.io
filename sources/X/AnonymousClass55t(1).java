package X;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.55t  reason: invalid class name */
public final class AnonymousClass55t extends C879455k {
    public C003201n A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55t(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public final void A0J(View view, AccessibilityEvent accessibilityEvent) {
        super.A0J(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A07)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0L(view, accessibilityNodeInfoCompat);
        CharSequence A012 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A012)) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
            accessibilityNodeInfo.setText(A012);
            accessibilityNodeInfoCompat.A06(256);
            accessibilityNodeInfoCompat.A06(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfoCompat.A06(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        }
        C003201n r0 = this.A00;
        if (r0 != null) {
            r0.A0L(view, accessibilityNodeInfoCompat);
        }
    }
}
