package X;

/* renamed from: X.6ts  reason: invalid class name and case insensitive filesystem */
public final class C114776ts {
    public final String A00;
    public final String A01;

    public C114776ts(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (X.C114776ts) r5;
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x0026
            boolean r0 = r5 instanceof X.C114776ts
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.6ts r5 = (X.C114776ts) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0018:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == r0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114776ts.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 37) + AnonymousClass0wJ.A03(this.A01);
    }

    public final String toString() {
        return AnonymousClass00U.A0h("[packageName=", this.A00, ",libraryName=", this.A01, "]");
    }
}
