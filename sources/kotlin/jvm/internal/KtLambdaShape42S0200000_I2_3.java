package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass601;
import X.C02220Ah;
import X.C109326jp;
import ch.boye.httpclientandroidlib.util.LangUtils;
import java.util.List;

public class KtLambdaShape42S0200000_I2_3 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape42S0200000_I2_3(AnonymousClass601 r2, C109326jp r3, int i) {
        super(1);
        this.A02 = i;
        if (33 - i != 0) {
            this.A01 = r2;
            this.A00 = r3;
        } else {
            this.A00 = r2;
            this.A01 = r3;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0494, code lost:
        r3 = r1.A01(X.AnonymousClass000.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x049c, code lost:
        if (r3 == null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x049e, code lost:
        r1 = (X.AnonymousClass9FA) r9.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04a4, code lost:
        if (r0 == null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04a6, code lost:
        r2 = r0.A09();
        X.C19260AtP.A02(r3, r1.A04);
        r1.A02.A06(r3, (X.C39520Kv4) null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0568, code lost:
        r3.A00(new kotlin.jvm.internal.KtLambdaShape48S0100000_I2_28(r1, r0), 4000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0574, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d0, code lost:
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0158, code lost:
        r0 = (X.AnonymousClass7HE) X.AnonymousClass00J.A0D(r1.A08(r0, r2, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0162, code lost:
        if (r0 == null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0166, code lost:
        if (r0.A02 == null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0168, code lost:
        X.C18240wQ.A1G(r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f7, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0277, code lost:
        if (r1 != null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034a, code lost:
        r3.CrC(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0059;
                case 2: goto L_0x006b;
                case 3: goto L_0x007c;
                case 4: goto L_0x0091;
                case 5: goto L_0x00a4;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00fd;
                case 10: goto L_0x0116;
                case 11: goto L_0x012e;
                case 12: goto L_0x0005;
                case 13: goto L_0x0143;
                case 14: goto L_0x014e;
                case 15: goto L_0x016f;
                case 16: goto L_0x0182;
                case 17: goto L_0x018f;
                case 18: goto L_0x0005;
                case 19: goto L_0x01a4;
                case 20: goto L_0x0216;
                case 21: goto L_0x0246;
                case 22: goto L_0x027a;
                case 23: goto L_0x0005;
                case 24: goto L_0x028f;
                case 25: goto L_0x02a6;
                case 26: goto L_0x02bf;
                case 27: goto L_0x02fa;
                case 28: goto L_0x0005;
                case 29: goto L_0x030f;
                case 30: goto L_0x0352;
                case 31: goto L_0x0005;
                case 32: goto L_0x0367;
                case 33: goto L_0x0376;
                case 34: goto L_0x0387;
                case 35: goto L_0x0005;
                case 36: goto L_0x0398;
                case 37: goto L_0x03b2;
                case 38: goto L_0x0005;
                case 39: goto L_0x03c7;
                case 40: goto L_0x03f9;
                case 41: goto L_0x0446;
                case 42: goto L_0x0459;
                case 43: goto L_0x0464;
                case 44: goto L_0x048a;
                case 45: goto L_0x04b7;
                case 46: goto L_0x0509;
                case 47: goto L_0x0545;
                case 48: goto L_0x0557;
                case 49: goto L_0x0560;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r0 = r9.A01
            java.util.List r0 = (java.util.List) r0
            r0.get(r1)
            r0 = 0
            return r0
        L_0x0012:
            X.7Zx r10 = (X.C123917Zx) r10
            r2 = 0
            X.C04220Ms.A0B(r10, r2)
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r10)
            java.lang.Object r1 = r9.A01
            X.59F r1 = (X.AnonymousClass59F) r1
            if (r0 == 0) goto L_0x0050
            X.7F7 r0 = r1.A00()
            r0.A04(r10)
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0572
            java.lang.Object r1 = r2.next()
            X.6hP r1 = (X.C107846hP) r1
            X.59F r0 = r1.A00
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            r0.remove(r1)
            X.0ZU r0 = r1.A01
            r0.invoke()
            goto L_0x0037
        L_0x0050:
            X.7F7 r0 = r1.A00()
            r0.A07(r10, r2)
            goto L_0x0572
        L_0x0059:
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r0 = r9.A00
            X.7KG r0 = (X.AnonymousClass7KG) r0
            r0.A0H()
            java.lang.Object r0 = r9.A01
            X.C86134wK.A1L(r0, r10)
            goto L_0x0572
        L_0x006b:
            java.lang.String r2 = X.C18210wN.A0f(r10)
            java.lang.Object r1 = r9.A01
            X.57z r1 = (X.C884257z) r1
            java.lang.Object r0 = r9.A00
            X.66x r0 = (X.C968466x) r0
            r1.A01(r0, r2)
            goto L_0x0572
        L_0x007c:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8P2 r1 = (X.AnonymousClass8P2) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x0091:
            int r1 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r0 = r9.A01
            java.lang.Object r1 = X.C86124wJ.A0p(r0, r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0Ai r0 = X.C86124wJ.A16(r1)
            return r0
        L_0x00a4:
            java.lang.String r3 = X.C18210wN.A0f(r10)
            java.lang.Object r2 = r9.A00
            android.content.Context r2 = (android.content.Context) r2
            X.C86164wN.A1F(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r9.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.9wF r0 = X.C171209wF.A0t
            X.Jpy r4 = new X.Jpy
            r4.<init>((android.app.Activity) r2, (com.instagram.service.session.UserSession) r1, (X.C171209wF) r0, (java.lang.String) r3)
            goto L_0x00d0
        L_0x00bd:
            java.lang.String r3 = X.C18210wN.A0f(r10)
            java.lang.Object r2 = r9.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.9wF r0 = X.C171209wF.A0t
            X.Jpy r4 = new X.Jpy
            r4.<init>((android.content.Context) r2, (com.instagram.service.session.UserSession) r1, (X.C171209wF) r0, (java.lang.String) r3)
        L_0x00d0:
            r4.A04()
            goto L_0x0572
        L_0x00d5:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8P5 r1 = (X.AnonymousClass8P5) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x00ea:
            int r1 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r0 = r9.A01
            java.lang.Object r1 = X.C86124wJ.A0p(r0, r1)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.0Ai r0 = X.C86124wJ.A16(r1)
            return r0
        L_0x00fd:
            int r3 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r2 = r9.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r3)
            X.8Xe r2 = (X.C140638Xe) r2
            java.lang.Object r0 = r2.invoke(r1, r0)
            return r0
        L_0x0116:
            java.lang.String r5 = X.C18210wN.A0f(r10)
            java.lang.Object r4 = r9.A00
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r3 = r9.A01
            r2 = 0
            r0 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1.<init>(r3, r5, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r4, r0)
            goto L_0x0572
        L_0x012e:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PB r1 = (X.AnonymousClass8PB) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x0143:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A00
            X.7yH r1 = (X.C134747yH) r1
            java.lang.String r0 = "see_all_span"
            goto L_0x0158
        L_0x014e:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A00
            X.7yH r1 = (X.C134747yH) r1
            java.lang.String r0 = "how_it_works_span"
        L_0x0158:
            java.util.List r0 = r1.A08(r0, r2, r2)
            java.lang.Object r0 = X.AnonymousClass00J.A0D(r0)
            X.7HE r0 = (X.AnonymousClass7HE) r0
            if (r0 == 0) goto L_0x0572
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0572
            java.lang.Object r0 = r9.A01
            X.C18240wQ.A1G(r0)
            goto L_0x0572
        L_0x016f:
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r1 = r9.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            java.lang.Object r0 = r9.A01
            X.5Lv r0 = (X.C90395Lv) r0
            X.21k r0 = r0.A00
            r1.invoke(r0, r10)
            goto L_0x0572
        L_0x0182:
            java.lang.Object r2 = r9.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r9.A01
            X.8iS r0 = (X.AnonymousClass8iS) r0
            X.5Lw r0 = (X.C90405Lw) r0
            java.lang.String r0 = r0.A04
            goto L_0x01f7
        L_0x018f:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PC r1 = (X.AnonymousClass8PC) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x01a4:
            int r1 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r3 = r9.A00
            X.6ku r3 = (X.C109966ku) r3
            X.8pE r2 = r3.A01
            java.lang.Object r0 = r2.getValue()
            X.7yH r0 = (X.C134747yH) r0
            java.util.List r0 = r0.A07(r1, r1)
            java.util.Iterator r5 = r0.iterator()
        L_0x01bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r4 = r5.next()
            r0 = r4
            X.7HE r0 = (X.AnonymousClass7HE) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "mention_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "collapsed_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x01bc
        L_0x01db:
            X.7HE r4 = (X.AnonymousClass7HE) r4
            if (r4 == 0) goto L_0x01fc
            java.lang.String r1 = r4.A03
        L_0x01e1:
            java.lang.String r0 = "mention_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0200
            java.lang.Object r2 = r9.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r1 = r4.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "@"
            java.lang.String r0 = X.AnonymousClass8bP.A0Q(r0, r1)
        L_0x01f7:
            r2.invoke(r0)
            goto L_0x0572
        L_0x01fc:
            r1 = 0
            goto L_0x01e1
        L_0x01fe:
            r4 = 0
            goto L_0x01db
        L_0x0200:
            java.lang.String r0 = "collapsed_span"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0572
            X.20h r1 = X.C302520h.Expanded
            X.8pE r0 = r3.A00
            r0.CrC(r1)
            X.7yH r0 = r3.A03
            r2.CrC(r0)
            goto L_0x0572
        L_0x0216:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r3 = r9.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r1 = r9.A01
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r0 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r0
            java.lang.Object r0 = r0.A02
            int r0 = X.C86144wL.A08(r0)
            int r2 = r2 - r0
            java.lang.Object r0 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r0
            java.lang.Object r0 = r0.A00
            int r1 = X.C86144wL.A08(r0)
            r0 = 1
            if (r1 > r0) goto L_0x023f
            r0 = 0
        L_0x023f:
            int r2 = r2 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x034a
        L_0x0246:
            java.lang.String r3 = X.C18210wN.A0f(r10)
            java.lang.Object r2 = r9.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r2 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r2
            java.lang.Object r1 = r9.A00
            X.66y r1 = (X.C968566y) r1
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.7y5 r0 = r2.A06
            X.BKU r1 = r0.A02(r1, r3)
            if (r1 == 0) goto L_0x0268
            r1.ADF()
        L_0x0261:
            com.instagram.service.session.UserSession r0 = r2.A0D
            r1.AAy(r0)
            goto L_0x0572
        L_0x0268:
            X.Awj r1 = r2.A0B
            X.BKU r0 = r1.A05(r3)
            if (r0 == 0) goto L_0x0273
            r0.ADF()
        L_0x0273:
            X.BKU r1 = r1.A05(r3)
            if (r1 == 0) goto L_0x0572
            goto L_0x0261
        L_0x027a:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PE r1 = (X.AnonymousClass8PE) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x028f:
            int r3 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r2 = r9.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r3)
            java.lang.Object r0 = r2.invoke(r1, r0)
            return r0
        L_0x02a6:
            int r3 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r2 = r9.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r3)
            X.8Xi r2 = (X.C140678Xi) r2
            java.lang.Object r0 = r2.invoke(r1, r0)
            return r0
        L_0x02bf:
            boolean r8 = X.AnonymousClass0wJ.A1X(r10)
            java.lang.Object r7 = r9.A01
            X.56Q r7 = (X.AnonymousClass56Q) r7
            java.lang.Object r6 = r9.A00
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            X.4wE r5 = r7.A01
        L_0x02cf:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2) r0
            r3 = 0
            boolean r2 = r0.A01
            r1 = 2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2
            r0.<init>(r8, r2, r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x02cf
            X.4qz r2 = X.AnonymousClass3J5.A00(r7)
            r0 = 22
            if (r8 == 0) goto L_0x02ef
            r0 = 21
        L_0x02ef:
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r7, (X.C146958n9) r3, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r2, r0)
            goto L_0x0572
        L_0x02fa:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PG r1 = (X.AnonymousClass8PG) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x030f:
            boolean r4 = X.AnonymousClass0wJ.A1X(r10)
            java.lang.Object r1 = r9.A01
            X.57O r1 = (X.AnonymousClass57O) r1
            com.instagram.service.session.UserSession r0 = r1.A02
            X.0kW r3 = r1.A01
            X.0nS r1 = X.C13330nS.A01(r3, r0)
            r0 = 1453(0x5ad, float:2.036E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2767(0xacf, float:3.877E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            if (r4 == 0) goto L_0x034f
            java.lang.String r1 = "private"
        L_0x0333:
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0T(r0, r1)
            X.C18240wQ.A14(r2, r3)
            r2.Bb4()
            java.lang.Object r3 = r9.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Boolean r0 = X.C18180wK.A0Y()
        L_0x034a:
            r3.CrC(r0)
            goto L_0x0572
        L_0x034f:
            java.lang.String r1 = "public"
            goto L_0x0333
        L_0x0352:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PH r1 = (X.AnonymousClass8PH) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x0367:
            X.39n r10 = (X.C570439n) r10
            java.lang.Object r1 = r9.A01
            X.I4O r1 = (X.I4O) r1
            java.lang.Object r0 = r9.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7000000_I2) r0
            X.I4O.A02(r0, r1, r10)
            goto L_0x0572
        L_0x0376:
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r1 = r9.A00
            X.601 r1 = (X.AnonymousClass601) r1
            java.lang.Object r0 = r9.A01
            X.6jp r0 = (X.C109326jp) r0
            X.C86124wJ.A1Q(r1, r0, r10)
            goto L_0x0572
        L_0x0387:
            java.lang.Object r2 = r9.A01
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r1 = r9.A00
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            java.lang.Object r0 = X.C63913ic.A0K(r2, r1, r0)
            return r0
        L_0x0398:
            double r0 = X.C86124wJ.A00(r10)
            java.lang.Object r3 = r9.A01
            com.instagram.casper.IgSignalsCasper r3 = (com.instagram.casper.IgSignalsCasper) r3
            java.lang.Object r4 = r9.A00
            long r7 = (long) r0
            X.4qz r1 = r3.A0I
            r5 = 0
            r6 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0200100_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0200100_I2
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C25237DiI.A00(r5, r5, r2, r1, r0)
            goto L_0x0572
        L_0x03b2:
            int r2 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r1 = r9.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r9.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r2)
            X.8PR r1 = (X.AnonymousClass8PR) r1
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x03c7:
            double r5 = X.C86124wJ.A00(r10)
            java.lang.Object r4 = r9.A00
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            X.0TJ r2 = X.C18180wK.A0J(r4)
            r0 = 37166959058026727(0x840b27000900e7, double:3.567872795403179E-306)
            double r1 = X.C63803iN.A00(r2, r4, r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r3 = X.C86124wJ.A1X(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0P
            r0 = 207(0xcf, float:2.9E-43)
            java.lang.String r2 = X.I17.A00(r0)
            X.BzX r1 = X.C19255AtK.A00(r1, r4, r2)
            boolean r0 = r1 instanceof X.C148678rf
            if (r0 == 0) goto L_0x0572
            X.8rf r1 = (X.C148678rf) r1
            r1.AIV(r4, r2, r3)
            goto L_0x0572
        L_0x03f9:
            X.5z0 r10 = (X.AnonymousClass5z0) r10
            java.lang.Object r0 = r9.A01
            X.Avd r0 = (X.C19395Avd) r0
            com.instagram.service.session.UserSession r4 = r0.A03
            X.C04220Ms.A07(r10)
            java.lang.Object r3 = r10.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            r1 = 0
            if (r3 == 0) goto L_0x0429
            java.lang.Class<com.instagram.clips.api.ClipsProfileQueryResponseImpl$XdtUserClipsGraphql> r2 = com.instagram.clips.api.ClipsProfileQueryResponseImpl.XdtUserClipsGraphql.class
            r0 = 1497(0x5d9, float:2.098E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x0429
            java.lang.Class<com.instagram.clips.api.ClipsProfileFragmentImpl> r0 = com.instagram.clips.api.ClipsProfileFragmentImpl.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r0)
            if (r2 == 0) goto L_0x0429
            java.lang.Class<X.1t3> r0 = X.C27721t3.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r0)
            X.BpT r1 = (X.C21138BpT) r1
        L_0x0429:
            boolean r0 = r1 instanceof X.C27721t3
            if (r0 == 0) goto L_0x043f
            X.1t3 r1 = (X.C27721t3) r1
            if (r1 == 0) goto L_0x043f
            X.1td r2 = r1.A0E()
            X.B6i r1 = X.AnonymousClass6SH.A00(r4)
            X.432 r0 = new X.432
            r0.<init>(r1, r2)
            return r0
        L_0x043f:
            java.lang.String r0 = "Expected profile clips to be available"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0446:
            java.lang.Object r0 = r9.A01
            X.9EI r0 = (X.AnonymousClass9EI) r0
            X.92S r0 = r0.A03
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0572
            java.lang.Object r0 = r9.A00
            X.Lwg r0 = (X.C41110Lwg) r0
            X.C41110Lwg.A00(r0, r1)
            goto L_0x0572
        L_0x0459:
            java.lang.Object r0 = r9.A00
            X.C2X r0 = (X.C2X) r0
            X.MNZ r1 = r0.AZh()
            r0 = 1065(0x429, float:1.492E-42)
            goto L_0x0494
        L_0x0464:
            X.AK6 r10 = (X.AK6) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r5 = r9.A01
            X.9FA r5 = (X.AnonymousClass9FA) r5
            X.Awo r4 = r5.A02
            X.9CZ r3 = r5.A00
            android.view.View r2 = r10.A00
            X.C04220Ms.A05(r2)
            java.lang.Object r1 = r9.A00
            r0 = 65
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r1, r5, r0)
            android.view.View$OnClickListener r1 = r4.A03(r0, r2, r3)
            android.view.View r0 = r10.A00
            r1.onClick(r0)
            goto L_0x0572
        L_0x048a:
            java.lang.Object r0 = r9.A00
            X.C2X r0 = (X.C2X) r0
            X.MNZ r1 = r0.AZh()
            r0 = 1068(0x42c, float:1.497E-42)
        L_0x0494:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.view.View r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x0572
            java.lang.Object r1 = r9.A01
            X.9FA r1 = (X.AnonymousClass9FA) r1
            X.9CZ r0 = r1.A00
            if (r0 == 0) goto L_0x0572
            X.BKT r2 = r0.A09()
            com.instagram.service.session.UserSession r0 = r1.A04
            X.C19260AtP.A02(r3, r0)
            X.Awo r1 = r1.A02
            r0 = 0
            r1.A06(r3, r0, r2)
            goto L_0x0572
        L_0x04b7:
            java.lang.Object r2 = r9.A01
            X.B5b r2 = (X.B5b) r2
            r0 = 1069(0x42d, float:1.498E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.MNZ r0 = r2.A05
            android.view.View r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0572
            java.lang.Object r6 = r9.A00
            r5 = 2
            float[] r0 = new float[r5]
            r0 = {-1082130432, -1051721728} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.view.animation.BaseInterpolator r1 = X.C155049Ev.A04
            r2.setInterpolator(r1)
            r3 = 533(0x215, double:2.633E-321)
            r2.setDuration(r3)
            r0 = 3
            X.C86134wK.A0z(r2, r6, r0)
            r2.start()
            float[] r0 = new float[r5]
            r0 = {-1051721728, 1084227584} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r2.setInterpolator(r1)
            r0 = -1
            r2.setRepeatCount(r0)
            r2.setRepeatMode(r5)
            r0 = 800(0x320, double:3.953E-321)
            r2.setDuration(r0)
            r2.setStartDelay(r3)
            r0 = 4
            X.C86134wK.A0z(r2, r6, r0)
            r2.start()
            goto L_0x0572
        L_0x0509:
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.String r1 = "ClipsItemErrorBoundary"
            java.lang.String r0 = "Error caught while rendering clip!"
            X.AnonymousClass0LU.A0E(r1, r0, r10)
            java.lang.String r0 = "Clips item error caught: "
            java.lang.String r0 = X.C18230wP.A0t(r0, r10)
            X.C10450iM.A06(r1, r0, r10)
            java.lang.Object r0 = r9.A01
            X.9Dd r0 = (X.C154609Dd) r0
            X.0on r2 = X.C10770iu.A00()
            X.C04220Ms.A06(r2)
            X.9uQ r0 = r0.A00
            java.lang.String r1 = r0.toString()
            r0 = 817898112(0x30c02280, float:1.3979644E-9)
            X.0oo r0 = r2.ABJ(r1, r0)
            r0.Ciu(r10)
            r0.report()
            java.lang.Object r0 = r9.A00
            X.Lu1 r0 = (X.Lu1) r0
            r0.A00(r10)
            goto L_0x0572
        L_0x0545:
            com.instagram.model.shopping.Product r10 = (com.instagram.model.shopping.Product) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            java.lang.Object r1 = r9.A00
            X.B48 r1 = (X.B48) r1
            java.lang.Object r0 = r9.A01
            X.BKU r0 = (X.BKU) r0
            r1.A0h(r0, r10)
            goto L_0x0572
        L_0x0557:
            java.lang.Object r1 = r9.A01
            java.lang.Object r3 = r9.A00
            X.AcY r3 = (X.C18265AcY) r3
            r0 = 10
            goto L_0x0568
        L_0x0560:
            java.lang.Object r1 = r9.A01
            java.lang.Object r3 = r9.A00
            X.AcY r3 = (X.C18265AcY) r3
            r0 = 11
        L_0x0568:
            kotlin.jvm.internal.KtLambdaShape48S0100000_I2_28 r2 = new kotlin.jvm.internal.KtLambdaShape48S0100000_I2_28
            r2.<init>(r1, r0)
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.A00(r2, r0)
        L_0x0572:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape42S0200000_I2_3(List list, AnonymousClass0YY r3, int i) {
        super(1);
        this.A02 = i;
        switch (i) {
            case 3:
            case 7:
            case 11:
            case LangUtils.HASH_SEED /*17*/:
            case 22:
            case 27:
            case 30:
            case LangUtils.HASH_OFFSET /*37*/:
                this.A01 = r3;
                this.A00 = list;
                break;
            default:
                this.A00 = r3;
                this.A01 = list;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape42S0200000_I2_3(int i, Object obj, Object obj2) {
        super(1);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
