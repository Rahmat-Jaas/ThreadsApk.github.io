package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.6y5  reason: invalid class name and case insensitive filesystem */
public final class C117076y5 {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r19 = X.AnonymousClass73Q.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long A00(java.lang.String r20) {
        /*
            r12 = 10
            r13 = r20
            boolean r0 = r13.isEmpty()
            r20 = 0
            if (r0 != 0) goto L_0x0064
            r11 = 0
            char r1 = r13.charAt(r11)
            r0 = 45
            if (r1 != r0) goto L_0x0016
            r11 = 1
        L_0x0016:
            int r10 = r13.length()
            if (r11 == r10) goto L_0x0064
            int r1 = r11 + 1
            char r0 = r13.charAt(r11)
            r9 = 128(0x80, float:1.794E-43)
            if (r0 >= r9) goto L_0x0064
            byte[] r19 = X.AnonymousClass73Q.A00
            byte r0 = r19[r0]
            if (r0 < 0) goto L_0x0064
            if (r0 >= r12) goto L_0x0064
            int r0 = -r0
            long r5 = (long) r0
            long r7 = (long) r12
            r17 = -9223372036854775808
            long r15 = r17 / r7
        L_0x0035:
            if (r1 >= r10) goto L_0x0054
            int r14 = r1 + 1
            char r0 = r13.charAt(r1)
            if (r0 >= r9) goto L_0x0064
            byte r1 = r19[r0]
            if (r1 < 0) goto L_0x0064
            if (r1 >= r12) goto L_0x0064
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long r5 = r5 * r7
            long r3 = (long) r1
            long r1 = r3 + r17
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long r5 = r5 - r3
            r1 = r14
            goto L_0x0035
        L_0x0054:
            if (r11 == 0) goto L_0x005b
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
            return r20
        L_0x005b:
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            long r0 = -r5
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
        L_0x0064:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117076y5.A00(java.lang.String):java.lang.Long");
    }

    public static long[] A01(Collection collection) {
        if (collection instanceof AnonymousClass89K) {
            AnonymousClass89K r5 = (AnonymousClass89K) collection;
            return Arrays.copyOfRange(r5.A02, r5.A01, r5.A00);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = C18190wL.A08(obj);
        }
        return jArr;
    }
}
