package X;

import java.util.concurrent.Executor;

/* renamed from: X.0gV  reason: invalid class name */
public final class AnonymousClass0gV implements Executor {
    public final int A00;
    public final int A01;
    public final AnonymousClass0gW A02;
    public final boolean A03;
    public final boolean A04;

    public final void execute(Runnable runnable) {
        this.A02.AKp(new C13010mr(this, runnable, this.A01, this.A00, this.A04, this.A03));
    }

    public AnonymousClass0gV(AnonymousClass0gW r1, int i, int i2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = z2;
    }
}
