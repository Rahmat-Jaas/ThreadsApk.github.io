package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.7x6  reason: invalid class name and case insensitive filesystem */
public final class C134147x6 implements C33535HpV {
    public final /* synthetic */ C105976eI A00;
    public final /* synthetic */ UserSession A01;

    public C134147x6(C105976eI r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final C32165H8c AGI(String str) {
        H1T A0O = C18180wK.A0O(this.A01);
        A0O.A0J("business/account/get_suggested_hashtags/");
        Iterator it = this.A00.A00.A02.iterator();
        String str2 = "";
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (str2.length() > 0) {
                str2 = AnonymousClass00U.A0L(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            str2 = AnonymousClass00U.A0L(str2, A0k);
        }
        A0O.A0O("used_hashtags", str2);
        return AnonymousClass0wJ.A0T(A0O, AnonymousClass5uL.class, C1185071e.class);
    }
}
