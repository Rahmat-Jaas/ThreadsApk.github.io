package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.04T  reason: invalid class name */
public final class AnonymousClass04T implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass01I A02;
    public final /* synthetic */ AnonymousClass010 A03;
    public final /* synthetic */ C13370nZ A04;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        C12560m7.A0E(2);
    }

    public AnonymousClass04T(View view, ViewGroup viewGroup, AnonymousClass01I r3, AnonymousClass010 r4, C13370nZ r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = r3;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A01.post(new AnonymousClass04S(this));
        C12560m7.A0E(2);
    }
}
