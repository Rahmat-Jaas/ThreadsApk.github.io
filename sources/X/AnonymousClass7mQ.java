package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mQ  reason: invalid class name */
public final class AnonymousClass7mQ implements C143908hV {
    public C143888hT A00;
    public final Object A01 = C86144wL.A0d();
    public final Executor A02;

    public AnonymousClass7mQ(C143888hT r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void DC3(AnonymousClass7HU r3) {
        if (!r3.A0C() && !r3.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new AnonymousClass81E(this, r3));
        }
    }
}
