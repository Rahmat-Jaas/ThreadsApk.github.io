package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape2S0200001_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0200001_I2(Object obj, Object obj2, float f, int i) {
        super(1);
        this.A03 = i;
        this.A00 = f;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008d, code lost:
        r5.A01("shape", r2.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a6, code lost:
        r5.A01("brush", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x012b, code lost:
        if (r4 > r1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x016b, code lost:
        if (r4 < r1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0055, code lost:
        r1 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0059, code lost:
        if (r1 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005b, code lost:
        r1.CnS(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0265, code lost:
        if (r8.containsKey(r5) != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0060, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x033c, code lost:
        r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0340, code lost:
        if (r0 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0342, code lost:
        r0.CnR(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r11 = r20
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x0061;
                case 2: goto L_0x00ac;
                case 3: goto L_0x0112;
                case 4: goto L_0x016e;
                case 5: goto L_0x01a9;
                case 6: goto L_0x02ab;
                case 7: goto L_0x02d9;
                case 8: goto L_0x0305;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r6 = r2.A02
            X.GdL r6 = (X.C31007GdL) r6
            java.lang.Object r5 = r2.A01
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            float r3 = r2.A00
            float r7 = X.C31007GdL.A00(r5, r11, r6)
            float r10 = X.C31007GdL.A01(r5, r6)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r6.A02
            float r0 = r4.A0C(r5)
            double r0 = (double) r0
            double r8 = java.lang.Math.toRadians(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A01
            int r2 = r0.getHeight()
            android.graphics.Rect r0 = r5.getBounds()
            int r0 = r0.centerY()
            float r1 = (float) r0
            float r0 = X.C86134wK.A01(r2)
            float r1 = r1 - r0
            float r1 = r1 + r3
            double r5 = (double) r1
            double r2 = java.lang.Math.cos(r8)
            double r0 = (double) r10
            double r2 = r2 * r0
            double r5 = r5 + r2
            double r2 = java.lang.Math.sin(r8)
            double r0 = (double) r7
            double r2 = r2 * r0
            double r5 = r5 + r2
            float r0 = (float) r5
            java.lang.Object r3 = r11.A01
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
        L_0x0055:
            X.I0q r1 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r4)
            if (r1 == 0) goto L_0x005e
            r1.CnS(r0)
        L_0x005e:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0061:
            X.75O r6 = X.C86144wL.A0K(r11)
            X.86i r5 = r6.A01
            float r0 = r2.A00
            X.7yT r1 = X.C134847yT.A00(r0)
            java.lang.String r0 = "width"
            r5.A01(r0, r1)
            java.lang.Object r1 = r2.A01
            X.6nD r1 = (X.C111366nD) r1
            boolean r0 = r1 instanceof X.C876253m
            if (r0 == 0) goto L_0x00a6
            X.53m r1 = (X.C876253m) r1
            long r3 = r1.A00
            X.7KE r1 = X.C86134wK.A0I(r3)
            java.lang.String r0 = "color"
            r5.A01(r0, r1)
            X.7KE r0 = X.C86134wK.A0I(r3)
            r6.A00 = r0
        L_0x008d:
            java.lang.Object r1 = r2.A02
            java.lang.String r0 = "shape"
            r5.A01(r0, r1)
            goto L_0x005e
        L_0x0095:
            X.86i r5 = X.AnonymousClass75O.A00(r11)
            float r0 = r2.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = "alpha"
            r5.A01(r0, r1)
            java.lang.Object r1 = r2.A01
        L_0x00a6:
            java.lang.String r0 = "brush"
            r5.A01(r0, r1)
            goto L_0x008d
        L_0x00ac:
            long r0 = X.C18190wL.A08(r11)
            java.lang.Object r6 = r2.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r6 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r6
            long r7 = r6.A01
            r4 = -9223372036854775808
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00bf
            r6.A01 = r0
            r7 = r0
        L_0x00bf:
            float r4 = r6.A00
            X.52a r10 = new X.52a
            r10.<init>(r4)
            float r9 = r2.A00
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0108
            X.7U1 r7 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            X.52a r5 = new X.52a
            r5.<init>(r4)
            X.52a r4 = androidx.compose.foundation.gestures.UpdatableAnimationState.A04
            X.52a r3 = r6.A02
            long r13 = r7.AeN(r5, r4, r3)
        L_0x00dc:
            X.7U1 r9 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            X.52a r11 = androidx.compose.foundation.gestures.UpdatableAnimationState.A04
            X.52a r12 = r6.A02
            X.79u r3 = r9.BKM(r10, r11, r12, r13)
            X.52a r3 = (X.AnonymousClass52a) r3
            float r4 = r3.A00
            X.52a r12 = r6.A02
            X.79u r3 = r9.BKW(r10, r11, r12, r13)
            X.52a r3 = (X.AnonymousClass52a) r3
            r6.A02 = r3
            r6.A01 = r0
            float r0 = r6.A00
            float r0 = r0 - r4
            r6.A00 = r4
            java.lang.Object r1 = r2.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.invoke(r0)
            goto L_0x005e
        L_0x0108:
            long r4 = r0 - r7
            float r3 = (float) r4
            float r3 = r3 / r9
            double r3 = (double) r3
            long r13 = X.AnonymousClass8bA.A04(r3)
            goto L_0x00dc
        L_0x0112:
            X.6qg r11 = (X.C113076qg) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            float r1 = r2.A00
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x015b
            X.8pE r0 = r11.A06
            java.lang.Object r0 = r0.getValue()
            float r4 = X.C18240wQ.A00(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012e
        L_0x012d:
            r4 = r1
        L_0x012e:
            java.lang.Object r3 = r2.A02
            X.0Ma r3 = (X.C04040Ma) r3
            float r0 = r3.A00
            float r1 = r4 - r0
            java.lang.Object r0 = r2.A01
            X.8fT r0 = (X.C142718fT) r0
            float r0 = r0.CgC(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0157
            X.8pE r0 = r11.A06
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0157
        L_0x0150:
            float r0 = r3.A00
            float r0 = r0 + r1
            r3.A00 = r0
            goto L_0x005e
        L_0x0157:
            r11.A00()
            goto L_0x0150
        L_0x015b:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x012e
            X.8pE r0 = r11.A06
            java.lang.Object r0 = r0.getValue()
            float r4 = X.C18240wQ.A00(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012e
            goto L_0x012d
        L_0x016e:
            X.8pX r11 = (X.C147558pX) r11
            X.C147558pX.A00(r11)
            float r4 = r2.A00
            java.lang.Object r13 = r2.A02
            X.8n0 r13 = (X.C146868n0) r13
            java.lang.Object r12 = r2.A01
            X.6bI r12 = (X.C104136bI) r12
            X.8mj r7 = r11.Ae6()
            r1 = r7
            X.7X9 r1 = (X.AnonymousClass7X9) r1
            X.7XA r0 = r1.A01
            X.7El r6 = r0.A02
            long r2 = X.C121167El.A00(r6)
            X.8lx r5 = r1.A00
            r0 = 0
            r5.D7f(r4, r0)
            long r0 = X.AnonymousClass7KC.A03
            r4 = 1110704128(0x42340000, float:45.0)
            r5.CfJ(r0, r4)
            r15 = 1065353216(0x3f800000, float:1.0)
            X.53x r14 = X.C877353x.A00
            r16 = 3
            r17 = r0
            r11.AIw(r12, r13, r14, r15, r16, r17)
            X.C146708mj.A00(r6, r7, r2)
            goto L_0x005e
        L_0x01a9:
            X.6t4 r11 = (X.C114336t4) r11
            long r3 = r11.A00
            float r6 = r2.A00
            java.lang.Object r5 = r2.A02
            X.6kr r5 = (X.C109936kr) r5
            X.MSK r8 = new X.MSK
            r8.<init>()
            X.67T r7 = X.AnonymousClass67T.Hidden
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r8.put(r7, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r6 / r0
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01db
            int r0 = X.C86104wH.A08(r3)
            float r0 = (float) r0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01db
            X.67T r1 = X.AnonymousClass67T.HalfExpanded
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r8.put(r1, r0)
        L_0x01db:
            int r0 = X.C86104wH.A08(r3)
            if (r0 == 0) goto L_0x01f1
            X.67T r3 = X.AnonymousClass67T.Expanded
            r1 = 0
            float r0 = (float) r0
            float r6 = r6 - r0
            float r0 = java.lang.Math.max(r1, r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.put(r3, r0)
        L_0x01f1:
            X.AnonymousClass4WK.A0P(r8)
            X.7A5 r6 = r5.A01
            java.lang.Object r2 = r2.A01
            X.6hJ r2 = (X.C107786hJ) r2
            X.8pE r1 = r6.A02
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.C04220Ms.A0I(r0, r8)
            if (r0 != 0) goto L_0x005e
            java.util.Map r9 = X.C86154wM.A0t(r1)
            X.4oM r0 = r6.A09
            java.lang.Object r5 = r0.getValue()
            java.util.Map r0 = X.C86154wM.A0t(r1)
            boolean r4 = r0.isEmpty()
            r1.CrC(r8)
            java.util.Map r3 = X.C86154wM.A0t(r1)
            X.8pE r1 = r6.A04
            java.lang.Object r0 = r1.getValue()
            java.lang.Object r0 = r3.get(r0)
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            if (r4 == 0) goto L_0x023a
            if (r0 == 0) goto L_0x023a
            java.lang.Object r0 = r1.getValue()
            r6.A04(r0)
            goto L_0x005e
        L_0x023a:
            if (r2 == 0) goto L_0x005e
            X.67T r5 = (X.AnonymousClass67T) r5
            r6 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r5, r9)
            r1 = 2
            java.lang.Number r3 = X.C86124wJ.A0j(r5, r9)
            int r0 = r5.ordinal()
            if (r0 == r6) goto L_0x0268
            if (r0 == r1) goto L_0x0257
            if (r0 == r4) goto L_0x0257
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0257:
            X.67T r5 = X.AnonymousClass67T.HalfExpanded
            boolean r0 = r8.containsKey(r5)
            if (r0 != 0) goto L_0x0269
            X.67T r5 = X.AnonymousClass67T.Expanded
            boolean r0 = r8.containsKey(r5)
            if (r0 == 0) goto L_0x0268
            goto L_0x0269
        L_0x0268:
            r5 = r7
        L_0x0269:
            java.lang.Object r0 = X.AnonymousClass4WJ.A07(r5, r8)
            float r1 = X.C18240wQ.A00(r0)
            if (r3 == 0) goto L_0x027d
            float r0 = r3.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x027d
            goto L_0x005e
        L_0x027d:
            X.6kr r4 = r2.A00
            X.7A5 r1 = r4.A01
            X.8pE r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            r3 = 0
            if (r0 == 0) goto L_0x029d
            X.4qz r2 = r2.A01
            r0 = 36
        L_0x0292:
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.C146958n9) r3, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r2, r0)
            goto L_0x005e
        L_0x029d:
            X.C04220Ms.A0B(r5, r6)
            boolean r0 = r1.A04(r5)
            if (r0 != 0) goto L_0x005e
            X.4qz r2 = r2.A01
            r0 = 37
            goto L_0x0292
        L_0x02ab:
            X.5HU r11 = (X.AnonymousClass5HU) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r0 = r2.A02
            X.GUO r0 = (X.GUO) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r0.A01
            java.lang.Object r0 = r2.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            java.lang.Float r0 = r5.A0H(r0)
            if (r0 != 0) goto L_0x02c7
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x02c7:
            float r1 = r0.floatValue()
            int r0 = r11.A02
            float r3 = (float) r0
            float r1 = r1 * r3
            float r3 = r3 - r1
            android.graphics.drawable.Drawable r4 = r11.A03
            float r1 = r2.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r1 = r1 + r3
            goto L_0x033c
        L_0x02d9:
            X.5HU r11 = (X.AnonymousClass5HU) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r0 = r2.A02
            X.GUO r0 = (X.GUO) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r0.A01
            java.lang.Object r0 = r2.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            java.lang.Float r0 = r4.A0H(r0)
            if (r0 != 0) goto L_0x02f5
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x02f5:
            float r3 = r0.floatValue()
            int r0 = r11.A02
            float r1 = (float) r0
            float r3 = r3 * r1
            float r1 = r1 - r3
            android.graphics.drawable.Drawable r3 = r11.A03
            float r0 = r2.A00
            float r0 = r0 + r1
            goto L_0x0055
        L_0x0305:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r1 = r2.A02
            X.GdL r1 = (X.C31007GdL) r1
            java.lang.Object r0 = r2.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            float r2 = r2.A00
            float r10 = X.C31007GdL.A00(r0, r11, r1)
            float r4 = X.C31007GdL.A01(r0, r1)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r1.A02
            float r0 = r5.A0C(r0)
            double r0 = (double) r0
            double r8 = java.lang.Math.toRadians(r0)
            double r6 = (double) r2
            double r2 = java.lang.Math.cos(r8)
            double r0 = (double) r10
            double r2 = r2 * r0
            double r6 = r6 + r2
            double r2 = java.lang.Math.sin(r8)
            double r0 = (double) r4
            double r2 = r2 * r0
            double r6 = r6 - r2
            float r1 = (float) r6
            java.lang.Object r4 = r11.A01
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L_0x033c:
            X.I0q r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r4, r5)
            if (r0 == 0) goto L_0x005e
            r0.CnR(r1)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S0200001_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
