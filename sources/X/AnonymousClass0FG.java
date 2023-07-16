package X;

/* renamed from: X.0FG  reason: invalid class name */
public final class AnonymousClass0FG implements Runnable {
    public final /* synthetic */ AnonymousClass0FK A00;

    public AnonymousClass0FG(AnonymousClass0FK r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|4|(1:6)|22|7|(2:9|10)|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            java.lang.String r1 = "AppUnpacker.finishUnpackingOnBackgroundThread()"
            r0 = -7120075(0xffffffffff935b35, float:NaN)
            X.C13850oP.A01(r2, r1, r0)
            X.0FK r7 = r8.A00     // Catch:{ IOException -> 0x003f }
            X.0FJ[] r6 = r7.A05     // Catch:{ IOException -> 0x0035 }
            int r5 = r6.length     // Catch:{ IOException -> 0x0035 }
            r4 = 0
        L_0x0013:
            if (r4 >= r5) goto L_0x001e
            r1 = r6[r4]     // Catch:{ IOException -> 0x0035 }
            r0 = 0
            r1.A01(r0)     // Catch:{ IOException -> 0x0035 }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x001e:
            java.io.File r4 = r7.A02     // Catch:{ IOException -> 0x0035 }
            java.lang.String r1 = ".unpacked"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0035 }
            boolean r0 = r0.createNewFile()     // Catch:{ IOException -> 0x0035 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r1 = "Could not create .unpacked file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            throw r0     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            X.AnonymousClass0FK.A00(r7)     // Catch:{ IOException -> 0x003f }
            r0 = 1392940333(0x5306952d, float:5.7802837E11)
            X.C13850oP.A00(r2, r0)
            return
        L_0x003f:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0046 }
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            r0 = 1721410292(0x669aa2f4, float:3.651252E23)
            X.C13850oP.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FG.run():void");
    }
}
