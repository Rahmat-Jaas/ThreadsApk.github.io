package X;

/* renamed from: X.76P  reason: invalid class name */
public final class AnonymousClass76P {
    public AnonymousClass7EC A00;
    public AnonymousClass7EC A01;
    public final String A02;
    public final String A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.fbpay.w3c.models.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.fbpay.w3c.models.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.fbpay.w3c.models.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.fbpay.w3c.models.W3CCardDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7EC A00(X.AnonymousClass76P r11) {
        /*
            X.7EC r2 = r11.A00
            if (r2 == 0) goto L_0x000d
            java.lang.Throwable r1 = r2.A02
            if (r1 == 0) goto L_0x000d
        L_0x0008:
            X.7EC r0 = X.AnonymousClass7EC.A01(r1)
            return r0
        L_0x000d:
            X.7EC r0 = r11.A01
            if (r0 == 0) goto L_0x0016
            java.lang.Throwable r1 = r0.A02
            if (r1 == 0) goto L_0x0016
            goto L_0x0008
        L_0x0016:
            r1 = 0
            if (r2 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r2.A01
            X.C04220Ms.A0A(r0)
            java.util.Iterator r4 = X.C86154wM.A0q(r0)
        L_0x0024:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.fbpay.w3c.models.W3CCardDetail r0 = (com.fbpay.w3c.models.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r2 = r0.A07
            java.lang.String r0 = r11.A02
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0024
            r1 = r3
        L_0x003e:
            com.fbpay.w3c.models.W3CCardDetail r1 = (com.fbpay.w3c.models.W3CCardDetail) r1
            if (r1 == 0) goto L_0x0074
            X.7EC r0 = r11.A01
            X.C04220Ms.A0A(r0)
            java.lang.Object r8 = r0.A01
            X.C04220Ms.A0A(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = r11.A03
            r0 = 1
            X.C04220Ms.A0B(r8, r0)
            r11 = 0
            com.fbpay.w3c.CardDetails r0 = r1.A00
            com.fbpay.w3c.Address r3 = r0.A00
            java.lang.Integer r5 = r0.A03
            java.lang.Integer r4 = r0.A02
            java.lang.String r6 = r0.A04
            java.lang.String r7 = r0.A05
            java.lang.String r9 = r0.A07
            com.fbpay.w3c.CardDetails r2 = new com.fbpay.w3c.CardDetails
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = r1.A01
            com.fbpay.w3c.models.W3CCardDetail r0 = new com.fbpay.w3c.models.W3CCardDetail
            r0.<init>(r2, r1)
            X.7EC r0 = X.AnonymousClass7EC.A00(r0)
            return r0
        L_0x0074:
            java.lang.String r2 = "Card id "
            java.lang.String r1 = r11.A02
            java.lang.String r0 = " is not found."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)
            goto L_0x0008
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass76P.A00(X.76P):X.7EC");
    }

    public AnonymousClass76P(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
    }
}
