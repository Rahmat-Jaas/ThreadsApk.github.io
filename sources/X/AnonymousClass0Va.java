package X;

import android.view.Choreographer;

/* renamed from: X.0Va  reason: invalid class name */
public final class AnonymousClass0Va implements Runnable {
    public final /* synthetic */ C08440dP A00;

    public AnonymousClass0Va(C08440dP r1) {
        this.A00 = r1;
    }

    public final void run() {
        C03880Le r0;
        C08440dP r5 = this.A00;
        if (r5.A0B == null) {
            r5.A0B = new C03930Lj(Choreographer.getInstance(), r5.A00);
        }
        if (r5.A02.get() && r5.A0A != -1 && (r0 = r5.A0B) != null) {
            r0.AJS();
        }
    }
}
