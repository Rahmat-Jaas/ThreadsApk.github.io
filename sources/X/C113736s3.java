package X;

/* renamed from: X.6s3  reason: invalid class name and case insensitive filesystem */
public final class C113736s3 {
    public final int A00;
    public final C25515Dn3 A01;
    public final AnonymousClass01V A02;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C62903b6 r7) {
        /*
            r6 = this;
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            boolean r3 = r7 instanceof X.AnonymousClass1jB
            r2 = 17640860(0x10d2d9c, float:2.5930333E-38)
            if (r3 == 0) goto L_0x005f
            X.01V r4 = r6.A02
            int r1 = r6.A00
            r0 = r7
            X.1jB r0 = (X.AnonymousClass1jB) r0
            java.lang.Object r5 = r0.A00
            boolean r0 = r5 instanceof X.AnonymousClass5v7
            if (r0 != 0) goto L_0x005c
            X.5v2 r0 = X.AnonymousClass5v2.A00
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x005c
            boolean r0 = r5 instanceof X.AnonymousClass5v6
            if (r0 != 0) goto L_0x0059
            X.5v1 r0 = X.AnonymousClass5v1.A00
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x0059
            boolean r0 = r5 instanceof X.AnonymousClass5v4
            if (r0 == 0) goto L_0x0048
            java.lang.String r5 = "server_error"
        L_0x0032:
            java.lang.String r0 = "failure_reason"
        L_0x0034:
            r4.markerAnnotate((int) r2, (int) r1, (java.lang.String) r0, (java.lang.String) r5)
        L_0x0037:
            X.01V r4 = r6.A02
            int r1 = r6.A00
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            r0 = 2
        L_0x0040:
            r4.markerEnd(r2, r1, r0)
            return
        L_0x0044:
            if (r3 == 0) goto L_0x0077
            r0 = 3
            goto L_0x0040
        L_0x0048:
            boolean r0 = r5 instanceof X.AnonymousClass5v8
            if (r0 == 0) goto L_0x004f
            java.lang.String r5 = "insufficient_storage"
            goto L_0x0032
        L_0x004f:
            boolean r0 = r5 instanceof X.AnonymousClass5v5
            if (r0 == 0) goto L_0x0056
            java.lang.String r5 = "client_validation"
            goto L_0x0032
        L_0x0056:
            java.lang.String r5 = "unknown"
            goto L_0x0032
        L_0x0059:
            java.lang.String r5 = "exception"
            goto L_0x0032
        L_0x005c:
            java.lang.String r5 = "http_error"
            goto L_0x0032
        L_0x005f:
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0037
            X.01V r4 = r6.A02
            int r1 = r6.A00
            r0 = r7
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.6m5 r0 = (X.C110676m5) r0
            java.lang.Integer r0 = r0.A01
            java.lang.String r5 = X.AnonymousClass6LY.A00(r0)
            java.lang.String r0 = "cache_type"
            goto L_0x0034
        L_0x0077:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113736s3.A01(X.3b6):void");
    }

    public /* synthetic */ C113736s3(C25515Dn3 dn3) {
        AnonymousClass01V r1 = AnonymousClass01V.A0p;
        int A0A = C86144wL.A0A(r1);
        this.A01 = dn3;
        this.A02 = r1;
        this.A00 = A0A;
    }

    public final void A00(int i) {
        AnonymousClass01V r5 = this.A02;
        int i2 = this.A00;
        r5.markerStart(17640860, i2);
        C25515Dn3 dn3 = this.A01;
        r5.markerAnnotate(17640860, i2, "product_id", dn3.A02);
        r5.markerAnnotate(17640860, i2, "category_id", dn3.A01);
        r5.markerAnnotate(17640860, i2, "effects_count", i);
    }
}
