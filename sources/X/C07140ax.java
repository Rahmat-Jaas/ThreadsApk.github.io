package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.Constants;
import com.facebook.redex.IDxEHandlerShape300S0200000_I2;
import com.facebook.redex.IDxEHandlerShape806S0100000_I2;

/* renamed from: X.0ax  reason: invalid class name and case insensitive filesystem */
public final class C07140ax implements AnonymousClass0PC {
    public static final AnonymousClass0PN A05 = new C07130aw();
    public C06110Xs A00;
    public AnonymousClass0PN A01;
    public final C04100Mg A02;
    public final AnonymousClass0PN A03;
    public final AnonymousClass0Q4 A04;
    public byte[] mOomReservation;

    public final void A02(Thread thread, Throwable th) {
        AnonymousClass0NQ r0;
        this.mOomReservation = null;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        AnonymousClass0Q4 r7 = this.A04;
        C06040Xk r1 = r7.A03;
        C002801h.A02(r1, "Did you call SessionManager.init()?");
        if (th instanceof AnonymousClass0IS) {
            r0 = AnonymousClass0NQ.A0D;
        } else {
            r0 = AnonymousClass0NQ.A0C;
        }
        r1.A0A(r0);
        this.A03.A4x(thread, th);
        boolean z = false;
        C04170Mn r4 = new C04170Mn(th);
        try {
            r4.A02(AnonymousClass0MU.A2y, Long.valueOf(currentTimeMillis));
            r4.A03(AnonymousClass0MU.A4b, "exception");
            A01(r4, thread, th);
            r4.A02(AnonymousClass0MU.A2O, Long.valueOf(SystemClock.uptimeMillis() - r7.A01));
            while (th.getCause() != null) {
                th = th.getCause();
            }
            z = th instanceof OutOfMemoryError;
        } catch (Throwable th2) {
            C04790Pd.A00();
            r4.A03(AnonymousClass0MU.A5Z, th2.getMessage());
        }
        C04100Mg r3 = this.A02;
        AnonymousClass0ND r2 = AnonymousClass0ND.CRITICAL_REPORT;
        r3.A0C(r2, this);
        r3.A06(r4, r2, this);
        r3.A09 = true;
        if (!z) {
            r3.A0B(r2, this);
        }
        AnonymousClass0ND r02 = AnonymousClass0ND.LARGE_REPORT;
        r3.A0C(r02, this);
        r3.A06(r4, r02, this);
        r3.A0A = true;
        if (z) {
            r3.A0B(r2, this);
        }
        r3.A0B(r02, this);
    }

    public static void A00(C04050Mb r1, C04100Mg r2, AnonymousClass0ND r3) {
        AnonymousClass0PC r0 = (AnonymousClass0PC) r2.A03(C07140ax.class);
        if (r0 == null) {
            AnonymousClass0LU.A0C("lacrima", "Cannot find registered detector");
        } else {
            r2.A05(r1, r3, r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r1 = X.AnonymousClass00U.A0L(r6.toString(), ": truncated trace");
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[LOOP:0: B:29:0x0079->B:31:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C04170Mn r4, java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            java.lang.Class<X.0MN> r1 = X.AnonymousClass0MN.class
            monitor-enter(r1)     // Catch:{ all -> 0x0048 }
            java.io.StringWriter r0 = X.AnonymousClass0MN.A01     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x001f
            java.io.PrintWriter r0 = X.AnonymousClass0MN.A00     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x001f
            r6.printStackTrace(r0)     // Catch:{ all -> 0x0045 }
            java.io.PrintWriter r0 = X.AnonymousClass0MN.A00     // Catch:{ all -> 0x0045 }
            r0.close()     // Catch:{ all -> 0x0045 }
            java.io.StringWriter r0 = X.AnonymousClass0MN.A01     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0045 }
            r0 = 0
            X.AnonymousClass0MN.A00 = r0     // Catch:{ all -> 0x0045 }
            X.AnonymousClass0MN.A01 = r0     // Catch:{ all -> 0x0045 }
            goto L_0x0023
        L_0x001f:
            java.lang.String r3 = X.AnonymousClass0MN.A01(r6)     // Catch:{ all -> 0x0045 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            int r2 = r3.length()     // Catch:{ all -> 0x0048 }
            r0 = 10
            java.lang.String r1 = "No stack trace"
            if (r2 >= r0) goto L_0x003e
            java.lang.String r0 = r3.trim()     // Catch:{ all -> 0x0048 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "lacrima"
            X.AnonymousClass0LU.A0C(r0, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0055
        L_0x003e:
            r0 = 20000(0x4e20, float:2.8026E-41)
            java.lang.String r1 = X.AnonymousClass0MN.A00(r3, r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0055
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = ": truncated trace"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            X.C04790Pd.A00()
        L_0x0055:
            X.0ON r0 = X.AnonymousClass0MU.A5k
            r4.A03(r0, r1)
            X.0ON r1 = X.AnonymousClass0MU.A5m
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            r4.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A5n
            java.lang.String r0 = r6.getMessage()
            r4.A03(r1, r0)
            if (r5 != 0) goto L_0x0084
            java.lang.String r1 = "unknown"
        L_0x0074:
            X.0ON r0 = X.AnonymousClass0MU.A5o
            r4.A03(r0, r1)
        L_0x0079:
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L_0x008d
            java.lang.Throwable r6 = r6.getCause()
            goto L_0x0079
        L_0x0084:
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0074
        L_0x008d:
            X.0ON r1 = X.AnonymousClass0MU.A5f
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            r4.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A5h
            java.lang.String r0 = X.AnonymousClass0MN.A01(r6)
            r4.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A5g
            java.lang.String r0 = r6.getMessage()
            r4.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07140ax.A01(X.0Mn, java.lang.Thread, java.lang.Throwable):void");
    }

    public C07140ax(C04100Mg r1, C06110Xs r2, AnonymousClass0PN r3, AnonymousClass0PN r4, AnonymousClass0Q4 r5) {
        this.A04 = r5;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.JAVA_DETECT;
    }

    public final void start() {
        if (AnonymousClass0IR.A01() != null) {
            AnonymousClass0IR.A03(new IDxEHandlerShape806S0100000_I2(this, 1), 100);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(new IDxEHandlerShape300S0200000_I2(0, this, Thread.getDefaultUncaughtExceptionHandler()));
        }
        this.mOomReservation = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    }
}
