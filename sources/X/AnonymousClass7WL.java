package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7WL  reason: invalid class name */
public final class AnonymousClass7WL implements C145728kz {
    public C148838sG A00;
    public final AnonymousClass0YP A01;
    public final C83224qz A02;

    public final void Biz() {
        C148838sG r1 = this.A00;
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
        this.A00 = null;
    }

    public final void Bzv() {
        C148838sG r1 = this.A00;
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
        this.A00 = null;
    }

    public final void CFR() {
        C148838sG r3 = this.A00;
        if (r3 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause((Throwable) null);
            r3.AC7(cancellationException);
        }
        this.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, this.A01, this.A02, 3);
    }

    public AnonymousClass7WL(C27952Ew2 ew2, AnonymousClass0YP r3) {
        AnonymousClass0wJ.A1O(ew2, r3);
        this.A01 = r3;
        this.A02 = AnonymousClass7Ja.A03(ew2);
    }
}
