package X;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.85F  reason: invalid class name */
public final class AnonymousClass85F implements Executor {
    public final AnonymousClass0gW A00;

    public AnonymousClass85F() {
        this((DefaultConstructorMarker) null, 0, 1);
    }

    public final void execute(Runnable runnable) {
        C04220Ms.A0B(runnable, 0);
        this.A00.AKp(new AnonymousClass614(runnable));
    }

    public /* synthetic */ AnonymousClass85F(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        AnonymousClass0gW A002 = AnonymousClass0gN.A00();
        C04220Ms.A06(A002);
        this.A00 = A002;
    }
}
