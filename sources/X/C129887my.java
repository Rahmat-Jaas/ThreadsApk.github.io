package X;

import java.util.concurrent.Executor;

/* renamed from: X.7my  reason: invalid class name and case insensitive filesystem */
public final class C129887my implements C143958ha {
    public final C143948hZ A00;
    public final Object A01 = C86144wL.A0d();
    public final Executor A02;

    public final void DC0(C1202579k r3) {
        synchronized (this.A01) {
        }
        this.A02.execute(new AnonymousClass81I(this, r3));
    }

    public C129887my(C143948hZ r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }
}
