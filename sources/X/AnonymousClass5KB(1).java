package X;

/* renamed from: X.5KB  reason: invalid class name */
public final class AnonymousClass5KB extends AnonymousClass0Sf implements C143308gV {
    public final Exception A00;
    public final String A01;
    public final Integer A02 = AnonymousClass006.A0C;

    public final Integer AgJ() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (X.C04220Ms.A0I(r1, r2) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass5KB
            if (r0 == 0) goto L_0x003e
            java.lang.Exception r2 = r4.A00
            java.lang.String r1 = r2.getMessage()
            X.5KB r5 = (X.AnonymousClass5KB) r5
            java.lang.Exception r3 = r5.A00
            java.lang.String r0 = r3.getMessage()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0033
            java.lang.Throwable r0 = r2.getCause()
            r2 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r0.getMessage()
        L_0x0023:
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x002d
            java.lang.String r2 = r0.getMessage()
        L_0x002d:
            boolean r0 = X.C04220Ms.A0I(r1, r2)
            if (r0 == 0) goto L_0x003e
        L_0x0033:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            boolean r1 = X.C04220Ms.A0I(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            return r0
        L_0x0040:
            r1 = r2
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5KB.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + C18220wO.A07(this.A01);
    }

    public final String toString() {
        Exception exc = this.A00;
        String message = exc.getMessage();
        if (message == null) {
            Throwable cause = exc.getCause();
            if (cause != null) {
                message = cause.getMessage();
            } else {
                message = null;
            }
        }
        return AnonymousClass00U.A0X("FlowFailEvent: ", message, this.A01, ' ');
    }

    public AnonymousClass5KB(Exception exc, String str) {
        this.A00 = exc;
        this.A01 = str;
    }
}
