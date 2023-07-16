package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape31S0201000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape31S0201000_I2(int i, int i2, Object obj, Object obj2) {
        super(1);
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: java.lang.Number} */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v26, types: [int] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1 >= r2.A00) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0351, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r1 = r0[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r1 <= r2.A00) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r1 = (r0[r3] + r0[r4]) - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x0038;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r20
            r15 = r21
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x00bc;
                case 2: goto L_0x0127;
                case 3: goto L_0x0173;
                case 4: goto L_0x0215;
                case 5: goto L_0x022d;
                case 6: goto L_0x0247;
                case 7: goto L_0x003d;
                case 8: goto L_0x0274;
                case 9: goto L_0x02db;
                case 10: goto L_0x02f2;
                case 11: goto L_0x0308;
                case 12: goto L_0x0324;
                case 13: goto L_0x0336;
                case 14: goto L_0x0352;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.6kA r15 = (X.C109536kA) r15
            r3 = 0
            X.C04220Ms.A0B(r15, r3)
            java.lang.Object r1 = r2.A01
            java.lang.Integer r0 = r15.A02
            r4 = 1
            if (r1 != r0) goto L_0x008b
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x006c
            java.lang.Object r0 = r2.A02
            X.7H1 r0 = (X.AnonymousClass7H1) r0
            X.8mK r1 = r0.A09
            X.C2z r0 = r15.A01
            int[] r0 = r1.AwD(r0)
        L_0x0026:
            if (r0 == 0) goto L_0x0038
            r1 = r0[r3]
            r0 = r0[r4]
            int r1 = r1 + r0
            int r1 = r1 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0038
            int r0 = r2.A00
            if (r1 >= r0) goto L_0x008b
        L_0x0038:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x003d:
            X.6jx r15 = (X.C109406jx) r15
            r3 = 0
            X.C04220Ms.A0B(r15, r3)
            java.lang.Object r1 = r2.A01
            java.lang.Integer r0 = r15.A02
            r4 = 1
            if (r1 != r0) goto L_0x008b
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x005b
            java.lang.Object r0 = r2.A02
            X.AxN r0 = (X.C19500AxN) r0
            X.C2c r1 = r0.A0A
            X.BKU r0 = r15.A00
            int[] r0 = r1.getModelIndex(r0)
            goto L_0x0026
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x008b
            java.lang.Object r0 = r2.A02
            X.AxN r0 = (X.C19500AxN) r0
            X.C2c r1 = r0.A0A
            X.BKU r0 = r15.A00
            int[] r0 = r1.getModelIndex(r0)
            goto L_0x007c
        L_0x006c:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x008b
            java.lang.Object r0 = r2.A02
            X.7H1 r0 = (X.AnonymousClass7H1) r0
            X.8mK r1 = r0.A09
            X.C2z r0 = r15.A01
            int[] r0 = r1.AwD(r0)
        L_0x007c:
            if (r0 == 0) goto L_0x0038
            r1 = r0[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0038
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x008b
            goto L_0x0038
        L_0x008b:
            r4 = 0
            goto L_0x0038
        L_0x008d:
            r4 = 0
            X.C04220Ms.A0B(r15, r4)
            java.lang.Object r3 = r2.A02
            X.7XX r3 = (X.AnonymousClass7XX) r3
            X.7Ub r0 = r3.A00
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r2.A00
            int r0 = X.AnonymousClass8bI.A02(r1, r4, r0)
            int r1 = -r0
            boolean r0 = r3.A01
            r4 = r1
            r3 = 0
            if (r0 == 0) goto L_0x00b0
            r4 = 0
            r3 = r1
        L_0x00b0:
            java.lang.Object r2 = r2.A01
            X.7Xy r2 = (X.C123657Xy) r2
            r1 = 0
            r0 = 12
            X.C122067Jz.A04(r2, r1, r4, r3, r0)
            goto L_0x034f
        L_0x00bc:
            X.7KC r15 = (X.AnonymousClass7KC) r15
            long r3 = r15.A00
            java.lang.Object r8 = r2.A02
            androidx.compose.foundation.gestures.ScrollingLogic r8 = (androidx.compose.foundation.gestures.ScrollingLogic) r8
            X.4oM r0 = r8.A05
            java.lang.Object r6 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r6 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r6
            int r12 = r2.A00
            X.8lc r0 = r6.A00
            if (r0 == 0) goto L_0x0124
            long r0 = r0.CBu(r3, r12)
        L_0x00d6:
            long r3 = X.AnonymousClass7KC.A04(r3, r0)
            java.lang.Object r11 = r2.A01
            X.8fT r11 = (X.C142718fT) r11
            r9 = r3
            boolean r7 = r8.A06
            if (r7 == 0) goto L_0x00e9
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r9 = X.AnonymousClass7KC.A03(r2, r3)
        L_0x00e9:
            X.66l r5 = r8.A02
            X.66l r2 = X.C967266l.Horizontal
            if (r5 != r2) goto L_0x011f
            float r2 = X.AnonymousClass7KC.A01(r9)
        L_0x00f3:
            float r2 = r11.CgC(r2)
            long r8 = r8.A00(r2)
            if (r7 == 0) goto L_0x0103
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r8 = X.AnonymousClass7KC.A03(r2, r8)
        L_0x0103:
            long r10 = X.AnonymousClass7KC.A04(r3, r8)
            X.8lc r7 = r6.A00
            if (r7 == 0) goto L_0x011c
            long r2 = r7.CBp(r8, r10, r12)
        L_0x010f:
            long r0 = X.AnonymousClass7KC.A05(r0, r8)
            long r0 = X.AnonymousClass7KC.A05(r0, r2)
            X.7KC r4 = X.C86124wJ.A0O(r0)
            return r4
        L_0x011c:
            long r2 = X.AnonymousClass7KC.A03
            goto L_0x010f
        L_0x011f:
            float r2 = X.AnonymousClass7KC.A02(r9)
            goto L_0x00f3
        L_0x0124:
            long r0 = X.AnonymousClass7KC.A03
            goto L_0x00d6
        L_0x0127:
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            java.lang.Object r0 = r2.A02
            if (r15 == r0) goto L_0x016c
            boolean r0 = r15 instanceof X.C145738l0
            if (r0 == 0) goto L_0x034f
            X.Lsi r0 = X.C1191373q.A00
            java.lang.Object r0 = r0.A00()
            X.C04220Ms.A0A(r0)
            int r4 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r3 = r2.A01
            X.7EA r3 = (X.AnonymousClass7EA) r3
            int r0 = r2.A00
            int r4 = r4 - r0
            int r1 = X.AnonymousClass7EA.A00(r3, r15)
            if (r1 < 0) goto L_0x016a
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
        L_0x0151:
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0166
            int r0 = r0.intValue()
        L_0x0159:
            int r0 = java.lang.Math.min(r4, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01(r15, r0)
            goto L_0x034f
        L_0x0166:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0159
        L_0x016a:
            r0 = 0
            goto L_0x0151
        L_0x016c:
            java.lang.String r0 = "A derived state calculation cannot read itself"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0173:
            X.8la r15 = (X.C146068la) r15
            r10 = 0
            X.C04220Ms.A0B(r15, r10)
            java.lang.Object r7 = r2.A02
            X.7WO r7 = (X.AnonymousClass7WO) r7
            int r0 = r7.A00
            int r9 = r2.A00
            if (r0 != r9) goto L_0x034f
            java.lang.Object r8 = r2.A01
            X.6pM r8 = (X.C112306pM) r8
            X.6pM r0 = r7.A04
            boolean r0 = X.C04220Ms.A0I(r8, r0)
            if (r0 == 0) goto L_0x034f
            boolean r0 = r15 instanceof X.AnonymousClass7W5
            if (r0 == 0) goto L_0x034f
            int r11 = r8.A00
            r6 = 0
            r5 = 0
        L_0x0197:
            r4 = 0
            if (r6 >= r11) goto L_0x0201
            java.lang.Object[] r0 = r8.A02
            r1 = r0[r6]
            r0 = 19
            java.lang.String r0 = X.I17.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            int[] r3 = r8.A01
            r2 = r3[r6]
            if (r2 == r9) goto L_0x01f6
            r3 = r15
            X.7W5 r3 = (X.AnonymousClass7W5) r3
            X.C04220Ms.A0B(r1, r10)
            X.7Ew r2 = r3.A0B
            r2.A05(r1, r7)
            boolean r0 = r1 instanceof X.C147358pD
            if (r0 == 0) goto L_0x01f3
            int r0 = X.C121227Ew.A00(r2, r1)
            boolean r0 = X.C86114wI.A1S(r0)
            if (r0 != 0) goto L_0x01cb
            X.7Ew r0 = r3.A0A
            r0.A03(r1)
        L_0x01cb:
            X.7EA r13 = r7.A05
            if (r13 == 0) goto L_0x01f3
            int r14 = X.AnonymousClass7EA.A00(r13, r1)
            if (r14 < 0) goto L_0x01ed
            java.lang.Object[] r12 = r13.A02
            int r3 = r13.A00
            java.lang.Object[] r2 = r13.A01
            int r1 = r14 + 1
            X.AnonymousClass8AQ.A0G(r2, r2, r14, r1, r3)
            int r0 = r3 - r1
            java.lang.System.arraycopy(r12, r1, r12, r14, r0)
            int r0 = r3 + -1
            r2[r0] = r4
            r12[r0] = r4
            r13.A00 = r0
        L_0x01ed:
            int r0 = r13.A00
            if (r0 != 0) goto L_0x01f3
            r7.A05 = r4
        L_0x01f3:
            int r6 = r6 + 1
            goto L_0x0197
        L_0x01f6:
            if (r5 == r6) goto L_0x01fe
            java.lang.Object[] r0 = r8.A02
            r0[r5] = r1
            r3[r5] = r2
        L_0x01fe:
            int r5 = r5 + 1
            goto L_0x01f3
        L_0x0201:
            int r2 = r8.A00
            r1 = r5
        L_0x0204:
            if (r1 >= r2) goto L_0x020d
            java.lang.Object[] r0 = r8.A02
            r0[r1] = r4
            int r1 = r1 + 1
            goto L_0x0204
        L_0x020d:
            r8.A00 = r5
            if (r5 != 0) goto L_0x034f
            r7.A04 = r4
            goto L_0x034f
        L_0x0215:
            int r4 = X.AnonymousClass0wJ.A04(r15)
            java.lang.Object r0 = r2.A02
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r0
            X.01V r3 = r0.logger
            java.lang.Object r0 = r2.A01
            int r1 = r0.hashCode()
            int r0 = r2.A00
            short r0 = (short) r0
            r3.markerEnd(r4, r1, r0)
            goto L_0x034f
        L_0x022d:
            java.lang.Object r4 = r2.A02
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            java.lang.Object r3 = r2.A01
            int r1 = r2.A00
            r0 = 4
            kotlin.jvm.internal.KtLambdaShape22S0101000_I2_1 r2 = new kotlin.jvm.internal.KtLambdaShape22S0101000_I2_1
            r2.<init>(r3, r1, r0)
            r1 = -1516602512(0xffffffffa59a7b70, float:-2.6798386E-16)
            r0 = 1
            X.7WY r0 = X.AnonymousClass7WY.A01(r2, r1, r0)
            r4.setContent(r0)
            return r4
        L_0x0247:
            X.8jn r8 = X.C86124wJ.A0M(r15)
            java.lang.Object r7 = r2.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r2.A02
            int r5 = r2.A00
            X.4jz r1 = X.C79404jz.A00
            int r4 = r7.size()
            r0 = 23
            kotlin.jvm.internal.KtLambdaShape44S0200000_I2_5 r3 = new kotlin.jvm.internal.KtLambdaShape44S0200000_I2_5
            r3.<init>(r0, r7, r1)
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape32S0201000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape32S0201000_I2
            r2.<init>(r5, r0, r7, r6)
            r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            r0 = 1
            X.7WY r1 = X.AnonymousClass7WY.A01(r2, r1, r0)
            r0 = 0
            r8.Ba5(r0, r3, r1, r4)
            goto L_0x034f
        L_0x0274:
            com.instagram.user.follow.FollowButton r15 = (com.instagram.user.follow.FollowButton) r15
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            java.lang.Object r4 = r2.A01
            X.DsH r4 = (X.C25803DsH) r4
            com.instagram.user.model.User r3 = r4.A08()
            if (r3 == 0) goto L_0x02d6
            java.lang.Object r6 = r2.A02
            X.CWw r6 = (X.C22384CWw) r6
            com.instagram.service.session.UserSession r14 = r6.A05
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36314073041733417(0x81037500000729, double:3.0285042444029585E-306)
            boolean r0 = X.C63803iN.A0E(r5, r14, r0)
            if (r0 == 0) goto L_0x02cb
            X.D26 r0 = X.D26.MESSAGE_OPTION
            r15.setBaseStyle(r0)
            r11 = 0
            android.content.Context r12 = r6.A00
            X.0kW r13 = r6.A01
            java.lang.Boolean r18 = X.C18180wK.A0Y()
            X.EzY r0 = r6.A02
            r16 = r0
            r17 = r3
            X.C50422sy.A00(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x02ae:
            X.DvL r1 = r15.A03
            X.EzY r5 = r6.A02
            r1.A06 = r5
            X.0kW r0 = r6.A01
            r1.A02(r0, r14, r3)
            java.lang.String r1 = r3.getId()
            int r0 = r2.A00
            r5.Cmo(r4, r1, r0)
            java.lang.String r0 = r3.getId()
            X.C36505JYt.A01(r15, r14, r0)
            goto L_0x034f
        L_0x02cb:
            X.DvL r1 = r15.A03
            r0 = 0
            r1.A00 = r0
            X.D26 r0 = X.D26.MEDIUM
            r15.setBaseStyle(r0)
            goto L_0x02ae
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x02db:
            java.lang.Object r4 = r2.A02
            X.0YY r4 = (X.AnonymousClass0YY) r4
            int r3 = r2.A00
            java.lang.Object r0 = r2.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2) r0
            boolean r0 = r0.A02
            r1 = r0 ^ 1
            X.1th r0 = new X.1th
            r0.<init>(r3, r1)
            r4.invoke(r0)
            goto L_0x034f
        L_0x02f2:
            android.view.View r4 = X.C86124wJ.A0L(r15)
            java.lang.Object r3 = r2.A01
            X.8ko r3 = (X.C145628ko) r3
            java.lang.Object r1 = r2.A02
            X.BOl r1 = (X.C20101BOl) r1
            int r0 = r2.A00
            X.AXk r0 = X.C19334Auc.A00(r1, r0)
            r3.CD3(r4, r1, r0)
            goto L_0x034f
        L_0x0308:
            android.view.View r15 = (android.view.View) r15
            r3 = 0
            X.C04220Ms.A0B(r15, r3)
            java.lang.Object r14 = r2.A01
            X.8lT r14 = (X.C146008lT) r14
            java.lang.Object r1 = r2.A02
            X.5Hw r1 = (X.C89985Hw) r1
            X.9vO r16 = X.C170679vO.SHORTCUT_RIBBON
            int r0 = r2.A00
            r17 = r1
            r18 = r3
            r19 = r0
            r14.CKU(r15, r16, r17, r18, r19)
            goto L_0x034f
        L_0x0324:
            java.lang.Object r3 = r2.A01
            X.C18 r3 = (X.C18) r3
            java.lang.Object r0 = r2.A02
            X.BKU r0 = (X.BKU) r0
            X.BKN r0 = r0.A0f
            java.lang.String r1 = r0.A4Y
            int r0 = r2.A00
            r3.CCp(r1, r0)
            goto L_0x034f
        L_0x0336:
            java.lang.Object r0 = r2.A02
            X.Ar0 r0 = (X.C19123Ar0) r0
            X.9Oz r4 = r0.A08
            java.lang.Object r3 = r2.A01
            com.instagram.model.shopping.Product r3 = (com.instagram.model.shopping.Product) r3
            int r1 = r2.A00
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C156739Oz.A00(r3, r4, r0, r1)
        L_0x034f:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0352:
            android.view.View r5 = X.C86124wJ.A0L(r15)
            java.lang.Object r0 = r2.A02
            X.Ar0 r0 = (X.C19123Ar0) r0
            X.9Oz r1 = r0.A08
            java.lang.Object r6 = r2.A01
            com.instagram.model.shopping.Product r6 = (com.instagram.model.shopping.Product) r6
            int r4 = r2.A00
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            X.AaC r3 = r1.A00
            if (r3 != 0) goto L_0x0371
            java.lang.String r0 = "binder"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0371:
            X.0Oa r0 = r1.A03
            java.lang.String r2 = X.C18200wM.A0q(r0)
            if (r2 != 0) goto L_0x037b
            java.lang.String r2 = ""
        L_0x037b:
            X.0Oa r0 = r1.A07
            java.lang.String r0 = X.C18200wM.A0q(r0)
            X.6lC r1 = new X.6lC
            r1.<init>(r6, r2, r0, r4)
            X.Ar0 r0 = r3.A02
            X.0Oa r0 = r0.A0E
            java.lang.Object r3 = r0.getValue()
            X.BNa r3 = (X.BNa) r3
            X.GbW r2 = r3.A00
            kotlin.Unit r4 = kotlin.Unit.A00
            com.instagram.model.shopping.Product r0 = r1.A01
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            java.lang.String r0 = r0.A0j
            X.Jix r1 = X.C37284Jnx.A00(r1, r4, r0)
            X.9a5 r0 = r3.A03
            r1.A01(r0)
            X.Jnx r0 = r1.A02()
            r2.A03(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape31S0201000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
