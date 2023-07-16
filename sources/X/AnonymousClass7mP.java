package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mP  reason: invalid class name */
public final class AnonymousClass7mP implements C143908hV {
    public C143878hS A00;
    public final Object A01 = C86144wL.A0d();
    public final Executor A02;

    public final void DC3(AnonymousClass7HU r3) {
        synchronized (this.A01) {
        }
        this.A02.execute(new AnonymousClass81D(this, r3));
    }

    public AnonymousClass7mP(C143878hS r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }
}
