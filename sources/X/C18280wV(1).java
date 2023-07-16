package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.0wV  reason: invalid class name and case insensitive filesystem */
public final class C18280wV extends AnimatorListenerAdapter {
    public final /* synthetic */ IgLinearLayout A00;
    public final /* synthetic */ IgLinearLayout A01;
    public final /* synthetic */ IgView A02;
    public final /* synthetic */ IgView A03;
    public final /* synthetic */ C27351sN A04;

    public C18280wV(IgLinearLayout igLinearLayout, IgLinearLayout igLinearLayout2, IgView igView, IgView igView2, C27351sN r5) {
        this.A04 = r5;
        this.A00 = igLinearLayout;
        this.A03 = igView;
        this.A02 = igView2;
        this.A01 = igLinearLayout2;
    }

    public final void onAnimationEnd(Animator animator) {
        IgLinearLayout igLinearLayout = this.A00;
        igLinearLayout.setVisibility(8);
        this.A03.setVisibility(8);
        this.A02.setVisibility(0);
        igLinearLayout.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01.setLayoutTransition((LayoutTransition) null);
    }
}
