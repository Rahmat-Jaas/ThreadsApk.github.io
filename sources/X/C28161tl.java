package X;

import android.content.SharedPreferences;
import android.util.LruCache;
import com.google.gson.Gson;
import com.instagram.common.gallery.Medium;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IDxLambdaShape52S1100000_I2;

/* renamed from: X.1tl  reason: invalid class name and case insensitive filesystem */
public final class C28161tl extends C08390dI {
    public final SharedPreferences A00;
    public final C08410dK A01 = C08390dI.A00(this, "blacklist_search_ids");
    public final C08410dK A02 = C08390dI.A00(this, "external_sharing_universe_name");
    public final C08410dK A03 = A0A("has_flash_on", "off");
    public final C08410dK A04 = A0A("fx_account_center_info", "");
    public final C08410dK A05 = A0A("fx_linkage_cache_switcher", "");
    public final C08410dK A06 = A0B("suggested_users_shuffle_button_tooltip_shown", false);
    public final C08410dK A07 = A05(this, "recent_map_items_last_synced_timestamp_ms");
    public final C08410dK A08 = A05(this, "recent_items_last_sycned_timestamp_ms");
    public final C08410dK A09 = A05(this, "notification_last_received");
    public final C08410dK A0A = C08390dI.A00(this, "recent_audio_searches_with_ts");
    public final C08410dK A0B = C08390dI.A00(this, "recent_effect_searches");
    public final C08410dK A0C = C08390dI.A00(this, "recent_hashtag_searches_with_ts");
    public final C08410dK A0D = C08390dI.A00(this, "recent_keyword_searches_with_ts");
    public final C08410dK A0E = C08390dI.A00(this, "recent_map_hashtag_searches_with_ts");
    public final C08410dK A0F = C08390dI.A00(this, "recent_map_location_searches_with_ts");
    public final C08410dK A0G = C08390dI.A00(this, "recent_map_query_searches_with_ts");
    public final C08410dK A0H = C08390dI.A00(this, "recent_place_searces");
    public final C08410dK A0I = C08390dI.A00(this, "recent_shopping_product_keywords_with_ts");
    public final C08410dK A0J = C08390dI.A00(this, "recent_shopping_seller_accounts_with_ts");
    public final C08410dK A0K = C08390dI.A00(this, "recent_user_searches");
    public final C08410dK A0L = C08390dI.A00(this, "recent_user_searches_with_ts");
    public final C08410dK A0M = C08390dI.A00(this, "recent_tagged_users");
    public final C08410dK A0N = A0A("key_recently_uploaded_media", "");
    public final C08410dK A0O = A05(this, "recent_shopping_items_last_synced_timestamp_ms");

    public static C08410dK A05(C08390dI r3, String str) {
        return new C08410dK(new IDxLambdaShape52S1100000_I2(r3, str, 0), new AnonymousClass034(r3, str, false));
    }

    public final void A0L(UserSession userSession, boolean z) {
        SharedPreferences.Editor A022;
        String str;
        C04220Ms.A0B(userSession, 0);
        int ordinal = C04660Oo.A01(userSession).ordinal();
        if (ordinal == 1) {
            A022 = A02(this);
            str = "personal_account_fb_page_id_backfilling_completed";
        } else if (ordinal == 3) {
            A022 = A02(this);
            str = "creator_account_fb_destination_backfilling_completed";
        } else {
            return;
        }
        AnonymousClass0wJ.A13(A022, str, z);
    }

