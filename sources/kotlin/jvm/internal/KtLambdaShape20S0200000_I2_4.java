package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass601;
import X.C02220Ah;
import X.C109326jp;

public class KtLambdaShape20S0200000_I2_4 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape20S0200000_I2_4(AnonymousClass601 r2, C109326jp r3, int i) {
        super(0);
        this.A02 = i;
        if (35 - i != 0) {
            this.A01 = r2;
            this.A00 = r3;
        } else {
            this.A00 = r2;
            this.A01 = r3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: X.57G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: com.instagram.barcelona.profile.ui.ProfileViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: com.instagram.barcelona.profile.ui.ProfileViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: com.instagram.user.model.User} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r2v21, types: [X.8n9, X.Ew2, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x043d, code lost:
        new X.AnonymousClass1jJ(r2, (androidx.fragment.app.Fragment) null, r2, r5, r6, r7, r8, r9, r10).A02(new java.lang.Void[r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x04fe, code lost:
        X.C86074wE.A01(r0.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x056a, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b2, code lost:
        r4.invoke(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c3, code lost:
        r3.A00(new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2(r2, r1));
        X.C18240wQ.A1G(r14.A00);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r10v0, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x00da;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00fd;
                case 4: goto L_0x00fd;
                case 5: goto L_0x0108;
                case 6: goto L_0x014b;
                case 7: goto L_0x018f;
                case 8: goto L_0x01a2;
                case 9: goto L_0x01ba;
                case 10: goto L_0x01d2;
                case 11: goto L_0x01fb;
                case 12: goto L_0x024b;
                case 13: goto L_0x0260;
                case 14: goto L_0x0280;
                case 15: goto L_0x002b;
                case 16: goto L_0x029c;
                case 17: goto L_0x002b;
                case 18: goto L_0x002b;
                case 19: goto L_0x02db;
                case 20: goto L_0x0301;
                case 21: goto L_0x0328;
                case 22: goto L_0x033c;
                case 23: goto L_0x0356;
                case 24: goto L_0x0374;
                case 25: goto L_0x0390;
                case 26: goto L_0x040c;
                case 27: goto L_0x0423;
                case 28: goto L_0x044b;
                case 29: goto L_0x0468;
                case 30: goto L_0x0486;
                case 31: goto L_0x04a0;
                case 32: goto L_0x04c5;
                case 33: goto L_0x04e0;
                case 34: goto L_0x0504;
                case 35: goto L_0x0516;
                case 36: goto L_0x0526;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0538;
                case 40: goto L_0x0550;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x056b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0027
        L_0x0011:
            java.lang.Object r0 = r14.A01
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r1 = r0.getValue()
            X.06C r1 = (X.AnonymousClass06C) r1
            boolean r0 = r1 instanceof X.C012605w
            if (r0 == 0) goto L_0x0028
            X.05w r1 = (X.C012605w) r1
            if (r1 == 0) goto L_0x0028
            X.6o9 r2 = r1.getDefaultViewModelCreationExtras()
        L_0x0027:
            return r2
        L_0x0028:
            X.58e r2 = X.C884658e.A00
            return r2
        L_0x002b:
            java.lang.Object r3 = r14.A01
            com.instagram.barcelona.search.SearchScreenViewModel r3 = (com.instagram.barcelona.search.SearchScreenViewModel) r3
            java.lang.Object r0 = r14.A00
            X.8iU r0 = (X.AnonymousClass8iU) r0
            X.5M1 r0 = (X.AnonymousClass5M1) r0
            X.5Hm r0 = r0.A00
            java.lang.String r10 = r0.A04
            r13 = 0
            java.util.List r0 = r3.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.IoO r0 = (X.C35144IoO) r0
            com.instagram.user.model.User r0 = r0.A05()
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r0, r10)
            if (r0 == 0) goto L_0x0040
        L_0x005b:
            X.IoO r2 = (X.C35144IoO) r2
            if (r2 == 0) goto L_0x0068
            X.KKE r1 = r3.A08
            com.instagram.user.model.User r0 = r2.A05()
            r1.A03(r0)
        L_0x0068:
            X.4wE r2 = r3.A0C
        L_0x006a:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.5IV r3 = (X.AnonymousClass5IV) r3
            r4 = 0
            r12 = 495(0x1ef, float:6.94E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r11 = r4
            X.5IV r0 = X.AnonymousClass5IV.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x006a
            goto L_0x0568
        L_0x0086:
            r2 = 0
            goto L_0x005b
        L_0x0088:
            java.lang.Object r6 = r14.A01
            X.57k r6 = (X.C882757k) r6
            java.lang.Object r5 = r14.A00
            X.21k r5 = (X.C304621k) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.util.Map r0 = r6.A06
            java.lang.Object r0 = r0.get(r5)
            X.4wG r0 = (X.C86094wG) r0
            if (r0 == 0) goto L_0x0568
            java.lang.Object r0 = r0.getValue()
            X.33u r0 = (X.C555833u) r0
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d5
            java.util.Map r4 = r6.A05
            java.lang.Object r0 = r4.get(r5)
            X.8sG r0 = (X.C148838sG) r0
            r3 = 0
            if (r0 == 0) goto L_0x00c0
            r0.AC7(r3)
        L_0x00c0:
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r0 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.C146958n9) r3, (int) r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r3, r3, r1, r2, r0)
            r4.put(r5, r0)
            goto L_0x0568
        L_0x00d5:
            r6.A00(r5)
            goto L_0x0568
        L_0x00da:
            java.lang.Object r4 = r14.A00
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r0 = r14.A01
            X.8iS r0 = (X.AnonymousClass8iS) r0
            X.5Lw r0 = (X.C90405Lw) r0
            java.lang.String r2 = r0.A04
            java.lang.String r1 = r0.A05
            r0 = 17
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r3.<init>(r2, r1, r0)
            goto L_0x01b2
        L_0x00f1:
            java.lang.Object r4 = r14.A00
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r0 = r14.A01
            X.5Lw r0 = (X.C90405Lw) r0
            java.lang.String r3 = r0.A04
            goto L_0x01b2
        L_0x00fd:
            java.lang.Object r0 = r14.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r0 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r0
            X.3En r3 = r0.A04
            java.lang.String r2 = r0.A00
            r1 = 1
            goto L_0x01c3
        L_0x0108:
            java.lang.Object r1 = r14.A00
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r0 = r1.getValue()
            r2 = 0
            if (r0 == 0) goto L_0x0568
            java.lang.Object r3 = r14.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r3 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r3
            java.lang.Object r0 = r1.getValue()
            X.5Hq r0 = (X.C89945Hq) r0
            if (r0 == 0) goto L_0x0121
            java.lang.String r2 = r0.A07
        L_0x0121:
            X.C18240wQ.A1I(r2)
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            com.instagram.service.session.UserSession r0 = r3.A0D
            com.instagram.user.model.User r4 = X.C18210wN.A0P(r0, r2)
            if (r4 == 0) goto L_0x0568
            r4.A2g(r1, r1)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.7ra r0 = new X.7ra
            r0.<init>(r4)
            r1.CWx(r0)
            com.instagram.barcelona.profile.ui.ProfileViewModel.A03(r3, r4)
            X.4qz r5 = X.AnonymousClass3J5.A00(r3)
            r2 = 0
            r0 = 18
            goto L_0x0385
        L_0x014b:
            java.lang.Object r2 = r14.A00
            X.4oM r2 = (X.C81784oM) r2
            java.lang.Object r1 = r2.getValue()
            r0 = 0
            if (r1 == 0) goto L_0x0568
            java.lang.Object r3 = r14.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r3 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r3
            java.lang.Object r1 = r2.getValue()
            X.5Hq r1 = (X.C89945Hq) r1
            if (r1 == 0) goto L_0x0164
            java.lang.String r0 = r1.A07
        L_0x0164:
            X.C18240wQ.A1I(r0)
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            com.instagram.service.session.UserSession r1 = r3.A0D
            com.instagram.user.model.User r4 = X.C18210wN.A0P(r1, r0)
            if (r4 == 0) goto L_0x0568
            r0 = 1
            r4.A2g(r2, r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r1)
            X.7rZ r0 = new X.7rZ
            r0.<init>(r4)
            r1.CWx(r0)
            com.instagram.barcelona.profile.ui.ProfileViewModel.A03(r3, r4)
            X.4qz r5 = X.AnonymousClass3J5.A00(r3)
            r2 = 0
            r0 = 17
            goto L_0x0385
        L_0x018f:
            java.lang.Object r1 = r14.A01
            X.8iT r1 = (X.AnonymousClass8iT) r1
            X.5Lz r1 = (X.C90435Lz) r1
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0568
            java.lang.String r1 = r1.A06
            java.lang.Object r0 = r14.A00
            X.C86134wK.A1L(r0, r1)
            goto L_0x0568
        L_0x01a2:
            java.lang.Object r4 = r14.A00
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.5Hq r0 = (X.C89945Hq) r0
            if (r0 == 0) goto L_0x01b7
            java.lang.String r3 = r0.A07
        L_0x01b2:
            r4.invoke(r3)
            goto L_0x0568
        L_0x01b7:
            java.lang.String r3 = ""
            goto L_0x01b2
        L_0x01ba:
            java.lang.Object r0 = r14.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r0 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r0
            X.3En r3 = r0.A04
            java.lang.String r2 = r0.A00
            r1 = 0
        L_0x01c3:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2
            r0.<init>(r2, r1)
            r3.A00(r0)
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            goto L_0x0568
        L_0x01d2:
            java.lang.Object r0 = r14.A01
            X.6f3 r0 = (X.C106446f3) r0
            java.lang.Object r4 = r14.A00
            X.8jV r0 = r0.A00
            X.7y2 r3 = r0.B7J()
            java.lang.Class<X.Crh> r2 = X.C23415Crh.class
            r1 = 23
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r0 = new kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16
            r0.<init>(r4, r1)
            java.util.concurrent.ConcurrentHashMap r1 = r3.A00
            java.lang.Object r0 = r0.invoke()
            java.lang.Object r2 = r1.getOrDefault(r2, r0)
            r0 = 663(0x297, float:9.29E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            return r2
        L_0x01fb:
            java.lang.Object r5 = r14.A01
            X.57u r5 = (X.C883757u) r5
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r1.getSystemService(r0)
            r0 = 43
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            android.text.ClipboardManager r2 = (android.text.ClipboardManager) r2
            r8 = 0
            X.C04220Ms.A0B(r2, r8)
            com.instagram.user.model.User r1 = r5.A05
            if (r1 == 0) goto L_0x0568
            com.instagram.barcelona.share.data.PermalinkRepository r0 = r5.A02
            java.lang.String r0 = r0.A02(r1)
            r2.setText(r0)
            X.4wE r7 = r5.A07
        L_0x0227:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2) r0
            r4 = 1
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r0.A02
            X.C04220Ms.A0B(r3, r8)
            X.C04220Ms.A0B(r2, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2
            r0.<init>((java.util.List) r3, (java.util.List) r2, (boolean) r1, (boolean) r4)
            boolean r0 = r7.ADi(r6, r0)
            if (r0 == 0) goto L_0x0227
            goto L_0x0297
        L_0x024b:
            java.lang.Object r5 = r14.A01
            X.57u r5 = (X.C883757u) r5
            java.lang.Object r0 = r14.A00
            android.app.Activity r3 = X.C86144wL.A0E(r0)
            com.instagram.user.model.User r2 = r5.A05
            if (r2 == 0) goto L_0x0568
            X.DaJ r1 = r5.A00
            r0 = 0
            r1.A00(r3, r2, r0)
            goto L_0x0297
        L_0x0260:
            java.lang.Object r5 = r14.A01
            X.57u r5 = (X.C883757u) r5
            java.lang.Object r0 = r14.A00
            android.app.Activity r7 = X.C86144wL.A0E(r0)
            com.instagram.service.session.UserSession r9 = r5.A04
            java.lang.String r12 = r5.A06
            X.0kW r8 = r5.A03
            X.Fg4 r10 = X.C29009Fg4.A09
            X.Fg3 r11 = X.C29008Fg3.A0e
            X.Jmy r6 = new X.Jmy
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 1
            r6.A08 = r0
            r6.A06()
            goto L_0x0297
        L_0x0280:
            java.lang.Object r5 = r14.A01
            X.57u r5 = (X.C883757u) r5
            java.lang.Object r0 = r14.A00
            android.app.Activity r3 = X.C86144wL.A0E(r0)
            com.instagram.service.session.UserSession r2 = r5.A04
            X.0kW r0 = r5.A03
            java.lang.String r1 = X.C18230wP.A0n(r0)
            java.lang.String r0 = r5.A06
            X.AnonymousClass6N4.A00(r3, r2, r1, r0)
        L_0x0297:
            X.C883757u.A00(r5)
            goto L_0x0568
        L_0x029c:
            java.lang.Object r5 = r14.A01
            com.instagram.barcelona.search.SearchScreenViewModel r5 = (com.instagram.barcelona.search.SearchScreenViewModel) r5
            java.lang.Object r0 = r14.A00
            X.8iU r0 = (X.AnonymousClass8iU) r0
            X.5M1 r0 = (X.AnonymousClass5M1) r0
            java.lang.String r4 = r0.A02
            X.KKE r3 = r5.A08
            java.util.List r0 = r3.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x02b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d9
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.KYu r0 = (X.C38382KYu) r0
            java.lang.String r0 = r0.A01()
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x02b2
        L_0x02c9:
            X.IoO r1 = (X.C35144IoO) r1
            if (r1 == 0) goto L_0x02d4
            com.instagram.user.model.User r0 = r1.A05()
            r3.A02(r0)
        L_0x02d4:
            com.instagram.barcelona.search.SearchScreenViewModel.A02(r5)
            goto L_0x0568
        L_0x02d9:
            r1 = 0
            goto L_0x02c9
        L_0x02db:
            java.lang.Object r1 = r14.A01
            X.57G r1 = (X.AnonymousClass57G) r1
            java.lang.Object r2 = r14.A00
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r2, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            r10 = 0
            X.C04220Ms.A0B(r2, r10)
            com.instagram.service.session.UserSession r7 = r1.A01
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            X.0m7 r5 = r2.getSupportFragmentManager()
            java.lang.Integer r8 = X.AnonymousClass006.A00
            X.0kW r6 = r1.A00
            goto L_0x043d
        L_0x0301:
            java.lang.Object r3 = r14.A01
            X.57G r3 = (X.AnonymousClass57G) r3
            java.lang.Object r1 = r14.A00
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r4 = X.C86164wN.A0y(r1, r3, r0)
            X.4wE r5 = r3.A02
        L_0x030f:
            java.lang.Object r2 = r5.getValue()
            X.67x r1 = X.C970967x.InProgress
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r0.<init>((X.C970967x) r1)
            boolean r0 = r5.ADi(r2, r0)
            if (r0 == 0) goto L_0x030f
            X.4qz r5 = X.AnonymousClass3J5.A00(r3)
            r2 = 0
            r0 = 23
            goto L_0x0385
        L_0x0328:
            java.lang.Object r2 = r14.A00
            android.content.Context r2 = (android.content.Context) r2
            X.C86164wN.A1F(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.25S r0 = X.AnonymousClass25S.BARCELONA_APP_SETTING
            X.C63493hb.A00(r2, r0, r1)
            goto L_0x0568
        L_0x033c:
            java.lang.Object r4 = r14.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r14.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.9wF r2 = X.C171209wF.A0t
            r0 = 1112(0x458, float:1.558E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            X.Jpy r0 = new X.Jpy
            r0.<init>((android.content.Context) r4, (com.instagram.service.session.UserSession) r3, (X.C171209wF) r2, (java.lang.String) r1)
            r0.A04()
            goto L_0x0568
        L_0x0356:
            java.lang.Object r3 = r14.A00
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r3, r0)
            r2 = r3
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            r0 = 866(0x362, float:1.214E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.launchDeveloperOptionModalActivity(r3, r2, r1, r0)
            goto L_0x0568
        L_0x0374:
            java.lang.Object r3 = r14.A01
            X.3ak r3 = (X.C62793ak) r3
            java.lang.Object r4 = r14.A00
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.4qz r5 = X.AnonymousClass3J5.A00(r3)
            r2 = 0
            r0 = 26
        L_0x0385:
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.C146958n9) r2, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r5, r0)
            goto L_0x0568
        L_0x0390:
            java.lang.Object r3 = r14.A01
            X.57O r3 = (X.AnonymousClass57O) r3
            java.lang.Object r0 = r14.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2) r0
            boolean r0 = r0.A01
            r4 = r0 ^ 1
            X.4wE r8 = r3.A04
        L_0x03a2:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2) r0
            r5 = 0
            java.lang.Object r6 = r0.A00
            java.util.List r6 = (java.util.List) r6
            boolean r2 = r0.A02
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2
            r0.<init>((java.util.List) r6, (int) r1, (boolean) r4, (boolean) r2)
            boolean r0 = r8.ADi(r7, r0)
            if (r0 == 0) goto L_0x03a2
            com.instagram.user.model.User r0 = r3.A03
            X.9tz r1 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            if (r0 == r4) goto L_0x03dc
            X.4qz r2 = X.AnonymousClass3J5.A00(r3)
            r0 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2
            r1.<init>((java.lang.Object) r3, (X.C146958n9) r5, (int) r0, (boolean) r4)
            r0 = 3
            X.C25237DiI.A00(r5, r5, r1, r2, r0)
        L_0x03dc:
            com.instagram.service.session.UserSession r0 = r3.A02
            X.0kW r3 = r3.A01
            X.0nS r1 = X.C13330nS.A01(r3, r0)
            r0 = 888(0x378, float:1.244E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 150(0x96, float:2.1E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            if (r4 == 0) goto L_0x0409
            java.lang.String r1 = "private"
        L_0x03f8:
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0T(r0, r1)
            X.C18240wQ.A14(r2, r3)
            r2.Bb4()
            goto L_0x0568
        L_0x0409:
            java.lang.String r1 = "public"
            goto L_0x03f8
        L_0x040c:
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r14.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C63183gx.A03(r1, r0)
            goto L_0x0568
        L_0x0423:
            java.lang.Object r0 = r14.A01
            X.57H r0 = (X.AnonymousClass57H) r0
            java.lang.Object r2 = r14.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            r10 = 0
            X.C04220Ms.A0B(r2, r10)
            com.instagram.service.session.UserSession r7 = r0.A01
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            X.0m7 r5 = r2.getSupportFragmentManager()
            java.lang.Integer r8 = X.AnonymousClass006.A00
            X.0kW r6 = r0.A00
        L_0x043d:
            r3 = 0
            X.1jJ r1 = new X.1jJ
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Void[] r0 = new java.lang.Void[r10]
            r1.A02(r0)
            goto L_0x0568
        L_0x044b:
            X.3UZ r0 = X.AnonymousClass3UZ.A02
            if (r0 == 0) goto L_0x0568
            X.3IP r1 = r0.A00()
            if (r1 == 0) goto L_0x0568
            java.lang.Object r0 = r14.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            android.os.Bundle r2 = r1.A00(r0)
            java.lang.Object r1 = r14.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            java.lang.String r0 = "bloks"
            r1.invoke(r0, r2)
            goto L_0x0568
        L_0x0468:
            java.lang.Object r0 = r14.A00
            X.8pE r0 = (X.C147368pE) r0
            r5 = 0
            X.C147368pE.A03(r0, r5)
            java.lang.Object r4 = r14.A01
            X.3ak r4 = (X.C62793ak) r4
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r2 = 0
            r0 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2
            r1.<init>(r4, r2, r5, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x0568
        L_0x0486:
            java.lang.Object r0 = r14.A00
            X.7KG r0 = (X.AnonymousClass7KG) r0
            r0.A0H()
            java.lang.Object r1 = r14.A01
            X.0i6 r1 = (X.C10300i6) r1
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0568
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.49j r0 = X.C696349j.A03(r1)
            r0.A0L()
            goto L_0x0568
        L_0x04a0:
            java.lang.Object r1 = r14.A01
            X.0i6 r1 = (X.C10300i6) r1
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0568
            java.lang.Object r4 = r14.A00
            X.7KG r4 = (X.AnonymousClass7KG) r4
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.String r3 = r1.getUserId()
            java.lang.String r2 = "Following"
            X.AnonymousClass0wJ.A1N(r4, r3)
            java.lang.String r1 = "following_graph?userId="
            java.lang.String r0 = "&activeTab="
            java.lang.String r1 = X.AnonymousClass00U.A0d(r1, r3, r0, r2)
            r0 = 0
            r4.A0G(r0, r0, r1)
            goto L_0x0568
        L_0x04c5:
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            java.lang.Object r0 = r14.A01
            X.57L r0 = (X.AnonymousClass57L) r0
            com.instagram.service.session.UserSession r2 = r0.A02
            r1 = 0
            java.lang.Integer r3 = X.AnonymousClass006.A0T
            r4 = 0
            java.lang.String r8 = "take_break"
            r9 = 1
            r5 = r4
            r6 = r4
            r7 = r4
            X.C63583hq.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            X.6mV r0 = r0.A00
            goto L_0x04fe
        L_0x04e0:
            java.lang.Object r0 = r14.A00
            X.C18240wQ.A1G(r0)
            java.lang.Object r1 = r14.A01
            X.57L r1 = (X.AnonymousClass57L) r1
            com.instagram.service.session.UserSession r2 = r1.A02
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Integer r3 = X.AnonymousClass006.A0S
            r4 = 0
            java.lang.String r8 = "take_break"
            r9 = 1
            r5 = r4
            r6 = r4
            r7 = r4
            X.C63583hq.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            X.6mV r0 = r1.A00
            r1 = 0
        L_0x04fe:
            X.4wE r0 = r0.A00
            X.C86074wE.A01(r0, r1)
            goto L_0x0568
        L_0x0504:
            X.3VO r2 = X.AnonymousClass3VO.A00()
            java.lang.Object r1 = r14.A01
            r0 = 0
            r2.A02(r1, r0)
            java.lang.Object r1 = r14.A00
            r0 = 1
            X.3iY r2 = X.C86154wM.A0R(r2, r1, r0)
            return r2
        L_0x0516:
            java.lang.Object r2 = r14.A00
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r1 = r14.A01
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object[] r0 = X.C86164wN.A1T()
            X.C63913ic.A0K(r2, r1, r0)
            goto L_0x0568
        L_0x0526:
            java.lang.Object r2 = r14.A01
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r1 = r14.A00
            X.6jp r1 = (X.C109326jp) r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object r2 = X.C63913ic.A0K(r2, r1, r0)
            return r2
        L_0x0538:
            java.lang.Object r0 = r14.A00
            X.33V r0 = (X.AnonymousClass33V) r0
            if (r0 == 0) goto L_0x0547
            X.1dw r0 = r0.A00
            X.0m7 r0 = r0.getParentFragmentManager()
            r0.A16()
        L_0x0547:
            java.lang.Object r1 = r14.A01
            X.CBO r1 = (X.CBO) r1
            r0 = 0
            X.CBO.A01(r1, r0)
            goto L_0x0568
        L_0x0550:
            java.lang.Object r3 = r14.A01
            X.CBO r3 = (X.CBO) r3
            com.instagram.service.session.UserSession r2 = r3.A04
            java.lang.Object r0 = r14.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            X.0kW r0 = r3.A03
            X.C25788Ds1.A03(r0, r2, r1)
            java.lang.String r0 = "cancel"
            X.CBO.A03(r3, r0)
        L_0x0568:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x056b:
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A00
            X.0kW r0 = (X.C11630kW) r0
            X.KEd r2 = new X.KEd
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape20S0200000_I2_4(int i, Object obj, Object obj2) {
        super(0);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
