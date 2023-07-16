package X;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.5ls  reason: invalid class name and case insensitive filesystem */
public final class C93605ls extends C93625lu {
    public final GoogleSignInOptions A00;

    public final int Ave() {
        return 12451000;
    }

    public final boolean CYG() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93605ls(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.C148648rc r16, X.C148658rd r17, X.C110886mR r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.78K r4 = new X.78K
            if (r15 == 0) goto L_0x004c
            r4.<init>(r15)
        L_0x0015:
            r0 = 16
            byte[] r1 = new byte[r0]
            java.util.Random r0 = X.AnonymousClass30G.A00
            r0.nextBytes(r1)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r4.A00 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0050
            java.util.Iterator r3 = r1.iterator()
        L_0x0032:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A01
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0032
        L_0x004c:
            r4.<init>()
            goto L_0x0015
        L_0x0050:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93605ls.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.8rc, X.8rd, X.6mR):void");
    }

    public final Intent BC8() {
        return AnonymousClass7CO.A00(this.A0F, this.A00);
    }
}
