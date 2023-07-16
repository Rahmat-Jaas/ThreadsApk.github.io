package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape5S0102000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S0102000_I2(Object obj, int i, int i2, int i3) {
        super(1);
        this.A03 = i3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        r0 = r11.A00;
        r5 = r12.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A03
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0048;
                case 2: goto L_0x0083;
                case 3: goto L_0x00a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r12 = (android.content.Context) r12
            r10 = 0
            X.C04220Ms.A0B(r12, r10)
            androidx.recyclerview.widget.RecyclerView r4 = new androidx.recyclerview.widget.RecyclerView
            r4.<init>(r12)
            java.lang.Object r3 = r11.A02
            X.F6t r3 = (X.F6t) r3
            int r7 = r11.A01
            int r2 = r11.A00
            r1 = 4
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r1)
            r4.setLayoutManager(r0)
            X.F7m r0 = r3.A01
            r4.setAdapter(r0)
            r6 = 1
            X.CDi r5 = new X.CDi
            r8 = r7
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A0y(r5)
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r2)
            r4.setLayoutParams(r0)
            return r4
        L_0x003b:
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r4 = r11.A02
            X.7Xy r4 = (X.C123657Xy) r4
            int r2 = r11.A00
            int r1 = r11.A01
            goto L_0x00c5
        L_0x0048:
            X.6iT r12 = (X.C108506iT) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r0 = r12.A02
            X.8jp r0 = (X.C145098jp) r0
            X.0YY r6 = r0.Aqr()
            if (r6 == 0) goto L_0x00c9
            int r0 = r11.A00
            int r5 = r12.A01
            int r4 = java.lang.Math.max(r0, r5)
            int r1 = r11.A01
            int r0 = r12.A00
            int r0 = r0 + r5
            int r0 = r0 + -1
            int r3 = java.lang.Math.min(r1, r0)
            if (r4 > r3) goto L_0x00c9
        L_0x006d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r11.A02
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            int r0 = r4 - r5
            java.lang.Object r0 = X.C86154wM.A0f(r6, r0)
            r1.put(r0, r2)
            if (r4 == r3) goto L_0x00c9
            int r4 = r4 + 1
            goto L_0x006d
        L_0x0083:
            X.86i r2 = X.AnonymousClass75O.A00(r12)
            int r0 = r11.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "minLines"
            r2.A01(r0, r1)
            int r0 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "maxLines"
            r2.A01(r0, r1)
            java.lang.Object r1 = r11.A02
            java.lang.String r0 = "textStyle"
            r2.A01(r0, r1)
            goto L_0x00c9
        L_0x00a5:
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            int r1 = r11.A01
            java.lang.Object r4 = r11.A02
            X.7Xy r4 = (X.C123657Xy) r4
            int r0 = r4.A01
            int r1 = r1 - r0
            float r0 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            int r2 = X.AnonymousClass8bA.A02(r0)
            int r1 = r11.A00
            int r0 = r4.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 / r3
            int r1 = X.AnonymousClass8bA.A02(r0)
        L_0x00c5:
            r0 = 0
            X.C122067Jz.A00(r4, r0, r2, r1)
        L_0x00c9:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape5S0102000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
