package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Y9  reason: invalid class name */
public final class AnonymousClass0Y9 implements AnonymousClass0O9 {
    public final Map A00 = Collections.synchronizedMap(new HashMap());
    public final Map A01 = Collections.synchronizedMap(new HashMap());
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Map A07 = Collections.synchronizedMap(new HashMap());
    public final Map A08 = Collections.synchronizedMap(new HashMap());

    public final long Ar8(String str) {
        Number number = (Number) this.A07.get(str);
        if (number == null) {
            return 0;
        }
        return number.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if ((r8 % java.lang.Math.min((long) r15.A03, r6)) != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) >= r15.A06) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Css(java.lang.String r16, long r17) {
        /*
            r15 = this;
            java.util.Map r5 = r15.A08
            r3 = r16
            java.lang.Object r0 = r5.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            r14 = 0
            r13 = 1
            if (r0 == 0) goto L_0x001e
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r6 = r6 - r0
            long r1 = r15.A06
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r12 = 1
            if (r0 < 0) goto L_0x001f
        L_0x001e:
            r12 = 0
        L_0x001f:
            r10 = 0
            if (r12 != 0) goto L_0x0066
            java.util.Map r4 = r15.A00
            java.lang.Object r0 = r4.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00c9
            r8 = 0
        L_0x002f:
            long r6 = r15.A05
            r0 = r17
            long r0 = java.lang.Math.min(r0, r6)
            long r8 = r8 % r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            java.util.Map r0 = r15.A01
            java.lang.Object r0 = r0.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00c4
            r8 = 0
        L_0x0048:
            int r0 = r15.A04
            long r1 = (long) r0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            java.lang.Object r0 = r4.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00bf
            r8 = 0
        L_0x0059:
            int r0 = r15.A03
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r0, r6)
            long r8 = r8 % r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r12 = 1
        L_0x0066:
            int r0 = r5.size()
            long r6 = (long) r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r5.clear()
            java.util.Map r0 = r15.A07
            r0.clear()
            java.util.Map r0 = r15.A02
            r0.clear()
            java.util.Map r0 = r15.A00
            r0.clear()
            java.util.Map r0 = r15.A01
            r0.clear()
        L_0x0088:
            r6 = 1
            if (r12 == 0) goto L_0x00cf
            java.util.Map r2 = r15.A02
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00ba
            r0 = 0
        L_0x0098:
            long r0 = r0 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            java.util.Map r2 = r15.A00
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00b5
            r0 = 0
        L_0x00ac:
            long r0 = r0 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            return r14
        L_0x00b5:
            long r0 = r0.longValue()
            goto L_0x00ac
        L_0x00ba:
            long r0 = r0.longValue()
            goto L_0x0098
        L_0x00bf:
            long r8 = r0.longValue()
            goto L_0x0059
        L_0x00c4:
            long r8 = r0.longValue()
            goto L_0x0048
        L_0x00c9:
            long r8 = r0.longValue()
            goto L_0x002f
        L_0x00cf:
            java.util.Map r4 = r15.A07
            java.util.Map r2 = r15.A02
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x011a
            r0 = 0
        L_0x00dd:
            long r0 = r0 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r2.put(r3, r0)
            java.util.Map r1 = r15.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.put(r3, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r3, r0)
            java.util.Map r2 = r15.A01
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x0115
            r0 = 0
        L_0x010c:
            long r0 = r0 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            return r13
        L_0x0115:
            long r0 = r0.longValue()
            goto L_0x010c
        L_0x011a:
            long r0 = r0.longValue()
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y9.Css(java.lang.String, long):boolean");
    }

    public AnonymousClass0Y9(int i, int i2, long j, long j2) {
        this.A06 = j;
        this.A05 = j2;
        this.A03 = i;
        this.A04 = i2;
    }
}
