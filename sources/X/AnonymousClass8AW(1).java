package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.8AW  reason: invalid class name */
public final class AnonymousClass8AW extends C1370685y implements C148838sG {
    public static final AnonymousClass8AW A00 = new AnonymousClass8AW();

    public final void AC7(CancellationException cancellationException) {
    }

    public final boolean BSN() {
        return false;
    }

    public final boolean Cuq() {
        return false;
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public AnonymousClass8AW() {
        super(C148838sG.A00);
    }

    public final CancellationException AWH() {
        throw C18180wK.A0a("This job is always active");
    }

    public final Object Ba9(C146958n9 r2) {
        throw C86134wK.A0s("This job is always active");
    }

    public final C148898sM A9u(C27178EfE efE) {
        return C1371986m.A00;
    }

    public final Et5 BQv(AnonymousClass0YY r2) {
        return C1371986m.A00;
    }

    public final Et5 BQw(AnonymousClass0YY r2, boolean z, boolean z2) {
        return C1371986m.A00;
    }
}
