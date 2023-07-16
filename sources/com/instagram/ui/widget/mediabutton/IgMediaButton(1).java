package com.instagram.ui.widget.mediabutton;

import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.I6A;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.BaseViewManager;

public final class IgMediaButton extends ConstraintLayout {
    public static final Interpolator A0A = new PathInterpolator(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.58f, 1.0f);
    public static final Interpolator A0B = new PathInterpolator(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.99f, 0.4f, 0.98f);
    public final ObjectAnimator A00;
    public final ObjectAnimator A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgMediaButton(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r5 = 1
            r2 = r20
            X.C04220Ms.A0B(r2, r5)
            r6 = r19
            r1 = r21
            r0 = r22
            r6.<init>(r2, r1, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131495695(0x7f0c0b0f, float:1.8614934E38)
            r1.inflate(r0, r6, r5)
            r0 = 2131302923(0x7f091a0b, float:1.8223946E38)
            android.view.View r9 = X.AnonymousClass0wJ.A0J(r6, r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r6.A04 = r9
            r0 = 2131302927(0x7f091a0f, float:1.8223954E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r6, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A08 = r0
            r0 = 2131302928(0x7f091a10, float:1.8223956E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r6, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A09 = r0
            r0 = 2131302924(0x7f091a0c, float:1.8223948E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r6, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r6.A05 = r4
            r0 = 2131302926(0x7f091a0e, float:1.8223952E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0K(r6, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r6.A07 = r3
            r0 = 2131302925(0x7f091a0d, float:1.822395E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0K(r6, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r6.A06 = r2
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.AnonymousClass7FY.A02(r6, r0)
            r7 = 2
            float[] r0 = new float[r5]
            r12 = 0
            r8 = 1066192077(0x3f8ccccd, float:1.1)
            r0[r12] = r8
            java.lang.String r11 = "scaleX"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r11, r0)
            float[] r0 = new float[r5]
            r0[r12] = r8
            java.lang.String r10 = "scaleY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r10, r0)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r1, r0}
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r9, r0)
            X.C04220Ms.A06(r8)
            r0 = 700(0x2bc, double:3.46E-321)
            r8.setDuration(r0)
            r8.setRepeatMode(r7)
            r9 = -1
            r8.setRepeatCount(r9)
            r1 = 1084227584(0x40a00000, float:5.0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            r8.setInterpolator(r0)
            r6.A00 = r8
            float[] r0 = new float[r7]
            r0 = {1063675494, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r13 = android.animation.PropertyValuesHolder.ofFloat(r11, r0)
            float[] r0 = new float[r7]
            r0 = {1063675494, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofFloat(r10, r0)
            float[] r1 = new float[r5]
            r0 = -1047527424(0xffffffffc1900000, float:-18.0)
            r1[r12] = r0
            java.lang.String r0 = "translationX"
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r1 = new float[r5]
            r0 = -1048576000(0xffffffffc1800000, float:-16.0)
            r1[r12] = r0
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r16 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r1 = new float[r7]
            r1 = {1065353216, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.PropertyValuesHolder r17 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r10 = new float[r7]
            r0 = 0
            r10[r12] = r0
            double r0 = java.lang.Math.random()
            r7 = 29
            double r7 = (double) r7
            double r0 = r0 * r7
            float r7 = (float) r0
            r0 = -14
            float r0 = (float) r0
            float r7 = r7 + r0
            r10[r5] = r7
            java.lang.String r0 = "rotation"
            android.animation.PropertyValuesHolder r18 = android.animation.PropertyValuesHolder.ofFloat(r0, r10)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r13, r14, r15, r16, r17, r18}
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r0)
            X.C04220Ms.A06(r4)
            r0 = 1400(0x578, double:6.917E-321)
            r4.setDuration(r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r4.setStartDelay(r0)
            r4.setRepeatCount(r9)
            r4.setRepeatMode(r5)
            android.view.animation.Interpolator r0 = A0A
            r4.setInterpolator(r0)
            r1 = 4
            com.facebook.redex.IDxAListenerShape183S0200000_2_I2 r0 = new com.facebook.redex.IDxAListenerShape183S0200000_2_I2
            r0.<init>(r1, r4, r6)
            r4.addListener(r0)
            r6.A01 = r4
            r1 = 1069547520(0x3fc00000, float:1.5)
            r4 = 400(0x190, double:1.976E-321)
            r0 = 1056964608(0x3f000000, float:0.5)
            android.animation.ObjectAnimator r0 = A00(r2, r1, r0, r4)
            r6.A02 = r0
            r4 = 1068708659(0x3fb33333, float:1.4)
            r1 = 800(0x320, double:3.953E-321)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            android.animation.ObjectAnimator r0 = A00(r3, r4, r0, r1)
            r6.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.mediabutton.IgMediaButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static final ObjectAnimator A00(ImageView imageView, float f, float f2, long j) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{f}), PropertyValuesHolder.ofFloat("alpha", new float[]{f2, 0.0f})});
        C04220Ms.A06(ofPropertyValuesHolder);
        ofPropertyValuesHolder.setDuration(1400);
        ofPropertyValuesHolder.setStartDelay(j);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setInterpolator(new I6A());
        return ofPropertyValuesHolder;
    }

    public final void setLabel(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        TextView textView = this.A09;
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (AnonymousClass8bQ.A0m(charSequence)) {
            CharSequence contentDescription = getContentDescription();
            if (contentDescription == null || AnonymousClass8bQ.A0n(contentDescription)) {
                setContentDescription(charSequence);
            }
        }
    }

    public final void setDrawableLarge(Drawable drawable) {
        ImageView imageView = this.A04;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public final void setDrawableMedium(Drawable drawable) {
        ImageView imageView = this.A08;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
