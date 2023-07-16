package X;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.0PK  reason: invalid class name */
public final class AnonymousClass0PK extends C02290Ao {
    public final int A00;
    public final AnonymousClass0AW A01;
    public final File A02;
    public final String A03 = UUID.randomUUID().toString();

    public AnonymousClass0PK(AnonymousClass0AG r9, AnonymousClass0AU r10, AnonymousClass0AW r11, AnonymousClass0LI r12, File file, int i, int i2, int i3, int i4) {
        super(r9, r10, r12, i, i2, i3);
        this.A02 = file;
        this.A01 = r11;
        this.A00 = i4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:20|21|22|23|24|25|(2:27|32)(1:28)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00c2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C02280An A06(X.C02280An r16, java.lang.String r17) {
        /*
            r15 = this;
            r1 = 0
        L_0x0001:
            int r4 = r15.A00
            if (r1 >= r4) goto L_0x00ed
            java.io.File r0 = r15.A02
            java.lang.String r2 = "null"
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r2)
            java.lang.String r8 = r15.A03
            long r2 = X.AnonymousClass0AJ.A00()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r2)
            long r2 = X.AnonymousClass0AJ.A01()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r5, r2)
            java.lang.Class<X.0AJ> r2 = X.AnonymousClass0AJ.class
            monitor-enter(r2)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ea }
            monitor-exit(r2)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            java.util.concurrent.atomic.AtomicInteger r2 = X.AnonymousClass0AJ.A02
            int r2 = r2.getAndIncrement()
            java.lang.String r5 = "batch-"
            java.lang.String r7 = "-"
            java.lang.String r10 = java.lang.Integer.toString(r2)
            java.lang.String r11 = ".json"
            r9 = r7
            java.lang.String r2 = X.AnonymousClass00U.A0j(r5, r6, r7, r8, r9, r10, r11)
            java.io.File r8 = new java.io.File
            r8.<init>(r3, r2)
            if (r16 == 0) goto L_0x0080
            java.lang.String r3 = r8.getCanonicalPath()
            r2 = r16
            X.0PR r2 = (X.AnonymousClass0PR) r2
            java.io.File r2 = r2.A00
            java.lang.String r2 = r2.getCanonicalPath()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0080
            java.lang.String r5 = r8.getCanonicalPath()
            int r2 = r5.length()
            int r3 = r2 + -5
            r2 = 0
            java.lang.String r3 = r5.substring(r2, r3)
            java.lang.String r2 = "-1"
            java.lang.String r2 = X.AnonymousClass00U.A0V(r3, r2, r11)
            java.io.File r8 = new java.io.File
            r8.<init>(r2)
        L_0x0080:
            X.0AW r2 = r15.A01
            X.0AV r2 = r2.A02(r8)
            r7 = 0
            boolean r3 = r2.A0B(r15)     // Catch:{ all -> 0x00e3 }
            if (r3 != 0) goto L_0x00bd
            if (r1 < r4) goto L_0x00b6
            java.lang.String r6 = "EventBatchFileStore"
            java.lang.String r5 = "Couldn't lock newly created file. File name: %s, length: %d, path: %s, lockname: %s, %s, %s"
            java.lang.String r9 = r8.getName()     // Catch:{ all -> 0x00e3 }
            long r3 = r8.length()     // Catch:{ all -> 0x00e3 }
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r11 = r0.getCanonicalPath()     // Catch:{ all -> 0x00e3 }
            java.lang.String r12 = r2.A01()     // Catch:{ all -> 0x00e3 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14}     // Catch:{ all -> 0x00e3 }
            X.AnonymousClass0LU.A0O(r6, r5, r0)     // Catch:{ all -> 0x00e3 }
        L_0x00b6:
            r2.A03()
            int r1 = r1 + 1
            goto L_0x0001
        L_0x00bd:
            X.0PR r7 = r15.A00(r2, r8)     // Catch:{ FileNotFoundException -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            X.0PR r7 = r15.A00(r2, r8)     // Catch:{ all -> 0x00de }
        L_0x00c6:
            java.util.Set r0 = r15.A07     // Catch:{ all -> 0x00e3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00e3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00dd
            r1.next()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "onBatchCreated"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x00e3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e2
        L_0x00dd:
            return r7
        L_0x00de:
            r1 = move-exception
            r2.A08(r15)     // Catch:{ all -> 0x00e3 }
        L_0x00e2:
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r1 = move-exception
            if (r7 != 0) goto L_0x00fa
            r2.A03()
            throw r1
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00ed:
            java.lang.String r2 = "Failed to lock batch file after "
            java.lang.String r0 = " attempts"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r2, r0, r1)
            X.0Am r1 = new X.0Am
            r1.<init>(r0)
        L_0x00fa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PK.A06(X.0An, java.lang.String):X.0An");
    }

    public final /* bridge */ /* synthetic */ Object A07() {
        C02280An r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        return ((AnonymousClass0PR) r0).A00;
    }

    private AnonymousClass0PR A00(AnonymousClass0AV r3, File file) {
        if (file.getParentFile().isDirectory() || file.getParentFile().mkdirs()) {
            return new AnonymousClass0PR(r3, this, file);
        }
        StringBuilder sb = new StringBuilder("Unable to create parent directories for: ");
        sb.append(file);
        throw new IOException(sb.toString());
    }
}
