package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3hR  reason: invalid class name and case insensitive filesystem */
public final class C63413hR {
    public static final long A00 = TimeUnit.DAYS.toMillis(30);

    public static C32165H8c A03(UserSession userSession, Integer num, String str, String str2, String str3) {
        int indexOf = str2.indexOf(95);
        if (indexOf > 0) {
            str2 = str2.substring(0, indexOf);
        }
        H1T A0O = C18180wK.A0O(userSession);
        AnonymousClass3OR.A01(A0O, userSession, num, C18180wK.A0j("third_party_sharing/%s/%s/get_story_item_url/", new Object[]{str, str2}), str3);
        return AnonymousClass0wJ.A0T(A0O, C21781Sd.class, AnonymousClass3OQ.class);
    }

    public static C32165H8c A00(BKU bku, UserSession userSession, Integer num, String str) {
        H1T A0O = C18180wK.A0O(userSession);
        BKN bkn = bku.A0f;
        AnonymousClass3OR.A01(A0O, userSession, num, C18180wK.A0j("media/%s/permalink/", new Object[]{bkn.A4Y}), str);
        A0O.A0P("logging_info_token", bkn.A4h);
        A0O.A0P(I17.A00(271), bkn.A4e);
        A0O.A0H(Integer.valueOf(bku.Aup().A00), "m_t");
        return AnonymousClass0wJ.A0T(A0O, C21761Sb.class, AnonymousClass3ON.class);
    }

    public static C32165H8c A01(UserSession userSession, Integer num, String str, String str2, String str3) {
        H1T A0O = C18180wK.A0O(userSession);
        AnonymousClass3OR.A01(A0O, userSession, num, C18180wK.A0j("third_party_sharing/%s/get_story_highlights_to_share_url/", new Object[]{str}), str3);
        if (str2 != null) {
            A0O.A0O("media_id", str2);
        }
        return AnonymousClass0wJ.A0T(A0O, AnonymousClass1SY.class, AnonymousClass3OI.class);
    }

    public static C32165H8c A02(UserSession userSession, Integer num, String str, String str2, String str3) {
        H1T A0O = C18180wK.A0O(userSession);
        AnonymousClass3OR.A01(A0O, userSession, num, C18180wK.A0j("third_party_sharing/%s/live/%s/get_live_url/", new Object[]{str, str2}), str3);
        return AnonymousClass0wJ.A0T(A0O, AnonymousClass1SZ.class, AnonymousClass3OK.class);
    }

    public static String A04(UserSession userSession) {
        return C18200wM.A0j(AnonymousClass3WS.A01(userSession).A02);
    }

    public static boolean A05(UserSession userSession) {
        long j = C28161tl.A04(userSession).getLong("external_sharing_experiment_exposure_timestamp", 0);
        if (j <= 0 || C18240wQ.A09(j) > A00) {
            return false;
        }
        return true;
    }
}
