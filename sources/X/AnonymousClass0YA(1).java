package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0YA  reason: invalid class name */
public final class AnonymousClass0YA implements AnonymousClass0O9 {
    public final Map A00 = Collections.synchronizedMap(new HashMap());
    public final Map A01 = Collections.synchronizedMap(new HashMap());
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Random A04;

    public final long Ar8(String str) {
        Number number = (Number) this.A02.get(str);
        if (number == null) {
            return 0;
        }
        return number.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if ((((long) r3.nextInt()) % java.lang.Math.min((long) 1000, 2147483647L)) != 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) >= 120000) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Css(java.lang.String r19, long r20) {
        /*
            r18 = this;
            r9 = r18
            java.util.Map r10 = r9.A03
            r8 = r19
            java.lang.Object r0 = r10.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            r17 = 0
            r16 = 1
            if (r0 == 0) goto L_0x0023
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r15 = 1
            if (r0 < 0) goto L_0x0024
        L_0x0023:
            r15 = 0
        L_0x0024:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2 = r20
            long r0 = java.lang.Math.min(r2, r0)
            r4 = 1
            long r11 = java.lang.Math.max(r4, r0)
            r13 = 0
            if (r15 != 0) goto L_0x006a
            java.util.Random r3 = r9.A04
            int r0 = r3.nextInt()
            long r0 = (long) r0
            long r0 = r0 % r11
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0069
            java.util.Map r0 = r9.A00
            java.lang.Object r0 = r0.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00a3
            r11 = 0
        L_0x0052:
            r0 = 5
            long r0 = (long) r0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x006a
            int r0 = r3.nextInt()
            long r2 = (long) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r0, r6)
            long r2 = r2 % r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r15 = 1
        L_0x006a:
            int r0 = r10.size()
            long r1 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r10.clear()
            java.util.Map r0 = r9.A02
            r0.clear()
            java.util.Map r0 = r9.A01
            r0.clear()
            java.util.Map r0 = r9.A00
            r0.clear()
        L_0x0087:
            if (r15 == 0) goto L_0x00a8
            java.util.Map r2 = r9.A01
            java.lang.Object r0 = r2.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x009e
            r0 = 0
        L_0x0095:
            long r0 = r0 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r8, r0)
            return r17
        L_0x009e:
            long r0 = r0.longValue()
            goto L_0x0095
        L_0x00a3:
            long r11 = r0.longValue()
            goto L_0x0052
        L_0x00a8:
            java.util.Map r3 = r9.A02
            java.util.Map r2 = r9.A01
            java.lang.Object r0 = r2.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00ea
            r0 = 0
        L_0x00b6:
            long r0 = r0 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2.put(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r8, r0)
            java.util.Map r2 = r9.A00
            java.lang.Object r0 = r2.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00e5
            r0 = 0
        L_0x00dc:
            long r0 = r0 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r8, r0)
            return r16
        L_0x00e5:
            long r0 = r0.longValue()
            goto L_0x00dc
        L_0x00ea:
            long r0 = r0.longValue()
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YA.Css(java.lang.String, long):boolean");
    }

    public AnonymousClass0YA(Random random) {
        this.A04 = random;
    }
}
