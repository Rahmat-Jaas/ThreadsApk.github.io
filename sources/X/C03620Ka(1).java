package X;

/* renamed from: X.0Ka  reason: invalid class name and case insensitive filesystem */
public final class C03620Ka {
    public static C03050Ed A00 = new C03050Ed();
    public static final int[] A01 = {4096};

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c0, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[LOOP:3: B:33:0x006e->B:36:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0049 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(java.lang.String r18) {
        /*
            r14 = 1
            r13 = 0
            r0 = 0
            java.lang.String[] r17 = new java.lang.String[]{r0}
            int[] r12 = A01
            X.0Ed r0 = A00
            r11 = 384(0x180, float:5.38E-43)
            byte[] r10 = new byte[r11]
            r1 = r18
            int r9 = X.C03050Ed.A00(r0, r1, r10)
            if (r9 >= 0) goto L_0x0024
            r0 = 4
        L_0x0018:
            r2 = r17[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0024:
            int r8 = r12.length
            int r0 = java.lang.Math.max(r13, r13)
            int r7 = java.lang.Math.max(r14, r0)
            r6 = 0
            r5 = 0
            r4 = 0
        L_0x0030:
            if (r5 >= r8) goto L_0x00c0
            r0 = r12[r5]
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 34
            if (r1 != 0) goto L_0x00ab
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0044
            byte r1 = r10[r6]
            if (r1 == r2) goto L_0x00ab
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
        L_0x0044:
            r1 = r0 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            if (r6 < r9) goto L_0x004b
            r0 = 5
            goto L_0x0018
        L_0x004b:
            r3 = -1
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x005c
            r3 = r6
        L_0x0051:
            if (r3 >= r9) goto L_0x006a
            byte r15 = r10[r3]
            r2 = 41
            if (r15 == r2) goto L_0x006a
            int r3 = r3 + 1
            goto L_0x0051
        L_0x005c:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x006d
            r3 = r6
        L_0x0061:
            byte r15 = r10[r3]
            if (r15 == r2) goto L_0x006a
            if (r3 >= r9) goto L_0x006a
            int r3 = r3 + 1
            goto L_0x0061
        L_0x006a:
            int r2 = r3 + 1
            goto L_0x006e
        L_0x006d:
            r2 = r6
        L_0x006e:
            if (r2 >= r9) goto L_0x0077
            byte r15 = r10[r2]
            if (r15 == r1) goto L_0x0077
            int r2 = r2 + 1
            goto L_0x006e
        L_0x0077:
            if (r3 >= 0) goto L_0x007a
            r3 = r2
        L_0x007a:
            if (r2 >= r9) goto L_0x008b
            int r2 = r2 + 1
            r15 = r0 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x008b
        L_0x0082:
            if (r2 >= r9) goto L_0x008b
            byte r15 = r10[r2]
            if (r15 != r1) goto L_0x008b
            int r2 = r2 + 1
            goto L_0x0082
        L_0x008b:
            r1 = r0 & 28672(0x7000, float:4.0178E-41)
            if (r1 == 0) goto L_0x00c3
            if (r3 >= r11) goto L_0x00a7
            r16 = 1
            byte r15 = r10[r3]
            r10[r3] = r13
        L_0x0097:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00b8
            if (r4 >= r14) goto L_0x00b8
            r1 = r6
        L_0x009e:
            if (r1 >= r11) goto L_0x00ae
            byte r0 = r10[r1]
            if (r0 == r13) goto L_0x00b0
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00a7:
            r16 = 0
            r15 = 0
            goto L_0x0097
        L_0x00ab:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x00ae:
            r1 = 384(0x180, float:5.38E-43)
        L_0x00b0:
            int r1 = r1 - r6
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10, r6, r1)
            r17[r4] = r0
        L_0x00b8:
            if (r16 == 0) goto L_0x00bc
            r10[r3] = r15
        L_0x00bc:
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x00c3
        L_0x00c0:
            r0 = 0
            goto L_0x0018
        L_0x00c3:
            int r5 = r5 + 1
            r6 = r2
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03620Ka.A00(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[LOOP:3: B:29:0x005c->B:32:0x0062, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r16, int[] r17, long[] r18) {
        /*
            X.0Ed r0 = A00
            r12 = 384(0x180, float:5.38E-43)
            byte[] r11 = new byte[r12]
            r1 = r16
            int r10 = X.C03050Ed.A00(r0, r1, r11)
            if (r10 < 0) goto L_0x00af
            r0 = r17
            int r9 = r0.length
            r8 = 0
            r13 = r18
            int r7 = r13.length
            int r0 = java.lang.Math.max(r7, r8)
            int r6 = java.lang.Math.max(r8, r0)
            r1 = 0
            r5 = 0
            r4 = 0
        L_0x0020:
            if (r5 >= r9) goto L_0x009f
            r15 = r17[r5]
            r0 = r15 & 512(0x200, float:7.175E-43)
            r2 = 34
            if (r0 != 0) goto L_0x0079
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0034
            byte r0 = r11[r1]
            if (r0 == r2) goto L_0x0079
            r15 = r15 & -1025(0xfffffffffffffbff, float:NaN)
        L_0x0034:
            r0 = r15 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            if (r1 >= r10) goto L_0x00af
            r3 = -1
            r14 = r15 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x004a
            r3 = r1
        L_0x003f:
            if (r3 >= r10) goto L_0x0058
            byte r14 = r11[r3]
            r2 = 41
            if (r14 == r2) goto L_0x0058
            int r3 = r3 + 1
            goto L_0x003f
        L_0x004a:
            r14 = r15 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005b
            r3 = r1
        L_0x004f:
            byte r14 = r11[r3]
            if (r14 == r2) goto L_0x0058
            if (r3 >= r10) goto L_0x0058
            int r3 = r3 + 1
            goto L_0x004f
        L_0x0058:
            int r2 = r3 + 1
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            if (r2 >= r10) goto L_0x0065
            byte r14 = r11[r2]
            if (r14 == r0) goto L_0x0065
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0065:
            if (r3 >= 0) goto L_0x0068
            r3 = r2
        L_0x0068:
            if (r2 >= r10) goto L_0x007c
            int r2 = r2 + 1
            r14 = r15 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x007c
        L_0x0070:
            if (r2 >= r10) goto L_0x007c
            byte r14 = r11[r2]
            if (r14 != r0) goto L_0x007c
            int r2 = r2 + 1
            goto L_0x0070
        L_0x0079:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x007c:
            r0 = r15 & 28672(0x7000, float:4.0178E-41)
            if (r0 == 0) goto L_0x00aa
            if (r3 >= r12) goto L_0x00a6
            r16 = 1
            byte r14 = r11[r3]
            r11[r3] = r8
        L_0x0088:
            r0 = r15 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0097
            if (r4 >= r7) goto L_0x0097
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00a1
            byte r0 = r11[r1]
            long r0 = (long) r0
        L_0x0095:
            r18[r4] = r0
        L_0x0097:
            if (r16 == 0) goto L_0x009b
            r11[r3] = r14
        L_0x009b:
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x00aa
        L_0x009f:
            r0 = 1
            return r0
        L_0x00a1:
            long r0 = X.AnonymousClass0KZ.A00(r11, r1)
            goto L_0x0095
        L_0x00a6:
            r16 = 0
            r14 = 0
            goto L_0x0088
        L_0x00aa:
            int r5 = r5 + 1
            r1 = r2
            goto L_0x0020
        L_0x00af:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03620Ka.A01(java.lang.String, int[], long[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r7[r3] == 10) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        if (r3 < 2048) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008a, code lost:
        if (r7[r3] == 0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        r7[r3] = 0;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0090, code lost:
        r11[r12] = X.AnonymousClass0KZ.A00(r7, r1);
        r5 = r5 + 1;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r2 == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        if (r6 < 2048) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0051 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x007d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(java.lang.String r15, long[] r16, java.lang.String[] r17) {
        /*
            X.0Ed r3 = A00
            if (r15 == 0) goto L_0x00bf
            r10 = r17
            int r9 = r10.length
            r11 = r16
            int r0 = r11.length
            if (r9 > r0) goto L_0x00b7
            r17 = 0
            r2 = 0
        L_0x000f:
            if (r2 >= r9) goto L_0x0018
            r0 = 0
            r16[r2] = r0
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0018:
            r8 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r8]
            int r6 = X.C03050Ed.A00(r3, r15, r7)
            if (r6 >= 0) goto L_0x00b0
            r16 = 0
            r6 = 0
        L_0x0025:
            r7[r6] = r17
        L_0x0027:
            r1 = 0
            r5 = 0
        L_0x0029:
            if (r1 >= r6) goto L_0x00b6
            byte r0 = r7[r1]
            if (r0 == 0) goto L_0x00b6
            if (r5 >= r9) goto L_0x00b6
            r12 = 0
        L_0x0032:
            r4 = 10
            if (r12 >= r9) goto L_0x009b
            r15 = r10[r12]
            r14 = r1
            int r13 = r15.length()
            r3 = 0
        L_0x003e:
            if (r14 >= r8) goto L_0x004f
            if (r3 >= r13) goto L_0x004f
            byte r2 = r7[r14]
            char r0 = r15.charAt(r3)
            if (r2 != r0) goto L_0x007d
            int r14 = r14 + 1
            int r3 = r3 + 1
            goto L_0x003e
        L_0x004f:
            if (r3 != r13) goto L_0x007d
            int r0 = r15.length()
            int r1 = r1 + r0
        L_0x0056:
            if (r1 >= r8) goto L_0x006b
            byte r0 = r7[r1]
            if (r0 == 0) goto L_0x0068
            byte r2 = r7[r1]
            r0 = 32
            if (r2 == r0) goto L_0x0068
            byte r2 = r7[r1]
            r0 = 9
            if (r2 != r0) goto L_0x006b
        L_0x0068:
            int r1 = r1 + 1
            goto L_0x0056
        L_0x006b:
            r3 = r1
        L_0x006c:
            if (r3 >= r8) goto L_0x0085
            byte r2 = r7[r3]
            r0 = 48
            if (r2 < r0) goto L_0x0080
            byte r2 = r7[r3]
            r0 = 57
            if (r2 > r0) goto L_0x0080
            int r3 = r3 + 1
            goto L_0x006c
        L_0x007d:
            int r12 = r12 + 1
            goto L_0x0032
        L_0x0080:
            byte r0 = r7[r3]
            r2 = 0
            if (r0 == r4) goto L_0x0088
        L_0x0085:
            r2 = 1
            if (r3 >= r8) goto L_0x0090
        L_0x0088:
            byte r0 = r7[r3]
            if (r0 == 0) goto L_0x0090
            r7[r3] = r17
            int r3 = r3 + 1
        L_0x0090:
            long r0 = X.AnonymousClass0KZ.A00(r7, r1)
            r11[r12] = r0
            int r5 = r5 + 1
            r1 = r3
            if (r2 == 0) goto L_0x0029
        L_0x009b:
            if (r1 >= r6) goto L_0x00a6
            byte r0 = r7[r1]
            if (r0 == 0) goto L_0x00a6
            if (r0 == r4) goto L_0x00a6
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00a6:
            if (r1 >= r8) goto L_0x0029
            byte r0 = r7[r1]
            if (r0 != r4) goto L_0x0029
            int r1 = r1 + 1
            goto L_0x0029
        L_0x00b0:
            r16 = 1
            if (r6 >= r8) goto L_0x0027
            goto L_0x0025
        L_0x00b6:
            return r16
        L_0x00b7:
            java.lang.String r0 = "Array lengths differ"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x00bf:
            java.lang.String r0 = "Cannot pass null values"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03620Ka.A02(java.lang.String, long[], java.lang.String[]):boolean");
    }
}
