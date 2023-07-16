package com.facebook.redex;

import X.C18190wL;
import X.C39769Kzd;
import X.C86674y5;
import X.KHQ;
import X.L5E;
import android.graphics.Bitmap;

public class IDxCCallbackShape484S0100000_2_I2 implements C39769Kzd {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape484S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r2 = (X.C86674y5) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r6, X.L5E r7) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x004c;
                case 2: goto L_0x0083;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.AnonymousClass0wJ.A1N(r7, r6)
            java.lang.Object r3 = r6.A01
            if (r3 == 0) goto L_0x0024
            java.lang.Object r0 = r7.BFS()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r5.A00
            X.4y5 r2 = (X.C86674y5) r2
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x0024
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r1.add(r0, r3)
        L_0x0021:
            r2.invalidateSelf()
        L_0x0024:
            return
        L_0x0025:
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r2 = r5.A00
            X.544 r2 = (X.AnonymousClass544) r2
            java.lang.Object r0 = r6.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x004a
            X.Gmy r1 = new X.Gmy
            r1.<init>(r0)
            android.graphics.Bitmap r0 = r1.A00
            r0.prepareToDraw()
        L_0x003d:
            X.8pE r0 = r2.A03
            r0.CrC(r1)
            X.0ZU r0 = r2.A05
            if (r0 == 0) goto L_0x0024
            r0.invoke()
            return
        L_0x004a:
            r1 = 0
            goto L_0x003d
        L_0x004c:
            java.lang.Object r4 = r6.A01
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L_0x0024
            java.lang.Object r3 = r5.A00
            X.7A2 r3 = (X.AnonymousClass7A2) r3
            android.content.Context r0 = r3.A01
            android.content.res.Resources r2 = r0.getResources()
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0070
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0070
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r2, r4)
        L_0x006c:
            r3.A01(r1)
            return
        L_0x0070:
            X.F6Z r1 = new X.F6Z
            r1.<init>(r2, r4)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x007d
            r1.A01()
            goto L_0x006c
        L_0x007d:
            float r0 = r3.A00
            r1.A02(r0)
            goto L_0x006c
        L_0x0083:
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r6.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r2 = r5.A00
            X.4y5 r2 = (X.C86674y5) r2
            if (r0 != 0) goto L_0x0099
            X.0Oa r0 = r2.A08
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x0099:
            r2.A00 = r0
            X.C86674y5.A01(r2)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCCallbackShape484S0100000_2_I2.BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2, X.L5E):void");
    }

    public final void C1y(L5E l5e, KHQ khq) {
        switch (this.A01) {
            case 0:
            case 1:
                return;
            default:
                C86674y5 r1 = (C86674y5) this.A00;
                r1.A00 = (Bitmap) C18190wL.A0f(r1.A08);
                C86674y5.A01(r1);
                r1.invalidateSelf();
                return;
        }
    }

    public final void C25(L5E l5e, int i) {
    }
}
