package X;

import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;

/* renamed from: X.4Sa  reason: invalid class name and case insensitive filesystem */
public final class C73344Sa implements Runnable {
    public final /* synthetic */ Scene A00;
    public final /* synthetic */ Transition A01;
    public final /* synthetic */ AnonymousClass3TK A02;

    public C73344Sa(Scene scene, Transition transition, AnonymousClass3TK r3) {
        this.A02 = r3;
        this.A00 = scene;
        this.A01 = transition;
    }

    public final void run() {
        TransitionManager.go(this.A00, this.A01);
    }
}
