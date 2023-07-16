package X;

import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public final class C58753Hb {
    public C25553Dnn A00;
    public final Context A01;
    public final C12560m7 A02;
    public final IgFragmentActivity A03;
    public final C11630kW A04;
    public final UserSession A05;
    public final AnonymousClass1x2 A06;
    public final AtomicBoolean A07 = C18230wP.A0w();
    public final C04530Oa A08 = C62373Zc.A02(this, 42);
    public final C04530Oa A09 = C62373Zc.A02(this, 43);
    public final AnonymousClass06E A0A;

    public C58753Hb(Context context, C12560m7 r5, AnonymousClass06E r6, IgFragmentActivity igFragmentActivity, C11630kW r8, UserSession userSession, AnonymousClass1x2 r10) {
        C18190wL.A1S(userSession, 1, igFragmentActivity);
        this.A05 = userSession;
        this.A06 = r10;
        this.A02 = r5;
        this.A0A = r6;
        this.A03 = igFragmentActivity;
        this.A01 = context;
        this.A04 = r8;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.LOGIN_INFO;
        IDxACallbackShape111S0100000_1_I2 A062 = C63873iU.A06(this, 149);
        try {
            C32165H8c A002 = AnonymousClass2D0.A00(new KtCSuperShape0S0100000_I2(xFBFXIGPCEntryPoint), userSession);
            A002.A00 = A062;
            C31155GhB.A03(A002);
        } catch (Exception e) {
            C63003bJ.A01(userSession, xFBFXIGPCEntryPoint, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.user.model.User r18, java.util.List r19) {
        /*
            r17 = this;
            r3 = 1
            r1 = r17
            com.instagram.base.activity.IgFragmentActivity r9 = r1.A03
            X.1x2 r15 = r1.A06
            X.0m7 r10 = r1.A02
            X.06E r11 = r1.A0A
            com.instagram.service.session.UserSession r14 = r1.A05
            X.0kW r12 = r1.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A07
            boolean r16 = r0.get()
            X.Dnn r13 = r1.A00
            X.3DA r8 = new X.3DA
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 2131830182(0x7f1125a6, float:1.9293354E38)
            r5 = r19
            X.C63613hu.A04(r5, r0)
            X.1x2 r0 = r8.A05
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0I
            boolean r0 = r0.get()
            r6 = 2131831477(0x7f112ab5, float:1.929598E38)
            if (r0 == 0) goto L_0x0180
            X.3an r0 = r8.A01
            com.instagram.service.session.UserSession r4 = r8.A04
            com.instagram.accountlinking.model.AccountFamily r0 = X.C62813an.A02(r0, r4)
            if (r0 != 0) goto L_0x017c
            java.lang.String r1 = "AccountLinkingManager"
            java.lang.String r0 = "The linking state of the requested account is never fetched"
            X.C10450iM.A03(r1, r0)
            X.22H r0 = X.AnonymousClass22H.UNKNOWN
        L_0x0044:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0178
            if (r1 != r3) goto L_0x0079
            r0 = 250(0xfa, float:3.5E-43)
        L_0x004f:
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r8, r0)
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0172
            X.Dnn r0 = r8.A03
            if (r0 == 0) goto L_0x0172
            X.1w7 r2 = new X.1w7
            r2.<init>(r1, r0)
        L_0x0060:
            X.0nS r1 = X.C13330nS.A02(r4)
            java.lang.String r0 = "ig_my_main_account_settings_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1361(0x551, float:1.907E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.C77494gf.A00(r0, r4)
            r0.Bb4()
        L_0x0076:
            r5.add(r2)
        L_0x0079:
            X.0BO r7 = r4.multipleAccountHelper
            boolean r6 = r7.A0L()
            r2 = 2131821017(0x7f1101d9, float:1.9274765E38)
            if (r6 == 0) goto L_0x0087
            r2 = 2131821089(0x7f110221, float:1.9274911E38)
        L_0x0087:
            r0 = 3
            com.facebook.redex.IDxCListenerShape4S0210000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape4S0210000_1_I2
            r1.<init>(r0, r8, r7, r6)
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r2)
            r7 = 2131099707(0x7f06003b, float:1.7811775E38)
            androidx.fragment.app.FragmentActivity r6 = r8.A00
            X.C62133Xg.A00(r6, r0, r5, r7)
            X.266 r1 = r18.A0g()
            X.266 r0 = X.AnonymousClass266.A06
            if (r1 != r0) goto L_0x00b7
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36312174666187622(0x8101bb00000366, double:3.027303704063653E-306)
            boolean r0 = X.C63803iN.A0E(r2, r14, r0)
            if (r0 == 0) goto L_0x00b7
            X.3Vj r0 = new X.3Vj
            r0.<init>(r15, r14)
            r0.A04(r5)
        L_0x00b7:
            X.3Yv r0 = X.C62353Yv.A00(r4)
            java.util.HashMap r0 = r0.A01
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            X.0BO r0 = r4.multipleAccountHelper
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x00df
            if (r1 != 0) goto L_0x00ef
            r2 = 2131830113(0x7f112561, float:1.9293214E38)
            r0 = 254(0xfe, float:3.56E-43)
        L_0x00d2:
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r8, r0)
        L_0x00d6:
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r2)
            X.C62133Xg.A00(r6, r0, r5, r7)
            return
        L_0x00df:
            if (r1 != 0) goto L_0x00ef
            X.3an r0 = r8.A01
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x00ef
            r2 = 2131830113(0x7f112561, float:1.9293214E38)
            r0 = 253(0xfd, float:3.55E-43)
            goto L_0x00d2
        L_0x00ef:
            X.3an r2 = r8.A01
            java.lang.String r1 = r4.getUserId()
            boolean r0 = r2.A08(r1)
            if (r0 != 0) goto L_0x0146
            int r0 = X.C62813an.A00(r2, r1)
            if (r0 == r3) goto L_0x0146
            java.lang.String r1 = r4.getUserId()
            boolean r0 = r2.A06(r1)
            if (r0 == 0) goto L_0x0117
            boolean r0 = r2.A07(r1)
            if (r0 == 0) goto L_0x0137
            int r0 = X.C62813an.A00(r2, r1)
            if (r0 != 0) goto L_0x0137
        L_0x0117:
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131830121(0x7f112569, float:1.929323E38)
            java.lang.String r0 = r18.BK7()
            java.lang.String r2 = X.C18190wL.A0h(r2, r0, r1)
            X.C04220Ms.A06(r2)
            r0 = 254(0xfe, float:3.56E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r8, r0)
        L_0x012f:
            X.3Xg r1 = new X.3Xg
            r1.<init>((java.lang.CharSequence) r2, (android.view.View.OnClickListener) r0)
            X.C62133Xg.A00(r6, r1, r5, r7)
        L_0x0137:
            X.3LL r1 = new X.3LL
            r1.<init>()
            r2 = 2131830115(0x7f112563, float:1.9293218E38)
            r0 = 202(0xca, float:2.83E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r8, r1, r0)
            goto L_0x00d6
        L_0x0146:
            com.instagram.user.model.User r0 = r2.A03(r4)
            if (r0 == 0) goto L_0x0152
            java.lang.String r2 = r0.BK7()
            if (r2 != 0) goto L_0x015d
        L_0x0152:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131824695(0x7f111037, float:1.9282225E38)
            java.lang.String r2 = X.C18190wL.A0g(r1, r0)
        L_0x015d:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131830114(0x7f112562, float:1.9293216E38)
            java.lang.String r2 = X.C18190wL.A0h(r1, r2, r0)
            X.C04220Ms.A06(r2)
            r0 = 252(0xfc, float:3.53E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r8, r0)
            goto L_0x012f
        L_0x0172:
            X.4MA r2 = X.AnonymousClass4MA.A00(r1, r6)
            goto L_0x0060
        L_0x0178:
            r0 = 249(0xf9, float:3.49E-43)
            goto L_0x004f
        L_0x017c:
            X.22H r0 = r0.A00
            goto L_0x0044
        L_0x0180:
            com.instagram.service.session.UserSession r4 = r8.A04
            X.3an r1 = X.C62813an.A01(r4)
            java.lang.String r0 = r4.getUserId()
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0079
            r0 = 251(0xfb, float:3.52E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r8, r0)
            X.3Xg r2 = new X.3Xg
            r2.<init>((android.view.View.OnClickListener) r0, (int) r6)
            r1 = 2131100000(0x7f060160, float:1.781237E38)
            androidx.fragment.app.FragmentActivity r0 = r8.A00
            int r0 = r0.getColor(r1)
            r2.A02 = r0
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58753Hb.A00(com.instagram.user.model.User, java.util.List):void");
    }

    public final void A01(List list, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C04220Ms.A0B(list, 0);
        UserSession userSession = this.A05;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        boolean A0E = C63803iN.A0E(r2, userSession, 36316409504074848L);
        if (C63803iN.A0E(r2, userSession, 36316409504140385L)) {
            AnonymousClass399 r4 = new AnonymousClass399();
            r4.A00 = new IDxCListenerShape2S0110000_1_I2(this);
            r4.A01 = C63803iN.A0E(r2, userSession, 36316409504271459L);
            list.add(r4);
        }
        if (A0E) {
            C63613hu.A04(list, 2131829095);
        }
        AnonymousClass4MA A002 = AnonymousClass4MA.A00(C18210wN.A0H(this, 258), 2131827585);
        if (z) {
            A002.A01 = R.drawable.instagram_user_follow_pano_outline_24;
        }
        list.add(A002);
        AnonymousClass4MA A003 = AnonymousClass4MA.A00(C18210wN.A0H(this, 260), 2131831918);
        if (z) {
            A003.A01 = R.drawable.instagram_alert_new_pano_outline_24;
        }
        list.add(A003);
        if (C63803iN.A0E(r2, userSession, 36316774576164162L)) {
            AnonymousClass4MA A012 = AnonymousClass4MA.A01(C18210wN.A0H(this, 256), AnonymousClass00U.A0L(this.A03.getString(2131820823), C63803iN.A0C(r2, userSession, 36879724529647810L)));
            if (z) {
                A012.A01 = R.drawable.instagram_accessibility_pano_outline_24;
            }
            list.add(A012);
        }
        C04620Ok r5 = C06810aP.A01;
        if (C18200wM.A1X(userSession, r5) || C59623Lo.A01(r5.A01(userSession))) {
            if (z2) {
                str5 = "settings_search";
            } else {
                str5 = "settings";
            }
            int i = 2131822792;
            if (C59623Lo.A01(r5.A01(userSession))) {
                i = 2131824635;
            }
            AnonymousClass4MA A004 = AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(this, str5, 19), i);
            if (z) {
                boolean A013 = C59623Lo.A01(r5.A01(userSession));
                int i2 = R.drawable.instagram_business_pano_outline_24;
                if (A013) {
                    i2 = R.drawable.instagram_media_account_pano_outline_24;
                }
                A004.A01 = i2;
            }
            list.add(A004);
        }
        C29291xi r1 = new C29291xi(C18210wN.A0H(this, 261), QPTooltipAnchor.A0s);
        if (z) {
            r1.A01 = R.drawable.instagram_lock_pano_outline_24;
        }
        list.add(r1);
        Boolean BYx = C18240wQ.A0W(userSession, r5).BYx();
        if (BYx != null && BYx.booleanValue()) {
            AnonymousClass4MA A005 = AnonymousClass4MA.A00(C18210wN.A0H(this, 259), 2131836425);
            if (z) {
                A005.A01 = R.drawable.instagram_users_pano_outline_24;
            }
            list.add(A005);
        }
        boolean A0E2 = C63803iN.A0E(r2, userSession, 36316409504205922L);
        if (!z2) {
            A0E2 = A0E;
        }
        if (!A0E2) {
            if (z2) {
                str4 = "settings_search";
            } else {
                str4 = "settings";
            }
            AnonymousClass4MA A006 = AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(this, str4, 21), 2131835361);
            if (z) {
                A006.A01 = R.drawable.instagram_shield_pano_outline_24;
            }
            list.add(A006);
        }
        if (C63803iN.A0E(r2, userSession, 36322680156200398L)) {
            AnonymousClass4MA A007 = AnonymousClass4MA.A00(C18210wN.A0H(this, 257), 2131836375);
            if (z) {
                A007.A01 = R.drawable.instagram_media_pano_outline_24;
            }
            list.add(A007);
        }
        if (!A0E2) {
            if (z2) {
                str3 = "settings_search";
            } else {
                str3 = "settings";
            }
            AnonymousClass4MA A008 = AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(this, str3, 18), 2131821225);
            if (z) {
                A008.A01 = R.drawable.instagram_ads_pano_outline_24;
            }
            list.add(A008);
        }
        Class<AnonymousClass3YL> cls = AnonymousClass3YL.class;
        AnonymousClass3YL r42 = (AnonymousClass3YL) C18180wK.A0c(userSession, cls, 30);
        Integer A022 = r42.A02();
        Integer num = AnonymousClass006.A00;
        if (!(A022 == num && r42.A0B == num) && !((AnonymousClass3YL) C18180wK.A0c(userSession, cls, 30)).A0E) {
            if (z2) {
                str2 = "settings_search";
            } else {
                str2 = "settings";
            }
            AnonymousClass4MA A009 = AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(this, str2, 20), 2131832211);
            if (z) {
                A009.A01 = R.drawable.instagram_payments_pano_outline_24;
            }
            list.add(A009);
        }
        int i3 = 2131820836;
        if (A0E) {
            i3 = 2131832746;
        }
        if (z2) {
            str = "settings_search";
        } else {
            str = "settings";
        }
        AnonymousClass4MA A0010 = AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(this, str, 17), i3);
        if (z) {
            A0010.A01 = R.drawable.instagram_user_circle_pano_outline_24;
        }
        list.add(A0010);
        int i4 = 2131829091;
        if (C63803iN.A0E(r2, userSession, 36322263544372493L)) {
            i4 = 2131829111;
        }
        AnonymousClass4MA A0011 = AnonymousClass4MA.A00(C18210wN.A0H(this, 262), i4);
        if (z) {
            A0011.A01 = R.drawable.instagram_help_pano_outline_24;
        }
        list.add(A0011);
        AnonymousClass4MA A0012 = AnonymousClass4MA.A00(C18210wN.A0H(this, 255), 2131820787);
        if (z) {
            A0012.A01 = R.drawable.instagram_info_pano_outline_24;
        }
        list.add(A0012);
        AnonymousClass4MA A0013 = AnonymousClass4MA.A00(C18200wM.A0R(userSession, this.A03, 170), 2131824752);
        if (z) {
            A0013.A01 = R.drawable.instagram_moon_pano_outline_24;
        }
        list.add(A0013);
        if (C19573AyZ.A02(userSession) || C63803iN.A0E(r2, userSession, 36313957077616387L)) {
            int i5 = 264;
            if (C63803iN.A0E(r2, userSession, 36313957077616387L)) {
                i5 = 263;
            }
            AnonymousClass4MA A0014 = AnonymousClass4MA.A00(C18210wN.A0H(this, i5), 2131829147);
            if (z) {
                A0014.A01 = R.drawable.instagram_app_instagram_outline_24;
            }
            list.add(A0014);
        }
        if (C67333zN.A05(userSession)) {
            new C61783Vj(this.A06, userSession).A04(list);
        }
        if (!C63803iN.A0E(r2, userSession, 36316409504140385L)) {
            AnonymousClass36Q r12 = new AnonymousClass36Q();
            r12.A00 = new IDxCListenerShape2S0110000_1_I2(this);
            list.add(r12);
        }
    }
}
