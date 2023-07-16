package X;

import android.animation.Animator;

/* renamed from: X.04R  reason: invalid class name */
public final class AnonymousClass04R implements C143138gA {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ AnonymousClass010 A01;
    public final /* synthetic */ C13370nZ A02;

    public AnonymousClass04R(Animator animator, AnonymousClass010 r2, C13370nZ r3) {
        this.A01 = r2;
        this.A00 = animator;
        this.A02 = r3;
    }

    public final void onCancel() {
        this.A00.end();
        C12560m7.A0E(2);
    }
}
