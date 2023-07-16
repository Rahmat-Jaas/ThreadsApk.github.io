package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mO  reason: invalid class name */
public final class AnonymousClass7mO implements C143908hV {
    public C143868hR A00;
    public final Object A01 = C86144wL.A0d();
    public final Executor A02;

    public final void DC3(AnonymousClass7HU r3) {
        if (r3.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new C135457zW(this));
        }
    }

    public AnonymousClass7mO(C143868hR r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }
}
