package X;

import android.content.Context;
import android.os.Process;

/* renamed from: X.08g  reason: invalid class name and case insensitive filesystem */
public final class C017408g {
    public long A00;
    public C017108d A01;
    public Integer A02 = AnonymousClass006.A00;
    public final int A03 = Process.myUid();
    public final Context A04;
    public final String A05;

    public final void A00() {
        C017108d r2;
        synchronized (this) {
            if (!(this.A02 == AnonymousClass006.A00 || (r2 = this.A01) == null)) {
                Object obj = r2.A05;
                synchronized (obj) {
                    r2.A01 = true;
                    obj.notifyAll();
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(X.C05010Qj r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.08d r0 = r5.A01     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x000f
            long r2 = r0.A03     // Catch:{ all -> 0x009f }
            long r0 = r5.A00     // Catch:{ all -> 0x009f }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x000f
            goto L_0x009d
        L_0x000f:
            int r0 = r7.intValue()     // Catch:{ all -> 0x009f }
            switch(r0) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0042;
                case 2: goto L_0x0060;
                case 3: goto L_0x0038;
                case 4: goto L_0x003d;
                case 5: goto L_0x0033;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x009f }
        L_0x0016:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x009d
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r2 = r6.A00     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r2.A0C     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "onCheckFailed"
            X.AnonymousClass0LU.A0B(r1, r0)     // Catch:{ all -> 0x009f }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x009f }
            r2.A03 = r0     // Catch:{ all -> 0x009f }
            android.os.Handler r1 = r2.A0Q     // Catch:{ all -> 0x009f }
            X.08L r0 = new X.08L     // Catch:{ all -> 0x009f }
            r0.<init>(r6)     // Catch:{ all -> 0x009f }
            goto L_0x008b
        L_0x0033:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x003d:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0042:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x009d
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r2 = r6.A00     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r2.A0C     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "On onErrorCleared"
            X.AnonymousClass0LU.A0C(r1, r0)     // Catch:{ all -> 0x009f }
            X.0N5 r0 = r2.A0U     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0058
            r0.CCg()     // Catch:{ all -> 0x009f }
        L_0x0058:
            android.os.Handler r1 = r2.A0Q     // Catch:{ all -> 0x009f }
            X.08K r0 = new X.08K     // Catch:{ all -> 0x009f }
            r0.<init>(r6)     // Catch:{ all -> 0x009f }
            goto L_0x008b
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x009f }
            r5.A02 = r0     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x009d
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r3 = r6.A00     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r3.A0C     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "On error detected %s %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9}     // Catch:{ all -> 0x009f }
            X.AnonymousClass0LU.A0O(r2, r1, r0)     // Catch:{ all -> 0x009f }
            java.lang.Object r1 = r3.A0W     // Catch:{ all -> 0x009f }
            monitor-enter(r1)     // Catch:{ all -> 0x009f }
            boolean r0 = r3.A0K     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x007c
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            goto L_0x009d
        L_0x007c:
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            X.0N5 r0 = r3.A0U     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0084
            r0.CCf()     // Catch:{ all -> 0x009f }
        L_0x0084:
            android.os.Handler r1 = r3.A0Q     // Catch:{ all -> 0x009f }
            X.08J r0 = new X.08J     // Catch:{ all -> 0x009f }
            r0.<init>(r6, r8, r9)     // Catch:{ all -> 0x009f }
        L_0x008b:
            r1.post(r0)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x008f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x0092:
            if (r6 == 0) goto L_0x009d
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r0 = r6.A00     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r0.A0C     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "Started monitoring"
            X.AnonymousClass0LU.A0C(r1, r0)     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r5)
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017408g.A01(X.0Qj, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public C017408g(Context context, String str) {
        this.A04 = context;
        this.A05 = str;
    }
}
