package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.0wU  reason: invalid class name and case insensitive filesystem */
public final class C18270wU extends AnimatorListenerAdapter {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ C27351sN A01;

    public C18270wU(IgTextView igTextView, C27351sN r2) {
        this.A01 = r2;
        this.A00 = igTextView;
    }

    public final void onAnimationEnd(Animator animator) {
        IgTextView igTextView = this.A00;
        igTextView.setVisibility(8);
        igTextView.setAlpha(1.0f);
        igTextView.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
