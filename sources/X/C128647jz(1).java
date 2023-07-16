package X;

import java.util.concurrent.Executor;

/* renamed from: X.7jz  reason: invalid class name and case insensitive filesystem */
public final class C128647jz implements C145348kM {
    public final C145348kM A00;
    public final Executor A01;

    public final void Bln(Throwable th) {
        this.A01.execute(new C1359880x(this, th));
    }

    public final void Blo(C108876j6 r3) {
        this.A01.execute(new C1359780w(r3, this));
    }

    public C128647jz(C145348kM r1, Executor executor) {
        this.A01 = executor;
        this.A00 = r1;
    }
}
