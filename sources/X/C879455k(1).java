package X;

import android.graphics.Rect;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.55k  reason: invalid class name and case insensitive filesystem */
public abstract class C879455k extends C003201n {
    public static final Rect A09 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
    public static final C141868dL A0A = new AnonymousClass7ZY();
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public int A01 = Process.WAIT_RESULT_TIMEOUT;
    public C879755o A02;
    public final View A03;
    public final AccessibilityManager A04;
    public final Rect A05 = C86134wK.A0D();
    public final Rect A06 = C86134wK.A0D();
    public final Rect A07 = C86134wK.A0D();
    public final int[] A08 = new int[2];
    public int mHoveredVirtualViewId = Process.WAIT_RESULT_TIMEOUT;

    public static AccessibilityEvent A00(C879455k r4, int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        if (i != -1) {
            AccessibilityNodeInfoCompat A0R = r4.A0R(i);
            obtain.getText().add(A0R.A03());
            AccessibilityNodeInfo accessibilityNodeInfo = A0R.A02;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            r4.A0V(obtain, i);
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                View view = r4.A03;
                obtain.setSource(view, i);
                obtain.setPackageName(view.getContext().getPackageName());
                return obtain;
            }
            throw C18250wR.A0V("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        r4.A03.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final AccessibilityNodeInfoCompat A0R(int i) {
        if (i != -1) {
            return A01(i);
        }
        View view = this.A03;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0Y(A0v);
        if (accessibilityNodeInfo.getChildCount() <= 0 || A0v.size() <= 0) {
            int size = A0v.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfo.addChild(view, AnonymousClass0wJ.A04(A0v.get(i2)));
            }
            return accessibilityNodeInfoCompat;
        }
        throw C18250wR.A0V("Views cannot have both real and virtual children");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S() {
        /*
            r4 = this;
            r3 = 1
            android.view.accessibility.AccessibilityManager r0 = r4.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            android.view.View r2 = r4.A03
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0020
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            r2.onInitializeAccessibilityEvent(r0)
            r0.setContentChangeTypes(r3)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A0S():void");
    }

    public void A0U(int i, boolean z) {
    }

    public void A0W(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            A0T(i, 128);
            A0T(i2, 256);
        }
    }

    public C008703u A0P(View view) {
        C879755o r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C879755o r02 = new C879755o(this);
        this.A02 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r0 = r1.getOffsetForHorizontal(r1.getLineForVertical((int) r9), r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0Q(float r8, float r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass55u
            if (r0 == 0) goto L_0x0083
            r3 = r7
            X.55u r3 = (X.AnonymousClass55u) r3
            java.util.List r6 = r3.A03
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x012e
            android.view.View r1 = r3.A02
            r2 = r1
            X.8m1 r2 = (X.C146308m1) r2
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x012e
            int r0 = r2.getTotalPaddingLeft()
            float r0 = (float) r0
            float r8 = r8 - r0
            int r0 = r2.getTotalPaddingTop()
            float r0 = (float) r0
            float r9 = r9 - r0
            int r0 = r1.getScrollX()
            float r0 = (float) r0
            float r8 = r8 + r0
            int r0 = r1.getScrollY()
            float r0 = (float) r0
            float r9 = r9 + r0
            android.text.Layout r1 = r2.getLayout()
            if (r1 == 0) goto L_0x012b
            int r0 = (int) r9
            int r0 = r1.getLineForVertical(r0)
            int r0 = r1.getOffsetForHorizontal(r0, r8)
            android.text.style.ClickableSpan[] r3 = r3.A0d(r0, r0)
            if (r3 == 0) goto L_0x012b
            int r0 = r3.length
            if (r0 == 0) goto L_0x012b
            java.lang.CharSequence r2 = r2.getText()
            r0 = 23
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            android.text.Spanned r2 = (android.text.Spanned) r2
            r1 = 0
            r0 = r3[r1]
            int r4 = r2.getSpanStart(r0)
            r0 = r3[r1]
            int r3 = r2.getSpanEnd(r0)
            int r2 = r6.size()
            r5 = 0
        L_0x006d:
            if (r5 >= r2) goto L_0x012b
            java.lang.Object r1 = r6.get(r5)
            X.6mQ r1 = (X.C110876mQ) r1
            if (r1 == 0) goto L_0x0080
            int r0 = r1.A01
            if (r0 != r4) goto L_0x0080
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0080
        L_0x007f:
            return r5
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x006d
        L_0x0083:
            boolean r0 = r7 instanceof X.AnonymousClass55t
            if (r0 == 0) goto L_0x00b2
            r0 = r7
            X.55t r0 = (X.AnonymousClass55t) r0
            com.facebook.rendercore.text.RCTextView r6 = r0.A01
            java.lang.CharSequence r4 = r6.A07
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0130
            android.text.Spanned r4 = (android.text.Spanned) r4
            r5 = 0
        L_0x0095:
            android.text.style.ClickableSpan[] r1 = r6.A0A
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0130
            r0 = r1[r5]
            int r3 = r4.getSpanStart(r0)
            int r2 = r4.getSpanEnd(r0)
            int r1 = (int) r8
            int r0 = (int) r9
            int r0 = com.facebook.rendercore.text.RCTextView.A00(r6, r1, r0)
            if (r0 < r3) goto L_0x00af
            if (r0 > r2) goto L_0x00af
            return r5
        L_0x00af:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00b2:
            r4 = r7
            X.55v r4 = (X.AnonymousClass55v) r4
            X.6cI r0 = r4.A03
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x007f
            java.util.List r2 = r0.A00
            int r0 = r2.size()
            if (r0 == 0) goto L_0x007f
            android.view.View r3 = r4.A02
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x007f
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r0 = r3.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x007f
            android.text.Layout r1 = r3.getLayout()
            if (r1 == 0) goto L_0x007f
            int r0 = r3.getTotalPaddingLeft()
            float r0 = (float) r0
            float r8 = r8 - r0
            int r0 = r3.getTotalPaddingTop()
            float r0 = (float) r0
            float r9 = r9 - r0
            int r0 = r3.getScrollX()
            float r0 = (float) r0
            float r8 = r8 + r0
            int r0 = r3.getScrollY()
            float r0 = (float) r0
            float r9 = r9 + r0
            int r0 = (int) r9
            int r0 = r1.getLineForVertical(r0)
            int r1 = r1.getOffsetForHorizontal(r0, r8)
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object r1 = r4.A0d(r0, r1, r1)
            if (r1 == 0) goto L_0x007f
            java.lang.CharSequence r0 = r3.getText()
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r4 = r0.getSpanStart(r1)
            int r3 = r0.getSpanEnd(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0114:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r2.next()
            X.6kW r1 = (X.C109726kW) r1
            int r0 = r1.A02
            if (r0 != r4) goto L_0x0114
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0114
            int r5 = r1.A01
            return r5
        L_0x012b:
            int r5 = X.AnonymousClass55u.A04
            return r5
        L_0x012e:
            r5 = -1
            return r5
        L_0x0130:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A0Q(float, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r3.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r4, int r5) {
        /*
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x001b
            android.view.accessibility.AccessibilityManager r0 = r3.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x001b
            android.view.View r2 = r3.A03
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x001b
            android.view.accessibility.AccessibilityEvent r0 = A00(r3, r4, r5)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A0T(int, int):void");
    }

    public void A0V(AccessibilityEvent accessibilityEvent, int i) {
        C110876mQ r0;
        String str;
        if (this instanceof AnonymousClass55u) {
            AnonymousClass55u r02 = (AnonymousClass55u) this;
            if (i >= 0) {
                List list = r02.A03;
                if (i < list.size()) {
                    r0 = (C110876mQ) list.get(i);
                    String str2 = "";
                    if (!(r0 == null || (str = r0.A05) == null)) {
                        str2 = str;
                    }
                    accessibilityEvent.setContentDescription(str2);
                }
            }
            r0 = null;
            String str22 = "";
            str22 = str;
            accessibilityEvent.setContentDescription(str22);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r20, int r21) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1 instanceof X.AnonymousClass55u
            r8 = r20
            r2 = r21
            if (r0 == 0) goto L_0x00f4
            r3 = r1
            X.55u r3 = (X.AnonymousClass55u) r3
            r7 = 1
            if (r21 < 0) goto L_0x00f1
            java.util.List r1 = r3.A03
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00f1
            java.lang.Object r0 = r1.get(r2)
            X.6mQ r0 = (X.C110876mQ) r0
        L_0x001e:
            java.lang.String r11 = ""
            r6 = 0
            if (r0 != 0) goto L_0x0031
            r8.A0B(r11)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r7, r7)
        L_0x002b:
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A02
            r0.setBoundsInParent(r1)
        L_0x0030:
            return
        L_0x0031:
            boolean r1 = r0.A06
            r16 = 0
            android.view.View r15 = r3.A02
            if (r1 != 0) goto L_0x00e3
            r1 = r15
            X.8m1 r1 = (X.C146308m1) r1
            r17 = r1
            android.text.Layout r13 = r17.getLayout()
            if (r13 == 0) goto L_0x00e3
            android.graphics.Rect r5 = X.C86134wK.A0D()
            int r1 = r0.A01
            double r1 = (double) r1
            int r3 = r0.A00
            double r9 = (double) r3
            int r12 = (int) r1
            float r1 = r13.getPrimaryHorizontal(r12)
            double r3 = (double) r1
            android.graphics.Paint r2 = X.C86144wL.A0F()
            float r1 = r17.getTextSize()
            r2.setTextSize(r1)
            java.lang.String r1 = r0.A05
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r14 = (int) r1
            int r2 = r13.getLineForOffset(r12)
            int r1 = (int) r9
            int r1 = r13.getLineForOffset(r1)
            if (r2 == r1) goto L_0x0078
            r16 = 1
        L_0x0078:
            r13.getLineBounds(r2, r5)
            int r2 = r15.getScrollY()
            int r1 = r17.getTotalPaddingTop()
            int r2 = r2 + r1
            int r1 = r5.top
            int r1 = r1 + r2
            r5.top = r1
            int r1 = r5.bottom
            int r1 = r1 + r2
            r5.bottom = r1
            int r9 = r5.left
            int r1 = r17.getTotalPaddingLeft()
            double r1 = (double) r1
            double r3 = r3 + r1
            int r1 = r15.getScrollX()
            double r1 = (double) r1
            double r3 = r3 - r1
            int r1 = (int) r3
            int r9 = r9 + r1
            r5.left = r9
            int r3 = r5.top
            if (r16 == 0) goto L_0x00da
            int r2 = r5.right
            int r1 = r5.bottom
            android.graphics.Rect r1 = X.C86164wN.A0F(r9, r3, r2, r1)
        L_0x00ac:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b5
            r1.set(r6, r6, r7, r7)
        L_0x00b5:
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x00ba
            r11 = r2
        L_0x00ba:
            android.view.accessibility.AccessibilityNodeInfo r2 = r8.A02
            r2.setText(r11)
            r2.setBoundsInParent(r1)
            java.lang.Integer r1 = r0.A03
            X.AnonymousClass7FY.A03(r8, r1)
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0030
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0282
            r8.A0G(r6)
            X.03m r0 = X.C008103m.A08
            r8.A09(r0)
            return
        L_0x00da:
            int r2 = r9 + r14
            int r1 = r5.bottom
            android.graphics.Rect r1 = X.C86164wN.A0F(r9, r3, r2, r1)
            goto L_0x00ac
        L_0x00e3:
            int r3 = r15.getWidth()
            int r2 = r15.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r3, r2)
            goto L_0x00ac
        L_0x00f1:
            r0 = 0
            goto L_0x001e
        L_0x00f4:
            boolean r0 = r1 instanceof X.AnonymousClass55t
            if (r0 == 0) goto L_0x017c
            r0 = r1
            X.55t r0 = (X.AnonymousClass55t) r0
            com.facebook.rendercore.text.RCTextView r5 = r0.A01
            java.lang.CharSequence r11 = r5.A07
            android.text.Spanned r11 = (android.text.Spanned) r11
            android.graphics.Rect r10 = X.C86134wK.A0D()
            android.text.style.ClickableSpan[] r1 = r5.A0A
            if (r1 == 0) goto L_0x0286
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0286
            r6 = r1[r21]
            int r9 = r11.getSpanStart(r6)
            int r7 = r11.getSpanEnd(r6)
            android.text.Layout r0 = r5.A06
            int r1 = r0.getLineForOffset(r9)
            android.text.Layout r0 = r5.A06
            int r0 = r0.getLineForOffset(r7)
            android.graphics.Path r4 = X.C86144wL.A0G()
            android.graphics.RectF r3 = X.C86134wK.A0E()
            if (r1 != r0) goto L_0x0175
            r1 = r7
        L_0x012d:
            android.text.Layout r0 = r5.A06
            r0.getSelectionPath(r9, r1, r4)
            r2 = 1
            r4.computeBounds(r3, r2)
            float r1 = r5.A00
            float r0 = r5.A01
            r3.offset(r1, r0)
            r3.round(r10)
            android.view.accessibility.AccessibilityNodeInfo r1 = r8.A02
            r1.setBoundsInParent(r10)
            r8.A0G(r2)
            r1.setFocusable(r2)
            r1.setEnabled(r2)
            r1.setVisibleToUser(r2)
            java.lang.CharSequence r0 = r11.subSequence(r9, r7)
            r1.setText(r0)
            java.lang.String r0 = "android.widget.Button"
            r8.A0A(r0)
            boolean r0 = r6 instanceof X.C86994zf
            if (r0 == 0) goto L_0x0030
            X.4zf r6 = (X.C86994zf) r6
            java.lang.String r0 = r6.A00
            java.lang.String r2 = r6.A01
            if (r0 == 0) goto L_0x016c
            r8.A0B(r0)
        L_0x016c:
            android.content.Context r1 = r5.getContext()
            r0 = 0
            X.C98916Hk.A00(r1, r0, r8, r2)
            return
        L_0x0175:
            android.text.Layout r0 = r5.A06
            int r1 = r0.getLineVisibleEnd(r1)
            goto L_0x012d
        L_0x017c:
            r13 = r1
            X.55v r13 = (X.AnonymousClass55v) r13
            X.6cI r0 = r13.A03
            java.lang.String r15 = ""
            r14 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0278
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x018d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r9 = r1.next()
            X.6kW r9 = (X.C109726kW) r9
            int r0 = r9.A01
            if (r0 != r2) goto L_0x018d
            android.view.View r7 = r13.A02
            boolean r0 = r7 instanceof android.widget.TextView
            r17 = 0
            if (r0 != 0) goto L_0x01d9
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
        L_0x01ad:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r2, r0)
        L_0x01b2:
            java.lang.String r0 = r9.A03
            r8.A0B(r0)
            r0 = 16
            r8.A06(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A02
            r0.setBoundsInParent(r1)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131829647(0x7f11238f, float:1.929227E38)
            java.lang.String r0 = r1.getString(r0)
            r8.A0C(r0)
            X.69X r0 = X.AnonymousClass69X.A03
            java.lang.String r0 = X.AnonymousClass69X.A03(r0)
            r8.A0A(r0)
            return
        L_0x01d9:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r18 = r0
            android.text.Layout r11 = r18.getLayout()
            if (r11 != 0) goto L_0x01ed
            int r2 = r18.getWidth()
            int r0 = r18.getHeight()
            goto L_0x01ad
        L_0x01ed:
            int r0 = r9.A02
            double r4 = (double) r0
            int r0 = r9.A00
            double r2 = (double) r0
            int r12 = (int) r4
            int r10 = r11.getLineForOffset(r12)
            int r0 = r11.getLineEnd(r10)
            double r0 = (double) r0
            int r16 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x0278
            android.graphics.Rect r6 = X.C86134wK.A0D()
            float r0 = r11.getPrimaryHorizontal(r12)
            double r4 = (double) r0
            android.graphics.Paint r1 = X.C86144wL.A0F()
            int r14 = r9.A02
            int r12 = r9.A00
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r0 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object r0 = r13.A0d(r0, r14, r12)
            android.text.style.AbsoluteSizeSpan r0 = (android.text.style.AbsoluteSizeSpan) r0
            if (r0 == 0) goto L_0x0273
            int r0 = r0.getSize()
            float r0 = (float) r0
        L_0x0221:
            r1.setTextSize(r0)
            java.lang.String r0 = r9.A03
            float r0 = r1.measureText(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r12 = (int) r0
            int r0 = (int) r2
            int r0 = r11.getLineForOffset(r0)
            if (r10 == r0) goto L_0x0239
            r17 = 1
        L_0x0239:
            r11.getLineBounds(r10, r6)
            int r1 = r18.getScrollY()
            int r0 = r18.getTotalPaddingTop()
            int r1 = r1 + r0
            int r0 = r6.top
            int r0 = r0 + r1
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 + r1
            r6.bottom = r0
            int r0 = r6.left
            double r2 = (double) r0
            int r0 = r18.getTotalPaddingLeft()
            double r0 = (double) r0
            double r4 = r4 + r0
            int r0 = r18.getScrollX()
            double r0 = (double) r0
            double r4 = r4 - r0
            double r2 = r2 + r4
            int r4 = (int) r2
            r6.left = r4
            int r2 = r6.top
            if (r17 == 0) goto L_0x0270
            int r1 = r6.right
        L_0x0268:
            int r0 = r6.bottom
            android.graphics.Rect r1 = X.C86164wN.A0F(r4, r2, r1, r0)
            goto L_0x01b2
        L_0x0270:
            int r1 = r4 + r12
            goto L_0x0268
        L_0x0273:
            float r0 = r18.getTextSize()
            goto L_0x0221
        L_0x0278:
            r8.A0B(r15)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r14, r14)
            goto L_0x002b
        L_0x0282:
            X.C86154wM.A1K(r8, r1)
            return
        L_0x0286:
            java.lang.String r1 = ""
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A02
            r0.setText(r1)
            r0.setBoundsInParent(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A0X(androidx.core.view.accessibility.AccessibilityNodeInfoCompat, int):void");
    }

    public void A0Y(List list) {
        if (this instanceof AnonymousClass55u) {
            AnonymousClass55u r0 = (AnonymousClass55u) this;
            AnonymousClass55u.A01(r0);
            int size = r0.A03.size();
            for (int i = 0; i < size; i++) {
                C86144wL.A1V(list, i);
            }
        } else if (this instanceof AnonymousClass55t) {
            ClickableSpan[] clickableSpanArr = ((AnonymousClass55t) this).A01.A0A;
            if (clickableSpanArr != null) {
                int length = clickableSpanArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    C86144wL.A1V(list, i2);
                }
            }
        } else {
            C104736cI r2 = ((AnonymousClass55v) this).A03;
            if (r2 != null) {
                for (int i3 = 0; i3 < r2.A00.size(); i3++) {
                    C86144wL.A1V(list, i3);
                }
            }
        }
    }

    public final boolean A0Z(int i) {
        if (this.A01 != i) {
            return false;
        }
        this.A01 = Process.WAIT_RESULT_TIMEOUT;
        A0U(i, false);
        A0T(i, 8);
        return true;
    }

    public final boolean A0a(int i) {
        int i2;
        View view = this.A03;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A01) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A0Z(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.A01 = i;
                A0U(i, true);
                A0T(i, 8);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0b(int r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass55u
            if (r0 == 0) goto L_0x0048
            r4 = r5
            X.55u r4 = (X.AnonymousClass55u) r4
            r0 = 16
            if (r7 != r0) goto L_0x0048
            if (r6 < 0) goto L_0x0048
            java.util.List r1 = r4.A03
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x0048
            java.lang.Object r0 = r1.get(r6)
            X.6mQ r0 = (X.C110876mQ) r0
            if (r0 == 0) goto L_0x0048
            android.text.style.ClickableSpan r1 = r0.A02
            if (r1 == 0) goto L_0x0048
            android.view.View r0 = r4.A02
            r1.onClick(r0)
            r3 = 0
            android.view.accessibility.AccessibilityManager r0 = r4.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0043
            android.view.View r2 = r4.A03
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0043
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = A00(r4, r6, r0)
            r0.setContentChangeTypes(r3)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x0043:
            r0 = 1
            r4.A0T(r6, r0)
            return r0
        L_0x0048:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A0b(int, int, android.os.Bundle):boolean");
    }

    public final boolean A0c(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.A04;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A0Q = A0Q(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(A0Q);
            if (A0Q != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        } else {
            updateHoveredVirtualView(Process.WAIT_RESULT_TIMEOUT);
            return true;
        }
    }

    public C879455k(View view) {
        this.A03 = view;
        this.A04 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private AccessibilityNodeInfoCompat A01(int i) {
        boolean z;
        AccessibilityNodeInfoCompat A0L = C86144wL.A0L();
        AccessibilityNodeInfo accessibilityNodeInfo = A0L.A02;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        A0L.A0A("android.view.View");
        Rect rect = A09;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A03;
        A0L.A07(view);
        A0X(A0L, i);
        if (A0L.A03() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw C18250wR.A0V("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A05;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) == 0) {
                int i2 = 128;
                if ((actions & 128) == 0) {
                    accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                    A0L.A01 = i;
                    accessibilityNodeInfo.setSource(view, i);
                    if (this.A00 == i) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        i2 = 64;
                    }
                    A0L.A06(i2);
                    if (this.A01 == i) {
                        z = true;
                        A0L.A06(2);
                    } else {
                        z = false;
                        if (accessibilityNodeInfo.isFocusable()) {
                            A0L.A06(1);
                        }
                    }
                    accessibilityNodeInfo.setFocused(z);
                    int[] iArr = this.A08;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.A06;
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        accessibilityNodeInfo.getBoundsInParent(rect3);
                        if (A0L.A00 != -1) {
                            AccessibilityNodeInfoCompat A0L2 = C86144wL.A0L();
                            for (int i3 = A0L.A00; i3 != -1; i3 = A0L2.A00) {
                                A0L2.A00 = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo2 = A0L2.A02;
                                accessibilityNodeInfo2.setParent(view, -1);
                                accessibilityNodeInfo2.setBoundsInParent(rect);
                                A0X(A0L2, i3);
                                accessibilityNodeInfo2.getBoundsInParent(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.A07;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            accessibilityNodeInfo.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return A0L;
                }
                throw C18250wR.A0V("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw C18250wR.A0V("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw C18250wR.A0V("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016c, code lost:
        if (r0 < r1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0192, code lost:
        if (r0 >= 0) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.graphics.Rect r13, X.C879455k r14, int r15) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            r14.A0Y(r3)
            X.00y r6 = new X.00y
            r6.<init>()
            r2 = 0
        L_0x000d:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x002d
            java.lang.Object r0 = r3.get(r2)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r14.A01(r0)
            java.lang.Object r0 = r3.get(r2)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r6.A07(r0, r1)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x002d:
            int r0 = r14.A01
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r7) goto L_0x0051
            r8 = 0
        L_0x0034:
            r9 = 1
            if (r15 == r9) goto L_0x0138
            r0 = 2
            if (r15 == r0) goto L_0x0138
            r0 = 17
            if (r15 == r0) goto L_0x0056
            r0 = 33
            if (r15 == r0) goto L_0x0056
            r0 = 66
            if (r15 == r0) goto L_0x0056
            r0 = 130(0x82, float:1.82E-43)
            if (r15 == r0) goto L_0x0056
            java.lang.String r0 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0051:
            java.lang.Object r8 = r6.A04(r0)
            goto L_0x0034
        L_0x0056:
            android.graphics.Rect r5 = X.C86134wK.A0D()
            int r0 = r14.A01
            if (r0 == r7) goto L_0x00f3
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r14.A0R(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r0.getBoundsInParent(r5)
        L_0x0067:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r5)
            r0 = 17
            r3 = 0
            if (r15 == r0) goto L_0x00e1
            r0 = 33
            if (r15 == r0) goto L_0x00da
            r0 = 66
            if (r15 == r0) goto L_0x00e8
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x012a
            int r0 = r5.height()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x0084:
            r4.offset(r3, r0)
        L_0x0087:
            r13 = 0
            int r12 = r6.A01()
            android.graphics.Rect r11 = X.C86134wK.A0D()
        L_0x0090:
            if (r3 >= r12) goto L_0x0172
            java.lang.Object r10 = r6.A05(r3)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r10 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r10
            if (r10 == r8) goto L_0x00d7
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A02
            r0.getBoundsInParent(r11)
            boolean r0 = X.C121677Hj.A02(r5, r11, r15)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = X.C121677Hj.A02(r5, r4, r15)
            if (r0 == 0) goto L_0x00d3
            boolean r0 = X.C121677Hj.A04(r5, r11, r4, r15)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = X.C121677Hj.A04(r5, r4, r11, r15)
            if (r0 != 0) goto L_0x00d7
            int r1 = X.C121677Hj.A00(r5, r11, r15)
            int r0 = X.C121677Hj.A01(r5, r11, r15)
            int r9 = r1 * 13
            int r9 = r9 * r1
            int r0 = r0 * r0
            int r9 = r9 + r0
            int r2 = X.C121677Hj.A00(r5, r4, r15)
            int r1 = X.C121677Hj.A01(r5, r4, r15)
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r1 * r1
            int r0 = r0 + r1
            if (r9 >= r0) goto L_0x00d7
        L_0x00d3:
            r4.set(r11)
            r13 = r10
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x0090
        L_0x00da:
            int r0 = r5.height()
            int r0 = r0 + 1
            goto L_0x0084
        L_0x00e1:
            int r0 = r5.width()
            int r0 = r0 + 1
            goto L_0x00ef
        L_0x00e8:
            int r0 = r5.width()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x00ef:
            r4.offset(r0, r3)
            goto L_0x0087
        L_0x00f3:
            if (r13 == 0) goto L_0x00fa
            r5.set(r13)
            goto L_0x0067
        L_0x00fa:
            android.view.View r0 = r14.A03
            int r4 = r0.getWidth()
            int r3 = r0.getHeight()
            r0 = 17
            r2 = 0
            if (r15 == r0) goto L_0x0125
            r0 = 33
            if (r15 == r0) goto L_0x0120
            r0 = 66
            r1 = -1
            if (r15 == r0) goto L_0x011b
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0131
            r5.set(r2, r1, r4, r1)
            goto L_0x0067
        L_0x011b:
            r5.set(r1, r2, r1, r3)
            goto L_0x0067
        L_0x0120:
            r5.set(r2, r3, r4, r3)
            goto L_0x0067
        L_0x0125:
            r5.set(r4, r2, r4, r3)
            goto L_0x0067
        L_0x012a:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0131:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0138:
            android.view.View r0 = r14.A03
            int r0 = r0.getLayoutDirection()
            boolean r5 = X.AnonymousClass0wJ.A1T(r0, r9)
            X.8dL r4 = A0A
            int r3 = r6.A01()
            java.util.ArrayList r2 = X.C18240wQ.A0k(r3)
            r1 = 0
        L_0x014d:
            if (r1 >= r3) goto L_0x0159
            java.lang.Object r0 = r6.A05(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x014d
        L_0x0159:
            X.83k r0 = new X.83k
            r0.<init>(r4, r5)
            java.util.Collections.sort(r2, r0)
            if (r15 == r9) goto L_0x0186
            int r1 = r2.size()
            if (r8 != 0) goto L_0x0181
            r0 = -1
        L_0x016a:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x017c
        L_0x016e:
            java.lang.Object r13 = r2.get(r0)
        L_0x0172:
            if (r13 == 0) goto L_0x017c
            int r0 = r6.A03(r13)
            int r7 = r6.A02(r0)
        L_0x017c:
            boolean r0 = r14.A0a(r7)
            return r0
        L_0x0181:
            int r0 = r2.lastIndexOf(r8)
            goto L_0x016a
        L_0x0186:
            int r0 = r2.size()
            if (r8 == 0) goto L_0x0190
            int r0 = r2.indexOf(r8)
        L_0x0190:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x017c
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879455k.A02(android.graphics.Rect, X.55k, int):boolean");
    }

    public void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0L(view, accessibilityNodeInfoCompat);
        A0W(accessibilityNodeInfoCompat);
    }
}
