package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.4Nc  reason: invalid class name and case insensitive filesystem */
public final class C72224Nc implements Closeable, C83224qz {
    public final C27952Ew2 A00;

    public C72224Nc(C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 1);
        this.A00 = ew2;
    }

    public final C27952Ew2 Aa1() {
        return this.A00;
    }

    public final void close() {
        AnonymousClass7C2.A00((CancellationException) null, this.A00);
    }
}
