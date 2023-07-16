package X;

import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.49Q  reason: invalid class name */
public final class AnonymousClass49Q implements AnonymousClass0i4 {
    public boolean A00;
    public final UserSession A01;
    public final Map A02 = AnonymousClass0wJ.A0y();
    public final Map A03 = AnonymousClass0wJ.A0y();

    public AnonymousClass49Q(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final ImmutableList A01(Context context) {
        C566037v r0;
        String str;
        String str2;
        String str3;
        HashSet A0u = C18200wM.A0u();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        UserSession userSession = this.A01;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        AnonymousClass3AB A002 = AnonymousClass2OO.A00(context, userSession, false, userSession.getUserId());
        if (!(A002 == null || (r0 = A002.A00) == null || (str = r0.A01) == null || str.length() <= 0 || (str2 = A002.A02) == null || str2.length() <= 0)) {
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A004, str2, "sensitive_string_value");
            A003.A0B(A004, "access_token");
            GraphQlCallInput.A05(A003, "ACTIVE_ACCOUNT", "account_source");
            GraphQlCallInput.A05(A003, "FACEBOOK", "app_source");
            GraphQlCallInput.A05(A003, "FACEBOOK", "account_type");
            C566037v r02 = A002.A00;
            if (r02 == null || (str3 = r02.A01) == null) {
                str3 = "";
            }
            A0u.add(str3);
            A0v2.add(A003);
        }
        A0v.addAll(A0v2);
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        C57723Cf r2 = new C57723Cf();
        r2.A02 = new AnonymousClass4VE(userSession, (String) null);
        for (AnonymousClass3H2 r03 : C63053bO.A01(context, C18180wK.A0n(C307822y.A01), new C63053bO(r2), false)) {
            AnonymousClass3VA r1 = r03.A01;
            String str4 = r1.A00;
            C04220Ms.A06(str4);
            if (str4.length() != 0 && !A0u.contains(r1.A01.A02)) {
                GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
                GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A006, str4, "sensitive_string_value");
                A005.A0B(A006, "access_token");
                GraphQlCallInput.A05(A005, "INACTIVE_LOGGED_IN_ACCOUNTS", "account_source");
                GraphQlCallInput.A05(A005, "FACEBOOK", "app_source");
                GraphQlCallInput.A05(A005, "FACEBOOK", "account_type");
                A0v3.add(A005);
            }
        }
        A0v.addAll(A0v3);
        return C18220wO.A0S(A0v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (A06(r14) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r0 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r12, com.instagram.service.session.UserSession r13, java.lang.String r14, boolean r15) {
        /*
            r11 = this;
            r0 = 1
            X.C04220Ms.A0B(r13, r0)
            r7 = r11
            com.instagram.service.session.UserSession r4 = r11.A01
            X.1z6 r2 = X.C35692Ol.A00(r4)
            java.lang.String r0 = "FxMultiNativeAuthTokenVerifier"
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A01(r0)
            java.lang.String r0 = "ig_android_linking_cache_fx_ac_eligibility_linkage_check"
            boolean r0 = r2.A05(r1, r0)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r11.A04()
            r8 = r14
            if (r0 == 0) goto L_0x0066
            java.util.Map r0 = r11.A02
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto L_0x0066
            int r1 = r14.hashCode()
            r0 = -1599767705(0xffffffffa0a57b67, float:-2.8033748E-19)
            if (r1 == r0) goto L_0x0063
            r0 = -664343167(0xffffffffd866ed81, float:-1.01563098E15)
            if (r1 == r0) goto L_0x0053
            r0 = 473182135(0x1c342fb7, float:5.9618674E-22)
            if (r1 != r0) goto L_0x0066
            java.lang.String r0 = "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL"
        L_0x003d:
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0066
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321546286668708(0x810a41001c1ba4, double:3.0332303545923785E-306)
        L_0x004a:
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0066
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = "IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0066
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321546286734245(0x810a41001d1ba5, double:3.0332303546338244E-306)
            goto L_0x004a
        L_0x0063:
            java.lang.String r0 = "IG_FB_PROFILE_LINK_INTEGRATION"
            goto L_0x003d
        L_0x0066:
            boolean r0 = r11.A04()
            if (r0 != 0) goto L_0x0073
            boolean r1 = r11.A06(r14)
            r0 = 1
            if (r1 != 0) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            r6 = r12
            if (r15 != 0) goto L_0x0094
            java.lang.Class<X.49S> r3 = X.AnonymousClass49S.class
            r2 = 20
            java.lang.Object r0 = X.C18180wK.A0c(r13, r3, r2)
            X.49S r0 = (X.AnonymousClass49S) r0
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "FACEBOOK"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00da
            return
        L_0x0094:
            if (r0 != 0) goto L_0x0052
            java.util.HashSet r9 = X.C18200wM.A0u()
            java.lang.String r0 = "FACEBOOK"
            r9.add(r0)
            java.lang.String r0 = "MESSENGER"
            r9.add(r0)
            X.4rS r3 = X.GQH.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36884496239624575(0x830a410015017f, double:3.3892421716591815E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r4, r0)
            int r1 = r2.hashCode()
            r0 = -841943367(0xffffffffcdd0f6b9, float:-4.38228768E8)
            if (r1 == r0) goto L_0x00d2
            r0 = 107348(0x1a354, float:1.50427E-40)
            if (r1 != r0) goto L_0x00c8
            java.lang.String r0 = "low"
            boolean r0 = r2.equals(r0)
            r10 = 4
        L_0x00c6:
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r10 = 3
        L_0x00c9:
            X.1nv r5 = new X.1nv
            r5.<init>(r6, r7, r8, r9, r10)
            r3.CwT(r5)
            return
        L_0x00d2:
            java.lang.String r0 = "anytime"
            boolean r0 = r2.equals(r0)
            r10 = 5
            goto L_0x00c6
        L_0x00da:
            java.lang.Object r5 = X.C18180wK.A0c(r13, r3, r2)
            X.49S r5 = (X.AnonymousClass49S) r5
            X.44X r0 = X.AnonymousClass44X.A00()
            X.3AB r0 = r0.A01
            if (r0 == 0) goto L_0x0101
            java.lang.String r4 = r0.A02
        L_0x00ea:
            com.instagram.service.session.UserSession r3 = r5.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36316980734856645(0x81061a00040dc5, double:3.0303430812424284E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = X.AnonymousClass49S.A00(r12, r5, r4)
            X.AnonymousClass49S.A01(r5, r0)
            return
        L_0x0101:
            r4 = 0
            goto L_0x00ea
        L_0x0103:
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1me r0 = new X.1me
            r0.<init>(r12, r5, r4)
            r1.AKp(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49Q.A03(android.content.Context, com.instagram.service.session.UserSession, java.lang.String, boolean):void");
    }

    public static final void A00(ImmutableList immutableList, AnonymousClass49Q r7, String str) {
        if (immutableList != null && !immutableList.isEmpty()) {
            IDxACallbackShape4S1100000_1_I2 iDxACallbackShape4S1100000_1_I2 = new IDxACallbackShape4S1100000_1_I2(str, r7, 2);
            C67463zb A002 = C67463zb.A00();
            A002.A06("target_accounts", immutableList);
            A002.A05("entry_point", str);
            boolean A1W = AnonymousClass0wJ.A1W(str);
            A002.A05("target_account_type", "FACEBOOK");
            A002.A05("holdout_type", "H2_2022");
            AnonymousClass7Ko.A0B(true);
            AnonymousClass7Ko.A0B(A1W);
            AnonymousClass7Ko.A0B(true);
            AnonymousClass7Ko.A0B(true);
            C32165H8c A0R = C18180wK.A0R(C67473zc.A00(A002, AnonymousClass15M.class, "FxIgCanUserSeeACUpsellMultiNativeAuthQuery"), r7.A01);
            A0R.A00 = iDxACallbackShape4S1100000_1_I2;
            C31155GhB.A03(A0R);
        }
    }

    public final boolean A04() {
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36321546286668708L) || C63803iN.A0E(r2, userSession, 36321546286734245L)) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession, String str, boolean z) {
        if (z) {
            return A06(str);
        }
        Boolean bool = (Boolean) ((AnonymousClass49S) C18180wK.A0c(userSession, AnonymousClass49S.class, 20)).A01.get("FACEBOOK");
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A06(String str) {
        Boolean bool = (Boolean) this.A03.get("FACEBOOK");
        if (A04()) {
            bool = (Boolean) this.A02.get(str);
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49Q.class);
    }

    public final ImmutableList A02(Context context) {
        HashSet A0u = C18200wM.A0u();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        UserSession userSession = this.A01;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (AnonymousClass3H2 r0 : C63693i8.A04(context, userSession, "ig_android_access_library_fx_fetch_active_msgr_token", (String) null)) {
            AnonymousClass3VA r6 = r0.A01;
            String str = r6.A00;
            C04220Ms.A06(str);
            if (str.length() != 0) {
                GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A003, str, "sensitive_string_value");
                A002.A0B(A003, "access_token");
                GraphQlCallInput.A05(A002, "ACTIVE_ACCOUNT", "account_source");
                GraphQlCallInput.A05(A002, "MESSENGER", "app_source");
                GraphQlCallInput.A05(A002, "FACEBOOK", "account_type");
                String str2 = r6.A01.A02;
                if (str2 == null) {
                    str2 = "";
                }
                A0u.add(str2);
                A0v2.add(A002);
            }
        }
        A0v.addAll(A0v2);
        return C18220wO.A0S(A0v);
    }
}
