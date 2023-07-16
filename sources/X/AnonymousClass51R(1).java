package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLAdapterShape0S0100000_2_I2;

/* renamed from: X.51R  reason: invalid class name */
public final class AnonymousClass51R extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public C143198gH A05;
    public C143208gI A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public LLF A0A;
    public C121247Ez A0B;
    public boolean A0C;
    public final Animator.AnimatorListener A0D = new IDxLAdapterShape0S0100000_2_I2(this, 1);
    public final Animator.AnimatorListener A0E = new IDxLAdapterShape0S0100000_2_I2(this, 0);
    public final GestureDetector.OnGestureListener A0F;
    public final GestureDetector A0G;
    public final Runnable A0H = new C135167yz(this);

    public AnonymousClass51R(Context context, Integer num, boolean z) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener r1 = new AnonymousClass7QT(this);
        this.A0F = r1;
        this.A09 = z;
        this.A07 = num;
        this.A0G = new GestureDetector(context, !z ? new AnonymousClass507(this) : r1);
    }

    public static void A00(AnonymousClass51R r3) {
        if (r3.A00 != 0 && !r3.A0C) {
            Runnable runnable = r3.A0H;
            r3.removeCallbacks(runnable);
            r3.postDelayed(runnable, (long) r3.A00);
        }
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() > C86134wK.A01(getHeight())) {
                A02(this.A01);
            } else {
                A03((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public final void A02(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0H);
        this.A0C = true;
        if (getContext() == null || !isAttachedToWindow()) {
            C143198gH r0 = this.A05;
            if (r0 != null) {
                r0.BuA();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A09) {
            clearAnimation();
            alpha = animate().setDuration((long) i).setInterpolator(this.A03).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A07.equals(AnonymousClass006.A00);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i).translationY((float) height).setInterpolator(this.A03).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        alpha.setListener(this.A0D);
    }

    public void setBloksContentViewFromParseResult(AnonymousClass3HX r4, C121997Jj r5) {
        C121247Ez r0 = this.A0B;
        if (r0 != null) {
            r0.A03();
            this.A0B = null;
        }
        LLF llf = this.A0A;
        if (llf != null) {
            removeView(llf);
        }
        Context context = r4.A00;
        if (!context.equals(getContext())) {
            C30967GcS.A02("bk.action.toast.ShowToast", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A0A = new LLF(context);
        C121247Ez A002 = new C58513Fy(context, r5, r4.A02).A00();
        this.A0B = A002;
        A002.A06(this.A0A);
        setContentView(this.A0B.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            C30967GcS.A02("bk.action.toast.ShowToast", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    public final void A03(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration((long) i).translationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(1065279139);
        super.onDetachedFromWindow();
        C121247Ez r0 = this.A0B;
        if (r0 != null) {
            r0.A03();
            this.A0B = null;
            this.A0A = null;
        }
        C14030oh.A0D(1929518435, A062);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0H);
        } else if (action == 1 || action == 3) {
            A00(this);
            A01();
        }
        return this.A0G.onTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = C14030oh.A05(-538809931);
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        boolean z2 = true;
        if (action == 0) {
            this.A08 = false;
            i = -1153010405;
        } else if (action == 1 || action == 3) {
            A00(this);
            z2 = A01();
            i = -688547336;
        } else {
            if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                z = true;
            }
            C14030oh.A0C(-759278360, A052);
            return z;
        }
        C14030oh.A0C(i, A052);
        return z2;
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(C143198gH r1) {
        this.A05 = r1;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(C143208gI r1) {
        this.A06 = r1;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
