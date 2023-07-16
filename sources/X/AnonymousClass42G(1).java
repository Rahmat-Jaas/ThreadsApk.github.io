package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.42G  reason: invalid class name */
public final class AnonymousClass42G implements C33788HuV {
    public final UserSession A00;

    public AnonymousClass42G(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final String getFilenamePrefix() {
        return "fan_club_data";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "FanClubBugReportLogsProvider";
    }

    public final String getContentInBackground(Context context) {
        Boolean bool;
        JSONObject A0y = C18230wP.A0y();
        User A01 = C06810aP.A01.A01(this.A00);
        C84624tY A0I = A01.A0I();
        Boolean bool2 = null;
        if (A0I == null) {
            return null;
        }
        A0y.put("fan_club_id", A0I.AhE());
        A0y.put("is_fan_club_referral_eligible", A0I.BTr());
        A0y.put("is_fan_club_gifting_eligible", A0I.BTp());
        A0y.put("fan_consideration_page_revamp_eligiblity", A0I.AhI());
        C84034sR AhI = A0I.AhI();
        if (AhI != null) {
            bool = Boolean.valueOf(AhI.BBN());
        } else {
            bool = null;
        }
        A0y.put("should_show_content_preview", bool);
        C84034sR AhI2 = A0I.AhI();
        if (AhI2 != null) {
            bool2 = Boolean.valueOf(AhI2.BBW());
        }
        A0y.put("should_show_social_context", bool2);
        A0y.put("has_exclusive_feed_content", C04220Ms.A0I(A01.A05.Alk(), C18180wK.A0Y()));
        A0y.put("has_fan_club_subscriptions", A01.A35());
        return A0y.toString();
    }
}
