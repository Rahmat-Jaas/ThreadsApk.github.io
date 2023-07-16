package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.04Q  reason: invalid class name */
public final class AnonymousClass04Q extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass01I A02;
    public final /* synthetic */ AnonymousClass010 A03;
    public final /* synthetic */ C13370nZ A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass04Q(View view, ViewGroup viewGroup, AnonymousClass01I r3, AnonymousClass010 r4, C13370nZ r5, boolean z) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A05 = z;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        if (this.A05) {
            C011505i.A02(view, this.A04.A00);
        }
        this.A02.A02();
        C12560m7.A0E(2);
    }
}
