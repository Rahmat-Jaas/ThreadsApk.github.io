package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.55i  reason: invalid class name and case insensitive filesystem */
public final class C879255i extends C003201n {
    public final void A0I(View view, AccessibilityEvent accessibilityEvent) {
        super.A0I(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(C18180wK.A1X(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int scrollRange;
        super.A0L(view, accessibilityNodeInfoCompat);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfoCompat.A0A(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfoCompat.A02.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.A08(C008103m.A0X);
                accessibilityNodeInfoCompat.A08(C008103m.A0d);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.A08(C008103m.A0Z);
                accessibilityNodeInfoCompat.A08(C008103m.A0Y);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r7 != 16908346) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0M(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = super.A0M(r6, r7, r8)
            r3 = 1
            if (r0 != 0) goto L_0x007d
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            boolean r0 = r6.isEnabled()
            r4 = 0
            if (r0 == 0) goto L_0x003e
            int r2 = r6.getHeight()
            android.graphics.Rect r1 = X.C86134wK.A0D()
            android.graphics.Matrix r0 = r6.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r6.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L_0x002c
            int r2 = r1.height()
        L_0x002c:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r7 == r0) goto L_0x003f
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r0) goto L_0x0057
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r7 == r0) goto L_0x0057
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r7 == r0) goto L_0x003f
        L_0x003e:
            return r4
        L_0x003f:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r1 = r6.getScrollY()
            int r1 = r1 + r2
            int r0 = r6.getScrollRange()
            int r2 = java.lang.Math.min(r1, r0)
            goto L_0x006a
        L_0x0057:
            int r0 = r6.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r6.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r6.getScrollY()
            int r0 = r0 - r2
            int r2 = java.lang.Math.max(r0, r4)
        L_0x006a:
            int r0 = r6.getScrollY()
            if (r2 == r0) goto L_0x003e
            int r0 = r6.getScrollX()
            int r1 = -r0
            int r0 = r6.getScrollY()
            int r2 = r2 - r0
            androidx.core.widget.NestedScrollView.A04(r6, r1, r2, r3)
        L_0x007d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879255i.A0M(android.view.View, int, android.os.Bundle):boolean");
    }
}
