package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.55a  reason: invalid class name and case insensitive filesystem */
public final class C878655a extends C003201n {
    public final C127397h3 A00;

    public C878655a(C127397h3 r1) {
        this.A00 = r1;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0L(view, accessibilityNodeInfoCompat);
        C127397h3 r3 = this.A00;
        String A0o = C18230wP.A0o(r3);
        String A0B = C127397h3.A0B(r3);
        if (A0o != null) {
            accessibilityNodeInfoCompat.A0B(A0o);
        }
        C98916Hk.A00(view.getContext(), view, accessibilityNodeInfoCompat, A0B);
        String A0C = C127397h3.A0C(r3);
        if (A0C != null) {
            C86154wM.A1K(accessibilityNodeInfoCompat, A0C);
        }
        boolean A002 = AnonymousClass2LL.A00(C127397h3.A0A(r3, 42), false);
        boolean A003 = AnonymousClass2LL.A00(C127397h3.A0A(r3, 43), false);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo.setSelected(A002);
        accessibilityNodeInfo.setEnabled(!A003);
    }
}
