package X;

import android.os.Process;

/* renamed from: X.0Ne  reason: invalid class name and case insensitive filesystem */
public final class C04330Ne extends Thread {
    public final /* synthetic */ C04340Nf A00;
    public final /* synthetic */ Runnable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04330Ne(C04340Nf r1, Runnable runnable, String str) {
        super(str);
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(this.A00.A00);
        } catch (Throwable unused) {
            C04790Pd.A00();
        }
        this.A01.run();
    }
}
