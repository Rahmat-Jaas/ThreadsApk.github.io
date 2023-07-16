package X;

import android.os.SystemClock;

/* renamed from: X.0ky  reason: invalid class name and case insensitive filesystem */
public final class C11890ky extends AnonymousClass0gG {
    public final AnonymousClass0gG A00;
    public final /* synthetic */ C11710kf A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11890ky(AnonymousClass0gG r5, C11710kf r6) {
        super(r5.getRunnableId(), r5.getPriority(), r5.isSendToNetworkThreadPool(), r5.isMayRunDuringStartup());
        this.A01 = r6;
        this.A00 = C09690fw.A00(r5);
        SystemClock.elapsedRealtime();
    }

    public final void run() {
        C11710kf r3 = this.A01;
        r3.A01.set(SystemClock.elapsedRealtime());
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.elapsedRealtime();
        synchronized (r3) {
            r3.A00 = false;
        }
        C11710kf.A00(r3);
    }

    public final String toString() {
        return this.A00.toString();
    }
}
