package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.3hM  reason: invalid class name and case insensitive filesystem */
public final class C63363hM {
    public static final int A00(C28161tl r3, C306522j r4) {
        SharedPreferences sharedPreferences;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r4);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            sharedPreferences = r3.A00;
            str = "feed_xpost_user_migration_upsell_display_count";
        } else if (ordinal == A1Z) {
            sharedPreferences = r3.A00;
            str = "feed_xpost_user_migration_upsell_second_wave_display_count";
        } else if (ordinal == 2) {
            sharedPreferences = r3.A00;
            str = "story_xpost_user_migration_upsell_display_count";
        } else if (ordinal == 3) {
            sharedPreferences = r3.A00;
            str = "story_xpost_user_migration_upsell_second_wave_display_count";
        } else if (ordinal == 4) {
            sharedPreferences = r3.A00;
            str = "xpost_unified_onboarding_upsell_display_count";
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return sharedPreferences.getInt(str, 0);
    }

    public static final long A01(C28161tl r3, C306522j r4) {
        SharedPreferences sharedPreferences;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r4);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            sharedPreferences = r3.A00;
            str = "feed_xpost_user_migration_upsell_last_seen_sec";
        } else if (ordinal == A1Z) {
            sharedPreferences = r3.A00;
            str = "feed_xpost_user_migration_upsell_second_wave_last_seen_sec";
        } else if (ordinal == 2) {
            sharedPreferences = r3.A00;
            str = "story_xpost_user_migration_upsell_last_seen_sec";
        } else if (ordinal == 3) {
            sharedPreferences = r3.A00;
            str = "story_xpost_user_migration_upsell_second_wave_last_seen_sec";
        } else if (ordinal == 4) {
            sharedPreferences = r3.A00;
            str = "xpost_unified_onboarding_upsell_last_seen_sec";
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return C18180wK.A04() - C18180wK.A05(sharedPreferences, str);
    }

    public static final boolean A02(AnonymousClass2AC r7, C28161tl r8, UserSession userSession, C306522j r10) {
        int A02 = C18200wM.A02(1, r8, r10);
        if (A04(r7, userSession)) {
            return true;
        }
        int A00 = A00(r8, r10);
        int ordinal = r10.ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != A02) {
                    if (!(ordinal == 3 || ordinal == 4)) {
                        throw AnonymousClass4VZ.A00();
                    }
                }
            }
            i = 3;
        }
        if (A00 >= i) {
            return false;
        }
        return true;
    }

    public static final boolean A03(AnonymousClass2AC r10, C28161tl r11, UserSession userSession, C306522j r13) {
        Long valueOf;
        int A02 = C18200wM.A02(1, r11, r13);
        long A01 = A01(r11, r13);
        if (A04(r10, userSession)) {
            valueOf = C63803iN.A07(AnonymousClass0TJ.A05, userSession, 36604219557482753L);
        } else {
            int ordinal = r13.ordinal();
            long j = 168;
            if (!(ordinal == 0 || ordinal == 1 || ordinal == A02 || ordinal == 3)) {
                if (ordinal == 4) {
                    j = 504;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
            }
            valueOf = Long.valueOf(j);
        }
        if (A01 >= valueOf.longValue() * 3600) {
            return false;
        }
        return true;
    }

    public static final boolean A04(AnonymousClass2AC r2, UserSession userSession) {
        C04220Ms.A0B(r2, 1);
        if ((r2 == AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON || r2 == AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36322744580709855L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (C61453Tm.A00(userSession) || C62183Xq.A00(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        boolean A00 = C61453Tm.A00(userSession);
        if (z) {
            if (A00 || !C62183Xq.A00(userSession)) {
                return false;
            }
            return true;
        } else if (!A00 || C62183Xq.A00(userSession)) {
            return false;
        } else {
            return true;
        }
    }
}
