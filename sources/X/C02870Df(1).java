package X;

import java.util.ArrayDeque;

/* renamed from: X.0Df  reason: invalid class name and case insensitive filesystem */
public final class C02870Df implements AnonymousClass0C0 {
    public final int A00;
    public final AnonymousClass0C0 A01;
    public final /* synthetic */ AnonymousClass0C6 A02;

    public C02870Df(AnonymousClass0C0 r1, AnonymousClass0C6 r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void BxC() {
        Runnable runnable;
        int i = this.A00;
        AnonymousClass0C6 r2 = this.A02;
        synchronized (r2) {
            AnonymousClass0C5 r1 = (AnonymousClass0C5) r2.A01.get(i);
            if (r1 != null) {
                r1.A00 = null;
                r1.A00 = null;
                ArrayDeque arrayDeque = r1.A01;
                if (!(arrayDeque == null || (runnable = (Runnable) arrayDeque.poll()) == null)) {
                    runnable.run();
                }
            }
            this.A01.BxC();
        }
    }

    public final void CV4(boolean z) {
        this.A01.CV4(z);
    }
}
