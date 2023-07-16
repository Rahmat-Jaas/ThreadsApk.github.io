package X;

import kotlin.ULong;

/* renamed from: X.727  reason: invalid class name */
public final class AnonymousClass727 {
    public static final ULong A01(String str) {
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        AnonymousClass725.A00(10);
        int length = str2.length();
        if (length != 0) {
            int i = 0;
            char charAt = str2.charAt(0);
            if (C04220Ms.A00(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i = 1;
                }
            }
            long j = (long) 10;
            long j2 = 0;
            long j3 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit(str2.charAt(i), 10);
                if (digit >= 0) {
                    if ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE)) {
                        if (j3 == 512409557603043100L) {
                            if (j >= 0) {
                                int i2 = 1;
                                long j4 = ((-1 >>> 1) / j) << 1;
                                if (((-1 - (j4 * j)) ^ Long.MIN_VALUE) < (j ^ Long.MIN_VALUE)) {
                                    i2 = 0;
                                }
                                j3 = j4 + ((long) i2);
                            } else if (Long.MAX_VALUE < (j ^ Long.MIN_VALUE)) {
                                j3 = 0;
                            } else {
                                j3 = 1;
                            }
                            if ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE)) {
                            }
                        }
                    }
                    long j5 = j2 * j;
                    long j6 = (((long) digit) & 4294967295L) + j5;
                    if ((j6 ^ Long.MIN_VALUE) >= (j5 ^ Long.MIN_VALUE)) {
                        i++;
                        j2 = j6;
                    }
                }
            }
            return new ULong(j2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r2 = (int) ((((long) -1) & 4294967295L) / (((long) 10) & 4294967295L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 == '+') goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.UInt A00(java.lang.String r14) {
        /*
            r10 = 10
            r0 = 0
            X.AnonymousClass725.A00(r10)
            int r9 = r14.length()
            r13 = 0
            if (r9 == 0) goto L_0x0021
            r8 = 0
            char r1 = r14.charAt(r0)
            r0 = 48
            int r0 = X.C04220Ms.A00(r1, r0)
            r7 = 1
            if (r0 >= 0) goto L_0x0022
            if (r9 == r7) goto L_0x0021
            r0 = 43
            if (r1 == r0) goto L_0x0023
        L_0x0021:
            return r13
        L_0x0022:
            r7 = 0
        L_0x0023:
            r6 = 119304647(0x71c71c7, float:1.1769572E-34)
            r2 = 119304647(0x71c71c7, float:1.1769572E-34)
        L_0x0029:
            if (r7 >= r9) goto L_0x0064
            char r0 = r14.charAt(r7)
            int r12 = java.lang.Character.digit(r0, r10)
            if (r12 < 0) goto L_0x0021
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r8 ^ r11
            r0 = r2 ^ r11
            if (r1 == r0) goto L_0x0055
            if (r1 < r0) goto L_0x0055
            if (r2 != r6) goto L_0x0021
            r0 = -1
            long r4 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r0 = (long) r10
            long r0 = r0 & r2
            long r4 = r4 / r0
            int r2 = (int) r4
            r1 = r8 ^ r11
            r0 = r2 ^ r11
            if (r1 == r0) goto L_0x0055
            if (r1 >= r0) goto L_0x0021
        L_0x0055:
            int r1 = r8 * 10
            int r12 = r12 + r1
            r0 = r12 ^ r11
            r1 = r1 ^ r11
            if (r0 == r1) goto L_0x0060
            if (r0 >= r1) goto L_0x0060
            return r13
        L_0x0060:
            int r7 = r7 + 1
            r8 = r12
            goto L_0x0029
        L_0x0064:
            kotlin.UInt r0 = new kotlin.UInt
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass727.A00(java.lang.String):kotlin.UInt");
    }
}
