package com.facebook.redex;

import X.AnonymousClass0OB;

public class IDxCFactoryShape111S0000000_I2 implements AnonymousClass0OB {
    public final int A00;

    public IDxCFactoryShape111S0000000_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
        return new X.C04190Mp(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r2 = r13.A03();
        r1 = r13.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r1 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r1 = new com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2(r13, 1);
        r13.A03 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        return new X.AnonymousClass0NY((X.C019809f) r1.get(), r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AFC(X.AnonymousClass0OK r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x0005;
                case 2: goto L_0x003e;
                case 3: goto L_0x0052;
                case 4: goto L_0x0005;
                case 5: goto L_0x005a;
                case 6: goto L_0x0062;
                case 7: goto L_0x0005;
                case 8: goto L_0x0070;
                case 9: goto L_0x0077;
                case 10: goto L_0x009a;
                case 11: goto L_0x00d3;
                case 12: goto L_0x005a;
                case 13: goto L_0x002c;
                case 14: goto L_0x003c;
                case 15: goto L_0x0005;
                case 16: goto L_0x00de;
                case 17: goto L_0x0100;
                case 18: goto L_0x010e;
                case 19: goto L_0x0118;
                case 20: goto L_0x0124;
                case 21: goto L_0x012e;
                case 22: goto L_0x013c;
                case 23: goto L_0x0146;
                case 24: goto L_0x014e;
                case 25: goto L_0x005a;
                case 26: goto L_0x002c;
                case 27: goto L_0x0156;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0Q4 r0 = r13.A03()
            java.io.File r3 = r0.A04
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r3, r0)
        L_0x0010:
            X.0Q4 r2 = r13.A03()
            X.0Oe r1 = r13.A03
            if (r1 != 0) goto L_0x0020
            r0 = 1
            com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2 r1 = new com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2
            r1.<init>(r13, r0)
            r13.A03 = r1
        L_0x0020:
            java.lang.Object r0 = r1.get()
            X.09f r0 = (X.C019809f) r0
            X.0NY r4 = new X.0NY
            r4.<init>(r0, r2, r3)
            return r4
        L_0x002c:
            X.0Q4 r1 = r13.A03()
            X.0Q4 r0 = r13.A03()
            java.lang.String r0 = r0.A06
            java.io.File r3 = r1.A02(r0)
            if (r3 != 0) goto L_0x0010
        L_0x003c:
            r4 = 0
            return r4
        L_0x003e:
            X.0PD r6 = X.AnonymousClass0PD.PERIODIC_BATTERY
            X.0Q4 r7 = r13.A03()
            X.0Mg r5 = r13.A02()
            java.util.concurrent.ScheduledExecutorService r8 = X.C04350Ng.A04
            r9 = 30
            X.0bF r4 = new X.0bF
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0052:
            android.app.Application r0 = r13.A0L
            X.0Nl r4 = new X.0Nl
            r4.<init>(r0)
            return r4
        L_0x005a:
            android.app.Application r0 = r13.A0L
            X.0Us r4 = new X.0Us
            r4.<init>(r0)
            return r4
        L_0x0062:
            X.0Q4 r1 = r13.A03()
            X.0Mg r0 = r13.A02()
            X.0au r4 = new X.0au
            r4.<init>(r0, r1)
            return r4
        L_0x0070:
            r0 = 0
            X.0XY r4 = new X.0XY
            r4.<init>(r0)
            return r4
        L_0x0077:
            java.lang.Integer r5 = X.AnonymousClass006.A0L
            r0 = 1
            X.0XY r4 = new X.0XY
            r4.<init>(r0)
            X.0Vj r3 = new X.0Vj
            r3.<init>()
            android.app.Application r0 = r13.A0L
            X.0R8 r2 = new X.0R8
            r2.<init>(r0)
            X.0Xg r1 = new X.0Xg
            r1.<init>()
            X.0Xb r0 = new X.0Xb
            r0.<init>()
            X.0Mb[] r0 = new X.C04050Mb[]{r4, r3, r2, r1, r0}
            goto L_0x00cd
        L_0x009a:
            java.lang.Integer r5 = X.AnonymousClass006.A0q
            X.0Oe r1 = r13.A08
            if (r1 != 0) goto L_0x00a8
            r0 = 3
            com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2 r1 = new com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2
            r1.<init>(r13, r0)
            r13.A08 = r1
        L_0x00a8:
            X.0R7 r6 = new X.0R7
            r6.<init>(r1)
            r0 = 1
            X.0XY r7 = new X.0XY
            r7.<init>(r0)
            X.0Vj r8 = new X.0Vj
            r8.<init>()
            android.app.Application r0 = r13.A0L
            X.0R8 r9 = new X.0R8
            r9.<init>(r0)
            X.0Xg r10 = new X.0Xg
            r10.<init>()
            X.0Xb r11 = new X.0Xb
            r11.<init>()
            X.0Mb[] r0 = new X.C04050Mb[]{r6, r7, r8, r9, r10, r11}
        L_0x00cd:
            X.0Mp r4 = new X.0Mp
            r4.<init>(r5, r0)
            return r4
        L_0x00d3:
            android.app.Application r0 = r13.A0L
            r0.getPackageName()
            X.0Vz r4 = new X.0Vz
            r4.<init>()
            return r4
        L_0x00de:
            java.lang.Class<X.0ML> r1 = X.AnonymousClass0ML.class
            monitor-enter(r1)
            X.0MK r0 = X.AnonymousClass0ML.A00     // Catch:{ all -> 0x00fd }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x00ef
            X.0Yn r0 = new X.0Yn
            r0.<init>(r13, r12)
            monitor-enter(r1)
            X.AnonymousClass0ML.A00 = r0     // Catch:{ all -> 0x00fd }
            monitor-exit(r1)
        L_0x00ef:
            X.0Q4 r1 = r13.A03()
            X.0Mg r0 = r13.A02()
            X.0bO r4 = new X.0bO
            r4.<init>(r0, r1)
            return r4
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0100:
            X.0Q4 r1 = r13.A03()
            X.0Mg r0 = r13.A02()
            X.0bM r4 = new X.0bM
            r4.<init>(r0, r1)
            return r4
        L_0x010e:
            X.0Mg r0 = r13.A02()
            X.0bJ r4 = new X.0bJ
            r4.<init>(r0)
            return r4
        L_0x0118:
            X.0Mg r1 = r13.A02()
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            X.0aq r4 = new X.0aq
            r4.<init>(r1, r0)
            return r4
        L_0x0124:
            X.0Mg r0 = r13.A02()
            X.0at r4 = new X.0at
            r4.<init>(r0)
            return r4
        L_0x012e:
            X.0Q4 r1 = r13.A03()
            X.0Mg r0 = r13.A02()
            X.0bE r4 = new X.0bE
            r4.<init>(r0, r1)
            return r4
        L_0x013c:
            X.0Q4 r0 = r13.A03()
            X.0ad r4 = new X.0ad
            r4.<init>(r0)
            return r4
        L_0x0146:
            android.app.Application r0 = r13.A0L
            X.0RQ r4 = new X.0RQ
            r4.<init>(r0)
            return r4
        L_0x014e:
            android.app.Application r0 = r13.A0L
            X.0Lo r4 = new X.0Lo
            r4.<init>(r0, r13, r12)
            return r4
        L_0x0156:
            X.0Mg r0 = r13.A02()
            X.0bP r4 = new X.0bP
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCFactoryShape111S0000000_I2.AFC(X.0OK):java.lang.Object");
    }
}
