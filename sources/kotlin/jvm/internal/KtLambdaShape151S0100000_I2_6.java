package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape151S0100000_I2_6 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape151S0100000_I2_6(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        r0 = java.lang.Float.valueOf(X.C18240wQ.A00(r2.getValue()) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x013e, code lost:
        r1.invoke(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a7, code lost:
        r0 = (X.C147368pE) r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b6, code lost:
        r0.CrC(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c9, code lost:
        r2.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02bd, code lost:
        r1 = X.AnonymousClass00U.A0L(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c1, code lost:
        r5.A0G((X.C113926sO) null, (X.AnonymousClass8dR) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x036c, code lost:
        if (r1.A06() != true) goto L_0x036e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r2 = r21
            r6 = r22
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0028;
                case 2: goto L_0x003a;
                case 3: goto L_0x02c7;
                case 4: goto L_0x02d1;
                case 5: goto L_0x0041;
                case 6: goto L_0x0041;
                case 7: goto L_0x0065;
                case 8: goto L_0x0077;
                case 9: goto L_0x0082;
                case 10: goto L_0x009b;
                case 11: goto L_0x01a3;
                case 12: goto L_0x00d9;
                case 13: goto L_0x00e4;
                case 14: goto L_0x02e9;
                case 15: goto L_0x0331;
                case 16: goto L_0x0118;
                case 17: goto L_0x00d9;
                case 18: goto L_0x01a3;
                case 19: goto L_0x00d9;
                case 20: goto L_0x0349;
                case 21: goto L_0x0353;
                case 22: goto L_0x0127;
                case 23: goto L_0x0130;
                case 24: goto L_0x0139;
                case 25: goto L_0x0009;
                case 26: goto L_0x0356;
                case 27: goto L_0x0380;
                case 28: goto L_0x03a3;
                case 29: goto L_0x01a7;
                case 30: goto L_0x0147;
                case 31: goto L_0x0154;
                case 32: goto L_0x0162;
                case 33: goto L_0x01ac;
                case 34: goto L_0x0147;
                case 35: goto L_0x0353;
                case 36: goto L_0x01bb;
                case 37: goto L_0x0009;
                case 38: goto L_0x01ce;
                case 39: goto L_0x01db;
                case 40: goto L_0x03be;
                case 41: goto L_0x01e8;
                case 42: goto L_0x01f9;
                case 43: goto L_0x0221;
                case 44: goto L_0x0238;
                case 45: goto L_0x0245;
                case 46: goto L_0x0286;
                case 47: goto L_0x0238;
                case 48: goto L_0x029e;
                case 49: goto L_0x02ae;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
        L_0x000d:
            r0.invoke()
        L_0x0010:
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0012:
            return r2
        L_0x0013:
            X.8pw r1 = X.C86144wL.A0J(r6)
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            float r0 = X.C18240wQ.A00(r0)
            X.7Wz r1 = (X.C123457Wz) r1
            r1.A03 = r0
            r1.A04 = r0
            goto L_0x0010
        L_0x0028:
            X.6t4 r6 = (X.C114336t4) r6
            long r0 = r6.A00
            java.lang.Object r2 = r2.A00
            X.8pE r2 = (X.C147368pE) r2
            int r0 = X.C86104wH.A08(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c9
        L_0x003a:
            java.lang.Object r0 = r2.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0041:
            X.6m7 r6 = (X.C110696m7) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r1 = r2.A00
            X.75b r1 = (X.AnonymousClass75b) r1
            X.84D r0 = r1.A01
            r0.remove((java.lang.Object) r6)
            X.84D r0 = r1.A00
            r0.remove((java.lang.Object) r6)
            X.8s9 r1 = r6.A05
            r0 = r1
            X.EnC r0 = (X.C27420EnC) r0
            java.lang.Object r0 = r0._state
            boolean r0 = r0 instanceof X.C142598fH
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r1.AC9(r0)
            goto L_0x0010
        L_0x0065:
            X.6qg r6 = (X.C113076qg) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r2 = r2.A00
            X.8pE r2 = (X.C147368pE) r2
            X.8pE r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            goto L_0x01c9
        L_0x0077:
            float r1 = X.C18240wQ.A00(r6)
            java.lang.Object r0 = r2.A00
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.8pE r2 = r0.A03
            goto L_0x008c
        L_0x0082:
            float r1 = X.C18240wQ.A00(r6)
            java.lang.Object r0 = r2.A00
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.8pE r2 = r0.A04
        L_0x008c:
            java.lang.Object r0 = r2.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = r0 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x01c9
        L_0x009b:
            X.8pw r5 = X.C86144wL.A0J(r6)
            java.lang.Object r4 = r2.A00
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r4 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r4
            X.8pE r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            X.7Wz r5 = (X.C123457Wz) r5
            r5.A06 = r0
            X.8pE r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            r1 = 0
        L_0x00c1:
            r5.A07 = r1
            float r0 = r5.A06
            float r0 = r0 + r1
            float r2 = java.lang.Math.abs(r0)
            float r0 = r4.A00
            float r2 = r2 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r2
            float r0 = X.AnonymousClass8bI.A01(r0, r3, r1)
            r5.A00 = r0
            goto L_0x0010
        L_0x00d9:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r2.A00
            X.C86134wK.A1L(r0, r6)
            goto L_0x0010
        L_0x00e4:
            X.68c r6 = (X.C971468c) r6
            r14 = 0
            X.C04220Ms.A0B(r6, r14)
            java.lang.Object r0 = r2.A00
            X.56Z r0 = (X.AnonymousClass56Z) r0
            X.4wE r2 = r0.A0D
        L_0x00f0:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IX r7 = (X.AnonymousClass5IX) r7
            r4 = 0
            r13 = 8388606(0x7ffffe, float:1.1754941E-38)
            r5 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            X.5IX r0 = X.AnonymousClass5IX.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00f0
            goto L_0x0010
        L_0x0118:
            X.8fm r6 = (X.C142898fm) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r1 = r2.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            boolean r0 = r6.BUK()
            goto L_0x013e
        L_0x0127:
            java.lang.Object r1 = r2.A00
            X.H8c r1 = (X.C32165H8c) r1
            r0 = 0
            r1.A00 = r0
            goto L_0x0010
        L_0x0130:
            java.lang.Object r0 = r2.A00
            X.6rr r0 = (X.C113636rr) r0
            r0.A00()
            goto L_0x0010
        L_0x0139:
            java.lang.Object r1 = r2.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            r0 = 1
        L_0x013e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            goto L_0x0010
        L_0x0147:
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            java.lang.Object r0 = r2.A00
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r1, r1)
            goto L_0x0010
        L_0x0154:
            r3 = 0
            X.C04220Ms.A0B(r6, r3)
            java.lang.Object r1 = r2.A00
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r3, r3)
            goto L_0x0010
        L_0x0162:
            X.7KC r6 = (X.AnonymousClass7KC) r6
            long r3 = r6.A00
            java.lang.Object r5 = r2.A00
            X.6hN r5 = (X.C107826hN) r5
            X.8pE r0 = r5.A00
            java.lang.Object r0 = r0.getValue()
            X.7AW r0 = (X.AnonymousClass7AW) r0
            r2 = 0
            if (r0 == 0) goto L_0x0012
            int r1 = r0.A07(r3)
            X.7yH r0 = r5.A01
            java.util.List r0 = r0.A07(r1, r1)
            java.util.Iterator r4 = r0.iterator()
        L_0x0183:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.7HE r0 = (X.AnonymousClass7HE) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "web_url_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "mention_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0183
        L_0x01a2:
            return r3
        L_0x01a3:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
        L_0x01a7:
            java.lang.Object r0 = r2.A00
            X.8pE r0 = (X.C147368pE) r0
            goto L_0x01b6
        L_0x01ac:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r2.A00
            X.6hN r0 = (X.C107826hN) r0
            X.8pE r0 = r0.A00
        L_0x01b6:
            r0.CrC(r6)
            goto L_0x0010
        L_0x01bb:
            float r1 = X.C18240wQ.A00(r6)
            java.lang.Object r0 = r2.A00
            X.AgK r0 = (X.C18488AgK) r0
            X.8pE r2 = r0.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L_0x01c9:
            r2.CrC(r0)
            goto L_0x0010
        L_0x01ce:
            java.lang.String r1 = X.C18210wN.A0f(r6)
            java.lang.Object r0 = r2.A00
            X.8ma r0 = (X.C146638ma) r0
            r0.BhB(r1)
            goto L_0x0010
        L_0x01db:
            java.lang.String r1 = X.C18210wN.A0f(r6)
            java.lang.Object r0 = r2.A00
            X.8ma r0 = (X.C146638ma) r0
            r0.BhI(r1)
            goto L_0x0010
        L_0x01e8:
            java.lang.String r3 = X.C18210wN.A0f(r6)
            java.lang.Object r0 = r2.A00
            X.56T r0 = (X.AnonymousClass56T) r0
            X.77g r1 = r0.A03
            X.C2o r0 = r0.A06
            r1.A01(r3, r0)
            goto L_0x0010
        L_0x01f9:
            java.lang.String r3 = X.C18210wN.A0f(r6)
            java.lang.Object r2 = r2.A00
            X.56T r2 = (X.AnonymousClass56T) r2
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r0 = r2.A00
            X.JrZ r0 = r0.A04(r3)
            if (r0 == 0) goto L_0x020f
            X.BKU r1 = X.C86144wL.A0W(r0)
            if (r1 != 0) goto L_0x0217
        L_0x020f:
            X.Awj r0 = r2.A05
            X.BKU r1 = r0.A05(r3)
            if (r1 == 0) goto L_0x0010
        L_0x0217:
            r1.ADF()
            com.instagram.service.session.UserSession r0 = r2.A07
            r1.AAy(r0)
            goto L_0x0010
        L_0x0221:
            java.lang.String r6 = (java.lang.String) r6
            r3 = 0
            X.C04220Ms.A0B(r6, r3)
            java.lang.Object r2 = r2.A00
            X.56T r2 = (X.AnonymousClass56T) r2
            com.instagram.service.session.UserSession r0 = r2.A07
            com.instagram.barcelona.feed.post.data.PostRepository r1 = X.C100166Mg.A00(r0)
            X.C2o r0 = r2.A06
            com.instagram.barcelona.feed.post.data.PostRepository.A01(r1, r0, r6, r3)
            goto L_0x0010
        L_0x0238:
            java.lang.String r1 = X.C18210wN.A0f(r6)
            java.lang.Object r0 = r2.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C33482Fw.A00(r0, r1)
            goto L_0x0010
        L_0x0245:
            X.7KG r5 = X.C86114wI.A0I(r6)
            X.8AL r0 = r5.A0M
            java.lang.Object r0 = r0.A0T()
            X.7Zx r0 = (X.C123917Zx) r0
            if (r0 == 0) goto L_0x026b
            X.7En r3 = X.C123917Zx.A00(r0)
        L_0x0257:
            r4 = 1
            java.lang.String r1 = "media_file_paths"
            if (r3 == 0) goto L_0x026d
            java.util.Map r0 = r3.A03
            boolean r0 = r0.containsKey(r1)
            if (r0 != r4) goto L_0x026d
            java.lang.Object r0 = r2.A00
            r3.A02(r1, r0)
            goto L_0x0010
        L_0x026b:
            r3 = 0
            goto L_0x0257
        L_0x026d:
            java.lang.Object r3 = r2.A00
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            X.C04220Ms.A0B(r3, r4)
            java.lang.String r2 = "create?mediaFilePaths="
            java.lang.String r1 = ";"
            X.GdW r0 = new X.GdW
            r0.<init>(r1)
            java.lang.String r0 = r0.A04(r3)
            java.lang.String r1 = X.AnonymousClass00U.A0L(r2, r0)
            goto L_0x02c1
        L_0x0286:
            X.7KG r6 = (X.AnonymousClass7KG) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r2 = r2.A00
            android.net.Uri r2 = (android.net.Uri) r2
            X.C04220Ms.A0B(r2, r0)
            r1 = 0
            X.6pQ r0 = new X.6pQ
            r0.<init>(r2, r1, r1)
            r6.A0F(r0, r1, r1)
            goto L_0x0010
        L_0x029e:
            java.lang.String r6 = (java.lang.String) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r5 = r2.A00
            X.7KG r5 = (X.AnonymousClass7KG) r5
            X.C04220Ms.A0B(r5, r0)
            java.lang.String r0 = "create_quote/"
            goto L_0x02bd
        L_0x02ae:
            java.lang.String r6 = (java.lang.String) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r5 = r2.A00
            X.7KG r5 = (X.AnonymousClass7KG) r5
            X.C04220Ms.A0B(r5, r0)
            java.lang.String r0 = "media?id="
        L_0x02bd:
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r6)
        L_0x02c1:
            r0 = 0
            r5.A0G(r0, r0, r1)
            goto L_0x0010
        L_0x02c7:
            java.lang.Object r1 = r2.A00
            r0 = 15
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r2 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r2.<init>(r1, r0)
            return r2
        L_0x02d1:
            java.lang.Object r0 = r2.A00
            com.instagram.compose.core.SwipeableState r0 = (com.instagram.compose.core.SwipeableState) r0
            X.8pE r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r1 = X.AnonymousClass8bA.A02(r0)
            r0 = 0
            X.7Eg r2 = X.AnonymousClass7Hh.A04(r1, r0)
            return r2
        L_0x02e9:
            X.5J1 r6 = (X.AnonymousClass5J1) r6
            r11 = 0
            X.C04220Ms.A0B(r6, r11)
            X.8s2 r5 = r6.A05
            java.lang.Object r4 = r2.A00
            X.0MJ r4 = (X.AnonymousClass0MJ) r4
            java.lang.Object r0 = r4.A00
            int r3 = X.C18230wP.A05(r0)
            java.lang.Object r0 = r4.A00
            X.HFU r0 = (X.HFU) r0
            r2 = 1
            if (r0 == 0) goto L_0x032f
            int r1 = r0.getWidth()
        L_0x0306:
            java.lang.Object r0 = r4.A00
            X.HFU r0 = (X.HFU) r0
            if (r0 == 0) goto L_0x0310
            int r2 = r0.getHeight()
        L_0x0310:
            r4 = 0
            X.5La r0 = new X.5La
            r0.<init>(r3, r1, r2)
            java.util.List r0 = X.C18180wK.A0n(r0)
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r5)
            X.8s2 r9 = X.AnonymousClass7C0.A00(r0)
            r10 = 991(0x3df, float:1.389E-42)
            r5 = r4
            r7 = r4
            r8 = r4
            r12 = r11
            r13 = r11
            r14 = r11
            X.5J1 r2 = X.AnonymousClass5J1.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x032f:
            r1 = 1
            goto L_0x0306
        L_0x0331:
            X.5J1 r6 = (X.AnonymousClass5J1) r6
            r11 = 0
            X.C04220Ms.A0B(r6, r11)
            java.lang.Object r4 = r2.A00
            X.7HD r4 = (X.AnonymousClass7HD) r4
            r5 = 0
            r10 = 1021(0x3fd, float:1.431E-42)
            r7 = r5
            r8 = r5
            r9 = r5
            r12 = r11
            r13 = r11
            r14 = r11
            X.5J1 r2 = X.AnonymousClass5J1.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0349:
            java.lang.Object r1 = r2.A00
            r0 = 16
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r2 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r2.<init>(r1, r0)
            return r2
        L_0x0353:
            java.lang.Object r2 = r2.A00
            return r2
        L_0x0356:
            java.lang.Object r5 = r2.A00
            X.6jB r5 = (X.C108926jB) r5
            X.03c r4 = r5.A00
            r2 = 1
            if (r4 == 0) goto L_0x036e
            X.03a r1 = r4.A00
            boolean r0 = r1.A07()
            if (r0 != r2) goto L_0x036e
            boolean r0 = r1.A06()
            r3 = 1
            if (r0 == r2) goto L_0x036f
        L_0x036e:
            r3 = 0
        L_0x036f:
            r1 = 0
            if (r4 == 0) goto L_0x037a
            X.03a r0 = r4.A00
            r0.A05(r1)
            r0.A04(r1)
        L_0x037a:
            X.7W9 r2 = new X.7W9
            r2.<init>(r5, r3)
            return r2
        L_0x0380:
            java.lang.Object r4 = r2.A00
            X.6jB r4 = (X.C108926jB) r4
            X.03c r3 = r4.A00
            if (r3 == 0) goto L_0x03a1
            r1 = 1
            X.03a r0 = r3.A00
            r0.A01(r1)
            r2 = 2
            r0.A01(r2)
            X.03a r1 = r3.A00
            int r0 = r1.A00()
            r1.A02(r2)
        L_0x039b:
            X.7WA r2 = new X.7WA
            r2.<init>(r4, r0)
            return r2
        L_0x03a1:
            r0 = 0
            goto L_0x039b
        L_0x03a3:
            int r1 = X.AnonymousClass0wJ.A04(r6)
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r0
            java.lang.Object r0 = r0.A01
            X.8s2 r0 = (X.AnonymousClass8s2) r0
            java.lang.Object r0 = r0.get(r1)
            X.8eh r0 = (X.C142338eh) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2102000_I2) r0
            java.lang.String r2 = r0.A04
            return r2
        L_0x03be:
            int r1 = X.AnonymousClass0wJ.A04(r6)
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r1)
            X.0Ai r2 = X.C86124wJ.A16(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6.invoke(java.lang.Object):java.lang.Object");
    }
}
