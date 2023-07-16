package X;

import android.os.PowerManager;
import java.lang.ref.WeakReference;

/* renamed from: X.0Dk  reason: invalid class name and case insensitive filesystem */
public final class C02920Dk {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04 = Long.MAX_VALUE;
    public boolean A05 = false;
    public boolean A06 = true;
    public final String A07;
    public final WeakReference A08;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0 != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C02920Dk r6, long r7) {
        /*
            boolean r0 = r6.A05
            r5 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r6.A06
            r4 = 1
            if (r0 == 0) goto L_0x0012
            int r0 = r6.A00
            int r0 = r0 - r4
            r6.A00 = r0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            return r5
        L_0x0012:
            r6.A03 = r7
            long r2 = r6.A02
            long r0 = r6.A01
            long r7 = r7 - r0
            long r2 = r2 + r7
            r6.A02 = r2
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.A04 = r0
            r6.A05 = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02920Dk.A00(X.0Dk, long):boolean");
    }

    public C02920Dk(PowerManager.WakeLock wakeLock, String str) {
        this.A07 = str;
        this.A08 = new WeakReference(wakeLock);
    }
}
