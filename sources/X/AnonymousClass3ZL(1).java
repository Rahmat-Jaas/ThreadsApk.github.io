package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.3ZL  reason: invalid class name */
public final class AnonymousClass3ZL {
    public long A00;
    public long A01;
    public long A02;
    public final SharedPreferences A03;
    public final SharedPreferences A04;
    public final String A05 = "clips_share_to_fb_consecutive_share_count_when_enabled";
    public final String A06 = "clips_share_to_fb_reuse_original_audio";
    public final String A07 = "clips_share_to_fb_should_show_consumption_upsell";
    public final UserSession A08;
    public final String A09 = "clips_share_to_fb_enabled";
    public final String A0A = "clips_recommend_to_fb_last_changed_ms";
    public final String A0B = "clips_share_to_fb_should_show_creation_primer";

    public static SharedPreferences.Editor A00(AnonymousClass3ZL r0) {
        return r0.A04.edit();
    }

    public static final void A01(AnonymousClass3ZL r0, String str) {
        C18180wK.A0u(r0.A03.edit(), str);
    }

    public final int A02() {
        long A032 = C63803iN.A03(AnonymousClass0TJ.A05, this.A08, 36601466484100792L);
        SharedPreferences sharedPreferences = this.A04;
        if (C18180wK.A05(sharedPreferences, "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION") < A032) {
            AnonymousClass0wJ.A11(sharedPreferences.edit().putLong("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION", A032), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", 0);
        }
        return sharedPreferences.getInt("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", 0);
    }

    public final long A03() {
        return this.A04.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", this.A03.getLong(this.A0A, 0));
    }

    public final void A04(boolean z) {
        SharedPreferences sharedPreferences = this.A04;
        if (z != C18190wL.A1X(sharedPreferences, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED")) {
            C18190wL.A1X(sharedPreferences, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
            AnonymousClass0wJ.A12(sharedPreferences.edit().putBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", z), "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", System.currentTimeMillis());
            if (!z && !A09(this.A01)) {
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "PREFERENCE_REEL_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", C18200wM.A0A());
            }
            this.A01 = System.currentTimeMillis();
        }
    }

    public final void A05(boolean z) {
        if (!z) {
            AnonymousClass0wJ.A11(A00(this), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", 0);
            A01(this, this.A05);
        }
        if (z != A08()) {
            boolean A082 = A08();
            SharedPreferences sharedPreferences = this.A04;
            AnonymousClass0wJ.A12(sharedPreferences.edit().putBoolean("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", z), "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", System.currentTimeMillis());
            A01(this, this.A09);
            A01(this, "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS");
            if (A082 && !z) {
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "PREFERENCE_REEL_RECOMMEND_SETTING_LAST_DISABLED_SECONDS", C18200wM.A0A());
            }
        }
    }

    public final boolean A07() {
        return this.A04.getBoolean("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", this.A03.getBoolean(this.A0B, false));
    }

    public final boolean A08() {
        return this.A04.getBoolean("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", this.A03.getBoolean(this.A09, false));
    }

    public final boolean A09(long j) {
        if (System.currentTimeMillis() < j + (C63803iN.A03(AnonymousClass0TJ.A05, this.A08, 36607045646160513L) * ((long) 1000))) {
            return true;
        }
        return false;
    }

    public AnonymousClass3ZL(UserSession userSession) {
        this.A08 = userSession;
        this.A04 = AnonymousClass3Zs.A03(userSession).A02(D2R.A0i, getClass());
        this.A03 = AnonymousClass3Zs.A03(userSession).A01(D2R.A2Z);
    }

    public final void A06(boolean z) {
        AnonymousClass0wJ.A13(A00(this), "PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", z);
        A01(this, this.A0B);
    }
}
