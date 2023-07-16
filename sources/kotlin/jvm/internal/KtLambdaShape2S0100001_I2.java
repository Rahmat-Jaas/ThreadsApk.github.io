package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape2S0100001_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0100001_I2(Object obj, float f, int i) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ab, code lost:
        r2.A0Z(r1, r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d1, code lost:
        r3.A0a(r2, (r1 * ((float) r0)) / ((float) r2.getIntrinsicHeight()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0035;
                case 2: goto L_0x0005;
                case 3: goto L_0x0062;
                case 4: goto L_0x0005;
                case 5: goto L_0x0079;
                case 6: goto L_0x0088;
                case 7: goto L_0x009b;
                case 8: goto L_0x00b2;
                case 9: goto L_0x00de;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.8pw r2 = X.C86144wL.A0J(r7)
            java.lang.Object r0 = r6.A01
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r0 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r0
            float r1 = com.instagram.barcelona.bds.components.header.EnterAlwaysState.A00(r0)
            float r0 = r6.A00
            float r1 = r1 / r0
            float r0 = -r1
            X.7Wz r2 = (X.C123457Wz) r2
            r2.A07 = r0
        L_0x0019:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x001c:
            long r2 = X.C18190wL.A08(r7)
            java.lang.Object r4 = r6.A01
            X.6vT r4 = (X.C115556vT) r4
            X.8pE r0 = r4.A02
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 != 0) goto L_0x0019
            r0 = 1
            long r2 = r2 / r0
            float r0 = r6.A00
            r4.A01(r2, r0)
            goto L_0x0019
        L_0x0035:
            X.8cg r7 = (X.AnonymousClass8cg) r7
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r2 = r6.A01
            java.util.List r2 = (java.util.List) r2
            int r5 = r2.size()
            float r0 = r6.A00
            X.8aZ r1 = new X.8aZ
            r1.<init>(r2, r0)
            r0 = 199172463(0xbdf216f, float:8.594678E-32)
            X.7WY r4 = X.AnonymousClass7WY.A00(r1, r0)
            X.4hI r3 = X.C77734hI.A00
            X.7VR r7 = (X.AnonymousClass7VR) r7
            X.7VV r2 = r7.A00
            X.0YP r1 = r7.A01
            X.7VZ r0 = new X.7VZ
            r0.<init>(r3, r1, r4)
            r2.A01(r5, r0)
            goto L_0x0019
        L_0x0062:
            X.86i r2 = X.AnonymousClass75O.A00(r7)
            float r0 = r6.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = "ratio"
            r2.A01(r0, r1)
            java.lang.Object r1 = r6.A01
            java.lang.String r0 = "contentPadding"
            r2.A01(r0, r1)
            goto L_0x0019
        L_0x0079:
            X.5HU r7 = (X.AnonymousClass5HU) r7
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.GUO r0 = (X.GUO) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A01
            android.graphics.drawable.Drawable r1 = r7.A03
            goto L_0x00ab
        L_0x0088:
            X.5HU r7 = (X.AnonymousClass5HU) r7
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.GUO r0 = (X.GUO) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A01
            android.graphics.drawable.Drawable r2 = r7.A03
            float r1 = r6.A00
            int r0 = r7.A02
            goto L_0x00d1
        L_0x009b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r7
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.GdL r0 = (X.C31007GdL) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A02
            java.lang.Object r1 = r7.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x00ab:
            float r0 = r6.A00
            r2.A0Z(r1, r0)
            goto L_0x0019
        L_0x00b2:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r7
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r2 = r6.A01
            X.GdL r2 = (X.C31007GdL) r2
            android.content.Context r0 = r2.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r2.A02
            java.lang.Object r2 = r7.A01
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            float r1 = r6.A00
        L_0x00d1:
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r2.getIntrinsicHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r3.A0a(r2, r1)
            goto L_0x0019
        L_0x00de:
            com.instagram.music.common.ui.MusicPreviewButton r7 = (com.instagram.music.common.ui.MusicPreviewButton) r7
            r2 = 0
            X.C04220Ms.A0B(r7, r2)
            java.lang.Object r0 = r6.A01
            X.67e r0 = (X.C969167e) r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0103
            if (r1 == r2) goto L_0x0108
            r0 = 2
            if (r1 == r0) goto L_0x00fe
            r0 = 3
            if (r1 != r0) goto L_0x0019
            float r0 = r6.A00
            r7.setProgress(r0)
            goto L_0x0019
        L_0x00fe:
            r7.A00()
            goto L_0x0019
        L_0x0103:
            X.C4p r1 = r7.A00
            X.D0U r0 = X.D0U.LOADING
            goto L_0x0117
        L_0x0108:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0113
            X.C4p r0 = r7.A00
            r0.A03 = r2
            r0.invalidateSelf()
        L_0x0113:
            X.C4p r1 = r7.A00
            X.D0U r0 = X.D0U.PLAY
        L_0x0117:
            r1.A04(r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S0100001_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
