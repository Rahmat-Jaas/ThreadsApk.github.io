package X;

import android.content.Context;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.3Nn  reason: invalid class name and case insensitive filesystem */
public abstract class C60073Nn {
    public static C84194si A00(Context context, AnonymousClass254 r2, C11630kW r3, C85874vu r4, UserSession userSession, User user, ArrayList arrayList) {
        int ordinal = r2.ordinal();
        Context context2 = context;
        switch (ordinal) {
            case 0:
                return new AnonymousClass4FO(context2, r4, user);
            case 1:
                return new AnonymousClass4FY(context2, r4, user);
            case 2:
                return new AnonymousClass4FS(context2, r4, user);
            case 3:
                return new C70564Ff(context2, r4, user);
            case 4:
                return new AnonymousClass4FQ(context2, r4, user);
            case 5:
                return new AnonymousClass4FP(context2, r4, user);
            case 6:
                return new C70554Fe(context2, r4, userSession, user);
            case 7:
                return new AnonymousClass4FT(context2, r4, user);
            case 8:
                arrayList.getClass();
                return new C70574Fg(context2, r4, user, arrayList);
            case 9:
                return new C70524Fb(context2, r3, r4, userSession, user);
            case 10:
                return new C70514Fa(context2, r4, userSession, user);
            case 11:
                return new AnonymousClass4FU(context2, r4, user.A3S());
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AnonymousClass4FV(context2, r4, user);
            default:
                throw C18180wK.A0a("Unknown business action on profile.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f9, code lost:
        if (r1.AhE() != null) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        if (X.AnonymousClass0wJ.A0Y(r13).A3a() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(android.content.Context r15, X.C11630kW r16, X.C85864vt r17, com.instagram.service.session.UserSession r18, com.instagram.user.model.User r19, java.lang.String r20) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r14 = r19
            X.4te r5 = r14.A0J()
            r13 = r18
            boolean r1 = X.C19573AyZ.A06(r13, r14)
            r3 = 1
            r9 = r15
            r12 = r17
            if (r1 == 0) goto L_0x014c
            boolean r1 = X.C60103Nr.A01(r14)
            if (r1 == 0) goto L_0x0145
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36325033798607717(0x810d6d00052365, double:3.035435871185691E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 != 0) goto L_0x0034
            r1 = 36325033798738790(0x810d6d00072366, double:3.0354358712685823E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0145
        L_0x0034:
            X.4FX r1 = new X.4FX
            r1.<init>(r15, r12, r14)
        L_0x0039:
            r0.add(r1)
            X.4FM r1 = new X.4FM
            r1.<init>(r15, r12)
            r0.add(r1)
            X.MeW r1 = r14.A05
            java.lang.Boolean r1 = r1.AmK()
            if (r1 == 0) goto L_0x0067
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0067
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36310383664889899(0x81001a0001002b, double:3.0261710676311896E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0067
            X.4FK r1 = new X.4FK
            r1.<init>(r15, r12)
        L_0x0064:
            r0.add(r1)
        L_0x0067:
            r11 = r16
            if (r5 == 0) goto L_0x00b6
            boolean r1 = r14.A3P()
            if (r1 == 0) goto L_0x00b6
            X.Ctp r1 = X.C23527Ctp.A00(r13)
            X.D0g r2 = r1.A0L(r14)
            X.D0g r1 = X.C23894D0g.FollowStatusNotFollowing
            if (r2 == r1) goto L_0x00b6
            boolean r1 = r5.AVf()
            if (r1 == 0) goto L_0x0142
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36318230572175646(0x81073d0020111e, double:3.0311334833956555E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 != 0) goto L_0x009b
            r1 = 36318230572241183(0x81073d0021111f, double:3.0311334834371014E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0142
        L_0x009b:
            r1 = 1
        L_0x009c:
            r20 = r1 ^ 1
            X.4Fc r15 = new X.4Fc
            r16 = r9
            r17 = r11
            r18 = r12
            r15.<init>(r16, r17, r18, r19, r20)
            r0.add(r15)
            if (r1 == 0) goto L_0x00b6
            X.4FW r1 = new X.4FW
            r1.<init>(r9, r12, r14)
            r0.add(r1)
        L_0x00b6:
            boolean r2 = X.C60083No.A01(r9, r13, r14, r3)
            boolean r1 = X.C19573AyZ.A06(r13, r14)
            if (r1 == 0) goto L_0x00cb
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r13)
            boolean r1 = r1.A3a()
            r8 = 1
            if (r1 != 0) goto L_0x00cc
        L_0x00cb:
            r8 = 0
        L_0x00cc:
            if (r2 == 0) goto L_0x0277
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r5 = 0
            r7 = 0
            r2 = 0
        L_0x00da:
            X.254 r10 = X.C67353zP.A01(r9, r13, r14, r7, r3)
            if (r10 == 0) goto L_0x00f8
            X.254 r1 = X.AnonymousClass254.MESSAGE
            if (r10 == r1) goto L_0x00f8
            X.254 r1 = X.AnonymousClass254.SHOP
            if (r10 != r1) goto L_0x012c
            boolean r1 = X.C19573AyZ.A06(r13, r14)
            if (r1 == 0) goto L_0x012c
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r13)
            boolean r1 = r1.A3a()
            if (r1 == 0) goto L_0x012c
        L_0x00f8:
            int r7 = r7 + 1
            r1 = 10
            if (r7 < r1) goto L_0x00da
            int r1 = r6.size()
            if (r1 > r3) goto L_0x0110
            int r1 = r6.size()
            if (r1 < r3) goto L_0x0259
            boolean r1 = X.C67353zP.A0A(r14)
            if (r1 == 0) goto L_0x0259
        L_0x0110:
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            r2 = 0
        L_0x0115:
            int r1 = r6.size()
            if (r2 >= r1) goto L_0x02c4
            java.lang.Object r1 = r6.valueAt(r2)
            r1.getClass()
            X.254 r1 = (X.AnonymousClass254) r1
            int r1 = r1.A00
            X.C18200wM.A1U(r15, r1)
            int r2 = r2 + 1
            goto L_0x0115
        L_0x012c:
            int r1 = r10.ordinal()
            switch(r1) {
                case 0: goto L_0x013e;
                case 1: goto L_0x013e;
                case 2: goto L_0x013e;
                case 3: goto L_0x013e;
                case 4: goto L_0x013e;
                case 5: goto L_0x0133;
                case 6: goto L_0x0133;
                case 7: goto L_0x0133;
                case 8: goto L_0x0133;
                case 9: goto L_0x0133;
                case 10: goto L_0x0133;
                case 11: goto L_0x013e;
                case 12: goto L_0x013e;
                default: goto L_0x0133;
            }
        L_0x0133:
            r15 = 0
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r4.add(r1)
        L_0x013b:
            int r2 = r2 + 1
            goto L_0x00f8
        L_0x013e:
            r6.put(r2, r10)
            goto L_0x013b
        L_0x0142:
            r1 = 0
            goto L_0x009c
        L_0x0145:
            X.4FR r1 = new X.4FR
            r1.<init>(r15, r12, r14)
            goto L_0x0039
        L_0x014c:
            if (r5 == 0) goto L_0x0176
            boolean r1 = r5.BZq()
            if (r1 == 0) goto L_0x0176
            int r2 = r5.Ay1()
            int r1 = r5.Ay2()
            int r2 = r2 + r1
        L_0x015d:
            X.4Fd r1 = new X.4Fd
            r1.<init>(r2)
            r0.add(r1)
            java.lang.String r1 = "37229129288"
            r2 = r20
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0178
            X.4FI r1 = new X.4FI
            r1.<init>(r15, r12)
            goto L_0x0064
        L_0x0176:
            r2 = 0
            goto L_0x015d
        L_0x0178:
            boolean r1 = r14.A3S()
            if (r1 == 0) goto L_0x01ca
            X.4te r1 = r14.A0J()
            if (r1 == 0) goto L_0x0067
            X.4te r1 = r14.A0J()
            java.lang.String r1 = r1.AXF()
            if (r1 == 0) goto L_0x0067
            boolean r1 = r14.A3P()
            if (r1 == 0) goto L_0x0067
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36327821232187579(0x810ff6000228bb, double:3.03719865540569E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0067
        L_0x01a1:
            boolean r2 = r14.A3S()
            X.4FU r1 = new X.4FU
            r1.<init>(r15, r12, r2)
            r0.add(r1)
            boolean r1 = X.C19573AyZ.A06(r13, r14)
            r2 = 0
            if (r1 != 0) goto L_0x0067
            boolean r1 = X.C60083No.A01(r15, r13, r14, r3)
            if (r1 == 0) goto L_0x0215
            int r1 = X.C67353zP.A00(r15, r13, r14, r2, r3)
            if (r1 > r3) goto L_0x0067
            if (r1 < r3) goto L_0x0201
            boolean r1 = X.C67353zP.A0A(r14)
            if (r1 == 0) goto L_0x0201
            goto L_0x0067
        L_0x01ca:
            X.MeW r4 = r14.A05
            java.lang.Boolean r1 = r4.B6q()
            if (r1 == 0) goto L_0x01da
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01da
            goto L_0x0067
        L_0x01da:
            boolean r1 = X.C19573AyZ.A06(r13, r14)
            if (r1 != 0) goto L_0x01f4
            X.9tz r2 = r14.A0e()
            X.9tz r1 = X.C169839tz.PrivacyStatusPrivate
            if (r2 != r1) goto L_0x01f4
            X.Ctp r1 = X.C23527Ctp.A00(r13)
            boolean r1 = r1.A0N(r14)
            if (r1 != 0) goto L_0x01f4
            goto L_0x0067
        L_0x01f4:
            java.lang.Boolean r1 = r4.BW0()
            if (r1 == 0) goto L_0x01a1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0067
            goto L_0x01a1
        L_0x0201:
            java.lang.String r1 = r14.A1D()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0215
            java.lang.Integer r2 = r14.A0m()
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r2 != r1) goto L_0x0215
            goto L_0x0067
        L_0x0215:
            boolean r1 = X.C09650fs.A04(r15)
            if (r1 == 0) goto L_0x0067
            X.Ctp r1 = X.C23527Ctp.A00(r13)
            boolean r2 = r1.A0N(r14)
            boolean r1 = r14.A3Q()
            if (r2 != 0) goto L_0x022b
            if (r1 == 0) goto L_0x0067
        L_0x022b:
            boolean r1 = r14.BZi()
            if (r1 != 0) goto L_0x0067
            boolean r1 = r14.A3U()
            if (r1 != 0) goto L_0x0067
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 2342153908274594094(0x208100920000012e, double:4.057869055891701E-152)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0067
            r1 = 36313295652652452(0x8102c0000005a4, double:3.028012620417862E-306)
            boolean r1 = X.C63803iN.A0E(r4, r13, r1)
            if (r1 == 0) goto L_0x0067
            X.4FJ r1 = new X.4FJ
            r1.<init>(r15, r12)
            r0.add(r1)
            goto L_0x0067
        L_0x0259:
            int r1 = r6.size()
            if (r5 >= r1) goto L_0x02d1
            int r2 = r6.keyAt(r5)
            java.lang.Object r10 = r6.valueAt(r5)
            r10.getClass()
            X.254 r10 = (X.AnonymousClass254) r10
            r15 = 0
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r4.add(r2, r1)
            int r5 = r5 + 1
            goto L_0x0259
        L_0x0277:
            if (r8 != 0) goto L_0x0293
            boolean r1 = r14.Apo()
            if (r1 != 0) goto L_0x0285
            boolean r1 = X.C59623Lo.A01(r14)
            if (r1 == 0) goto L_0x0293
        L_0x0285:
            boolean r1 = X.C67353zP.A09(r13, r14)
            if (r1 == 0) goto L_0x0293
            X.4Fe r1 = new X.4Fe
            r1.<init>(r9, r12, r13, r14)
            r0.add(r1)
        L_0x0293:
            boolean r1 = X.C121877Ip.A05(r14)
            if (r1 == 0) goto L_0x02a3
            X.254 r10 = X.AnonymousClass254.SUPPORT
            r15 = 0
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r0.add(r1)
        L_0x02a3:
            boolean r1 = X.C67353zP.A08(r13, r14)
            if (r1 == 0) goto L_0x02b3
            X.254 r10 = X.AnonymousClass254.DONATE
            r15 = 0
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r0.add(r1)
        L_0x02b3:
            boolean r1 = r14.A3b()
            if (r1 == 0) goto L_0x02d4
            X.254 r10 = X.AnonymousClass254.NATIVE_CALL
            r15 = 0
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r0.add(r1)
            goto L_0x02d4
        L_0x02c4:
            int r2 = r6.keyAt(r5)
            X.254 r10 = X.AnonymousClass254.CONTACT
            X.4si r1 = A00(r9, r10, r11, r12, r13, r14, r15)
            r4.add(r2, r1)
        L_0x02d1:
            r0.addAll(r4)
        L_0x02d4:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36314837546174653(0x810427000408bd, double:3.0289877200900085E-306)
            boolean r1 = X.C63803iN.A0E(r3, r13, r1)
            if (r1 == 0) goto L_0x0303
            java.lang.String r2 = r13.getUserId()
            java.lang.String r1 = r14.getId()
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x034c
            X.4tY r1 = r14.A0I()
            if (r1 == 0) goto L_0x0303
            java.lang.String r1 = r1.AhE()
            if (r1 == 0) goto L_0x0303
        L_0x02fb:
            X.4FZ r1 = new X.4FZ
            r1.<init>(r9, r12, r13, r14)
            r0.add(r1)
        L_0x0303:
            X.MeW r2 = r14.A05
            java.lang.Boolean r1 = r2.BBy()
            if (r1 == 0) goto L_0x0327
            java.lang.Boolean r1 = r2.BBy()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0327
            java.lang.String r1 = r2.B7t()
            if (r1 == 0) goto L_0x0327
            java.lang.String r2 = r2.B7t()
            X.4FL r1 = new X.4FL
            r1.<init>(r9, r12, r2)
            r0.add(r1)
        L_0x0327:
            r2 = 3
            if (r8 != 0) goto L_0x032b
            r2 = 6
        L_0x032b:
            int r1 = r0.size()
            if (r1 <= r2) goto L_0x035f
            int r4 = r2 + -1
            r1 = 0
            java.util.List r3 = r0.subList(r1, r4)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
        L_0x033c:
            int r1 = r0.size()
            if (r4 >= r1) goto L_0x0356
            java.lang.Object r1 = r0.get(r4)
            r2.add(r1)
            int r4 = r4 + 1
            goto L_0x033c
        L_0x034c:
            X.22o r1 = r14.A02
            int r1 = r1.ordinal()
            switch(r1) {
                case 3: goto L_0x02fb;
                case 4: goto L_0x02fb;
                case 5: goto L_0x02fb;
                default: goto L_0x0355;
            }
        L_0x0355:
            goto L_0x0303
        L_0x0356:
            X.4FN r0 = new X.4FN
            r0.<init>(r9, r12, r2)
            r3.add(r0)
            return r3
        L_0x035f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60073Nn.A01(android.content.Context, X.0kW, X.4vt, com.instagram.service.session.UserSession, com.instagram.user.model.User, java.lang.String):java.util.List");
    }
}
