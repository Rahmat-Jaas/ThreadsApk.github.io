package X;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.55f  reason: invalid class name and case insensitive filesystem */
public final class C879055f extends C003201n {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Resources A02;
    public final /* synthetic */ boolean A03;

    public C879055f(Resources resources, int i, int i2, boolean z) {
        this.A03 = z;
        this.A02 = resources;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass0wJ.A1N(view, accessibilityNodeInfoCompat);
        super.A0L(view, accessibilityNodeInfoCompat);
        boolean z = this.A03;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo.setSelected(z);
        accessibilityNodeInfoCompat.A0C(view.getContext().getString(2131836536));
        accessibilityNodeInfo.setTooltipText(this.A02.getString(2131827953, C18210wN.A1Y(Integer.valueOf(this.A01), this.A00)));
    }
}
