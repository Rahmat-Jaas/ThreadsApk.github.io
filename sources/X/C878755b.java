package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.55b  reason: invalid class name and case insensitive filesystem */
public final class C878755b extends C003201n {
    public final /* synthetic */ Integer A00;
    public final /* synthetic */ boolean A01;

    public C878755b(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0L(view, accessibilityNodeInfoCompat);
        view.setLongClickable(this.A01);
        AnonymousClass7FY.A03(accessibilityNodeInfoCompat, this.A00);
    }
}
