package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.55e  reason: invalid class name and case insensitive filesystem */
public final class C878955e extends C003201n {
    public final /* synthetic */ Boolean A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C878955e(Boolean bool, Integer num, String str, String str2) {
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean A1Y = AnonymousClass0wJ.A1Y(view, accessibilityNodeInfoCompat);
        super.A0L(view, accessibilityNodeInfoCompat);
        AnonymousClass7FY.A03(accessibilityNodeInfoCompat, this.A01);
        accessibilityNodeInfoCompat.A0G(A1Y);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo.setLongClickable(A1Y);
        accessibilityNodeInfoCompat.A09(C008103m.A08);
        accessibilityNodeInfoCompat.A09(C008103m.A0L);
        String str = this.A02;
        if (str != null) {
            accessibilityNodeInfo.setHintText(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            accessibilityNodeInfo.setText(str2);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            accessibilityNodeInfo.setHeading(bool.booleanValue());
        }
    }
}
