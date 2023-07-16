package X;

/* renamed from: X.0KF  reason: invalid class name */
public final class AnonymousClass0KF {
    public static String A00(String str) {
        if (!(str == null || str.length() == 0)) {
            char charAt = str.charAt(0);
            char c = charAt;
            if (charAt >= 'a' && charAt <= 'z') {
                c = (char) (charAt - ' ');
            }
            if (charAt != c) {
                char[] charArray = str.toCharArray();
                charArray[0] = c;
                return new String(charArray);
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6 A[LOOP:0: B:53:0x00a4->B:54:0x00a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5 A[LOOP:1: B:56:0x00b3->B:57:0x00b5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(boolean r9, int r10) {
        /*
            java.lang.String r6 = "Successfully"
            java.lang.String r8 = "Un"
            r4 = 0
            int r3 = r8.length()
            if (r3 == 0) goto L_0x003a
            if (r9 != 0) goto L_0x003a
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0066
            r6 = r8
            r0 = 1
            if (r10 == r0) goto L_0x001c
            java.lang.String r6 = A00(r8)
        L_0x001b:
            return r6
        L_0x001c:
            char r2 = r8.charAt(r4)
            r1 = r2
            r0 = 65
            if (r2 < r0) goto L_0x002c
            r0 = 90
            if (r2 > r0) goto L_0x002c
            int r0 = r2 + 32
            char r1 = (char) r0
        L_0x002c:
            if (r2 == r1) goto L_0x001b
            char[] r0 = r8.toCharArray()
            r0[r4] = r1
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
        L_0x003a:
            r0 = 1
            if (r10 == r0) goto L_0x0042
            java.lang.String r6 = A00(r6)
            return r6
        L_0x0042:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x001b
            char r2 = r6.charAt(r4)
            r1 = r2
            r0 = 65
            if (r2 < r0) goto L_0x0058
            r0 = 90
            if (r2 > r0) goto L_0x0058
            int r0 = r2 + 32
            char r1 = (char) r0
        L_0x0058:
            if (r2 == r1) goto L_0x001b
            char[] r0 = r6.toCharArray()
            r0[r4] = r1
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
        L_0x0066:
            char r5 = r8.charAt(r4)
            r0 = 1
            r9 = r5
            if (r10 == r0) goto L_0x0092
            r0 = 97
            if (r5 < r0) goto L_0x0079
            r0 = 122(0x7a, float:1.71E-43)
            if (r5 > r0) goto L_0x0079
            int r0 = r5 + -32
        L_0x0078:
            char r9 = (char) r0
        L_0x0079:
            char r1 = r6.charAt(r4)
            r2 = r1
            r0 = 65
            if (r1 < r0) goto L_0x0089
            r0 = 90
            if (r1 > r0) goto L_0x0089
            int r0 = r1 + 32
            char r2 = (char) r0
        L_0x0089:
            if (r5 != r9) goto L_0x009d
            if (r1 != r2) goto L_0x009d
            java.lang.String r6 = X.AnonymousClass00U.A0L(r8, r6)
            return r6
        L_0x0092:
            r0 = 65
            if (r5 < r0) goto L_0x0079
            r0 = 90
            if (r5 > r0) goto L_0x0079
            int r0 = r5 + 32
            goto L_0x0078
        L_0x009d:
            int r7 = r7 + r3
            char[] r5 = new char[r7]
            r5[r4] = r9
            r4 = 1
            r1 = 1
        L_0x00a4:
            if (r1 >= r3) goto L_0x00af
            char r0 = r8.charAt(r1)
            r5[r1] = r0
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00af:
            int r3 = r1 + 1
            r5[r1] = r2
        L_0x00b3:
            if (r3 >= r7) goto L_0x00c2
            int r2 = r3 + 1
            int r1 = r4 + 1
            char r0 = r6.charAt(r4)
            r5[r3] = r0
            r3 = r2
            r4 = r1
            goto L_0x00b3
        L_0x00c2:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KF.A01(boolean, int):java.lang.String");
    }
}
