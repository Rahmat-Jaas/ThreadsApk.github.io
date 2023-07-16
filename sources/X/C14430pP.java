package X;

/* renamed from: X.0pP  reason: invalid class name and case insensitive filesystem */
public final class C14430pP implements C14870qJ {
    public int A00 = 0;
    public final C14870qJ[] A01;

    public final boolean CZY(UnsatisfiedLinkError unsatisfiedLinkError, C15010qZ[] r5) {
        int i;
        C14870qJ[] r1;
        do {
            i = this.A00;
            r1 = this.A01;
            if (i >= r1.length) {
                return false;
            }
            this.A00 = i + 1;
        } while (!r1[i].CZY(unsatisfiedLinkError, r5));
        return true;
    }

    public C14430pP(C14870qJ... r2) {
        this.A01 = r2;
    }
}
