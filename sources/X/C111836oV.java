package X;

/* renamed from: X.6oV  reason: invalid class name and case insensitive filesystem */
public final class C111836oV {
    public final C1202579k A00 = new C1202579k();

    public final void A00(Exception exc) {
        C1202579k r2 = this.A00;
        synchronized (r2.A03) {
            if (!r2.A01) {
                r2.A01 = true;
                r2.A00 = exc;
                r2.A02.A01(r2);
            }
        }
    }
}
