package X;

import android.app.Activity;
import android.app.Service;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.09a  reason: invalid class name and case insensitive filesystem */
public final class C019409a {
    public static C019409a A09;
    public int A00;
    public C07190b4 A01;
    public C07200b5 A02;
    public WeakReference A03;
    public boolean A04;
    public final Object A05 = new Object();
    public final Object A06;
    public final List A07;
    public final WeakHashMap A08;

    public final synchronized int A02() {
        return ((WeakHashMap) this.A07.get(5)).size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.Object r8, java.lang.Integer r9) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            java.lang.Integer r4 = X.AnonymousClass006.A15     // Catch:{ all -> 0x00db }
            r5 = 1
            if (r9 == r4) goto L_0x0009
            r7.A04 = r5     // Catch:{ all -> 0x00db }
        L_0x0009:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x00db }
            if (r9 != r0) goto L_0x0014
            int r0 = r7.A00     // Catch:{ all -> 0x00db }
            int r0 = r0 + 1
        L_0x0011:
            r7.A00 = r0     // Catch:{ all -> 0x00db }
            goto L_0x001c
        L_0x0014:
            java.lang.Integer r0 = X.AnonymousClass006.A0j     // Catch:{ all -> 0x00db }
            if (r9 != r0) goto L_0x001c
            int r0 = r7.A00     // Catch:{ all -> 0x00db }
            int r0 = r0 - r5
            goto L_0x0011
        L_0x001c:
            if (r9 == r4) goto L_0x00a7
            java.lang.Integer r0 = X.AnonymousClass006.A1C     // Catch:{ all -> 0x00db }
            if (r9 == r0) goto L_0x00a7
            java.lang.ref.WeakReference r0 = r7.A03     // Catch:{ all -> 0x00d9 }
            r4 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x005a
            java.util.WeakHashMap r0 = r7.A08     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00d9 }
            X.09Z r0 = (X.AnonymousClass09Z) r0     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x005a
            java.lang.Integer r3 = r0.A00     // Catch:{ all -> 0x00d9 }
            r2 = 0
            if (r1 != r8) goto L_0x003d
            r2 = 1
        L_0x003d:
            int r1 = r9.compareTo(r3)     // Catch:{ all -> 0x00d9 }
            r0 = 0
            if (r1 >= 0) goto L_0x0045
            r0 = 1
        L_0x0045:
            if (r2 == 0) goto L_0x0057
            if (r0 != 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            java.lang.Object r0 = r7.A00(r3, r9, r8)     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0061
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x005f
        L_0x0057:
            if (r0 != 0) goto L_0x005a
            goto L_0x0061
        L_0x005a:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d9 }
            r1.<init>(r8)     // Catch:{ all -> 0x00d9 }
        L_0x005f:
            r7.A03 = r1     // Catch:{ all -> 0x00d9 }
        L_0x0061:
            java.util.WeakHashMap r3 = r7.A08     // Catch:{ all -> 0x00d9 }
            java.lang.Object r2 = r3.get(r8)     // Catch:{ all -> 0x00d9 }
            X.09Z r2 = (X.AnonymousClass09Z) r2     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x007c
            java.util.List r1 = r7.A07     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r0 = r2.A00     // Catch:{ all -> 0x00d9 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00d9 }
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0     // Catch:{ all -> 0x00d9 }
            r0.remove(r8)     // Catch:{ all -> 0x00d9 }
        L_0x007c:
            java.util.List r1 = r7.A07     // Catch:{ all -> 0x00d9 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00d9 }
            java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r7.A05     // Catch:{ all -> 0x00d9 }
            r1.put(r8, r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r0 = X.AnonymousClass006.A0Y     // Catch:{ all -> 0x00d9 }
            if (r9 != r0) goto L_0x0094
            if (r2 == 0) goto L_0x009e
            goto L_0x0097
        L_0x0094:
            if (r2 != 0) goto L_0x009b
            goto L_0x009e
        L_0x0097:
            r2.A03 = r4     // Catch:{ all -> 0x00d9 }
            r2.A04 = r4     // Catch:{ all -> 0x00d9 }
        L_0x009b:
            r2.A00 = r9     // Catch:{ all -> 0x00d9 }
            goto L_0x00a3
        L_0x009e:
            X.09Z r2 = new X.09Z     // Catch:{ all -> 0x00d9 }
            r2.<init>(r9)     // Catch:{ all -> 0x00d9 }
        L_0x00a3:
            r3.put(r8, r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d7
        L_0x00a7:
            r3 = 0
            java.lang.ref.WeakReference r0 = r7.A03     // Catch:{ all -> 0x00d9 }
            r2 = 0
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00d9 }
            if (r8 != r0) goto L_0x00b6
            r7.A03 = r2     // Catch:{ all -> 0x00d9 }
            r3 = 1
        L_0x00b6:
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r1 = X.AnonymousClass006.A01     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x00d9 }
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0     // Catch:{ all -> 0x00d9 }
            r0.remove(r8)     // Catch:{ all -> 0x00d9 }
            java.util.WeakHashMap r0 = r7.A08     // Catch:{ all -> 0x00d9 }
            r0.remove(r8)     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r1 = r7.A00(r1, r4, r2)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x00d7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            r7.A03 = r0     // Catch:{ all -> 0x00d9 }
        L_0x00d7:
            monitor-exit(r6)
            return
        L_0x00d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019409a.A03(java.lang.Object, java.lang.Integer):void");
    }

    private Object A00(Integer num, Integer num2, Object obj) {
        List list = this.A07;
        int intValue = num.intValue();
        AbstractMap abstractMap = (AbstractMap) list.get(intValue);
        Object obj2 = null;
        if (abstractMap.size() > 1) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                if (entry.getKey() != obj) {
                    return entry.getKey();
                }
            }
            return null;
        }
        int intValue2 = num2.intValue();
        int i = intValue + 1;
        if (intValue2 == i) {
            return null;
        }
        while (i < intValue2) {
            Iterator it = ((AbstractMap) list.get(i)).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (entry2.getKey() != obj) {
                    obj2 = entry2.getKey();
                    if (obj2 != null) {
                        return obj2;
                    }
                }
            }
            i++;
        }
        return obj2;
    }

    public static String A01(Object obj) {
        if ((obj instanceof Activity) || (obj instanceof Service)) {
            return obj.getClass().getSimpleName();
        }
        return obj.toString();
    }

    public C019409a() {
        this.A04 = false;
        this.A06 = new Object();
        this.A08 = new WeakHashMap();
        this.A07 = new ArrayList();
        this.A02 = null;
        this.A01 = null;
        for (Integer intValue : AnonymousClass006.A00(12)) {
            this.A07.add(intValue.intValue(), new WeakHashMap());
        }
    }
}
