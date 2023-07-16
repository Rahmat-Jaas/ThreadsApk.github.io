package X;

/* renamed from: X.8bj  reason: invalid class name and case insensitive filesystem */
public final class C141508bj extends C27399Emr implements Runnable {
    public final long A00;

    public final void run() {
        A0L(new AnonymousClass8A0(AnonymousClass00U.A0T("Timed out waiting for ", " ms", this.A00), this));
    }

    public C141508bj(C146958n9 r2, long j) {
        super(r2, r2.getContext());
        this.A00 = j;
    }

    public final String A0E() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(super.A0E());
        A0r.append("(timeMillis=");
        A0r.append(this.A00);
        return AnonymousClass0wJ.A0u(A0r);
    }
}
