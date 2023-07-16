package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.49f  reason: invalid class name and case insensitive filesystem */
public final class C695949f implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "ReelsShareToFbSettingsRepository";
    public final AnonymousClass3V6 A00;
    public final UserSession A01;
    public final AnonymousClass3ZL A02;
    public final C83224qz A03;
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final C86094wG A09;
    public final CallerContext A0A = CallerContext.A00(C695949f.class);
    public final C82394pY A0B;
    public final C695649c A0C;

    public final void A04(boolean z) {
        boolean A1X = C18190wL.A1X(this.A02.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
        A03(z);
        AnonymousClass4f0 r5 = AnonymousClass4f0.A00;
        KtLambdaShape4S0110000_I2 ktLambdaShape4S0110000_I2 = new KtLambdaShape4S0110000_I2(31, this, A1X);
        USLEBaseShape0S0000000 A042 = USLEBaseShape0S0000000.A04(C18220wO.A0W(this.A01));
        A042.A0T("flow_name", "ig_reels_share_to_fb");
        C18230wP.A1G(A042, "server_setting_update_attempt");
        C18250wR.A0w(A042, C18190wL.A0Z(A042, "xposting_setting_location", "reels", z));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0311000_I2(ktLambdaShape4S0110000_I2, r5, this, (C146958n9) null, 17, z), this.A03, 3);
    }

    public static final void A00(C695949f r4, AnonymousClass3CW r5) {
        AnonymousClass3ZL A032 = AnonymousClass3Zu.A03(r4.A01);
        A032.A05(r5.A00);
        A032.A06(r5.A03);
        boolean z = r5.A04;
        SharedPreferences sharedPreferences = A032.A04;
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_SHOULD_SHOW_CONSUMPTION_UPSELL", z);
        AnonymousClass3ZL.A01(A032, A032.A07);
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_REUSE_ORIGINAL_AUDIO", r5.A01);
        AnonymousClass3ZL.A01(A032, A032.A06);
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_INCENTIVES_CREATION_PRIMER", r5.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r0 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r1 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r1 = X.C306822m.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r5 = (X.AnonymousClass24X) X.AnonymousClass24X.A01.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r5 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r5 = X.AnonymousClass24X.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r7 = X.C67373zR.A00(r3);
        r8 = X.C67373zR.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r4 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r9 = r4.getStringValue("destination_profile_url_link");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        return new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2(r5, r6, r7, r8, r9, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 A01() {
        /*
            r11 = this;
            com.instagram.service.session.UserSession r3 = r11.A01
            boolean r0 = X.C67343zO.A04(r3)
            if (r0 == 0) goto L_0x007c
            X.49c r5 = r11.A0C
            X.49H r4 = r5.A01
            com.facebook.common.callercontext.CallerContext r2 = r5.A00
            java.lang.String r1 = "CROSS_POSTING_SETTING"
            java.util.List r0 = X.C18180wK.A0n(r1)
            java.util.Map r0 = r4.A00(r2, r0)
            java.lang.Object r1 = r0.get(r1)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "CrossPostingCustomClientServiceData"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl$InlineCrossPostingCustomClientServiceData> r0 = com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x007a
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl$InlineCrossPostingCustomClientServiceData$FbReelsPrivacySettingServiceData> r1 = com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.FbReelsPrivacySettingServiceData.class
            java.lang.String r0 = "fb_reels_privacy_setting_service_data"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
        L_0x0038:
            com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl$InlineCrossPostingCustomClientServiceData$DestinationMetadataServiceData r4 = r5.A01()
            r9 = 0
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = "privacy_option_name"
            java.lang.String r6 = r0.getStringValue(r1)
            if (r6 != 0) goto L_0x004b
        L_0x0047:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0055
        L_0x004b:
            X.22m r2 = X.C306822m.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "fb_reels_audience"
            java.lang.Enum r1 = r0.getEnumValue(r1, r2)
            if (r1 != 0) goto L_0x0057
        L_0x0055:
            X.22m r1 = X.C306822m.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x0057:
            java.util.Map r0 = X.AnonymousClass24X.A01
            java.lang.Object r5 = r0.get(r1)
            X.24X r5 = (X.AnonymousClass24X) r5
            if (r5 != 0) goto L_0x0063
            X.24X r5 = X.AnonymousClass24X.A07
        L_0x0063:
            r10 = 1
            java.lang.String r7 = X.C67373zR.A00(r3)
            java.lang.String r8 = X.C67373zR.A01(r3)
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = "destination_profile_url_link"
            java.lang.String r9 = r4.getStringValue(r0)
        L_0x0074:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2
            r4.<init>((X.AnonymousClass24X) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (boolean) r10)
            return r4
        L_0x007a:
            r0 = 0
            goto L_0x0038
        L_0x007c:
            X.4wE r0 = r11.A05
            java.lang.Object r4 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C695949f.A01():com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2");
    }

    public final void A02() {
        if (C67343zO.A04(this.A01)) {
            if (C18190wL.A08(this.A09.getValue()) != 0) {
                C695649c r1 = this.A0C;
                AnonymousClass49H r0 = r1.A01;
                Object obj = r0.A00.A01(r1.A00, "ig_android_service_cache_crossposting_setting", C18180wK.A0n("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
                if (obj != null && !obj.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                    return;
                }
            }
            this.A0C.A04((C83804s1) null, "reels", "REELS");
        } else if (C18190wL.A08(this.A06.getValue()) == 0) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0101000_I2_11(this, (C146958n9) null, 17), this.A03, 3);
        }
    }

    public final void A03(boolean z) {
        this.A02.A04(z);
        C86074wE.A01(this.A04, z);
    }

    public final void onSessionWillEnd() {
        AnonymousClass3LY.A00(this.A01).A02(this.A0B, AnonymousClass463.class);
    }

    public C695949f(AnonymousClass3V6 r6, UserSession userSession, C83224qz r8) {
        this.A01 = userSession;
        this.A03 = r8;
        this.A00 = r6;
        AnonymousClass3ZL A032 = AnonymousClass3Zu.A03(userSession);
        this.A02 = A032;
        C695649c A002 = C49222r2.A00(userSession);
        this.A0C = A002;
        Object valueOf = Boolean.valueOf(C18190wL.A1X(A032.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"));
        C27457Enn A0z = C18190wL.A0z(valueOf == null ? DIV.A01 : valueOf);
        this.A04 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(DIV.A01);
        this.A05 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(C18210wN.A0V());
        this.A06 = A0z3;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
        this.A08 = C18230wP.A0x((C148838sG) null, A0z2);
        this.A09 = C67343zO.A04(userSession) ? A002.A04 : A0z3;
        IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 76);
        this.A0B = A0P;
        AnonymousClass3LY.A00(userSession).A01(A0P, AnonymousClass463.class);
    }
}
