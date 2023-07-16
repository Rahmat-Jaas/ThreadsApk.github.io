package X;

import android.animation.ValueAnimator;
import com.instagram.barcelona.R;

/* renamed from: X.7LD  reason: invalid class name */
public final class AnonymousClass7LD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B5b A01;
    public final /* synthetic */ C18266Acd A02;
    public final /* synthetic */ AnonymousClass0YY A03;

    public AnonymousClass7LD(B5b b5b, C18266Acd acd, AnonymousClass0YY r3, int i) {
        this.A01 = b5b;
        this.A00 = i;
        this.A02 = acd;
        this.A03 = r3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        this.A02.A00(C86154wM.A0f(this.A03, C09760gd.A02(C18240wQ.A00(C86144wL.A0e(valueAnimator)), C19556AyH.A02(this.A01, R.color.fds_transparent), this.A00)));
    }
}
