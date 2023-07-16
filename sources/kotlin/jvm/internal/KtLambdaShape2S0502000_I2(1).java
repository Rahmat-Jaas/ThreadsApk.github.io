package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape2S0502000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0502000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        super(1);
        this.A07 = i3;
        this.A05 = obj;
        this.A03 = obj2;
        this.A06 = obj3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.7Xy} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b8, code lost:
        if (r5 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A07
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r11.A05
            X.B5b r0 = (X.B5b) r0
            X.MNZ r1 = r0.A05
            r0 = 1067(0x42b, float:1.495E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.view.View r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r11.A06
            X.9FH r1 = (X.AnonymousClass9FH) r1
            java.lang.Object r6 = r11.A02
            X.BKT r6 = (X.BKT) r6
            com.instagram.service.session.UserSession r0 = r1.A05
            X.C19260AtP.A01(r2, r0)
            X.C19260AtP.A00(r2, r0)
            X.Awo r5 = r1.A03
            X.9zx r3 = X.C171779zx.A0B
            X.7oV r4 = new X.7oV
            r4.<init>(r6)
            r7 = 16
            X.C19465Awo.A01(r2, r3, r4, r5, r6, r7)
        L_0x0034:
            java.lang.Object r0 = r11.A06
            X.9FH r0 = (X.AnonymousClass9FH) r0
            X.Lu1 r0 = r0.A00
            java.lang.Object r0 = r0.A02
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r11.A03
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A00
        L_0x0048:
            r1.setColor(r0)
        L_0x004b:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x004e:
            java.lang.Object r0 = r11.A04
            X.74p r0 = (X.C1193274p) r0
            X.C1193274p.A00(r0)
            java.lang.Object r1 = r11.A03
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A01
            goto L_0x0048
        L_0x005c:
            r2 = 0
            X.C04220Ms.A0B(r12, r2)
            java.lang.Object r5 = r11.A05
            X.7Xy r5 = (X.C123657Xy) r5
            java.lang.Object r6 = r11.A03
            if (r5 == 0) goto L_0x00b5
            X.7Xy r6 = (X.C123657Xy) r6
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r10 = r11.A06
            X.8nV r10 = (X.C147168nV) r10
            int r7 = r11.A01
            int r4 = r11.A00
            java.lang.Object r0 = r11.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = X.C86134wK.A0A(r0)
            java.lang.Object r0 = r11.A04
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = X.C86134wK.A0A(r0)
            if (r9 != r8) goto L_0x00b2
            float r0 = X.AnonymousClass7IG.A02
        L_0x0088:
            int r3 = r10.CfL(r0)
            float r0 = X.AnonymousClass78U.A00
            int r0 = r10.CfL(r0)
            int r3 = r3 + r0
            int r2 = r6.A00
            long r0 = X.AnonymousClass7IG.A04
            int r0 = r10.CfK(r0)
            int r2 = r2 + r0
            int r2 = r2 - r9
            int r0 = r5.A01
            int r0 = r7 - r0
            int r0 = r0 >> 1
            int r4 = r4 - r8
            int r4 = r4 - r3
            X.C122067Jz.A02(r5, r0, r4)
            int r0 = r6.A01
            int r7 = r7 - r0
            int r0 = r7 >> 1
            int r4 = r4 - r2
            X.C122067Jz.A02(r6, r0, r4)
            goto L_0x004b
        L_0x00b2:
            float r0 = X.AnonymousClass7IG.A00
            goto L_0x0088
        L_0x00b5:
            r5 = r6
            X.7Xy r5 = (X.C123657Xy) r5
            if (r5 == 0) goto L_0x004b
        L_0x00ba:
            int r1 = r11.A00
            int r0 = r5.A00
            int r1 = r1 - r0
            int r0 = r1 >> 1
            X.C122067Jz.A02(r5, r2, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S0502000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
