package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.widget.LinearLayout;

/* renamed from: X.7L9  reason: invalid class name */
public final class AnonymousClass7L9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113176qs A01;

    public AnonymousClass7L9(C113176qs r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        int A04 = AnonymousClass0wJ.A04(C86134wK.A0e(valueAnimator));
        LinearLayout linearLayout = this.A01.A04;
        linearLayout.setClipBounds(new Rect(0, 0, A04, this.A00));
        linearLayout.invalidate();
    }
}
