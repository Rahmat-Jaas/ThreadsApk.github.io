package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.01n  reason: invalid class name and case insensitive filesystem */
public class C003201n {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public void A0H(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A0I(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0J(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A0K(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.A01.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.A02);
    }

    public boolean A0N(View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0O(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public C008703u A0P(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A01.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C008703u(accessibilityNodeProvider);
        }
        return null;
    }

    public C003201n(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new C003001l(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131307874(0x7f092d62, float:1.8233988E38)
            java.lang.Object r3 = r7.getTag(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x000f
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x000f:
            r2 = 0
        L_0x0010:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x005f
            java.lang.Object r1 = r3.get(r2)
            X.03m r1 = (X.C008103m) r1
            java.lang.Object r0 = r1.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            int r0 = r0.getId()
            if (r0 != r8) goto L_0x0031
            X.03z r5 = r1.A01
            r2 = 0
            if (r5 == 0) goto L_0x005f
            r4 = 0
            java.lang.Class r3 = r1.A02
            if (r3 == 0) goto L_0x0059
            goto L_0x0034
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0049 }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0049 }
            X.03y r0 = (X.C008903y) r0     // Catch:{ Exception -> 0x0049 }
            r0.A00 = r9     // Catch:{ Exception -> 0x0046 }
            r4 = r0
            goto L_0x0059
        L_0x0046:
            r2 = move-exception
            r4 = r0
            goto L_0x004a
        L_0x0049:
            r2 = move-exception
        L_0x004a:
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "A11yActionCompat"
            android.util.Log.e(r0, r1, r2)
        L_0x0059:
            boolean r1 = r5.CWW(r7, r4)
            if (r1 != 0) goto L_0x00be
        L_0x005f:
            android.view.View$AccessibilityDelegate r0 = r6.A01
            boolean r1 = r0.performAccessibilityAction(r7, r8, r9)
            if (r1 != 0) goto L_0x00be
            r0 = 2131296303(0x7f09002f, float:1.8210519E38)
            if (r8 != r0) goto L_0x00be
            if (r9 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r9.getInt(r0, r1)
            r0 = 2131307875(0x7f092d63, float:1.823399E38)
            java.lang.Object r0 = r7.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r4 = r0.get()
            android.text.style.ClickableSpan r4 = (android.text.style.ClickableSpan) r4
            r3 = 0
            if (r4 == 0) goto L_0x00c2
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00c2
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r3, r1, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            r1 = 0
            if (r2 == 0) goto L_0x00c2
        L_0x00af:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x00c2
            r0 = r2[r1]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r4.onClick(r7)
            r1 = 1
        L_0x00be:
            return r1
        L_0x00bf:
            int r1 = r1 + 1
            goto L_0x00af
        L_0x00c2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003201n.A0M(android.view.View, int, android.os.Bundle):boolean");
    }

    public C003201n() {
        this(A02);
    }
}
