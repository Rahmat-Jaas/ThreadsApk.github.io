package X;

import java.io.StringWriter;

/* renamed from: X.3bH  reason: invalid class name and case insensitive filesystem */
public final class C62993bH {
    public static final AnonymousClass0LI A00 = AnonymousClass0LI.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r3.charAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0018
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0018
            char r1 = r3.charAt(r2)
            r0 = 95
            if (r1 == r0) goto L_0x0018
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62993bH.A03(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (r13 >= 16384) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C07810cE r20, java.util.List r21) {
        /*
            X.0LI r0 = A00     // Catch:{ IOException -> 0x0164 }
            X.0KD r9 = r0.A02()     // Catch:{ IOException -> 0x0164 }
            java.lang.String r1 = "configs"
            X.0LI r0 = r9.A01     // Catch:{ IOException -> 0x0164 }
            X.0KD r8 = r0.A02()     // Catch:{ IOException -> 0x0164 }
            r9.A0D(r8, r1)     // Catch:{ IOException -> 0x0164 }
            X.0TJ r0 = X.C18200wM.A0Q()     // Catch:{ IOException -> 0x0164 }
            r7 = 1
            r0.A03 = r7     // Catch:{ IOException -> 0x0164 }
            X.0TJ r6 = X.AnonymousClass0TJ.A00(r0)     // Catch:{ IOException -> 0x0164 }
            r6.A02 = r7     // Catch:{ IOException -> 0x0164 }
            java.util.Iterator r18 = r21.iterator()     // Catch:{ IOException -> 0x0164 }
            java.lang.String r17 = ""
            r19 = r17
            r5 = 0
            r4 = 0
        L_0x0028:
            boolean r0 = r18.hasNext()     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x015f
            java.lang.Object r11 = r18.next()     // Catch:{ IOException -> 0x0164 }
            X.3GH r11 = (X.AnonymousClass3GH) r11     // Catch:{ IOException -> 0x0164 }
            int r1 = r11.A03     // Catch:{ IOException -> 0x0164 }
            java.lang.String r14 = r11.A00     // Catch:{ IOException -> 0x0164 }
            if (r1 <= 0) goto L_0x0043
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 >= r0) goto L_0x0043
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0044
        L_0x0043:
            r2 = r14
        L_0x0044:
            if (r5 == 0) goto L_0x004e
            r0 = r19
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0164 }
            if (r0 != 0) goto L_0x0064
        L_0x004e:
            X.0LI r0 = r8.A01     // Catch:{ IOException -> 0x0164 }
            X.0KD r5 = r0.A02()     // Catch:{ IOException -> 0x0164 }
            r8.A0D(r5, r2)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r1 = "fields"
            X.0LI r0 = r5.A01     // Catch:{ IOException -> 0x0164 }
            X.0Jr r4 = r0.A01()     // Catch:{ IOException -> 0x0164 }
            r5.A0D(r4, r1)     // Catch:{ IOException -> 0x0164 }
            r19 = r2
        L_0x0064:
            long r1 = r11.A00()     // Catch:{ IOException -> 0x0164 }
            X.0LI r0 = r4.A01     // Catch:{ IOException -> 0x0164 }
            X.0KD r10 = r0.A02()     // Catch:{ IOException -> 0x0164 }
            r4.A0B(r10)     // Catch:{ IOException -> 0x0164 }
            int r13 = r11.A04     // Catch:{ IOException -> 0x0164 }
            r0 = -1
            if (r13 == r0) goto L_0x007b
            r3 = 16384(0x4000, float:2.2959E-41)
            r0 = 0
            if (r13 < r3) goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            java.lang.String r12 = "k"
            if (r0 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r12)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0097
        L_0x0089:
            java.lang.String r3 = "pname"
            java.lang.String r0 = r11.A01     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r12)     // Catch:{ IOException -> 0x0164 }
        L_0x0097:
            int r15 = r11.A06     // Catch:{ IOException -> 0x0164 }
            r13 = 1
            r12 = r20
            if (r15 != r7) goto L_0x00b2
            java.lang.String r3 = "bln"
            boolean r0 = r12.ATv(r6, r1)     // Catch:{ IOException -> 0x0164 }
            if (r0 != 0) goto L_0x00a7
            r13 = 0
        L_0x00a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
            A02(r10, r6)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0116
        L_0x00b2:
            r0 = 2
            if (r15 != r0) goto L_0x00b6
            goto L_0x0106
        L_0x00b6:
            r0 = 3
            if (r15 != r0) goto L_0x00e0
            r0 = 60
            long r15 = r1 >>> r0
            r13 = 1
            long r15 = r15 & r13
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.String r3 = "str"
            if (r0 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            java.lang.String r0 = r12.BET(r6, r1)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
            goto L_0x00dc
        L_0x00d3:
            r0 = r17
            java.lang.String r0 = r12.BEU(r6, r0, r1)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
        L_0x00dc:
            A02(r10, r6)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0116
        L_0x00e0:
            r0 = 4
            if (r15 != r0) goto L_0x00f4
            java.lang.String r3 = "dbl"
            double r13 = r12.Adv(r6, r1)     // Catch:{ IOException -> 0x0164 }
            java.lang.Double r0 = java.lang.Double.valueOf(r13)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
            A02(r10, r6)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0116
        L_0x00f4:
            java.lang.String r13 = "MobileConfigDebugUtil"
            java.lang.String r3 = "Caught unsupported type %d for config %s, param %s in api consistency logging"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r0 = r11.A01     // Catch:{ IOException -> 0x0164 }
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r14, r0}     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0LU.A0P(r13, r3, r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0116
        L_0x0106:
            java.lang.String r3 = "i64"
            long r13 = r12.AtA(r6, r1)     // Catch:{ IOException -> 0x0164 }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
            A02(r10, r6)     // Catch:{ IOException -> 0x0164 }
        L_0x0116:
            X.3zp r3 = X.AnonymousClass2CI.A00(r12)     // Catch:{ IOException -> 0x0164 }
            if (r3 == 0) goto L_0x0125
            int r0 = r11.A02     // Catch:{ IOException -> 0x0164 }
            X.0cE r11 = r3.A08(r0)     // Catch:{ IOException -> 0x0164 }
            X.4vj r11 = (X.C85764vj) r11     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x0125:
            boolean r0 = r12 instanceof X.C85764vj     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x012d
            r11 = r12
            X.4vj r11 = (X.C85764vj) r11     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            if (r11 == 0) goto L_0x0028
            int r0 = r11.BID()     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x013f
            java.lang.String r3 = "tt"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r3)     // Catch:{ IOException -> 0x0164 }
        L_0x013f:
            java.lang.String r3 = r11.Asv(r1)     // Catch:{ IOException -> 0x0164 }
            int r2 = r11.Asz(r1)     // Catch:{ IOException -> 0x0164 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0164 }
            if (r0 != 0) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            java.lang.String r1 = "lm"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0164 }
            X.AnonymousClass0KD.A00(r10, r0, r1)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r0 = "li"
            X.AnonymousClass0KD.A00(r10, r3, r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0028
        L_0x015f:
            java.lang.String r0 = A00(r9)     // Catch:{ IOException -> 0x0164 }
            return r0
        L_0x0164:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62993bH.A01(X.0cE, java.util.List):java.lang.String");
    }

    public static void A02(AnonymousClass0KD r2, AnonymousClass0TJ r3) {
        AnonymousClass0KD.A00(r2, Integer.valueOf(r3.A00.A00.A00), "src");
    }

    public static String A00(AnonymousClass0KD r3) {
        StringWriter A0d = C18230wP.A0d();
        AnonymousClass0KR A002 = AnonymousClass0KR.A00();
        AnonymousClass0SJ.A01(A002, I17.A00(620));
        r3.A02 = A002;
        AnonymousClass0SJ.A01(A0d, "Writer is null!");
        AnonymousClass0SJ.A01(r3.A02, "No encoder set, please call setEncoder() first!");
        r3.A02.A04(r3, A0d);
        r3.A02();
        return A0d.toString();
    }
}
