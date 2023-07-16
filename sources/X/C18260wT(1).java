package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0wT  reason: invalid class name and case insensitive filesystem */
public final class C18260wT extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass51X A00;

    public C18260wT(AnonymousClass51X r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass51X r1 = this.A00;
        if (r1.getChildCount() > 0) {
            r1.removeViewAt(0);
        }
    }
}
