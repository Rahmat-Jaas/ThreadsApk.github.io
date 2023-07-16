package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxUListenerShape146S0200000_2_I2;

/* renamed from: X.86T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass86T implements C06070Xn {
    public static final /* synthetic */ AnonymousClass86T A00 = new AnonymousClass86T();

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        View view = (View) obj;
        Rect rect = (Rect) obj3;
        Rect rect2 = (Rect) obj4;
        AnonymousClass0YY r13 = (AnonymousClass0YY) obj5;
        AnonymousClass0YY r14 = (AnonymousClass0YY) obj6;
        AnonymousClass0YY r15 = (AnonymousClass0YY) obj7;
        AnonymousClass0wJ.A1N(view, obj2);
        C04220Ms.A0B(rect, 2);
        AnonymousClass0wJ.A1R(rect2, r13);
        C18230wP.A1R(r14, 5, r15);
        int width = ((int) (((float) rect2.width()) * 1.1f)) / 2;
        int height = ((int) (((float) rect2.height()) * 1.1f)) / 2;
        Rect A0F = C86164wN.A0F(rect2.centerX() - width, rect2.centerY() - height, rect2.centerX() + width, rect2.centerY() + height);
        AnimatorSet A002 = C101336Qu.A00(rect, A0F, view, r13, r14);
        A002.setInterpolator(new DecelerateInterpolator(1.0f));
        A002.setDuration(200);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new IDxUListenerShape146S0200000_2_I2(ofFloat, r15, 5));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{C101336Qu.A00(A0F, rect2, view, r13, r14), ofFloat});
        animatorSet.setDuration(700);
        animatorSet.setStartDelay(400);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{A002, animatorSet});
        return animatorSet2;
    }
}
