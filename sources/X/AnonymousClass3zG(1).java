package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.IDxACallbackShape0S1300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.CrosspostingUnifiedConfigsQueryResponseImpl;
import com.instagram.share.facebook.graphql.XpostingUnifiedConfigCrosspostingSettingImpl;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11;

/* renamed from: X.3zG  reason: invalid class name */
public final class AnonymousClass3zG implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A00(AnonymousClass3zG.class);
    public static final String __redex_internal_original_name = "FacebookCrosspostingSettingFetcher";
    public AnonymousClass36X A00;
    public final UserSession A01;
    public final C67263zF A02;
    public final C695949f A03;
    public final C67233zC A04;

    public AnonymousClass3zG(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new C67263zF(userSession);
        this.A04 = new C67233zC(userSession, (C83824s3) null);
        this.A03 = C49252r5.A00(userSession);
    }

    public static final CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs A00(AnonymousClass21C r5, CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot xcxpUnifiedCrosspostingConfigsRoot) {
        if (xcxpUnifiedCrosspostingConfigsRoot != null) {
            Class<CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs> cls = CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs.class;
            if (xcxpUnifiedCrosspostingConfigsRoot.getTreeList("account_linking_configs", cls) != null) {
                C1366783w A0G = C18250wR.A0G(xcxpUnifiedCrosspostingConfigsRoot, cls, "account_linking_configs");
                while (A0G.hasNext()) {
                    CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs accountLinkingConfigs = (CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs) A0G.next();
                    if (accountLinkingConfigs.getEnumValue("destination_app", AnonymousClass21C.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r5) {
                        return accountLinkingConfigs;
                    }
                }
            }
        }
        return null;
    }

    public static final void A03(AnonymousClass3zG r5, String str, boolean z, boolean z2) {
        if (z) {
            UserSession userSession = r5.A01;
            boolean A002 = C62183Xq.A00(userSession);
            USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
            C18230wP.A1G(A0O, "server_setting_fetch_failed");
            AnonymousClass0wJ.A1C(A0O, str, (String) null, A002, false);
            A0O.Bb4();
        }
        if (z2) {
            UserSession userSession2 = r5.A01;
            AnonymousClass3WY.A01(userSession2, str, "server_setting_fetch_failed", (String) null, C61453Tm.A00(userSession2));
        }
        UserSession userSession3 = r5.A01;
        AnonymousClass3WY.A00(userSession3, str, "server_setting_fetch_failed", (String) null, C18190wL.A1X(AnonymousClass3Zu.A03(userSession3).A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"));
    }

    public final void A04(boolean z, String str, boolean z2, boolean z3) {
        boolean A052;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        if (z3) {
            C695949f r4 = this.A03;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0101000_I2_11(r4, (C146958n9) null, 19), r4.A03, 3);
        }
        C04180Mo r7 = new C04180Mo();
        boolean z4 = z;
        r7.A00 = z4;
        C04180Mo r42 = new C04180Mo();
        boolean z5 = z2;
        r42.A00 = z5;
        if (z4 != z5) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 2342171324367055220L)) {
                r7.A00 = true;
                r42.A00 = true;
            }
        }
        AnonymousClass266 r1 = AnonymousClass266.A04;
        UserSession userSession = this.A01;
        if (r1 != C04660Oo.A01(userSession)) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342171324366989683L)) {
                A052 = C67373zR.A08(userSession);
            } else {
                A052 = C35692Ol.A00(userSession).A05(A05, "ig_to_fb_setting_fetch");
            }
            if (!A052) {
                C62183Xq r3 = C67263zF.A03;
                if (C62183Xq.A00(userSession) || C61453Tm.A00(userSession)) {
                    r3.A02(userSession, AnonymousClass00U.A0L(str2, ":linking_reset"), false, false);
                    UserSession userSession2 = userSession;
                    C67233zC.A08.A01(userSession2, AnonymousClass006.A00, AnonymousClass00U.A0L(str2, ":linking_reset"), false, false);
                    return;
                }
                return;
            }
        }
        if (r7.A00) {
            boolean A002 = C62183Xq.A00(userSession);
            USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
            C18180wK.A1F(A0O, "server_setting_fetch_attempt", str2, A002, false);
            A0O.Bb4();
        }
        if (r42.A00) {
            boolean A003 = C61453Tm.A00(userSession);
            USLEBaseShape0S0000000 A0M = C18230wP.A0M(userSession);
            C18180wK.A1F(A0M, "server_setting_fetch_attempt", str2, A003, false);
            A0M.Bb4();
        }
        boolean A1X = C18190wL.A1X(AnonymousClass3Zu.A03(userSession).A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
        USLEBaseShape0S0000000 A042 = USLEBaseShape0S0000000.A04(C13330nS.A02(userSession));
        A042.A0T("flow_name", "ig_reels_share_to_fb");
        C18180wK.A1F(A042, "server_setting_fetch_attempt", str2, A1X, false);
        A042.Bb4();
        if (C49312rB.A00(userSession)) {
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            ImmutableList.Builder builder = ImmutableList.builder();
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A005, "FB", "destination_app");
            GraphQlCallInput.A05(A005, "STORY", "destination_surface");
            GraphQlCallInput.A05(A005, "STORY", "source_surface");
            GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A006, "FB", "destination_app");
            GraphQlCallInput.A05(A006, "FEED", "destination_surface");
            GraphQlCallInput.A05(A006, "FEED", "source_surface");
            builder.add((Object) A005);
            builder.add((Object) A006);
            GQLCallInputCInputShape0S0000000 A007 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A007, "FB", "destination_app");
            GraphQlCallInput.A05(A007, "REELS", "destination_surface");
            GraphQlCallInput.A05(A007, "REELS", "source_surface");
            builder.add((Object) A007);
            A004.A0A("crosspost_app_surface_list", builder.build());
            GraphQlCallInput.A05(A004, "IG", "source_app");
            C57553Bn r12 = new C57553Bn(this, str2, r7, r42);
            C31580Grx A012 = AnonymousClass3WK.A01(userSession);
            C67463zb A008 = C67463zb.A00();
            C67463zb A009 = C67463zb.A00();
            A008.A02(A004, "configs_request");
            C18250wR.A12(new PandoGraphQLRequest(C63233h2.A04(true), "CrosspostingUnifiedConfigsQuery", GraphQlCallInput.A03(A008), GraphQlCallInput.A03(A009), CrosspostingUnifiedConfigsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_unified_crossposting_configs_root"), A012, r12, 13);
            return;
        }
        H1T A0P = C18180wK.A0P(userSession);
        C18220wO.A1K(A0P, "ig_fb_xposting/user_setting/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C22161Tp.class, C60353Or.class);
        A0T.A00 = new IDxACallbackShape0S1300000_1_I2(this, r42, r7, str2, 1);
        C31155GhB.A05(A0T, 763, 3, true, true);
    }

    public static final XpostingUnifiedConfigCrosspostingSettingImpl A01(AnonymousClass22R r4, CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs accountLinkingConfigs) {
        if (accountLinkingConfigs == null) {
            return null;
        }
        C1366783w A0G = C18250wR.A0G(accountLinkingConfigs, CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs.CrosspostSettings.class, "crosspost_settings");
        while (A0G.hasNext()) {
            XpostingUnifiedConfigCrosspostingSettingImpl xpostingUnifiedConfigCrosspostingSettingImpl = (XpostingUnifiedConfigCrosspostingSettingImpl) ((TreeJNI) A0G.next()).reinterpret(XpostingUnifiedConfigCrosspostingSettingImpl.class);
            C04220Ms.A06(xpostingUnifiedConfigCrosspostingSettingImpl);
            if (xpostingUnifiedConfigCrosspostingSettingImpl.getEnumValue("source_surface", AnonymousClass22R.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r4) {
                return xpostingUnifiedConfigCrosspostingSettingImpl;
            }
        }
        return null;
    }

    public static final XpostingUnifiedConfigCrosspostingSettingImpl A02(AnonymousClass22R r4, CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs accountLinkingConfigs) {
        if (accountLinkingConfigs == null) {
            return null;
        }
        C1366783w A0G = C18250wR.A0G(accountLinkingConfigs, CrosspostingUnifiedConfigsQueryResponseImpl.XcxpUnifiedCrosspostingConfigsRoot.AccountLinkingConfigs.CloseFriendsXpostSettings.class, "close_friends_xpost_settings");
        while (A0G.hasNext()) {
            XpostingUnifiedConfigCrosspostingSettingImpl xpostingUnifiedConfigCrosspostingSettingImpl = (XpostingUnifiedConfigCrosspostingSettingImpl) ((TreeJNI) A0G.next()).reinterpret(XpostingUnifiedConfigCrosspostingSettingImpl.class);
            C04220Ms.A06(xpostingUnifiedConfigCrosspostingSettingImpl);
            if (xpostingUnifiedConfigCrosspostingSettingImpl.getEnumValue("source_surface", AnonymousClass22R.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r4) {
                return xpostingUnifiedConfigCrosspostingSettingImpl;
            }
        }
        return null;
    }
}
