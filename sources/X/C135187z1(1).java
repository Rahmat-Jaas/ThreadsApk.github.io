package X;

import android.view.View;

/* renamed from: X.7z1  reason: invalid class name and case insensitive filesystem */
public final class C135187z1 implements Runnable {
    public final /* synthetic */ View A00;

    public C135187z1(View view) {
        this.A00 = view;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            android.view.View r3 = r5.A00
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
        L_0x0007:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001f
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
        L_0x0011:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x001f
            android.view.View r0 = r3.getChildAt(r1)
            if (r0 == 0) goto L_0x0011
            r2.addFirst(r0)
            goto L_0x0011
        L_0x001f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009f
            java.lang.Object r3 = r2.removeFirst()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0007
            int r1 = r3.getImportantForAccessibility()
            r0 = 2
            if (r1 == r0) goto L_0x0007
            r4 = 4
            if (r1 == r4) goto L_0x0007
            android.view.ViewParent r1 = r3.getParent()
        L_0x003b:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x004d
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getImportantForAccessibility()
            if (r0 == r4) goto L_0x0007
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x003b
        L_0x004d:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = X.C86144wL.A0L()     // Catch:{  }
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A02     // Catch:{ IllegalArgumentException -> 0x0007 }
            r3.onInitializeAccessibilityNodeInfo(r1)     // Catch:{ IllegalArgumentException -> 0x0007 }
            boolean r0 = X.AnonymousClass7FX.A01(r3, r4)
            if (r0 == 0) goto L_0x0063
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x0063
            goto L_0x0007
        L_0x0063:
            boolean r0 = r1.isVisibleToUser()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0007
            boolean r0 = X.AnonymousClass7FX.A02(r3, r4)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x007c
            int r0 = r1.getChildCount()     // Catch:{ all -> 0x009d }
            if (r0 <= 0) goto L_0x00a0
            boolean r0 = X.AnonymousClass7FX.A03(r3, r4)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0007
            goto L_0x00a0
        L_0x007c:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = r1.getCollectionInfo()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0007
            java.lang.CharSequence r0 = r4.A03()     // Catch:{ all -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0096
            java.lang.CharSequence r0 = r1.getContentDescription()     // Catch:{ all -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0007
        L_0x0096:
            boolean r0 = X.AnonymousClass7FX.A00(r3)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0007
            goto L_0x00a0
        L_0x009d:
            r0 = move-exception
            throw r0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            X.AnonymousClass7JU.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135187z1.run():void");
    }
}
