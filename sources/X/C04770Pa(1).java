package X;

import android.os.SystemClock;

/* renamed from: X.0Pa  reason: invalid class name and case insensitive filesystem */
public final class C04770Pa implements Runnable {
    public final /* synthetic */ C07300bI A00;
    public final /* synthetic */ Throwable A01;

    public C04770Pa(C07300bI r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        String str;
        C07300bI r9 = this.A00;
        Throwable th = this.A01;
        C07150ay r5 = C07150ay.A07;
        if (r5 != null) {
            Thread currentThread = Thread.currentThread();
            synchronized (r5.A06) {
                if (th == null) {
                    str = "javascript";
                } else {
                    str = th.getMessage();
                    if (str == null) {
                        str = "javascript";
                    }
                }
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                AnonymousClass0O9 r3 = r5.A03;
                if (r3.Css(str, 1000)) {
                    AnonymousClass0Q4 r92 = r5.A05;
                    C002801h.A02(r92.A03, "Did you call SessionManager.init()?");
                    C04170Mn r6 = new C04170Mn(th);
                    r6.A03(AnonymousClass0MU.A4b, "javascript");
                    AnonymousClass0OO r0 = AnonymousClass0MU.A2y;
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    r6.A02(r0, valueOf);
                    r6.A02(AnonymousClass0MU.A1K, valueOf);
                    r6.A02(AnonymousClass0MU.A1L, Long.valueOf(r3.Ar8(str)));
                    r6.A02(AnonymousClass0MU.A2O, Long.valueOf(SystemClock.uptimeMillis() - r92.A01));
                    if (th != null) {
                        C07140ax.A01(r6, currentThread, th);
                    }
                    r6.A00(AnonymousClass0MU.A0I, true);
                    C04350Ng.A00.execute(new C04060Mc(r6, r5.A01, r5, r5.A00));
                    r5.A00++;
                }
            }
            return;
        }
        C07300bI.A00(r9, "javascript", "JavascriptCrashDetector not initialized", th, 1);
    }
}
