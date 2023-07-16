package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape19S0301000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape19S0301000_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0264, code lost:
        r1 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0268, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x026e, code lost:
        if (r10.Alx() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0270, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            int r0 = r15.A04
            switch(r0) {
                case 0: goto L_0x02d6;
                case 1: goto L_0x0272;
                case 2: goto L_0x024c;
                case 3: goto L_0x0233;
                case 4: goto L_0x020d;
                case 5: goto L_0x01c2;
                case 6: goto L_0x016e;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x014e;
                case 10: goto L_0x00e9;
                case 11: goto L_0x0078;
                case 12: goto L_0x0045;
                case 13: goto L_0x0028;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.BMH r10 = (X.BMH) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r0 = r15.A03
            X.Aef r0 = (X.C18391Aef) r0
            X.C3w r0 = r0.A00
            X.C3D r9 = r0.AWn()
            java.lang.Object r11 = r15.A01
            X.BKU r11 = (X.BKU) r11
            java.lang.Object r13 = r15.A02
            X.BMj r13 = (X.C20066BMj) r13
            int r14 = r15.A00
            r12 = 0
            r9.CL2(r10, r11, r12, r13, r14)
        L_0x0025:
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x0027:
            return r1
        L_0x0028:
            android.view.View r4 = X.C86124wJ.A0L(r10)
            java.lang.Object r3 = r15.A01
            X.8ko r3 = (X.C145628ko) r3
            java.lang.Object r2 = r15.A03
            X.BOl r2 = (X.C20101BOl) r2
            int r0 = r15.A00
            X.AXk r1 = X.C19334Auc.A00(r2, r0)
            java.lang.Object r0 = r15.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            X.C04220Ms.A05(r0)
            r3.CD4(r4, r0, r2, r1)
            goto L_0x0025
        L_0x0045:
            android.view.View r3 = X.C86124wJ.A0L(r10)
            java.lang.Object r2 = r15.A01
            X.8ls r2 = (X.C146238ls) r2
            java.lang.Object r1 = r15.A03
            com.instagram.model.shopping.Product r1 = (com.instagram.model.shopping.Product) r1
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r1.A00
            com.instagram.model.shopping.Merchant r0 = r0.A0C
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r0.A06
        L_0x0059:
            X.C04220Ms.A0A(r0)
            long r8 = java.lang.Long.parseLong(r0)
            java.lang.Object r5 = r15.A02
            X.BKU r5 = (X.BKU) r5
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r1.A00
            java.lang.String r6 = r0.A0j
            X.C04220Ms.A06(r6)
            int r7 = r15.A00
            X.AYG r4 = new X.AYG
            r4.<init>(r5, r6, r7, r8)
            r2.C10(r3, r4)
            goto L_0x0025
        L_0x0076:
            r0 = 0
            goto L_0x0059
        L_0x0078:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            r9 = 0
            X.C04220Ms.A0B(r10, r9)
            java.lang.Object r4 = r15.A01
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            int r8 = r15.A00
            int r2 = r10.getWidth()
            int r1 = r10.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r0 = 3
            android.graphics.Paint r6 = X.C86114wI.A0C(r0)
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r9, r9, r1, r0)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r7)
            r0 = 1
            r6.setAntiAlias(r0)
            r3.drawARGB(r9, r9, r9, r9)
            int r0 = r10.getWidth()
            int r0 = r0 >> 1
            float r2 = (float) r0
            int r0 = r10.getHeight()
            int r0 = r0 >> 1
            float r1 = (float) r0
            int r0 = r10.getWidth()
            int r0 = r0 >> 1
            float r0 = (float) r0
            r3.drawCircle(r2, r1, r0, r6)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C86144wL.A18(r6, r0)
            r3.drawBitmap(r10, r5, r5, r6)
            X.C04220Ms.A06(r7)
            r4.put(r8, r7)
            int r1 = r4.size()
            java.lang.Object r0 = r15.A02
            X.0MZ r0 = (X.AnonymousClass0MZ) r0
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0025
            java.lang.Object r0 = r15.A03
            X.C86134wK.A1L(r0, r4)
            goto L_0x0025
        L_0x00e9:
            X.8cg r10 = (X.AnonymousClass8cg) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r9 = r15.A02
            java.lang.Object r8 = r15.A01
            int r2 = r15.A00
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape30S0201000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape30S0201000_I2
            r1.<init>(r2, r0, r8, r9)
            r7 = 1
            r0 = 1264771186(0x4b62e072, float:1.4868594E7)
            r3 = 2
            X.7WY r1 = X.AnonymousClass7WY.A01(r1, r0, r7)
            r0 = 0
            X.7VR r10 = (X.AnonymousClass7VR) r10
            X.7VV r6 = r10.A00
            X.0YP r5 = r10.A01
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r2 = X.C86154wM.A0z(r0, r7)
            kotlin.jvm.internal.KtLambdaShape173S0100000_I2 r1 = X.C86164wN.A0x(r1, r3)
            r0 = -1504808184(0xffffffffa64e7308, float:-7.1626504E-16)
            X.C04220Ms.A0B(r1, r3)
            X.7WY r1 = X.AnonymousClass7WY.A01(r1, r0, r7)
            X.7VZ r0 = new X.7VZ
            r0.<init>(r2, r5, r1)
            r6.A01(r7, r0)
            java.lang.Object r4 = r15.A03
            java.util.List r4 = (java.util.List) r4
            X.4k1 r1 = X.C79424k1.A00
            int r3 = r4.size()
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6 r2 = new kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6
            r2.<init>((java.util.List) r4, (X.AnonymousClass0YY) r1, (int) r0)
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape15S0300000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape15S0300000_I2
            r1.<init>(r0, r4, r9, r8)
            r0 = 699646206(0x29b3c0fe, float:7.982676E-14)
            X.7WY r1 = X.AnonymousClass7WY.A01(r1, r0, r7)
            X.7VZ r0 = new X.7VZ
            r0.<init>(r2, r5, r1)
            r6.A01(r3, r0)
            goto L_0x0025
        L_0x014e:
            X.AZP r10 = (X.AZP) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r0 = r15.A03
            X.6ed r0 = (X.C106186ed) r0
            X.C3v r0 = r0.A00
            X.C3B r7 = r0.AuH()
            java.lang.Object r8 = r15.A01
            X.BKU r8 = (X.BKU) r8
            java.lang.Object r11 = r15.A02
            X.BMj r11 = (X.C20066BMj) r11
            int r12 = r15.A00
            r9 = 0
            r7.CL3(r8, r9, r10, r11, r12)
            goto L_0x0025
        L_0x016e:
            android.content.Context r6 = X.C86154wM.A0A(r10)
            java.lang.Object r1 = r15.A03
            X.Aee r1 = (X.C18390Aee) r1
            java.lang.Object r5 = r15.A01
            X.BKU r5 = (X.BKU) r5
            int r0 = r15.A00
            int r0 = r0 + -1
            java.lang.Object r4 = r15.A02
            X.0kW r4 = (X.C11630kW) r4
            com.instagram.service.session.UserSession r2 = r1.A02
            com.instagram.model.androidlink.AndroidLink r3 = X.C19425Aw7.A01(r6, r5, r2, r0)
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x0025
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0025
            android.net.Uri r1 = X.C15430rJ.A01(r1)
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "shopping_session_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0025
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r4.getModuleName()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r0 = X.C18913AnQ.A00(r5, r3, r2, r0)
            java.lang.String r8 = r0.A01
            java.lang.Object r9 = r0.A00
            java.util.HashMap r9 = (java.util.HashMap) r9
            long r10 = X.C103316Ys.A00
            X.18u r7 = new X.18u
            r7.<init>(r2)
            X.M4x.A04(r6, r7, r8, r9, r10)
            goto L_0x0025
        L_0x01c2:
            java.lang.Object r3 = r15.A03
            X.9EU r3 = (X.AnonymousClass9EU) r3
            X.9CZ r0 = r3.A01
            X.BKT r8 = r0.A09()
            java.lang.Object r0 = r15.A02
            X.C2X r0 = (X.C2X) r0
            X.MNZ r2 = r0.AZh()
            r0 = 1066(0x42a, float:1.494E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = r15.A00
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            android.view.View r4 = r2.A01(r0)
            if (r4 == 0) goto L_0x0025
            java.lang.Object r2 = r15.A01
            X.BKU r2 = (X.BKU) r2
            com.instagram.service.session.UserSession r1 = r3.A06
            X.C19260AtP.A01(r4, r1)
            X.C19260AtP.A00(r4, r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.Jn1 r0 = X.C37235Jn1.A00(r1)
            X.9zx r5 = X.C171779zx.A07
            r0.A06(r4, r5)
            X.Awo r7 = r3.A03
            X.7oX r6 = new X.7oX
            r6.<init>(r2)
            r9 = 16
            X.C19465Awo.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0025
        L_0x020d:
            X.8jn r1 = X.C86124wJ.A0M(r10)
            java.lang.Object r7 = r15.A03
            int r3 = r15.A00
            java.lang.Object r5 = r15.A01
            java.lang.Object r6 = r15.A02
            r4 = 3
            kotlin.jvm.internal.KtLambdaShape20S0301000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape20S0301000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = -1696573611(0xffffffff9ae05755, float:-9.278532E-23)
            X.C115716vn.A00(r1, r2, r0)
            r4 = 4
            kotlin.jvm.internal.KtLambdaShape20S0301000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape20S0301000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 1052337214(0x3eb9643e, float:0.3620929)
            X.C115716vn.A00(r1, r2, r0)
            goto L_0x0025
        L_0x0233:
            X.8fs r10 = (X.C142958fs) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r3 = r15.A03
            X.53d r3 = (X.C875353d) r3
            java.lang.Object r2 = r15.A01
            X.53d r2 = (X.C875353d) r2
            int r1 = r15.A00
            java.lang.Object r0 = r15.A02
            X.0YY r0 = (X.AnonymousClass0YY) r0
            boolean r0 = X.AnonymousClass7KH.A04(r3, r2, r0, r1)
            goto L_0x0264
        L_0x024c:
            X.8fs r10 = (X.C142958fs) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r3 = r15.A03
            X.53d r3 = (X.C875353d) r3
            java.lang.Object r2 = r15.A01
            X.53d r2 = (X.C875353d) r2
            int r1 = r15.A00
            java.lang.Object r0 = r15.A02
            X.0YY r0 = (X.AnonymousClass0YY) r0
            boolean r0 = X.C121647Hd.A00(r3, r2, r0, r1)
        L_0x0264:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.Alx()
            if (r0 == 0) goto L_0x0027
            r1 = 0
            return r1
        L_0x0272:
            r5 = 0
            X.C04220Ms.A0B(r10, r5)
            java.lang.Object r4 = r15.A02
            X.8nV r4 = (X.C147168nV) r4
            java.lang.Object r7 = r15.A03
            X.7XZ r7 = (X.AnonymousClass7XZ) r7
            int r3 = r7.A00
            X.6tW r2 = r7.A02
            X.0ZU r0 = r7.A03
            java.lang.Object r0 = r0.invoke()
            X.7Gf r0 = (X.C121457Gf) r0
            if (r0 == 0) goto L_0x02d4
            X.7AW r1 = r0.A02
        L_0x028e:
            java.lang.Object r6 = r15.A01
            X.7Xy r6 = (X.C123657Xy) r6
            if (r1 == 0) goto L_0x02d1
            X.8nB r0 = r2.A01
            int r0 = r0.CVm(r3)
            X.7F6 r0 = r1.A0A(r0)
        L_0x029e:
            float r1 = X.AnonymousClass6ZI.A00
            int r1 = r4.CfL(r1)
            float r3 = r0.A01
            float r1 = (float) r1
            float r2 = r3 + r1
            float r1 = r0.A03
            float r0 = r0.A00
            X.7F6 r4 = new X.7F6
            r4.<init>(r3, r1, r2, r0)
            X.7EJ r3 = r7.A01
            X.66l r2 = X.C967266l.Vertical
            int r1 = r15.A00
            int r0 = r6.A00
            r3.A00(r2, r4, r1, r0)
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = -r0
            int r0 = X.AnonymousClass8bA.A02(r0)
            X.C122067Jz.A02(r6, r5, r0)
            goto L_0x0025
        L_0x02d1:
            X.7F6 r0 = X.AnonymousClass7F6.A04
            goto L_0x029e
        L_0x02d4:
            r1 = 0
            goto L_0x028e
        L_0x02d6:
            r5 = 0
            X.C04220Ms.A0B(r10, r5)
            java.lang.Object r8 = r15.A02
            X.8q0 r8 = (X.C147838q0) r8
            java.lang.Object r7 = r15.A03
            X.7XY r7 = (X.AnonymousClass7XY) r7
            int r10 = r7.A00
            X.6tW r9 = r7.A02
            X.0ZU r0 = r7.A03
            java.lang.Object r0 = r0.invoke()
            X.7Gf r0 = (X.C121457Gf) r0
            if (r0 == 0) goto L_0x034e
            X.7AW r4 = r0.A02
        L_0x02f2:
            X.69J r1 = r8.getLayoutDirection()
            X.69J r0 = X.AnonymousClass69J.Rtl
            boolean r3 = X.C18180wK.A1Z(r1, r0)
            java.lang.Object r6 = r15.A01
            X.7Xy r6 = (X.C123657Xy) r6
            int r2 = r6.A01
            if (r4 == 0) goto L_0x034b
            X.8nB r0 = r9.A01
            int r0 = r0.CVm(r10)
            X.7F6 r0 = r4.A0A(r0)
        L_0x030e:
            float r1 = X.AnonymousClass6ZI.A00
            int r4 = r8.CfL(r1)
            if (r3 == 0) goto L_0x0345
            float r3 = (float) r2
            float r1 = r0.A01
            float r3 = r3 - r1
            float r1 = (float) r4
            float r2 = r3 - r1
        L_0x031d:
            float r1 = r0.A03
            float r0 = r0.A00
            X.7F6 r4 = new X.7F6
            r4.<init>(r2, r1, r3, r0)
            X.7EJ r3 = r7.A01
            X.66l r2 = X.C967266l.Horizontal
            int r1 = r15.A00
            int r0 = r6.A01
            r3.A00(r2, r4, r1, r0)
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = -r0
            int r0 = X.AnonymousClass8bA.A02(r0)
            X.C122067Jz.A02(r6, r0, r5)
            goto L_0x0025
        L_0x0345:
            float r2 = r0.A01
            float r1 = (float) r4
            float r3 = r2 + r1
            goto L_0x031d
        L_0x034b:
            X.7F6 r0 = X.AnonymousClass7F6.A04
            goto L_0x030e
        L_0x034e:
            r4 = 0
            goto L_0x02f2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape19S0301000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
