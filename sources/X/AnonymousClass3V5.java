package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.3V5  reason: invalid class name */
public final class AnonymousClass3V5 {
    public C145538kf A00;
    public UserSession A01;

    public static String A00(AnonymousClass3V5 r4) {
        UserSession userSession = r4.A01;
        Iterator it = userSession.multipleAccountHelper.A0G((String) null).iterator();
        String str = "";
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (!A0k.equals(userSession.getUserId())) {
                if (str.length() > 0) {
                    str = AnonymousClass00U.A0L(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                str = AnonymousClass00U.A0L(str, A0k);
            }
        }
        return str;
    }

    public final void A01(C63873iU r4, Integer num) {
        H1T A0N = AnonymousClass0wJ.A0N(this.A01);
        A0N.A0J("business/account/set_onboarding_checklist_manual_status/");
        A0N.A0O("checklist_item_key", AnonymousClass2K8.A00(num).toLowerCase());
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C85814vo.class, AnonymousClass3Za.class);
        if (r4 != null) {
            A0T.A00 = r4;
        }
        this.A00.schedule(A0T);
    }

    public final void A02(C63873iU r5, String str) {
        C145538kf r3 = this.A00;
        H1T A0O = C18180wK.A0O(this.A01);
        A0O.A0J("business/account/get_onboarding_checklist/");
        A0O.A0O("entry_point", str);
        A0O.A0O("logged_in_user_ids", A00(this));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C22121Tl.class, AnonymousClass3L6.class);
        A0T.A00 = r5;
        r3.schedule(A0T);
    }

    public AnonymousClass3V5(C145538kf r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
