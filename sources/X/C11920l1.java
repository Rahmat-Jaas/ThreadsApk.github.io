package X;

import android.os.SystemClock;

/* renamed from: X.0l1  reason: invalid class name and case insensitive filesystem */
public final class C11920l1 extends AnonymousClass0gG {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass0gG A01;
    public final /* synthetic */ C11900kz A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11920l1(AnonymousClass0gG r5, C11900kz r6) {
        super(r5.getRunnableId(), r5.getPriority(), r5.isSendToNetworkThreadPool(), r5.isMayRunDuringStartup());
        this.A02 = r6;
        this.A01 = C09690fw.A00(r5);
    }

    public final void run() {
        C11900kz r5 = this.A02;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = r5.A01;
        if (i != -1 && elapsedRealtime - this.A00 > ((long) i)) {
            C10450iM.A03("dispatch time exceeded limit", r5.A02);
        }
        SystemClock.currentThreadTimeMillis();
        this.A01.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.elapsedRealtime();
        synchronized (r5) {
            r5.A00 = false;
        }
        C11900kz.A00(r5);
    }

    public final String toString() {
        return this.A01.toString();
    }
}
