package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7yk  reason: invalid class name and case insensitive filesystem */
public final class C135017yk implements Runnable {
    public final WeakReference A00;

    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass586) weakReference.get()).A0M = false;
        }
    }

    public C135017yk(AnonymousClass586 r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
