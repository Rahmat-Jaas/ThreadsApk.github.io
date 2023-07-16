package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.55g  reason: invalid class name and case insensitive filesystem */
public final class C879155g extends C003201n {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C879155g(View view, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = num;
        this.A00 = view;
        this.A05 = z;
        this.A06 = z2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean A1Y = AnonymousClass0wJ.A1Y(view, accessibilityNodeInfoCompat);
        super.A0L(view, accessibilityNodeInfoCompat);
        AnonymousClass7FY.A03(accessibilityNodeInfoCompat, this.A01);
        this.A00.setSelected(this.A05);
        if (!this.A06) {
            String str = this.A02;
            if (str == null || str.length() == 0) {
                accessibilityNodeInfoCompat.A0G(A1Y);
                accessibilityNodeInfoCompat.A09(C008103m.A08);
            } else {
                C86154wM.A1K(accessibilityNodeInfoCompat, str);
            }
        }
        String str2 = this.A03;
        if (str2 != null) {
            accessibilityNodeInfoCompat.A02.setHintText(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            accessibilityNodeInfoCompat.A02.setText(str3);
        }
    }
}
