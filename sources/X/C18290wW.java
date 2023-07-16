package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0wW  reason: invalid class name and case insensitive filesystem */
public final class C18290wW extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C109326jp A03;

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C04220Ms.A0B(animator, 0);
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02(animator, 0);
        A002.A02(C18240wQ.A0X(this.A00), 1);
        C61043Rr.A00(this.A02, C63893iY.A05(A002, this.A01, 2), this.A03);
        this.A00 = false;
    }

    public C18290wW(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
