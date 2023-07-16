package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7EX  reason: invalid class name */
public final class AnonymousClass7EX {
    public List A00 = AnonymousClass0ZV.A00;
    public final LoggingFanData A01;
    public final C13330nS A02;
    public final UserSession A03;

    public AnonymousClass7EX(LoggingFanData loggingFanData, C11630kW r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = C13330nS.A01(r3, userSession);
    }

    public final void A03(String str, String str2, String str3, List list, int i) {
        AnonymousClass0wJ.A1M(str, 0, list);
        C89195Ch A012 = A01(this, AnonymousClass006.A01, (Integer) null, str, i);
        A012.A0B("gift_options", list);
        C13330nS r2 = this.A02;
        String str4 = this.A01.A03;
        C04220Ms.A05(r2);
        C122017Jn.A04(A012, r2, str4, str2, (String) null, str3);
    }

    public static final C89195Ch A00(AnonymousClass7EX r8, Integer num, Integer num2) {
        String str;
        String str2;
        String userId = r8.A03.getUserId();
        LoggingFanData loggingFanData = r8.A01;
        String str3 = loggingFanData.A00;
        String str4 = loggingFanData.A02;
        String str5 = loggingFanData.A01;
        switch (num.intValue()) {
            case 0:
                str = "appreciation_gift";
                break;
            case 1:
                str = "appreciation_gift_send";
                break;
            default:
                str = "appreciation_gift_animation";
                break;
        }
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "add_to_balance";
                    break;
                case 2:
                    str2 = "send";
                    break;
                case 3:
                    str2 = "appreciation_balance";
                    break;
                default:
                    str2 = "select_gift";
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

    public final void A02(String str) {
        C13330nS r1 = this.A02;
        String str2 = this.A01.A03;
        C89195Ch A002 = A00(this, AnonymousClass006.A00, (Integer) null);
        C04220Ms.A05(r1);
        C122017Jn.A04(A002, r1, str2, "query_gifts_failure", (String) null, str);
    }

    public static C89195Ch A01(AnonymousClass7EX r0, Integer num, Integer num2, String str, int i) {
        C89195Ch A002 = A00(r0, num, num2);
        A002.A09("balance", Long.valueOf((long) i));
        A002.A0A("gift_id", str);
        return A002;
    }
}
