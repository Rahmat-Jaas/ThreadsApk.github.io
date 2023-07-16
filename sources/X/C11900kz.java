package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0kz  reason: invalid class name and case insensitive filesystem */
public final class C11900kz implements AnonymousClass0gW {
    public boolean A00;
    public final int A01;
    public final String A02;
    public final C09810gi A03;
    public final AnonymousClass0gW A04;
    public final Queue A05;

    public C11900kz(C09810gi r2, AnonymousClass0gW r3) {
        this.A03 = r2;
        this.A02 = "notifications";
        this.A04 = r3;
        this.A01 = 60000;
        this.A05 = new ConcurrentLinkedQueue();
        this.A00 = false;
    }

    public C11900kz(C09810gi r2, AnonymousClass0gW r3, String str) {
        this.A03 = r2;
        this.A02 = str;
        this.A04 = r3;
        this.A01 = -1;
        this.A05 = new ConcurrentLinkedQueue();
        this.A00 = false;
    }

    public static void A00(C11900kz r2) {
        C11920l1 r1;
        synchronized (r2) {
            if (!r2.A00 && (r1 = (C11920l1) r2.A05.poll()) != null) {
                r2.A00 = true;
                r2.A04.AKp(r1);
            }
        }
    }

    public final void AKo(AnonymousClass0gJ r2) {
        throw new UnsupportedOperationException();
    }

    public final void AKp(AnonymousClass0gG r3) {
        this.A05.add(new C11920l1(r3, this));
        A00(this);
    }
}
