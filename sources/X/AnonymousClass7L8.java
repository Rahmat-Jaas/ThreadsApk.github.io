package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7L8  reason: invalid class name */
public final class AnonymousClass7L8 implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final AnonymousClass5AK A01;

    public AnonymousClass7L8(RecyclerView recyclerView, AnonymousClass5AK r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A01 = C18240wQ.A00(valueAnimator.getAnimatedValue());
        this.A00.invalidate();
    }
}
