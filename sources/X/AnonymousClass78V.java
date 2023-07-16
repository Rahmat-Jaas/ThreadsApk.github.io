package X;

import android.os.Handler;

/* renamed from: X.78V  reason: invalid class name */
public final class AnonymousClass78V {
    public static final Handler A00 = AnonymousClass0wJ.A0F();
    public static final C110526lp A01;
    public static final AnonymousClass78V A02 = new AnonymousClass78V();

    public final void A00(I2F i2f) {
        C04220Ms.A0B(i2f, 0);
        Handler handler = A00;
        C135287zB r2 = i2f.A0D;
        handler.removeCallbacks(r2);
        C110526lp r0 = A01;
        synchronized (r0.A03) {
            r0.A00.remove(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r3.A02.post(r3.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.I2F r6) {
        /*
            r5 = this;
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            android.os.Handler r0 = A00
            X.7zB r4 = r6.A0D
            r0.removeCallbacks(r4)
            X.6lp r3 = A01
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L_0x0043
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.util.ArrayList r0 = r3.A00     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0028
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            return
        L_0x0028:
            java.util.ArrayList r0 = r3.A00     // Catch:{ all -> 0x0040 }
            r0.add(r4)     // Catch:{ all -> 0x0040 }
            int r1 = r0.size()     // Catch:{ all -> 0x0040 }
            r0 = 1
            if (r1 == r0) goto L_0x0035
            r0 = 0
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0048
            android.os.Handler r1 = r3.A02
            java.lang.Runnable r0 = r3.A04
            r1.post(r0)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0043:
            X.I2F r0 = r4.A00
            r0.A01()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78V.A01(X.I2F):void");
    }

    static {
        C110526lp r0;
        synchronized (C110526lp.class) {
            r0 = C110526lp.A05;
            if (r0 == null) {
                r0 = new C110526lp();
                C110526lp.A05 = r0;
            }
        }
        A01 = r0;
    }
}
