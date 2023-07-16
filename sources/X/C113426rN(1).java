package X;

/* renamed from: X.6rN  reason: invalid class name and case insensitive filesystem */
public final class C113426rN {
    public final AnonymousClass7HU A00 = new AnonymousClass7HU();

    public final boolean A00(Exception exc) {
        AnonymousClass7HU r3 = this.A00;
        C13320nQ.A02(exc, "Exception must not be null");
        synchronized (r3.A04) {
            if (r3.A02) {
                return false;
            }
            r3.A02 = true;
            r3.A00 = exc;
            r3.A03.A01(r3);
            return true;
        }
    }

    public final boolean A01(Object obj) {
        AnonymousClass7HU r3 = this.A00;
        synchronized (r3.A04) {
            if (r3.A02) {
                return false;
            }
            r3.A02 = true;
            r3.A01 = obj;
            r3.A03.A01(r3);
            return true;
        }
    }
}
