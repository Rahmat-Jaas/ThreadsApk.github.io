package com.facebookpay.widget.paybutton;

import X.AnonymousClass006;
import X.AnonymousClass0OY;
import X.AnonymousClass0TJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass51z;
import X.AnonymousClass67Q;
import X.AnonymousClass697;
import X.AnonymousClass69C;
import X.AnonymousClass7Fd;
import X.AnonymousClass7HK;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass7LF;
import X.AnonymousClass8HD;
import X.C04220Ms;
import X.C04530Oa;
import X.C116836xd;
import X.C121097Ec;
import X.C18190wL;
import X.C28174Ezk;
import X.C29934Fwk;
import X.C63803iN;
import X.C86134wK;
import X.D57;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAListenerShape371S0100000_2_I2;
import com.facebook.redex.IDxUListenerShape92S0300000_2_I2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.button.FBPayButton;
import com.instagram.barcelona.R;

public final class FBPayAnimationButton extends ShimmerFrameLayout {
    public static final C04530Oa A0D = AnonymousClass0OY.A02(AnonymousClass8HD.A00);
    public static final boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A06, AnonymousClass7HK.A00(), 36317470363225880L);
    public Dialog A00;
    public Drawable A01;
    public Drawable A02;
    public ViewPropertyAnimator A03;
    public ViewPropertyAnimator A04;
    public TextView A05;
    public FBPayButton A06;
    public AnonymousClass51z A07;
    public AnonymousClass0ZU A08;
    public String A09;
    public boolean A0A;
    public final int A0B;
    public final AttributeSet A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A0C = attributeSet;
        this.A0B = i;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        setClipChildren(false);
        Context context2 = getContext();
        AnonymousClass7Kz.A0G();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIButton, C29934Fwk.A0b);
        AnonymousClass7Kz.A0G();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context2, drawable, AnonymousClass7Kz.A0G(), 15);
        this.A01 = drawable;
        AnonymousClass7Kz.A0G();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        AnonymousClass7Kz.A0G();
        int color = context2.getColor(R.color.fds_transparent);
        C04220Ms.A0B(drawable2, 1);
        drawable2.setTint(color);
        this.A02 = drawable2;
        obtainStyledAttributes.recycle();
        D57.A00(this, (Integer) null);
        A00();
        this.A09 = "";
    }

    private final Animator.AnimatorListener getCollapseButtonAnimationEndListener() {
        return new IDxAListenerShape371S0100000_2_I2(this, 0);
    }

    public final void A07(boolean z) {
        super.A07(true);
        Drawable drawable = this.A01;
        if (drawable == null) {
            C04220Ms.A0E("shimmerViewBackground");
            throw null;
        }
        setBackground(drawable);
        getButtonView().setVisibility(8);
        getProgressBarView().setVisibility(8);
        C116836xd.A00(this, (Boolean) null, AnonymousClass006.A00, (String) null, getButtonView().getContext().getString(2131826410));
        setImportantForAccessibility(1);
    }

    public final void A0B(AnonymousClass7Kx r9) {
        AnonymousClass67Q r2 = r9.A00;
        if (r2 != AnonymousClass67Q.LOADING) {
            removeView(getButtonView());
            ViewPropertyAnimator viewPropertyAnimator = getProgressBarView().A03;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            if (getProgressBarView().getScaleX() != 1.0f) {
                getProgressBarView().setScaleX(1.0f);
                getProgressBarView().setScaleY(1.0f);
            }
            A01();
            if (r2 != null) {
                int ordinal = r2.ordinal();
                if (ordinal == 0) {
                    C116836xd.A00(this, (Boolean) null, AnonymousClass006.A00, (String) null, getContext().getString(2131826588));
                    setImportantForAccessibility(1);
                    getProgressBarView().setIcon(AnonymousClass697.PROGRESS_SPINNER_CHECK_MARK);
                    AnonymousClass51z progressBarView = getProgressBarView();
                    progressBarView.setVisibility(0);
                    progressBarView.setCircleColor(4);
                    progressBarView.A00(21);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
                    ofFloat.setDuration(250).addUpdateListener(new IDxUListenerShape92S0300000_2_I2(0, C18190wL.A0A(progressBarView), this, this.A08));
                    ofFloat.start();
                } else if (ordinal == 1) {
                    C116836xd.A00(this, (Boolean) null, AnonymousClass006.A00, (String) null, getContext().getString(2131826589));
                    setImportantForAccessibility(1);
                    getProgressBarView().setCircleColor(4);
                    AnonymousClass51z progressBarView2 = getProgressBarView();
                    progressBarView2.A00(4);
                    RotateDrawable rotateDrawable = progressBarView2.A02;
                    if (rotateDrawable == null) {
                        C04220Ms.A0E("layerSpinnerRingDrawable");
                        throw null;
                    }
                    rotateDrawable.setAlpha(0);
                    getProgressBarView().setIcon(AnonymousClass697.PROGRESS_SPINNER_CROSS);
                    if (Build.VERSION.SDK_INT >= 30) {
                        performHapticFeedback(16);
                    }
                }
            }
        }
    }

    public final void setButtonView(FBPayButton fBPayButton) {
        C04220Ms.A0B(fBPayButton, 0);
        this.A06 = fBPayButton;
    }

    public final void setProgressBarView(AnonymousClass51z r2) {
        C04220Ms.A0B(r2, 0);
        this.A07 = r2;
    }

    public final void setProgressMsgView(TextView textView) {
        C04220Ms.A0B(textView, 0);
        this.A05 = textView;
    }

    public final void setText(String str) {
        C04220Ms.A0B(str, 0);
        getButtonView().setText(str);
        this.A09 = str;
    }

    private final void A01() {
        ViewPropertyAnimator viewPropertyAnimator = this.A04;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.A03;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        getProgressMsgView().setVisibility(4);
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final AttributeSet getAttrs() {
        return this.A0C;
    }

    public final FBPayButton getButtonView() {
        FBPayButton fBPayButton = this.A06;
        if (fBPayButton != null) {
            return fBPayButton;
        }
        C04220Ms.A0E("buttonView");
        throw null;
    }

    public final int getDefStyleAttr() {
        return this.A0B;
    }

    public final boolean getPayButtonState() {
        return this.A0A;
    }

    public final AnonymousClass0ZU getPostSuccessfulTransactionAction() {
        return this.A08;
    }

    public final AnonymousClass51z getProgressBarView() {
        AnonymousClass51z r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("progressBarView");
        throw null;
    }

    public final TextView getProgressMsgView() {
        TextView textView = this.A05;
        if (textView != null) {
            return textView;
        }
        C04220Ms.A0E("progressMsgView");
        throw null;
    }

    public final String getText() {
        return this.A09;
    }

    private final void A00() {
        Context A0A2 = C18190wL.A0A(this);
        AttributeSet attributeSet = this.A0C;
        int i = this.A0B;
        this.A06 = new FBPayButton(A0A2, attributeSet, i, AnonymousClass69C.A07);
        getButtonView().setId(R.id.fbpay_ui_button_id);
        C04220Ms.A06(A0A2);
        AnonymousClass51z r1 = new AnonymousClass51z(A0A2, attributeSet, i);
        r1.setVisibility(4);
        this.A07 = r1;
        getProgressBarView().setId(R.id.fbpay_ui_progress_bar_id);
        TextView textView = new TextView(A0A2, attributeSet, i);
        textView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass7Fd.A01(textView, 3, 1);
        this.A05 = textView;
        getProgressMsgView().setId(R.id.fbpay_ui_progress_message_id);
        TextView progressMsgView = getProgressMsgView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        progressMsgView.setLayoutParams(layoutParams);
        addView(getButtonView());
        addView(getProgressBarView());
        addView(getProgressMsgView());
        A03();
    }

    public final void A03() {
        super.A03();
        Drawable drawable = this.A02;
        if (drawable == null) {
            C04220Ms.A0E("trasparentBackground");
            throw null;
        }
        setBackground(drawable);
        getButtonView().setVisibility(0);
        setFocusable(false);
        setImportantForAccessibility(2);
        getProgressMsgView().setImportantForAccessibility(2);
    }

    public final void A09() {
        CharSequence text = getButtonView().getText();
        A01();
        removeAllViews();
        A00();
        getButtonView().setText(text);
        setFocusable(false);
        setImportantForAccessibility(2);
        getProgressMsgView().setImportantForAccessibility(2);
    }

    public final void A0A() {
        if (getProgressBarView().getVisibility() != 0) {
            C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36317470363225880L);
            Drawable current = getButtonView().getBackground().getCurrent();
            C04220Ms.A0C(current, C28174Ezk.A00(0));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((GradientDrawable) current).getCornerRadius(), C86134wK.A01(getButtonView().getHeight())});
            ofFloat.setDuration(400).addUpdateListener(new AnonymousClass7LF(this));
            TranslateAnimation translateAnimation = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (getButtonView().getX() + ((float) (getButtonView().getWidth() / 2))) - ((float) (getButtonView().getHeight() / 2)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            C04530Oa r2 = A0D;
            PathInterpolator pathInterpolator = (PathInterpolator) r2.getValue();
            if (pathInterpolator != null) {
                translateAnimation.setInterpolator(pathInterpolator);
            }
            translateAnimation.setDuration(400);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            PathInterpolator pathInterpolator2 = (PathInterpolator) r2.getValue();
            if (pathInterpolator2 != null) {
                animatorSet.setInterpolator(pathInterpolator2);
            }
            animatorSet.addListener(new IDxAListenerShape371S0100000_2_I2(this, 0));
            animatorSet.start();
            getButtonView().startAnimation(translateAnimation);
            C116836xd.A00(this, (Boolean) null, AnonymousClass006.A00, (String) null, getContext().getString(2131826590));
            setImportantForAccessibility(1);
            sendAccessibilityEvent(32768);
            getButtonView().setEnabled(false);
        }
    }

    public final void setPayButtonState(boolean z) {
        getButtonView().setEnabled(z);
        this.A0A = z;
    }

    public final void setPostSuccessfulTransactionAction(AnonymousClass0ZU r1) {
        this.A08 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
