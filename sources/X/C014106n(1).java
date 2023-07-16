package X;

import android.view.Choreographer;

/* renamed from: X.06n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C014106n implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ C014106n(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void doFrame(long j) {
        this.A00.run();
    }
}
