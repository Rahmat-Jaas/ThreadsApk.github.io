package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.76R  reason: invalid class name */
public final class AnonymousClass76R {
    public List A00 = AnonymousClass0ZV.A00;
    public final LoggingFanData A01;
    public final C13330nS A02;
    public final UserSession A03;

    public static final C89195Ch A00(AnonymousClass76R r8, Integer num, Integer num2) {
        String str;
        String str2;
        String userId = r8.A03.getUserId();
        LoggingFanData loggingFanData = r8.A01;
        String str3 = loggingFanData.A00;
        String str4 = loggingFanData.A02;
        String str5 = loggingFanData.A01;
        if (num.intValue() != 0) {
            str = "purchase_outside";
        } else {
            str = "appreciation_balance";
        }
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "stars_terms";
                    break;
                case 2:
                    str2 = "payment_terms";
                    break;
                case 3:
                    str2 = "learn_more";
                    break;
                case 4:
                    str2 = "back";
                    break;
                default:
                    str2 = "star_package_option";
                    break;
            }
        } else {
            str2 = null;
        }
        C18180wK.A1Q(userId, 0, str);
        C89195Ch r1 = new C89195Ch();
        r1.A0A("sender_id", userId);
        r1.A0A("receiver_id", str3);
        r1.A0A("media_id", str4);
        C86124wJ.A1K(r1, str);
        r1.A0A("entry_point", str5);
        if (str2 != null && !AnonymousClass8bQ.A0n(str2)) {
            C86134wK.A1G(r1, str2);
        }
        return r1;
    }

    public AnonymousClass76R(LoggingFanData loggingFanData, C11630kW r3, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = C13330nS.A01(r3, userSession);
    }
}
