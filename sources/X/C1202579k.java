package X;

/* renamed from: X.79k  reason: invalid class name and case insensitive filesystem */
public final class C1202579k {
    public Exception A00;
    public boolean A01;
    public final C113716s1 A02 = new C113716s1();
    public final Object A03 = C86144wL.A0d();

    public static final void A00(C1202579k r2) {
        synchronized (r2.A03) {
            if (r2.A01) {
                r2.A02.A01(r2);
            }
        }
    }

    public final Exception A01() {
        Exception exc;
        synchronized (this.A03) {
            exc = this.A00;
        }
        return exc;
    }

    public final void A02() {
        Throwable th;
        synchronized (this.A03) {
            if (this.A01) {
                Exception exc = this.A00;
                if (exc != null) {
                    th = new AnonymousClass5r6(exc);
                }
            } else {
                th = C18180wK.A0a(String.valueOf("Task is not yet complete"));
            }
            throw th;
        }
    }

    public final boolean A03() {
        boolean z;
        synchronized (this.A03) {
            z = false;
            if (this.A01 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}
