package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.093  reason: invalid class name */
public final class AnonymousClass093 implements AnonymousClass0F4 {
    public final AnonymousClass01Q A00;
    public final AnonymousClass012 A01;
    public final Map A02;
    public final AnonymousClass0F0 A03;

    public final void A6m(C03170Es r4, AnonymousClass012 r5) {
        AnonymousClass0F5 r1;
        synchronized (this) {
            Map map = this.A02;
            r1 = (AnonymousClass0F5) map.get(r5);
            if (r1 == null) {
                r1 = new AnonymousClass0F5();
                map.put(r5, r1);
            }
        }
        synchronized (r1) {
            r1.A00 = null;
            r1.A01.add(r4);
        }
    }

    public final boolean BhS() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c A[Catch:{ Exception -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0122 A[Catch:{ Exception -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132 A[Catch:{ Exception -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0145 A[Catch:{ Exception -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C03170Es[] AV3(android.os.Parcelable r19, X.AnonymousClass01Q r20, X.C04650On r21) {
        /*
            r18 = this;
            r9 = r19
            r9.getClass()
            r4 = r18
            X.0F0 r8 = r4.A03
            r7 = 1
            r2 = 0
            r5 = r20
            java.lang.reflect.Method r1 = r8.A07     // Catch:{ Exception -> 0x0162 }
            r1.getClass()     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r6 = r1.invoke(r9, r0)     // Catch:{ Exception -> 0x0162 }
            if (r6 != 0) goto L_0x001e
            X.012 r2 = X.AnonymousClass012.A08     // Catch:{ Exception -> 0x0162 }
            goto L_0x0178
        L_0x001e:
            java.lang.reflect.Method r1 = r8.A05     // Catch:{ Exception -> 0x0162 }
            r1.getClass()     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r13 = r1.invoke(r6, r0)     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ Exception -> 0x0162 }
            if (r13 == 0) goto L_0x015a
            int r10 = r13.intValue()     // Catch:{ Exception -> 0x0162 }
            X.0If r11 = r8.A0B     // Catch:{ Exception -> 0x0162 }
            android.util.SparseArray r3 = X.AnonymousClass04A.A06     // Catch:{ Exception -> 0x0162 }
            if (r3 != 0) goto L_0x00f9
            X.04A[] r12 = X.AnonymousClass04A.A09     // Catch:{ Exception -> 0x0162 }
            if (r12 != 0) goto L_0x009c
            X.04A[] r17 = X.AnonymousClass04A.values()     // Catch:{ Exception -> 0x0162 }
            int r14 = X.AnonymousClass04A.A05     // Catch:{ Exception -> 0x0162 }
            if (r14 >= 0) goto L_0x0052
            X.04A[] r0 = X.AnonymousClass04A.values()     // Catch:{ Exception -> 0x0162 }
            int r14 = r0.length     // Catch:{ Exception -> 0x0162 }
            r0 = 1
            int r14 = r14 - r7
            if (r14 >= 0) goto L_0x004d
            r0 = 0
        L_0x004d:
            X.AnonymousClass0KW.A04(r0)     // Catch:{ Exception -> 0x0162 }
            X.AnonymousClass04A.A05 = r14     // Catch:{ Exception -> 0x0162 }
        L_0x0052:
            X.04A[] r12 = new X.AnonymousClass04A[r14]     // Catch:{ Exception -> 0x0162 }
            X.04A r1 = X.AnonymousClass04A.A0K     // Catch:{ Exception -> 0x0162 }
            r0 = r17[r2]     // Catch:{ Exception -> 0x0162 }
            boolean r2 = r1.equals(r0)     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x0162 }
        L_0x0062:
            java.lang.String r0 = "First item in AospActivityLifecycleItemInfo must be UNDEFINED. Got %s instead."
            X.AnonymousClass0KW.A01(r1, r0, r2)     // Catch:{ Exception -> 0x0162 }
            goto L_0x006b
        L_0x0068:
            java.lang.String r1 = "<null>"
            goto L_0x0062
        L_0x006b:
            r3 = 0
        L_0x006c:
            if (r3 >= r14) goto L_0x009a
            int r16 = r3 + 1
            r2 = r17[r16]     // Catch:{ Exception -> 0x0162 }
            int r0 = r2.A02     // Catch:{ Exception -> 0x0162 }
            r15 = 0
            if (r3 != r0) goto L_0x0078
            r15 = 1
        L_0x0078:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0162 }
            int r0 = r2.A02     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "AospActivityLifecycleItemInfo: Index %d must equal expected lifecycle num %d"
            if (r15 == 0) goto L_0x008f
            r12[r3] = r2     // Catch:{ Exception -> 0x0162 }
            r3 = r16
            goto L_0x006c
        L_0x008f:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x0162 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0162 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0161
        L_0x009a:
            X.AnonymousClass04A.A09 = r12     // Catch:{ Exception -> 0x0162 }
        L_0x009c:
            if (r10 < 0) goto L_0x00ba
            int r0 = r12.length     // Catch:{ Exception -> 0x0162 }
            if (r10 >= r0) goto L_0x00ba
            r12 = r12[r10]     // Catch:{ Exception -> 0x0162 }
            int r0 = r12.A00(r11)     // Catch:{ Exception -> 0x0162 }
            if (r0 == r10) goto L_0x011a
            X.0K9 r2 = X.AnonymousClass04A.A0A     // Catch:{ Exception -> 0x0162 }
            java.lang.String r1 = r12.name()     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r13, r0}     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "This platform has different AospActivityLifecycleItemInfo val for %s (expected: %d actual: %d)"
            goto L_0x00c2
        L_0x00ba:
            X.0K9 r2 = X.AnonymousClass04A.A0A     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r1 = new java.lang.Object[]{r13}     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "This platform cannot find AospActivityLifecycleItemInfo with lifecycle num: %d"
        L_0x00c2:
            r2.A07(r0, r1)     // Catch:{ Exception -> 0x0162 }
            android.util.SparseArray r3 = X.AnonymousClass04A.A06     // Catch:{ Exception -> 0x0162 }
            if (r3 != 0) goto L_0x00f9
            X.04A[] r13 = X.AnonymousClass04A.values()     // Catch:{ Exception -> 0x0162 }
            int r12 = X.AnonymousClass04A.A05     // Catch:{ Exception -> 0x0162 }
            if (r12 >= 0) goto L_0x00e0
            X.04A[] r0 = X.AnonymousClass04A.values()     // Catch:{ Exception -> 0x0162 }
            int r12 = r0.length     // Catch:{ Exception -> 0x0162 }
            r0 = 1
            int r12 = r12 - r7
            if (r12 >= 0) goto L_0x00db
            r0 = 0
        L_0x00db:
            X.AnonymousClass0KW.A04(r0)     // Catch:{ Exception -> 0x0162 }
            X.AnonymousClass04A.A05 = r12     // Catch:{ Exception -> 0x0162 }
        L_0x00e0:
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ Exception -> 0x0162 }
            r3.<init>(r12)     // Catch:{ Exception -> 0x0162 }
            r2 = 0
        L_0x00e6:
            if (r2 >= r12) goto L_0x00f4
            int r2 = r2 + 1
            r1 = r13[r2]     // Catch:{ Exception -> 0x0162 }
            int r0 = r1.A00(r11)     // Catch:{ Exception -> 0x0162 }
            r3.put(r0, r1)     // Catch:{ Exception -> 0x0162 }
            goto L_0x00e6
        L_0x00f4:
            X.AnonymousClass04A.A06 = r3     // Catch:{ Exception -> 0x0162 }
            r0 = 0
            X.AnonymousClass04A.A09 = r0     // Catch:{ Exception -> 0x0162 }
        L_0x00f9:
            java.lang.Object r12 = r3.get(r10)     // Catch:{ Exception -> 0x0162 }
            X.04A r12 = (X.AnonymousClass04A) r12     // Catch:{ Exception -> 0x0162 }
            if (r12 != 0) goto L_0x011a
            X.012 r2 = X.AnonymousClass012.A08     // Catch:{ Exception -> 0x0162 }
        L_0x0103:
            X.0F2 r3 = r8.A0A     // Catch:{ Exception -> 0x0162 }
            int r0 = r2.ordinal()     // Catch:{ Exception -> 0x0162 }
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0132;
                case 2: goto L_0x0132;
                case 3: goto L_0x0132;
                case 4: goto L_0x0145;
                case 5: goto L_0x0132;
                case 6: goto L_0x0132;
                case 7: goto L_0x0132;
                default: goto L_0x010c;
            }     // Catch:{ Exception -> 0x0162 }
        L_0x010c:
            X.0K9 r3 = X.AnonymousClass0F2.A02     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "Do not know how to process the given client transaction state state %s"
            r3.A07(r0, r1)     // Catch:{ Exception -> 0x0162 }
            X.012 r2 = X.AnonymousClass012.A08     // Catch:{ Exception -> 0x0162 }
            goto L_0x0178
        L_0x011a:
            X.012[] r10 = X.AnonymousClass012.values()     // Catch:{ Exception -> 0x0162 }
            int r3 = r10.length     // Catch:{ Exception -> 0x0162 }
            r1 = 0
        L_0x0120:
            if (r1 >= r3) goto L_0x012f
            r2 = r10[r1]     // Catch:{ Exception -> 0x0162 }
            X.04A r0 = r2.A00     // Catch:{ Exception -> 0x0162 }
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x0162 }
            if (r0 != 0) goto L_0x0103
            int r1 = r1 + 1
            goto L_0x0120
        L_0x012f:
            X.012 r2 = X.AnonymousClass012.A08     // Catch:{ Exception -> 0x0162 }
            goto L_0x0103
        L_0x0132:
            X.0If r1 = r3.A01     // Catch:{ Exception -> 0x0162 }
            X.0Eu r0 = r3.A00     // Catch:{ Exception -> 0x0162 }
            X.0QU r10 = new X.0QU     // Catch:{ Exception -> 0x0162 }
            r14 = r0
            r15 = r8
            r16 = r1
            r17 = r6
            r11 = r9
            r12 = r5
            r13 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0153
        L_0x0145:
            X.0If r1 = r3.A01     // Catch:{ Exception -> 0x0162 }
            X.0Eu r0 = r3.A00     // Catch:{ Exception -> 0x0162 }
            X.0QT r10 = new X.0QT     // Catch:{ Exception -> 0x0162 }
            r11 = r9
            r12 = r0
            r13 = r8
            r14 = r1
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0162 }
        L_0x0153:
            r0 = r21
            r0.A00 = r10     // Catch:{ Exception -> 0x0162 }
            r0.A03 = r7     // Catch:{ Exception -> 0x0162 }
            goto L_0x0178
        L_0x015a:
            java.lang.String r0 = "null cannot be int"
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x0162 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0162 }
        L_0x0161:
            throw r1     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            r3 = move-exception
            X.0K9 r2 = X.AnonymousClass0F0.A0D
            int r0 = r5.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "For code val %d, could not get activity lifecycle state from the client transaction. Code: %s"
            r2.A0B(r3, r0, r1)
            X.012 r2 = X.AnonymousClass012.A08
        L_0x0178:
            r3 = 0
            X.012 r0 = X.AnonymousClass012.A08
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01b0
            r1 = r4
            monitor-enter(r1)
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x01ad }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x01ad }
            X.0F5 r2 = (X.AnonymousClass0F5) r2     // Catch:{ all -> 0x01ad }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x01b0
            X.0Es[] r0 = r2.A00
            if (r0 != 0) goto L_0x01ac
            monitor-enter(r2)
            java.util.List r1 = r2.A01     // Catch:{ all -> 0x01a9 }
            int r0 = r1.size()     // Catch:{ all -> 0x01a9 }
            if (r0 != 0) goto L_0x019d
            r0 = 0
            goto L_0x01a7
        L_0x019d:
            X.0Es[] r0 = new X.C03170Es[r0]     // Catch:{ all -> 0x01a9 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x01a9 }
            X.0Es[] r0 = (X.C03170Es[]) r0     // Catch:{ all -> 0x01a9 }
            r2.A00 = r0     // Catch:{ all -> 0x01a9 }
        L_0x01a7:
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            return r0
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            throw r0
        L_0x01ac:
            return r0
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01b0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass093.AV3(android.os.Parcelable, X.01Q, X.0On):X.0Es[]");
    }

    public AnonymousClass093(AnonymousClass01Q r4, AnonymousClass012 r5, AnonymousClass0F0 r6, String str) {
        this.A01 = r5;
        this.A00 = r4;
        Object[] objArr = {str, r4};
        if (r4.A08) {
            this.A03 = r6;
            int i = AnonymousClass012.A04;
            if (i < 0) {
                i = AnonymousClass012.values().length - 1;
                AnonymousClass012.A04 = i;
            }
            this.A02 = new HashMap(i);
            return;
        }
        throw new IllegalStateException(StringFormatUtil.formatStrLocaleSafe("%s code must use schedule transaction %s", objArr));
    }

    public final AnonymousClass01Q AXy() {
        return this.A00;
    }

    public final AnonymousClass012 Arx() {
        return this.A01;
    }
}
