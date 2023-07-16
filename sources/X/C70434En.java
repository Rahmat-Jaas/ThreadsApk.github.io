package X;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4En  reason: invalid class name and case insensitive filesystem */
public final class C70434En implements C82764qE {
    public AtomicBoolean A00 = C18230wP.A0w();
    public final C82764qE A01;

    public final void BMv(FragmentActivity fragmentActivity) {
        C04220Ms.A0B(fragmentActivity, 0);
        if (!this.A00.getAndSet(true)) {
            this.A01.BMv(fragmentActivity);
        }
    }

    public C70434En(C82764qE r2) {
        this.A01 = r2;
    }
}
