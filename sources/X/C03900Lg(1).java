package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0Lg  reason: invalid class name and case insensitive filesystem */
public final class C03900Lg {
    public static C03900Lg A01;
    public static final long A02 = TimeUnit.SECONDS.toNanos(1);
    public long A00 = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r3 > 240.0d) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(android.content.Context r8) {
        /*
            r7 = this;
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            java.lang.String r0 = "window"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            float r0 = r0.getRefreshRate()
            double r3 = (double) r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x0021:
            long r5 = A02
            double r0 = (double) r5
            double r0 = r0 / r3
            long r3 = java.lang.Math.round(r0)
            r7.A00 = r3
        L_0x002b:
            return r3
        L_0x002c:
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            r1 = 4642648265865560064(0x406e000000000000, double:240.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
        L_0x0038:
            r3 = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03900Lg.A00(android.content.Context):long");
    }
}
