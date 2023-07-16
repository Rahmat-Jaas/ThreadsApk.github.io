package X;

import android.app.Application;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;

/* renamed from: X.0aO  reason: invalid class name and case insensitive filesystem */
public final class C06800aO implements AnonymousClass0P4 {
    public final AnonymousClass01P A00;
    public final Application A01;
    public final AnonymousClass0OB A02 = new IDxCFactoryShape495S0100000_I2((Object) this, 13);
    public final C07390bR A03;
    public final boolean A04;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r3, Integer num) {
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(r3, 1);
        if (num == AnonymousClass006.A1L) {
            r3.A01(AnonymousClass0ND.LARGE_REPORT, this.A02);
        }
        return r3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
        if (X.C07960cV.A05(X.AnonymousClass0e5.A00(36320768896014551L)) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0OM A7o(X.AnonymousClass0OM r11, X.AnonymousClass0Z8 r12) {
        /*
            r10 = this;
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            r0 = 1
            X.C04220Ms.A0B(r11, r0)
            java.lang.Integer r5 = X.AnonymousClass006.A1L
            android.app.Application r6 = r10.A01
            boolean r9 = r10.A04
            X.0bR r4 = r10.A03
            r0 = 36315168258525611(0x810474000209ab, double:3.029196863912426E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            r8 = r0 ^ 1
            r0 = 36315168258394537(0x810474000009a9, double:3.0291968638295343E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            r7 = r0 ^ 1
            r0 = 36315168258591148(0x810474000309ac, double:3.029196863953872E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 != 0) goto L_0x004d
            r0 = 36320768896014551(0x81098c000418d7, double:3.032738729612389E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            r2 = 0
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r2 = 1
        L_0x004e:
            java.lang.String r1 = "Config.createUnexplainedConfig"
            r0 = 1167365350(0x459494e6, float:4754.6123)
            X.C13810oL.A01(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0v     // Catch:{ all -> 0x00a1 }
            X.0OC r3 = new X.0OC     // Catch:{ all -> 0x00a1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a1 }
            X.0Z6 r0 = new X.0Z6     // Catch:{ all -> 0x00a1 }
            r0.<init>(r8, r7, r9)     // Catch:{ all -> 0x00a1 }
            r3.A00 = r0     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x0069
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x00a1 }
            goto L_0x006b
        L_0x0069:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x00a1 }
        L_0x006b:
            r3.A02 = r0     // Catch:{ all -> 0x00a1 }
            r1 = 26
            com.facebook.redex.IDxCFactoryShape111S0000000_I2 r0 = new com.facebook.redex.IDxCFactoryShape111S0000000_I2     // Catch:{ all -> 0x00a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a1 }
            X.0ND r2 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x00a1 }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00a1 }
            r1 = 25
            com.facebook.redex.IDxCFactoryShape111S0000000_I2 r0 = new com.facebook.redex.IDxCFactoryShape111S0000000_I2     // Catch:{ all -> 0x00a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a1 }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00a1 }
            X.0Z4 r0 = X.AnonymousClass0Z4.A00     // Catch:{ all -> 0x00a1 }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00a1 }
            r1 = 6
            com.facebook.redex.IDxCFactoryShape203S0200000_I2 r0 = new com.facebook.redex.IDxCFactoryShape203S0200000_I2     // Catch:{ all -> 0x00a1 }
            r0.<init>(r1, r6, r4)     // Catch:{ all -> 0x00a1 }
            r3.A01 = r0     // Catch:{ all -> 0x00a1 }
            r0 = -2009360566(0xffffffff883b974a, float:-5.6451105E-34)
            X.C13810oL.A00(r0)
            r12.A00(r3, r5)
            X.0YB r0 = r3.A00()
            r11.A00(r0)
            return r11
        L_0x00a1:
            r1 = move-exception
            r0 = 1173148016(0x45ecd170, float:7578.1797)
            X.C13810oL.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06800aO.A7o(X.0OM, X.0Z8):X.0OM");
    }

    public C06800aO(Application application, C07390bR r4, AnonymousClass01P r5, boolean z) {
        this.A01 = application;
        this.A04 = z;
        this.A00 = r5;
        this.A03 = r4;
    }
}
