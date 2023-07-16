package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mN  reason: invalid class name */
public final class AnonymousClass7mN implements C143908hV {
    public final C143858hQ A00;
    public final AnonymousClass7HU A01;
    public final Executor A02;

    public AnonymousClass7mN(C143858hQ r1, AnonymousClass7HU r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DC3(AnonymousClass7HU r3) {
        this.A02.execute(new AnonymousClass81B(this, r3));
    }
}
