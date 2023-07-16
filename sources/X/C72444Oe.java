package X;

/* renamed from: X.4Oe  reason: invalid class name and case insensitive filesystem */
public final class C72444Oe implements Runnable {
    public final /* synthetic */ C682042s A00;

    public C72444Oe(C682042s r1) {
        this.A00 = r1;
    }

    public final void run() {
        C682042s r2 = this.A00;
        C84654td r1 = r2.A02;
        if (r1 != null) {
            if ((r2.A0C || r2.A0B) && r2.A03 != null) {
                C682042s.A01(r2);
            } else {
                r1.Bel(r2.A03());
            }
            C682042s.A00(r2);
        }
    }
}
