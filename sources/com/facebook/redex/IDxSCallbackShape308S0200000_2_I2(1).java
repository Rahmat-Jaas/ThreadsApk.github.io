package com.facebook.redex;

import X.C143698hA;

public class IDxSCallbackShape308S0200000_2_I2 implements C143698hA {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSCallbackShape308S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CuA(X.C120967Dk r10, X.C112936qR r11, byte[] r12) {
        /*
            r9 = this;
            int r0 = r9.A02
            if (r0 == 0) goto L_0x009d
            java.lang.String r6 = "BIO"
            X.AnonymousClass0wJ.A1N(r10, r12)
            r0 = 0
            long r1 = r10.A00     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x007f
            java.lang.String r4 = r10.A04     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r3 = "VALID"
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r3 == 0) goto L_0x007f
            java.lang.Object r3 = r9.A01     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            X.7k3 r3 = (X.C128667k3) r3     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r8 = r3.A06     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x007f
            java.lang.String r7 = r10.A03     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            boolean r1 = r7.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 != 0) goto L_0x0048
            java.util.Map r1 = r10.A08     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            X.6cg r1 = (X.C104976cg) r1     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 == 0) goto L_0x007f
            long r1 = r1.A00     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x007f
        L_0x0048:
            boolean r1 = r7.equals(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 == 0) goto L_0x0070
            java.lang.Object r2 = r9.A00     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            X.6j6 r2 = (X.C108876j6) r2     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r2 == 0) goto L_0x0069
            X.7Dk r1 = r2.A01     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r1.A03     // Catch:{ Exception -> 0x0093, all -> 0x008e }
        L_0x005a:
            boolean r1 = X.C04220Ms.A0I(r1, r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 == 0) goto L_0x0070
            java.security.Signature r1 = r2.A02     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            if (r1 == 0) goto L_0x006b
            java.lang.String r2 = X.C116996xx.A00(r1, r12)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            goto L_0x008a
        L_0x0069:
            r1 = r0
            goto L_0x005a
        L_0x006b:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            throw r1     // Catch:{ Exception -> 0x0093, all -> 0x008e }
        L_0x0070:
            X.7HL r2 = X.AnonymousClass76O.A00()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r1 = r10.A01     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.security.Signature r1 = X.AnonymousClass7HL.A01(r2, r1)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r2 = X.C116996xx.A00(r1, r12)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            goto L_0x008a
        L_0x007f:
            X.88K r1 = new X.88K     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            r1.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            r2 = r0
            X.88U r0 = new X.88U
            r0.<init>(r10, r1)
        L_0x008a:
            r11.A00(r2, r0)
            return
        L_0x008e:
            r1 = move-exception
            r11.A00(r0, r0)
            throw r1
        L_0x0093:
            r2 = move-exception
            X.88U r1 = new X.88U
            r1.<init>(r10, r2)
            r11.A00(r0, r1)
            return
        L_0x009d:
            r4 = 0
            java.lang.Object r3 = r9.A00     // Catch:{ Exception -> 0x00c8 }
            X.583 r3 = (X.AnonymousClass583) r3     // Catch:{ Exception -> 0x00c8 }
            java.security.Signature r2 = X.AnonymousClass583.A00(r3, r10)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = r10.A03     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00bd
            X.7k0 r1 = new X.7k0     // Catch:{ Exception -> 0x00c8 }
            r1.<init>(r9, r10, r11, r12)     // Catch:{ Exception -> 0x00c8 }
            java.lang.Object r0 = r9.A01     // Catch:{ Exception -> 0x00c8 }
            X.6gT r0 = (X.C107266gT) r0     // Catch:{ Exception -> 0x00c8 }
            r3.A02(r1, r0, r10, r2)     // Catch:{ Exception -> 0x00c8 }
            return
        L_0x00bd:
            r2.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r0 = X.C116996xx.A00(r2, r12)     // Catch:{ Exception -> 0x00c8 }
            r11.A00(r0, r4)     // Catch:{ Exception -> 0x00c8 }
            return
        L_0x00c8:
            r0 = move-exception
            r11.A00(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSCallbackShape308S0200000_2_I2.CuA(X.7Dk, X.6qR, byte[]):void");
    }
}
