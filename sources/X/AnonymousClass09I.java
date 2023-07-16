package X;

/* renamed from: X.09I  reason: invalid class name */
public final class AnonymousClass09I extends AnonymousClass0DX {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    public static double A00(AnonymousClass0DU r6) {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (r6.A03()) {
                AnonymousClass0DU.A00(r6);
                if (Character.isDigit(r6.A00)) {
                    j2 = (j2 * 10) + ((long) (r6.A00 - '0'));
                } else if (z) {
                    if (r6.A00 == '-') {
                        j = -1;
                    } else {
                        throw new AnonymousClass0DT("Couldn't read number!");
                    }
                } else if (!r6.A06) {
                    r6.A03--;
                    r6.A00 = r6.A01;
                    r6.A06 = true;
                } else {
                    throw new AnonymousClass0DT("Can only rewind one step!");
                }
                z = false;
            } else if (z) {
                throw new AnonymousClass0DT("Couldn't read number because the file ended!");
            }
        }
        double d = (((double) (j * j2)) * 1.0d) / ((double) C02830Db.A00);
        r6.A02();
        return d;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass09R();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A04(X.AnonymousClass0DW r7) {
        /*
            r6 = this;
            X.09R r7 = (X.AnonymousClass09R) r7
            java.lang.String r5 = "CpuMetricsCollector"
            X.AnonymousClass0DZ.A00(r7)
            r4 = 0
            java.lang.ThreadLocal r0 = r6.A01     // Catch:{ 0DT -> 0x00c9 }
            java.lang.Object r2 = r0.get()     // Catch:{ 0DT -> 0x00c9 }
            X.0DU r2 = (X.AnonymousClass0DU) r2     // Catch:{ 0DT -> 0x00c9 }
            if (r2 != 0) goto L_0x001a
            X.0DU r2 = new X.0DU     // Catch:{ 0DT -> 0x00c9 }
            r2.<init>()     // Catch:{ 0DT -> 0x00c9 }
            r0.set(r2)     // Catch:{ 0DT -> 0x00c9 }
        L_0x001a:
            r0 = 1
            r2.A05 = r0     // Catch:{ 0DT -> 0x00c9 }
            java.io.RandomAccessFile r3 = r2.A04     // Catch:{ 0DT -> 0x00c9 }
            if (r3 == 0) goto L_0x002a
            r0 = 0
            r3.seek(r0)     // Catch:{ IOException -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r2.A01()     // Catch:{ 0DT -> 0x00c9 }
        L_0x002a:
            java.io.RandomAccessFile r0 = r2.A04     // Catch:{ 0DT -> 0x00c9 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r3 = "/proc/self/stat"
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003a }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x003a }
            r2.A04 = r0     // Catch:{ IOException -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r2.A05 = r4     // Catch:{ 0DT -> 0x00c9 }
            r2.A01()     // Catch:{ 0DT -> 0x00c9 }
        L_0x003f:
            boolean r0 = r2.A05     // Catch:{ 0DT -> 0x00c9 }
            if (r0 == 0) goto L_0x00c7
            r0 = -1
            r2.A03 = r0     // Catch:{ 0DT -> 0x00c9 }
            r2.A02 = r4     // Catch:{ 0DT -> 0x00c9 }
            r2.A00 = r4     // Catch:{ 0DT -> 0x00c9 }
            r2.A01 = r4     // Catch:{ 0DT -> 0x00c9 }
            r2.A06 = r4     // Catch:{ 0DT -> 0x00c9 }
            r1 = 0
        L_0x004f:
            r2.A02()     // Catch:{ 0DT -> 0x00c9 }
            int r1 = r1 + 1
            r0 = 13
            if (r1 < r0) goto L_0x004f
            double r0 = A00(r2)     // Catch:{ 0DT -> 0x00c9 }
            r7.A03 = r0     // Catch:{ 0DT -> 0x00c9 }
            double r0 = A00(r2)     // Catch:{ 0DT -> 0x00c9 }
            r7.A02 = r0     // Catch:{ 0DT -> 0x00c9 }
            double r0 = A00(r2)     // Catch:{ 0DT -> 0x00c9 }
            r7.A01 = r0     // Catch:{ 0DT -> 0x00c9 }
            double r0 = A00(r2)     // Catch:{ 0DT -> 0x00c9 }
            r7.A00 = r0     // Catch:{ 0DT -> 0x00c9 }
            java.lang.ThreadLocal r1 = r6.A00
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x0080
            X.09R r0 = new X.09R
            r0.<init>()
            r1.set(r0)
        L_0x0080:
            java.lang.Object r4 = r1.get()
            X.09R r4 = (X.AnonymousClass09R) r4
            double r2 = r7.A03
            double r0 = r4.A03
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x00b3
            double r2 = r7.A02
            double r0 = r4.A02
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x00b3
            double r2 = r7.A01
            double r0 = r4.A01
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x00b3
            double r2 = r7.A00
            double r0 = r4.A00
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x00b3
            r4.A06(r7)
            r0 = 1
            return r0
        L_0x00b3:
            java.lang.String r3 = "Cpu Time Decreased from "
            java.lang.String r2 = r4.toString()
            java.lang.String r1 = " to "
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = X.AnonymousClass00U.A0d(r3, r2, r1, r0)
            r0 = 0
            android.util.Log.e(r5, r1, r0)
        L_0x00c7:
            r0 = 0
            return r0
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "Unable to parse CPU time field"
            android.util.Log.e(r5, r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09I.A04(X.0DW):boolean");
    }
}
