package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mR  reason: invalid class name */
public final class AnonymousClass7mR implements C143908hV {
    public C143898hU A00;
    public final Object A01 = C86144wL.A0d();
    public final Executor A02;

    public AnonymousClass7mR(C143898hU r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void DC3(AnonymousClass7HU r3) {
        if (r3.A0C()) {
            synchronized (this.A01) {
            }
            this.A02.execute(new AnonymousClass81F(this, r3));
        }
    }
}
