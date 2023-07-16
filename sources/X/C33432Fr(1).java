package X;

/* renamed from: X.2Fr  reason: invalid class name and case insensitive filesystem */
public final class C33432Fr {
    /* JADX WARNING: type inference failed for: r0v15, types: [com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2] */
    /* JADX WARNING: type inference failed for: r6v5, types: [com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.lang.String r9) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r3 = 0
            if (r9 == 0) goto L_0x00a4
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "\\{|\\}"
            X.7yC r0 = X.C18250wR.A0h(r0)
            java.util.List r0 = r0.A02(r9, r3)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            X.C18220wO.A1P(r2, r1)
            goto L_0x001f
        L_0x0029:
            java.util.List r1 = X.AnonymousClass00J.A0N(r2)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a4
            java.util.Iterator r9 = r1.iterator()
        L_0x0037:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = X.C18180wK.A0k(r9)
            java.lang.String r0 = "|"
            r8 = 0
            r5 = 2
            r6 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r3)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0056 }
            X.C04220Ms.A06(r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0056 }
            r1 = r0
        L_0x0056:
            r0 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            r6.<init>((java.lang.String) r1, (int) r0, (int) r5, (boolean) r3)
            goto L_0x009e
        L_0x005d:
            java.lang.String r0 = "\\|"
            X.7yC r0 = X.C18250wR.A0h(r0)
            r7 = 5
            java.util.List r1 = r0.A02(r1, r7)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x009e
            java.lang.String r2 = X.C18190wL.A0p(r1, r3)
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r2, r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x007c }
            X.C04220Ms.A06(r0)     // Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x007c }
            r2 = r0
        L_0x007c:
            int r0 = r1.size()
            if (r0 < r5) goto L_0x0087
            r0 = 1
            java.lang.String r6 = X.C18190wL.A0q(r1, r0)
        L_0x0087:
            int r0 = r1.size()
            if (r0 != r7) goto L_0x0098
            r0 = 4
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "verified"
            boolean r8 = X.C04220Ms.A0I(r1, r0)
        L_0x0098:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            r0.<init>((java.lang.String) r2, (java.lang.String) r6, (int) r5, (boolean) r8)
            r6 = r0
        L_0x009e:
            if (r6 == 0) goto L_0x0037
            r4.add(r6)
            goto L_0x0037
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33432Fr.A00(java.lang.String):java.util.List");
    }
}
