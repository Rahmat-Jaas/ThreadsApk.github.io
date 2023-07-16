package com.facebook.redex;

import android.animation.ValueAnimator;

public class IDxUListenerShape255S0100000_2_I2 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public IDxUListenerShape255S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b9, code lost:
        X.C04220Ms.A0C(r1, r0);
        r2.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e4, code lost:
        r1.setTranslationY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0151, code lost:
        X.C09860go.A0O(r1, X.AnonymousClass0wJ.A04(X.C86134wK.A0e(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0163, code lost:
        r0 = r8.getAnimatedValue();
        r1 = "null cannot be cast to non-null type kotlin.Float";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c7, code lost:
        r0 = (android.view.View) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c9, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01d1, code lost:
        r6.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d9, code lost:
        r2 = (android.view.View) r2;
        r0 = r8.getAnimatedValue();
        r1 = "null cannot be cast to non-null type kotlin.Float";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e1, code lost:
        X.C04220Ms.A0C(r0, r1);
        r2.setScaleX(X.C18240wQ.A00(r0));
        r0 = r8.getAnimatedValue();
        X.C04220Ms.A0C(r0, r1);
        r2.setScaleY(X.C18240wQ.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0222, code lost:
        X.C04220Ms.A0C(r0, r1);
        r2.setAlpha(X.C18240wQ.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0066;
                case 2: goto L_0x007e;
                case 3: goto L_0x0092;
                case 4: goto L_0x0092;
                case 5: goto L_0x00a0;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00f5;
                case 11: goto L_0x00fc;
                case 12: goto L_0x0118;
                case 13: goto L_0x0118;
                case 14: goto L_0x012e;
                case 15: goto L_0x014b;
                case 16: goto L_0x015d;
                case 17: goto L_0x016b;
                case 18: goto L_0x017d;
                case 19: goto L_0x017d;
                case 20: goto L_0x018f;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x01a2;
                case 24: goto L_0x01bd;
                case 25: goto L_0x01cd;
                case 26: goto L_0x01d5;
                case 27: goto L_0x01fa;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = X.C86124wJ.A0l(r7, r8)
            java.util.Iterator r3 = X.C86154wM.A0q(r0)
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r2 = r3.next()
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r8.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleX(r0)
            java.lang.Object r0 = r8.getAnimatedValue()
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleY(r0)
            goto L_0x000d
        L_0x0038:
            r5 = 0
            X.C04220Ms.A0B(r8, r5)
            java.lang.Object r0 = X.C86144wL.A0e(r8)
            float r4 = X.C18240wQ.A00(r0)
            java.lang.Object r6 = r7.A00
            X.50R r6 = (X.AnonymousClass50R) r6
            android.graphics.Paint r3 = r6.A02
            r0 = 2
            float[] r2 = new float[r0]
            float r1 = r6.A00
            r2[r5] = r1
            r0 = 1
            r2[r0] = r1
            float r4 = r4 * r1
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r4 = 0
        L_0x005b:
            float r1 = r1 - r4
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r2, r1)
            r3.setPathEffect(r0)
            goto L_0x01d1
        L_0x0066:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r1.height = r0
            r2.requestLayout()
            return
        L_0x007e:
            java.lang.Object r0 = X.C86114wI.A0c(r8)
            float r1 = X.C18240wQ.A00(r0)
            java.lang.Object r0 = r7.A00
            X.I85 r0 = (X.I85) r0
            X.0Oa r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            goto L_0x01c7
        L_0x0092:
            java.lang.Object r1 = X.C86124wJ.A0l(r7, r8)
            X.Acd r1 = (X.C18266Acd) r1
            java.lang.Object r0 = X.C86144wL.A0e(r8)
            r1.A00(r0)
            return
        L_0x00a0:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r1 = r8.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            goto L_0x00b9
        L_0x00ad:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r1 = r8.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
        L_0x00b9:
            X.C04220Ms.A0C(r1, r0)
            r2.invoke(r1)
            return
        L_0x00c0:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = (float) r0
            float r0 = -r0
            goto L_0x00e4
        L_0x00d3:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            float r0 = (float) r0
        L_0x00e4:
            r1.setTranslationY(r0)
            return
        L_0x00e8:
            java.lang.Object r0 = X.C86124wJ.A0l(r7, r8)
            X.DY1 r0 = (X.DY1) r0
            X.Ayd r0 = r0.A03
            android.view.View r2 = r0.A08()
            goto L_0x0163
        L_0x00f5:
            java.lang.Object r1 = X.C86124wJ.A0l(r7, r8)
            android.view.View r1 = (android.view.View) r1
            goto L_0x0151
        L_0x00fc:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r2 = r8.getAnimatedValue()
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x01d4
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r1 = r7.A00
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r0 = r2.intValue()
            r1.setProgress(r0)
            return
        L_0x0118:
            java.lang.Object r0 = X.C86114wI.A0c(r8)
            float r1 = X.C18240wQ.A00(r0)
            java.lang.Object r0 = r7.A00
            android.widget.TextView r0 = X.C86134wK.A0G(r0, r1)
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            goto L_0x01c9
        L_0x012e:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            android.graphics.ColorFilter r0 = X.C63393hP.A00(r0)
            r1.setColorFilter(r0)
            r2.setImageDrawable(r1)
            return
        L_0x014b:
            java.lang.Object r1 = X.C86124wJ.A0l(r7, r8)
            android.view.View r1 = (android.view.View) r1
        L_0x0151:
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.C09860go.A0O(r1, r0)
            return
        L_0x015d:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            android.view.View r2 = (android.view.View) r2
        L_0x0163:
            java.lang.Object r0 = r8.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            goto L_0x0222
        L_0x016b:
            java.lang.Object r1 = X.C86124wJ.A0l(r7, r8)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = X.C86144wL.A0e(r8)
            float r0 = X.C18240wQ.A00(r0)
            r1.setTranslationX(r0)
            return
        L_0x017d:
            java.lang.Object r1 = X.C86124wJ.A0l(r7, r8)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = X.C86134wK.A0e(r8)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r1.setTextColor(r0)
            return
        L_0x018f:
            java.lang.Object r0 = X.C86124wJ.A0l(r7, r8)
            X.EO3 r0 = (X.EO3) r0
            java.util.ArrayList r1 = r0.A0N
            int r0 = X.EO3.A00(r0)
            int r0 = r0 + -1
            java.lang.Object r2 = X.C86164wN.A0b(r1, r0)
            goto L_0x01d9
        L_0x01a2:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r8.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setAlpha(r0)
            java.lang.Object r0 = r8.getAnimatedValue()
            goto L_0x01e1
        L_0x01bd:
            java.lang.Object r0 = X.C86114wI.A0c(r8)
            float r1 = X.C18240wQ.A00(r0)
            java.lang.Object r0 = r7.A00
        L_0x01c7:
            android.view.View r0 = (android.view.View) r0
        L_0x01c9:
            r0.setAlpha(r1)
            return
        L_0x01cd:
            java.lang.Object r6 = r7.A00
            android.view.View r6 = (android.view.View) r6
        L_0x01d1:
            r6.invalidate()
        L_0x01d4:
            return
        L_0x01d5:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
        L_0x01d9:
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r8.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
        L_0x01e1:
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleX(r0)
            java.lang.Object r0 = r8.getAnimatedValue()
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleY(r0)
            return
        L_0x01fa:
            java.lang.Object r2 = X.C86124wJ.A0l(r7, r8)
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r8.getAnimatedValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleX(r0)
            java.lang.Object r0 = r8.getAnimatedValue()
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setScaleY(r0)
            java.lang.Object r0 = r8.getAnimatedValue()
        L_0x0222:
            X.C04220Ms.A0C(r0, r1)
            float r0 = X.C18240wQ.A00(r0)
            r2.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxUListenerShape255S0100000_2_I2.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
