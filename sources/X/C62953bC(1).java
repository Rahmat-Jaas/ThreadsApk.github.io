package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3bC  reason: invalid class name and case insensitive filesystem */
public final class C62953bC {
    public static final int A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return AnonymousClass3Zs.A03(userSession).A01(D2R.A0v).getInt("invite_suggestions", -1);
    }

    public static final boolean A04(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return AnonymousClass3Zs.A03(userSession).A01(D2R.A0v).getBoolean("cal_migration_show_destination_picker", false);
    }

    public static final String A01(UserSession userSession) {
        String A02 = A02(userSession, "page_access_token");
        long currentTimeMillis = System.currentTimeMillis() - C28161tl.A04(userSession).getLong("xposting_page_access_token_last_saved_ms", -1);
        if (A02.length() != 0 && C60413Oy.A01(userSession, currentTimeMillis)) {
            C18180wK.A0v(C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A0v), "page_access_token", "");
            AnonymousClass0wJ.A12(C28161tl.A03(userSession), "xposting_page_access_token_last_saved_ms", System.currentTimeMillis());
            C60413Oy.A00(userSession, "clear_stale_destination_page_token", currentTimeMillis);
        }
        return A02(userSession, "page_access_token");
    }

    public static final String A02(UserSession userSession, String str) {
        String string = AnonymousClass3Zs.A03(userSession).A01(D2R.A0v).getString(str, "");
        C04220Ms.A06(string);
        return string;
    }

    public static final void A03(UserSession userSession, boolean z) {
        AnonymousClass0wJ.A13(AnonymousClass3Zs.A00(userSession), "cal_migration_show_destination_picker", z);
    }
}
