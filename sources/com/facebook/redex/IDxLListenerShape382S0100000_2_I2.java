package com.facebook.redex;

import android.view.ViewTreeObserver;

public class IDxLListenerShape382S0100000_2_I2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape382S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.widget.TextView, android.view.View, com.instagram.common.ui.base.IgTextView] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        X.C86154wM.A1J(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014c, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x011e;
                case 1: goto L_0x00c5;
                case 2: goto L_0x0083;
                case 3: goto L_0x0064;
                case 4: goto L_0x0045;
                case 5: goto L_0x0016;
                case 6: goto L_0x00a2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A00
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            X.C86154wM.A1J(r1, r6)
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x0015
            r1.A04()
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r5 = r6.A00
            X.7IJ r5 = (X.AnonymousClass7IJ) r5
            android.view.View r0 = r5.A04
            if (r0 == 0) goto L_0x0015
            int[] r1 = r5.A09
            r0.getLocationOnScreen(r1)
            android.view.View r0 = r5.A04
            int r4 = r0.getHeight()
            r0 = 1
            r3 = r1[r0]
            int r3 = r3 + r4
            int r2 = r5.A02
            r1 = 0
            r0 = -1
            if (r2 != r0) goto L_0x0126
            r5.A02 = r3
            r5.A00 = r3
            r5.A01 = r4
            java.util.Set r0 = r5.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0015
            X.AnonymousClass7IJ.A02(r5, r1)
            return
        L_0x0045:
            java.lang.Object r3 = r6.A00
            com.facebookpay.widget.navibar.NavigationBar r3 = (com.facebookpay.widget.navibar.NavigationBar) r3
            X.C86154wM.A1J(r3, r6)
            android.widget.LinearLayout r2 = r3.A09
            java.lang.String r0 = "navbarRightContainer"
            if (r2 == 0) goto L_0x0148
            int r1 = r2.getMeasuredWidth()
            int r0 = r3.A02
            if (r1 == r0) goto L_0x0015
            com.facebookpay.widget.navibar.NavigationBar.A00(r3)
            int r0 = r2.getMeasuredWidth()
            r3.A02 = r0
            return
        L_0x0064:
            java.lang.Object r3 = r6.A00
            com.facebookpay.widget.navibar.NavigationBar r3 = (com.facebookpay.widget.navibar.NavigationBar) r3
            X.C86154wM.A1J(r3, r6)
            android.widget.LinearLayout r2 = r3.A08
            java.lang.String r0 = "navbarLeftContainer"
            if (r2 == 0) goto L_0x0148
            int r1 = r2.getMeasuredWidth()
            int r0 = r3.A01
            if (r1 == r0) goto L_0x0015
            com.facebookpay.widget.navibar.NavigationBar.A00(r3)
            int r0 = r2.getMeasuredWidth()
            r3.A01 = r0
            return
        L_0x0083:
            java.lang.Object r3 = r6.A00
            com.facebookpay.widget.navibar.NavigationBar r3 = (com.facebookpay.widget.navibar.NavigationBar) r3
            X.C86154wM.A1J(r3, r6)
            android.widget.LinearLayout r2 = r3.A07
            java.lang.String r0 = "navbarCenterContainer"
            if (r2 == 0) goto L_0x0148
            int r1 = r2.getMeasuredWidth()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0015
            com.facebookpay.widget.navibar.NavigationBar.A00(r3)
            int r0 = r2.getMeasuredWidth()
            r3.A00 = r0
            return
        L_0x00a2:
            android.graphics.Rect r2 = X.C86134wK.A0D()
            java.lang.Object r0 = r6.A00
            X.M5O r0 = (X.M5O) r0
            X.5BZ r0 = (X.AnonymousClass5BZ) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A01
            r0 = 0
            r3.getLineBounds(r0, r2)
            int r1 = r2.bottom
            int r0 = r2.top
            int r1 = r1 - r0
            int r0 = r3.getHeight()
            int r0 = r0 / r1
            r3.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
            goto L_0x00ff
        L_0x00c5:
            java.lang.Object r3 = r6.A00
            X.51R r3 = (X.AnonymousClass51R) r3
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0103
            int r1 = r3.A02
            android.animation.Animator$AnimatorListener r4 = r3.A0E
            r3.clearAnimation()
            r0 = 1069547520(0x3fc00000, float:1.5)
            r3.setScaleX(r0)
            r3.setScaleY(r0)
            android.view.ViewPropertyAnimator r2 = r3.animate()
            long r0 = (long) r1
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.view.animation.Interpolator r0 = r3.A04
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            r0.setListener(r4)
        L_0x00fc:
            X.AnonymousClass51R.A00(r3)
        L_0x00ff:
            X.C86154wM.A1J(r3, r6)
            return
        L_0x0103:
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.AnonymousClass006.A00
            boolean r1 = r1.equals(r0)
            int r0 = r3.getHeight()
            if (r1 == 0) goto L_0x0112
            int r0 = -r0
        L_0x0112:
            float r0 = (float) r0
            r3.setTranslationY(r0)
            int r1 = r3.A02
            android.animation.Animator$AnimatorListener r0 = r3.A0E
            r3.A03(r0, r1)
            goto L_0x00fc
        L_0x011e:
            java.lang.Object r0 = r6.A00
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            androidx.compose.ui.platform.AndroidComposeView.A09(r0)
            return
        L_0x0126:
            int r0 = r5.A00
            if (r0 == r3) goto L_0x0143
            int r0 = r5.A01
            if (r0 == r4) goto L_0x0143
            if (r2 >= r3) goto L_0x0133
            r5.A02 = r3
            r2 = r3
        L_0x0133:
            int r2 = r2 - r3
            int r1 = java.lang.Math.max(r2, r1)
            java.util.Set r0 = r5.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0143
            X.AnonymousClass7IJ.A02(r5, r1)
        L_0x0143:
            r5.A00 = r3
            r5.A01 = r4
            return
        L_0x0148:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLListenerShape382S0100000_2_I2.onGlobalLayout():void");
    }
}
