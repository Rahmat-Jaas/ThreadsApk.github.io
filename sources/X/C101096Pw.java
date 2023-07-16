package X;

/* renamed from: X.6Pw  reason: invalid class name and case insensitive filesystem */
public final class C101096Pw {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r2 = java.lang.Math.min(r0 + r2, 1000);
        X.C002801h.A01(r2, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r6 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r0 = X.C36645JcB.A01.A03(r5, r6, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r2 = java.lang.Math.min(r0 + r2, 1000);
        X.C002801h.A01(r2, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r6 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 <= 400) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r0 = X.C36645JcB.A01.A03(r5, r6, r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        X.C04220Ms.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a7, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        throw X.C86124wJ.A0c("Can't parse unknown typeface: ", r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Typeface A00(android.content.Context r5, android.graphics.Typeface r6, java.lang.String r7) {
        /*
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            if (r6 == 0) goto L_0x0010
            int r1 = r6.getWeight()
            r0 = 400(0x190, float:5.6E-43)
            int r2 = r1 - r0
            if (r1 > r0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x001f;
                case -1078030475: goto L_0x002a;
                case -1039745817: goto L_0x0035;
                case 3029637: goto L_0x0040;
                case 99152071: goto L_0x004b;
                case 102970646: goto L_0x0056;
                case 1223860979: goto L_0x0061;
                case 1734741290: goto L_0x0083;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = "Can't parse unknown typeface: "
            X.1zB r0 = X.C86124wJ.A0c(r0, r7)
            throw r0
        L_0x001f:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 400(0x190, float:5.6E-43)
            goto L_0x008d
        L_0x002a:
            java.lang.String r0 = "medium"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x006b
        L_0x0035:
            java.lang.String r0 = "normal"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 400(0x190, float:5.6E-43)
            goto L_0x006b
        L_0x0040:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 700(0x2bc, float:9.81E-43)
            goto L_0x006b
        L_0x004b:
            java.lang.String r0 = "heavy"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 800(0x320, float:1.121E-42)
            goto L_0x006b
        L_0x0056:
            java.lang.String r0 = "light"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 300(0x12c, float:4.2E-43)
            goto L_0x006b
        L_0x0061:
            java.lang.String r0 = "semibold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 600(0x258, float:8.41E-43)
        L_0x006b:
            int r0 = r0 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.min(r0, r3)
            r1 = 1
            java.lang.String r0 = "weight"
            X.C002801h.A01(r2, r1, r0, r3)
            if (r6 != 0) goto L_0x007c
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x007c:
            X.JXX r0 = X.C36645JcB.A01
            android.graphics.Typeface r0 = r0.A03(r5, r6, r2, r4)
            goto L_0x00a4
        L_0x0083:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x008d:
            int r0 = r0 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.min(r0, r3)
            r1 = 1
            java.lang.String r0 = "weight"
            X.C002801h.A01(r2, r1, r0, r3)
            if (r6 != 0) goto L_0x009e
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x009e:
            X.JXX r0 = X.C36645JcB.A01
            android.graphics.Typeface r0 = r0.A03(r5, r6, r2, r1)
        L_0x00a4:
            X.C04220Ms.A06(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101096Pw.A00(android.content.Context, android.graphics.Typeface, java.lang.String):android.graphics.Typeface");
    }
}
