package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7yj  reason: invalid class name and case insensitive filesystem */
public final class C135007yj implements Runnable {
    public final WeakReference A00;

    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass586) weakReference.get()).A0K = false;
        }
    }

    public C135007yj(AnonymousClass586 r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