    public final void A0M(String str, boolean z) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A13(A02(this), AnonymousClass00U.A0L(str, "_limit_location_enabled"), z);
    }

    public final boolean A0R(String str) {
        return this.A00.getBoolean(AnonymousClass00U.A0L(str, "_limit_location_enabled"), false);
    }

    public static SharedPreferences.Editor A02(C28161tl r0) {
        return r0.A00.edit();
    }

    public static String A06(C28161tl r0, String str, String str2) {
        String string = r0.A00.getString(str, str2);
        C04220Ms.A06(string);
        return string;
    }

    public static final void A07(C28161tl r3, List list) {
        C18180wK.A0v(A02(r3), "m21_eligible_media_ids", C18220wO.A0p(list));
    }

    public final SharedPreferences A0C() {
        return this.A00;
    }

    public final long A0D() {
        SharedPreferences sharedPreferences = this.A00;
        int i = sharedPreferences.getInt("take_a_break_nudge_last_seen_count", 0);
        long j = sharedPreferences.getLong(AnonymousClass00U.A0J("take_a_break_nudge_last_seen_time_prefix_", i - 1), 0);
        if (i <= 0 || j != 0) {
            return j;
        }
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "take_a_break_nudge_last_seen_count", 0);
        return 0;
    }

    public final LruCache A0E() {
        LruCache A002;
        String string = this.A00.getString("auto_created_clips_source_medium_cache", (String) null);
        if (string != null) {
            try {
                AbstractMap abstractMap = (AbstractMap) new Gson().A07(string, new AnonymousClass1QX().type);
                if (!(abstractMap == null || (A002 = C34962Lo.A00()) == null)) {
                    boolean z = false;
                    Iterator A0u = C18190wL.A0u(abstractMap);
                    while (A0u.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0u);
                        Object key = A0o.getKey();
                        Medium medium = (Medium) A0o.getValue();
                        if (!new File(medium.A0T).exists() || !new File(medium.A0T).exists()) {
                            z = true;
                        } else {
                            A002.put(key, medium);
                        }
                    }
                    if (z) {
                        A0K(A002);
                    }
                    return A002;
                }
            } catch (IllegalStateException unused) {
                C10450iM.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
            } catch (LWW unused2) {
                C10450iM.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
                return null;
            }
        }
        return null;
    }

    public final String A0F() {
        return this.A00.getString("basic_ads_tier", C35334Ist.BASIC_ADS_TIER_NONE.toString());
    }

    public final HashMap A0G() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String A0W = C18250wR.A0W(this.A00, "nudge_tracker_map");
        if (A0W == null || C18180wK.A1W(A0W.length())) {
            C18180wK.A0v(A02(this), "nudge_tracker_map", C18220wO.A0p(A0y));
        } else {
            try {
                HashMap hashMap = (HashMap) new Gson().A06(A0W, A0y.getClass());
                if (hashMap != null) {
                    return hashMap;
                }
            } catch (LWW | IllegalStateException unused) {
                C10450iM.A03("UserPreferences", "Corrupted Nudge Tracker Map Data");
                return A0y;
            }
        }
        return A0y;
    }

    public final Set A0H(String str) {
        Set<String> stringSet = this.A00.getStringSet(AnonymousClass00U.A0L(str, "_limit_location_list"), C18200wM.A0u());
        C04220Ms.A06(stringSet);
        return stringSet;
    }

    public final void A0J(long j) {
        SharedPreferences sharedPreferences = this.A00;
        int A042 = C18190wL.A04(sharedPreferences, "take_a_break_nudge_last_seen_count");
        AnonymousClass0wJ.A12(sharedPreferences.edit(), AnonymousClass00U.A0J("take_a_break_nudge_last_seen_time_prefix_", A042), j);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "take_a_break_nudge_last_seen_count", A042 + 1);
    }

    public final void A0O(boolean z) {
        SharedPreferences sharedPreferences = this.A00;
        AnonymousClass0wJ.A13(sharedPreferences.edit(), C28174Ezk.A00(34), z);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "presence_last_set", System.currentTimeMillis());
    }

    public final boolean A0P() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences.contains("checkout_awareness_interstitial_shown_count_pdp") || sharedPreferences.contains("checkout_awareness_interstitial_shown_count_drops_pdp") || sharedPreferences.contains("checkout_awareness_interstitial_shown_count_shop_home") || sharedPreferences.contains("checkout_awareness_interstitial_shown_count_shopping_bag")) {
            AnonymousClass0wJ.A13(sharedPreferences.edit(), "has_shown_checkout_awareness_interstitial", true);
            C18180wK.A0u(sharedPreferences.edit(), "checkout_awareness_interstitial_shown_count_pdp");
            C18180wK.A0u(sharedPreferences.edit(), "checkout_awareness_interstitial_shown_count_drops_pdp");
            C18180wK.A0u(sharedPreferences.edit(), "checkout_awareness_interstitial_shown_count_shop_home");
            C18180wK.A0u(sharedPreferences.edit(), "checkout_awareness_interstitial_shown_count_shopping_bag");
            C18180wK.A0u(sharedPreferences.edit(), "checkout_awareness_interstitial_last_shown_time_ms");
        }
        return sharedPreferences.getBoolean("has_shown_checkout_awareness_interstitial", false);
    }

    public final boolean A0Q() {
        SharedPreferences sharedPreferences = this.A00;
        boolean A1X = C18190wL.A1X(sharedPreferences, "quick_capture_open_with_front_camera");
        if (A1X) {
            if (!sharedPreferences.getBoolean("quick_capture_front_camera", true)) {
                AnonymousClass0wJ.A13(A02(this), "quick_capture_front_camera", true);
            }
            String A002 = C28174Ezk.A00(73);
            if (!sharedPreferences.getBoolean(A002, true)) {
                AnonymousClass0wJ.A13(sharedPreferences.edit(), A002, true);
            }
        }
        return A1X;
    }

    public C28161tl(UserSession userSession) {
        this.A00 = AnonymousClass3Zs.A03(userSession).A02(D2R.A2Z, C28161tl.class);
    }

    public static SharedPreferences.Editor A03(UserSession userSession) {
        return AnonymousClass3WS.A01(userSession).A00.edit();
    }

    public static SharedPreferences A04(UserSession userSession) {
        return AnonymousClass3WS.A01(userSession).A00;
    }

    public final void A0I() {
        AnonymousClass0wJ.A13(A02(this), "has_used_shopping_bag", true);
    }

    public final void A0K(LruCache lruCache) {
        C18180wK.A0v(A02(this), "auto_created_clips_source_medium_cache", C18220wO.A0p(lruCache.snapshot()));
    }

    public final void A0N(boolean z) {
        AnonymousClass0wJ.A13(A02(this), "allow_contacts_sync", z);
    }
}
