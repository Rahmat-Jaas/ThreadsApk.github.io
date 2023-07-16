package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.concurrent.Executor;

/* renamed from: X.0r3  reason: invalid class name and case insensitive filesystem */
public final class C15280r3 implements AnonymousClass0W4 {
    public final Executor A00;

    public final void execute(Runnable runnable) {
        this.A00.execute(runnable);
    }

    public C15280r3(boolean z) {
        this.A00 = new AnonymousClass0gV(new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "IgQPLBackgroundExecution"), HttpStatus.SC_UNAUTHORIZED, 5, z, false);
    }

    public C15280r3() {
        this(false);
    }
}
