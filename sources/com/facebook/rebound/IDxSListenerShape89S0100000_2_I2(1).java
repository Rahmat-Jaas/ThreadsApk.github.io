package com.facebook.rebound;

import X.AnonymousClass7Rj;
import X.C127237gm;
import X.C25812DsR;
import X.C30864GZz;
import android.view.ViewGroup;

public class IDxSListenerShape89S0100000_2_I2 extends C127237gm {
    public Object A00;
    public final int A01;

    public IDxSListenerShape89S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CLg(C25812DsR dsR) {
        switch (this.A01) {
            case 1:
                ((AnonymousClass7Rj) this.A00).A02.A02.cancel();
                return;
            case 3:
                if (dsR.A01 == 0.0d) {
                    ViewGroup viewGroup = ((C30864GZz) this.A00).A03;
                    viewGroup.getClass();
                    viewGroup.setVisibility(8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r3.setScaleY((float) r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r0.setAlpha(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CLi(X.C25812DsR r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0005;
                case 2: goto L_0x0006;
                case 3: goto L_0x008d;
                case 4: goto L_0x001f;
                case 5: goto L_0x003f;
                case 6: goto L_0x0052;
                case 7: goto L_0x0085;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r3 = r6.A00
            com.instagram.ar.features.effectspage.ui.EffectsPageFragment r3 = (com.instagram.ar.features.effectspage.ui.EffectsPageFragment) r3
            android.view.ViewGroup r2 = r3.mUseInCameraButton
            if (r2 == 0) goto L_0x0005
            X.DON r0 = r7.A09
            double r0 = r0.A00
            float r4 = (float) r0
            r2.setScaleX(r4)
            android.view.ViewGroup r0 = r3.mUseInCameraButton
            r0.setScaleY(r4)
            android.view.ViewGroup r0 = r3.mUseInCameraButton
            goto L_0x00a7
        L_0x001f:
            java.lang.Object r2 = r6.A00
            X.E4i r2 = (X.C26218E4i) r2
            X.DON r0 = r7.A09
            double r0 = r0.A00
            float r3 = (float) r0
            X.7Gl r1 = r2.A0L
            android.widget.LinearLayout r0 = r1.A03
            if (r0 == 0) goto L_0x0005
            r0.setAlpha(r3)
            android.widget.LinearLayout r2 = r1.A03
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r0 = 8
            if (r1 <= 0) goto L_0x003b
            r0 = 0
        L_0x003b:
            r2.setVisibility(r0)
            return
        L_0x003f:
            java.lang.Object r4 = r6.A00
            X.HDX r4 = (X.HDX) r4
            android.widget.FrameLayout r3 = r4.A01
            if (r3 == 0) goto L_0x0005
            X.DON r5 = r7.A09
            double r1 = r5.A00
            float r0 = (float) r1
            r3.setScaleX(r0)
            android.widget.FrameLayout r3 = r4.A01
            goto L_0x0064
        L_0x0052:
            java.lang.Object r4 = r6.A00
            X.HDX r4 = (X.HDX) r4
            android.widget.FrameLayout r3 = r4.A00
            if (r3 == 0) goto L_0x0005
            X.DON r5 = r7.A09
            double r1 = r5.A00
            float r0 = (float) r1
            r3.setScaleX(r0)
            android.widget.FrameLayout r3 = r4.A00
        L_0x0064:
            double r1 = r5.A00
            float r0 = (float) r1
            r3.setScaleY(r0)
            return
        L_0x006b:
            java.lang.Object r4 = r6.A00
            X.7Rj r4 = (X.AnonymousClass7Rj) r4
            X.DON r0 = r7.A09
            double r2 = r0.A00
            float r1 = (float) r2
            r0 = 0
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x007f
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r4.A00 = r0
        L_0x007f:
            android.view.View r0 = r4.A01
            r0.setTranslationY(r1)
            return
        L_0x0085:
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            return
        L_0x008d:
            X.DON r0 = r7.A09
            double r4 = r0.A00
            r0 = 0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.max(r4, r0)
            double r0 = java.lang.Math.min(r0, r2)
            float r4 = (float) r0
            java.lang.Object r0 = r6.A00
            X.GZz r0 = (X.C30864GZz) r0
            android.view.ViewGroup r0 = r0.A03
            r0.getClass()
        L_0x00a7:
            r0.setAlpha(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.IDxSListenerShape89S0100000_2_I2.CLi(X.DsR):void");
    }
}
