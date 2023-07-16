package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.04x  reason: invalid class name and case insensitive filesystem */
public final class C010704x implements LayoutInflater.Factory2 {
    public final C12560m7 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r14 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (r5 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r1 == -1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r5 = r4.A00.A0L(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r20, java.lang.String r21, android.content.Context r22, android.util.AttributeSet r23) {
        /*
            r19 = this;
            r8 = r20
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            r1 = r21
            boolean r0 = r0.equals(r1)
            r12 = r22
            r10 = r23
            r4 = r19
            if (r0 == 0) goto L_0x001e
            X.0m7 r1 = r4.A00
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>((android.content.Context) r12, (android.util.AttributeSet) r10, (X.C12560m7) r1)
            return r0
        L_0x001e:
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r1)
            r5 = 0
            if (r0 != 0) goto L_0x0028
            return r5
        L_0x0028:
            java.lang.String r0 = "class"
            java.lang.String r2 = r10.getAttributeValue(r5, r0)
            int[] r0 = X.AnonymousClass04K.A00
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r10, r0)
            if (r2 != 0) goto L_0x003b
            r0 = 0
            java.lang.String r2 = r1.getString(r0)
        L_0x003b:
            r11 = 1
            r3 = -1
            int r6 = r1.getResourceId(r11, r3)
            r9 = 2
            java.lang.String r14 = r1.getString(r9)
            r1.recycle()
            if (r2 == 0) goto L_0x0184
            java.lang.ClassLoader r13 = r12.getClassLoader()
            X.00x r0 = X.C010504v.A00     // Catch:{ ClassNotFoundException -> 0x0078 }
            java.lang.Object r7 = r0.get(r13)     // Catch:{ ClassNotFoundException -> 0x0078 }
            X.00x r7 = (X.C002000x) r7     // Catch:{ ClassNotFoundException -> 0x0078 }
            if (r7 != 0) goto L_0x0061
            X.00x r7 = new X.00x     // Catch:{ ClassNotFoundException -> 0x0078 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0078 }
            r0.put(r13, r7)     // Catch:{ ClassNotFoundException -> 0x0078 }
        L_0x0061:
            java.lang.Object r1 = r7.get(r2)     // Catch:{ ClassNotFoundException -> 0x0078 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ ClassNotFoundException -> 0x0078 }
            if (r1 != 0) goto L_0x0071
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r13)     // Catch:{ ClassNotFoundException -> 0x0078 }
            r7.put(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0078 }
        L_0x0071:
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0078 }
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            if (r0 == 0) goto L_0x0184
            if (r20 == 0) goto L_0x0097
            int r1 = r8.getId()
            if (r1 != r3) goto L_0x0098
            if (r6 != r3) goto L_0x0098
            if (r14 != 0) goto L_0x00a4
            java.lang.String r1 = r10.getPositionDescription()
            java.lang.String r0 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r1, r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r6 == r3) goto L_0x00a2
            X.0m7 r0 = r4.A00
            androidx.fragment.app.Fragment r5 = r0.A0L(r6)
            if (r5 != 0) goto L_0x00b4
        L_0x00a2:
            if (r14 == 0) goto L_0x00ac
        L_0x00a4:
            X.0m7 r0 = r4.A00
            androidx.fragment.app.Fragment r5 = r0.A0O(r14)
            if (r5 != 0) goto L_0x00b4
        L_0x00ac:
            if (r1 == r3) goto L_0x00b4
            X.0m7 r0 = r4.A00
            androidx.fragment.app.Fragment r5 = r0.A0L(r1)
        L_0x00b4:
            java.lang.String r7 = "Fragment "
            if (r5 != 0) goto L_0x013e
            X.0m7 r3 = r4.A00
            X.04v r5 = r3.A0P()
            java.lang.ClassLoader r0 = r12.getClassLoader()
            androidx.fragment.app.Fragment r5 = r5.A01(r0, r2)
            r5.mFromLayout = r11
            r0 = r1
            if (r6 == 0) goto L_0x00cc
            r0 = r6
        L_0x00cc:
            r5.mFragmentId = r0
            r5.mContainerId = r1
            r5.mTag = r14
            r5.mInLayout = r11
            r5.mFragmentManager = r3
            X.0Oi r0 = r3.A09
            r5.mHost = r0
            android.content.Context r1 = r0.A01
            android.os.Bundle r0 = r5.mSavedFragmentState
            r5.onInflate((android.content.Context) r1, (android.util.AttributeSet) r10, (android.os.Bundle) r0)
            X.05H r3 = r3.A0Q(r5)
        L_0x00e5:
            X.C12560m7.A0E(r9)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.0nr r10 = new X.0nr
            r10.<init>(r8, r5)
            r0 = 3
            X.C12560m7.A0E(r0)
            X.05s r9 = X.C012405t.A00(r5)
            java.util.Set r1 = r9.A01
            X.05o r0 = X.C012005o.DETECT_FRAGMENT_TAG_USAGE
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0112
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r10.getClass()
            boolean r0 = X.C012405t.A03(r9, r1, r0)
            if (r0 == 0) goto L_0x0112
            X.C012405t.A02(r9, r10)
        L_0x0112:
            r5.mContainer = r8
            r3.A05()
            r3.A02()
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x0158
            if (r6 == 0) goto L_0x0123
            r0.setId(r6)
        L_0x0123:
            android.view.View r0 = r5.mView
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x0130
            android.view.View r0 = r5.mView
            r0.setTag(r14)
        L_0x0130:
            android.view.View r2 = r5.mView
            r1 = 0
            com.facebook.redex.IDxCListenerShape200S0200000_I2 r0 = new com.facebook.redex.IDxCListenerShape200S0200000_I2
            r0.<init>(r1, r3, r4)
            r2.addOnAttachStateChangeListener(r0)
            android.view.View r0 = r5.mView
            return r0
        L_0x013e:
            boolean r0 = r5.mInLayout
            if (r0 != 0) goto L_0x0164
            r5.mInLayout = r11
            X.0m7 r3 = r4.A00
            r5.mFragmentManager = r3
            X.0Oi r0 = r3.A09
            r5.mHost = r0
            android.content.Context r1 = r0.A01
            android.os.Bundle r0 = r5.mSavedFragmentState
            r5.onInflate((android.content.Context) r1, (android.util.AttributeSet) r10, (android.os.Bundle) r0)
            X.05H r3 = r3.A0R(r5)
            goto L_0x00e5
        L_0x0158:
            java.lang.String r0 = " did not create a view."
            java.lang.String r1 = X.AnonymousClass00U.A0V(r7, r2, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0164:
            java.lang.String r10 = r10.getPositionDescription()
            java.lang.String r11 = ": Duplicate id 0x"
            java.lang.String r12 = java.lang.Integer.toHexString(r6)
            java.lang.String r13 = ", tag "
            java.lang.String r15 = ", or parent id 0x"
            java.lang.String r16 = java.lang.Integer.toHexString(r1)
            java.lang.String r17 = " with another fragment for "
            r18 = r2
            java.lang.String r1 = X.AnonymousClass00U.A0l(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0184:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010704x.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public C010704x(C12560m7 r1) {
        this.A00 = r1;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
