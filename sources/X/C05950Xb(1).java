package X;

import android.os.Process;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
public final class C05950Xb implements C04050Mb {
    public final int A00 = Process.myPid();

    public final boolean BNv(Integer num) {
        if (num == AnonymousClass006.A00) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f3, code lost:
        if (r8 != Integer.MIN_VALUE) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r15, X.AnonymousClass0ND r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            java.lang.String r4 = java.lang.Integer.toString(r0)
            java.lang.Object r5 = X.AnonymousClass0Vr.A03
            monitor-enter(r5)
            java.lang.String r0 = X.AnonymousClass0Vr.A00     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "/proc/self/oom_adj"
            android.util.Pair r3 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x0013:
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = X.AnonymousClass0Vr.A00     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0021
        L_0x001c:
            android.util.Pair r3 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
            goto L_0x0013
        L_0x0021:
            if (r4 == 0) goto L_0x0031
            java.lang.String r1 = "/proc/"
            java.lang.String r0 = "/oom_adj"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r4, r0)     // Catch:{ all -> 0x0154 }
            X.AnonymousClass0Vr.A00 = r0     // Catch:{ all -> 0x0154 }
            android.util.Pair r3 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x0031:
            java.lang.String r0 = X.AnonymousClass0Vr.A02     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "/proc/self/oom_score"
            android.util.Pair r2 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x003b:
            java.lang.Object r0 = r2.first     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = X.AnonymousClass0Vr.A02     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0059
            goto L_0x0049
        L_0x0044:
            android.util.Pair r2 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
            goto L_0x003b
        L_0x0049:
            if (r4 == 0) goto L_0x0059
            java.lang.String r1 = "/proc/"
            java.lang.String r0 = "/oom_score"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r4, r0)     // Catch:{ all -> 0x0154 }
            X.AnonymousClass0Vr.A02 = r0     // Catch:{ all -> 0x0154 }
            android.util.Pair r2 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x0059:
            java.lang.String r0 = X.AnonymousClass0Vr.A01     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "/proc/self/oom_score_adj"
            android.util.Pair r1 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x0063:
            java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = X.AnonymousClass0Vr.A01     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0081
            goto L_0x0071
        L_0x006c:
            android.util.Pair r1 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
            goto L_0x0063
        L_0x0071:
            if (r4 == 0) goto L_0x0081
            java.lang.String r1 = "/proc/"
            java.lang.String r0 = "/oom_score_adj"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r4, r0)     // Catch:{ all -> 0x0154 }
            X.AnonymousClass0Vr.A01 = r0     // Catch:{ all -> 0x0154 }
            android.util.Pair r1 = X.C03620Ka.A00(r0)     // Catch:{ all -> 0x0154 }
        L_0x0081:
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Object r0 = r3.first
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            int r8 = java.lang.Integer.parseInt(r0)
        L_0x0096:
            java.lang.Object r0 = r3.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.lang.Object r0 = r2.first
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            int r6 = java.lang.Integer.parseInt(r0)
        L_0x00ac:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r1.first
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.trim()
            int r4 = java.lang.Integer.parseInt(r0)
        L_0x00c2:
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.List r0 = X.AnonymousClass0Vr.A04
            java.util.Iterator r13 = r0.iterator()
        L_0x00d0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r0 = r13.next()
            X.0Xu r0 = (X.C06130Xu) r0
            X.0Xw r9 = r0.A00
            monitor-enter(r9)
            X.0Xx r0 = r9.A0E     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0128
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r2) goto L_0x00eb
            int r0 = r9.A01     // Catch:{ all -> 0x012a }
            if (r0 != r8) goto L_0x00f5
        L_0x00eb:
            if (r4 == r2) goto L_0x0101
            int r0 = r9.A02     // Catch:{ all -> 0x012a }
            if (r0 == r4) goto L_0x0101
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r8 == r2) goto L_0x00f6
        L_0x00f5:
            byte r1 = (byte) r8     // Catch:{ all -> 0x012a }
        L_0x00f6:
            r11 = -32768(0xffffffffffff8000, float:NaN)
            r12 = -32768(0xffffffffffff8000, float:NaN)
            if (r6 == r2) goto L_0x00fd
            short r12 = (short) r6     // Catch:{ all -> 0x012a }
        L_0x00fd:
            if (r4 == r2) goto L_0x0105
            short r11 = (short) r4     // Catch:{ all -> 0x012a }
            goto L_0x0105
        L_0x0101:
            X.C06150Xw.A00(r9)     // Catch:{ all -> 0x012a }
            goto L_0x0128
        L_0x0105:
            java.lang.Integer r10 = X.AnonymousClass006.A1C     // Catch:{ all -> 0x012a }
            r0 = 5
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x012a }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x012a }
            r1 = 1
            int r0 = r12 >>> 8
            byte r0 = (byte) r0     // Catch:{ all -> 0x012a }
            r2[r1] = r0     // Catch:{ all -> 0x012a }
            r1 = 2
            byte r0 = (byte) r12     // Catch:{ all -> 0x012a }
            r2[r1] = r0     // Catch:{ all -> 0x012a }
            r1 = 3
            int r0 = r11 >>> 8
            byte r0 = (byte) r0     // Catch:{ all -> 0x012a }
            r2[r1] = r0     // Catch:{ all -> 0x012a }
            r1 = 4
            byte r0 = (byte) r11     // Catch:{ all -> 0x012a }
            r2[r1] = r0     // Catch:{ all -> 0x012a }
            X.C06150Xw.A02(r9, r10, r2)     // Catch:{ all -> 0x012a }
            r9.A01 = r8     // Catch:{ all -> 0x012a }
            r9.A02 = r4     // Catch:{ all -> 0x012a }
        L_0x0128:
            monitor-exit(r9)     // Catch:{ all -> 0x012a }
            goto L_0x00d0
        L_0x012a:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x012a }
            throw r0
        L_0x012d:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r1) goto L_0x0136
            X.0OO r0 = X.AnonymousClass0MU.A2C
            r15.A01(r0, r8)
        L_0x0136:
            X.0OO r0 = X.AnonymousClass0MU.A2D
            r15.A01(r0, r7)
            if (r6 == r1) goto L_0x0142
            X.0OO r0 = X.AnonymousClass0MU.A2E
            r15.A01(r0, r6)
        L_0x0142:
            X.0OO r0 = X.AnonymousClass0MU.A2H
            r15.A01(r0, r5)
            if (r4 == r1) goto L_0x014e
            X.0OO r0 = X.AnonymousClass0MU.A2F
            r15.A01(r0, r4)
        L_0x014e:
            X.0OO r0 = X.AnonymousClass0MU.A2G
            r15.A01(r0, r3)
            return
        L_0x0154:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0154 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05950Xb.CWp(X.0Mn, X.0ND):void");
    }

    public final Integer Awy() {
        return AnonymousClass006.A0R;
    }
}
