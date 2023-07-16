package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.3RI  reason: invalid class name */
public final class AnonymousClass3RI {
    public static boolean A00;

    public static final boolean A00(AnonymousClass2AC r30, UserSession userSession) {
        AnonymousClass29W r6;
        AnonymousClass14U A002;
        String str;
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession2);
        SharedPreferences sharedPreferences = A03.A04;
        if (!sharedPreferences.getBoolean("PREFERENCE_BYPASS_XAR_CCP_MIGRATION_UPSELL_COOLDOWNS", false)) {
            AnonymousClass2AD r3 = AnonymousClass2AD.A0E;
            AnonymousClass2AC r8 = r30;
            if (C63423hS.A03(r8, r3, userSession2)) {
                long j = sharedPreferences.getLong("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", 0);
                long A032 = A03.A03();
                long j2 = sharedPreferences.getLong("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0);
                long j3 = sharedPreferences.getLong("PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0);
                long j4 = sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0);
                long j5 = sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0);
                long j6 = sharedPreferences.getLong("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS", 0);
                int i = sharedPreferences.getInt("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", 0);
                long currentTimeMillis = System.currentTimeMillis();
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                long j7 = currentTimeMillis - A032;
                if (C63803iN.A03(r2, userSession2, 36607011286553212L) * 86400000 > j7) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:xar_setting_change";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286487675L) * 86400000 > currentTimeMillis - j) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:ccp_setting_change";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286225527L) * 86400000 > currentTimeMillis - j3 || C63803iN.A03(r2, userSession2, 36607011286225527L) * 86400000 > j7) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:xar_upsell_view";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286422138L) * 86400000 > currentTimeMillis - j2) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:ccp_upsell_view";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286422138L) * 86400000 > currentTimeMillis - j4) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:simplification_upsell_view";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286422138L) * 86400000 > currentTimeMillis - j5) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "custom_cooldown:simplification_upsell_v15_view";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286356601L) * 86400000 > currentTimeMillis - j6) {
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "upsell_self_cooldown";
                    }
                } else if (C63803iN.A03(r2, userSession2, 36607011286291064L) <= ((long) i)) {
                    C63803iN.A03(r2, userSession2, 36607011286291064L);
                    if (A01(userSession2)) {
                        r6 = AnonymousClass29W.SUPPRESS;
                        A002 = AnonymousClass14U.A00();
                        str = "impression_limit";
                    }
                }
                A002.A0A("suppress_reason", str);
                C49322rC.A00(r8, r6, r3, A002, userSession2);
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        return C63803iN.A0E(C18180wK.A0J(userSession), userSession, 2342168545523672199L);
    }
}
