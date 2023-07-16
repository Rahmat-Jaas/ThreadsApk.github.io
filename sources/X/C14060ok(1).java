package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.0ok  reason: invalid class name and case insensitive filesystem */
public final class C14060ok extends AnonymousClass0gG {
    public final /* synthetic */ C05900Ww A00;
    public final /* synthetic */ AnonymousClass01V A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14060ok(C05900Ww r5, AnonymousClass01V r6) {
        super(561673025, 5, true, false);
        this.A01 = r6;
        this.A00 = r5;
    }

    public final void run() {
        C12300lf A002 = C12300lf.A00();
        AnonymousClass01V r5 = this.A01;
        C12280ld r4 = (C12280ld) this.A00;
        Lock lock = A002.A05;
        lock.lock();
        try {
            if (A002.A00 != null) {
                r4.BQL(A002.A00, String.valueOf(A002.A04.size()));
            }
            A002.A04.put(r4, r5);
            C18150wG[] r0 = A002.A02;
            if (r0 != null) {
                A002.A02 = null;
                A002.A02(r0);
            }
        } finally {
            lock.unlock();
        }
    }
}
