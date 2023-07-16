package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5C2  reason: invalid class name */
public final class AnonymousClass5C2 extends C39945L9e {
    public final /* synthetic */ AnonymousClass5C1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5C2(RecyclerView recyclerView, AnonymousClass5C1 r2) {
        super(recyclerView);
        this.A00 = r2;
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C003201n r0 = this.A00.A00;
        if (r0 != null) {
            r0.A0L(view, accessibilityNodeInfoCompat);
        }
        accessibilityNodeInfoCompat.A09(C008103m.A0d);
        accessibilityNodeInfoCompat.A09(C008103m.A0Y);
        accessibilityNodeInfoCompat.A09(C008103m.A0a);
        accessibilityNodeInfoCompat.A09(C008103m.A0b);
        accessibilityNodeInfoCompat.A09(C008103m.A0Z);
        accessibilityNodeInfoCompat.A09(C008103m.A0X);
        accessibilityNodeInfoCompat.A02.setScrollable(false);
    }
}
