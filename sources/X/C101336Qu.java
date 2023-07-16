package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.facebook.redex.IDxUListenerShape146S0200000_2_I2;

/* renamed from: X.6Qu  reason: invalid class name and case insensitive filesystem */
public final class C101336Qu {
    public static /* synthetic */ AnimatorSet A00(Rect rect, Rect rect2, View view, AnonymousClass0YY r12, AnonymousClass0YY r13) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{rect.width(), rect2.width()});
        C86134wK.A0z(ofInt, r12, 5);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{rect.height(), rect2.height()});
        ofInt2.addUpdateListener(new IDxUListenerShape146S0200000_2_I2(ofInt2, r13, 4));
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ObjectAnimator.ofFloat(view, "X", new float[]{(float) rect.left, (float) rect2.left}), ObjectAnimator.ofFloat(view, "Y", new float[]{(float) rect.top, (float) rect2.top})});
        return animatorSet;
    }
}
