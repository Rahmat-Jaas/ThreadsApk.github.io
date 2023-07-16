package X;

import java.util.Arrays;

/* renamed from: X.6um  reason: invalid class name and case insensitive filesystem */
public final class C115266um {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C115266um)) {
            return false;
        }
        C115266um r4 = (C115266um) obj;
        if (!C117046y2.A01(this.A01, r4.A01) || !C117046y2.A01(this.A00, r4.A00) || !C117046y2.A01(this.A02, r4.A02) || !C117046y2.A01(this.A03, r4.A03)) {
            return false;
        }
        return C117046y2.A00(this.A04, r4.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02, null, this.A03, null, this.A04});
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(this.A01, "applicationId");
        r2.A00(this.A00, "apiKey");
        r2.A00(this.A02, "databaseUrl");
        r2.A00(this.A03, "gcmSenderId");
        r2.A00((Object) null, "storageBucket");
        r2.A00(this.A04, "projectId");
        return r2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C115266um(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C13320nQ.A07(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            r2.A02 = r5
            r2.A03 = r6
            r2.A04 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115266um.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
