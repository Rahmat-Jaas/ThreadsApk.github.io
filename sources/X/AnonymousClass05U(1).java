package X;

import android.transition.Transition;

/* renamed from: X.05U  reason: invalid class name */
public final class AnonymousClass05U implements Transition.TransitionListener {
    public final /* synthetic */ C12810mW A00;
    public final /* synthetic */ Runnable A01;

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }

    public AnonymousClass05U(C12810mW r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onTransitionEnd(Transition transition) {
        this.A01.run();
    }
}
