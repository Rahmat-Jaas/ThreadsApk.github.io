package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxPropertyShape0S0000000_2_I2;

/* renamed from: X.51X  reason: invalid class name */
public final class AnonymousClass51X extends FrameLayout {
    public static final Property A06;
    public static final Property A07;
    public static final Interpolator A08 = new PathInterpolator(0.17f, 0.17f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    public Integer A00 = AnonymousClass006.A00;
    public final ObjectAnimator A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final Animator.AnimatorListener A05;

    public static void A02(View view, AnonymousClass51X r9, Integer num, boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (!(num == null || r9.A00 == num)) {
            int intValue = num.intValue();
            if (intValue == 2) {
                r9.A01(0, 0);
            } else if (intValue != 1) {
                r9.A00();
            } else {
                r9.A01(250, 250);
                ObjectAnimator objectAnimator3 = r9.A03;
                if (objectAnimator3 != null) {
                    objectAnimator3.setProperty(A06);
                    objectAnimator3.setFloatValues(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
                }
                ObjectAnimator objectAnimator4 = r9.A04;
                if (objectAnimator4 != null) {
                    objectAnimator4.setProperty(A06);
                    objectAnimator4.setFloatValues(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
                }
                ObjectAnimator objectAnimator5 = r9.A01;
                if (objectAnimator5 != null) {
                    objectAnimator5.setProperty(A06);
                    objectAnimator5.setFloatValues(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
                }
                ObjectAnimator objectAnimator6 = r9.A02;
                if (objectAnimator6 != null) {
                    objectAnimator6.setProperty(A06);
                    objectAnimator6.setFloatValues(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
                }
            }
            r9.A00 = num;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        r9.addView(view, new ViewGroup.LayoutParams(-1, -1));
        int childCount = r9.getChildCount();
        if (z) {
            objectAnimator = r9.A03;
            objectAnimator2 = r9.A04;
        } else {
            objectAnimator = r9.A01;
            objectAnimator2 = r9.A02;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = r9.getChildAt(i);
            if (childAt == view) {
                childAt.setVisibility(0);
                if (childCount > 1 && objectAnimator != null) {
                    if (objectAnimator.isStarted()) {
                        objectAnimator.cancel();
                    }
                    objectAnimator.setTarget(childAt);
                    objectAnimator.start();
                }
            } else if (childAt.getVisibility() == 0) {
                if (objectAnimator2 != null) {
                    if (objectAnimator2.isStarted()) {
                        objectAnimator2.cancel();
                    }
                    objectAnimator2.setTarget(childAt);
                    objectAnimator2.start();
                } else {
                    r9.removeView(childAt);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (1 == X.C86114wI.A0B(r2).getLayoutDirection()) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r9 = this;
            r2 = 280(0x118, double:1.383E-321)
            r0 = 200(0xc8, double:9.9E-322)
            r9.A01(r2, r0)
            android.content.Context r2 = r9.getContext()
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0086
            android.content.res.Configuration r0 = X.C86114wI.A0B(r2)
            int r0 = r0.getLayoutDirection()
            r3 = 1
            if (r3 != r0) goto L_0x0086
        L_0x0021:
            android.animation.ObjectAnimator r2 = r9.A03
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 1
            r6 = 0
            r5 = 0
            r4 = 2
            if (r2 == 0) goto L_0x003f
            android.util.Property r0 = A07
            r2.setProperty(r0)
            float[] r1 = new float[r4]
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0038
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0038:
            r1[r5] = r0
            r1[r7] = r6
            r2.setFloatValues(r1)
        L_0x003f:
            android.animation.ObjectAnimator r2 = r9.A04
            if (r2 == 0) goto L_0x0057
            android.util.Property r0 = A07
            r2.setProperty(r0)
            float[] r1 = new float[r4]
            r1[r5] = r6
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 == 0) goto L_0x0052
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            r1[r7] = r0
            r2.setFloatValues(r1)
        L_0x0057:
            android.animation.ObjectAnimator r2 = r9.A01
            if (r2 == 0) goto L_0x006f
            android.util.Property r0 = A07
            r2.setProperty(r0)
            float[] r1 = new float[r4]
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 == 0) goto L_0x0068
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0068:
            r1[r5] = r0
            r1[r7] = r6
            r2.setFloatValues(r1)
        L_0x006f:
            android.animation.ObjectAnimator r1 = r9.A02
            if (r1 == 0) goto L_0x0085
            android.util.Property r0 = A07
            r1.setProperty(r0)
            float[] r0 = new float[r4]
            r0[r5] = r6
            if (r3 != 0) goto L_0x0080
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0080:
            r0[r7] = r8
            r1.setFloatValues(r0)
        L_0x0085:
            return
        L_0x0086:
            r3 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51X.A00():void");
    }

    private void A01(long j, long j2) {
        ObjectAnimator objectAnimator = this.A03;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = this.A04;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j2);
        }
        ObjectAnimator objectAnimator3 = this.A01;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j);
        }
        ObjectAnimator objectAnimator4 = this.A02;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j2);
        }
    }

    static {
        Class cls = Float.TYPE;
        A07 = new IDxPropertyShape0S0000000_2_I2(cls, 0);
        A06 = new IDxPropertyShape0S0000000_2_I2(cls, 1);
    }

    public AnonymousClass51X(Context context) {
        super(context);
        C18260wT r2 = new C18260wT(this);
        this.A05 = r2;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A08;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(r2);
        this.A03 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A04 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(r2);
        this.A01 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A02 = objectAnimator4;
        A00();
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }
}
