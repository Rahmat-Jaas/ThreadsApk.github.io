package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7C2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7C2 {
    public static final void A00(CancellationException cancellationException, C27952Ew2 ew2) {
        C148838sG A00 = C148838sG.A00(ew2);
        if (A00 != null) {
            A00.AC7(cancellationException);
        }
    }

    public static final void A01(C27952Ew2 ew2) {
        C148838sG A00 = C148838sG.A00(ew2);
        if (A00 != null && !A00.isActive()) {
            throw A00.AWH();
        }
    }

    public static final boolean A02(C27952Ew2 ew2) {
        C148838sG A00 = C148838sG.A00(ew2);
        if (A00 == null || !A00.isActive()) {
            return false;
        }
        return true;
    }
}
