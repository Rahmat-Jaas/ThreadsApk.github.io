package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49G  reason: invalid class name */
public final class AnonymousClass49G implements AnonymousClass0i4 {
    public long A00;
    public C10390iG A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A08;
    public final HashMap A09 = AnonymousClass0wJ.A0y();

    public static final boolean A00(AnonymousClass49G r5) {
        UserSession userSession = r5.A08;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36312105946776408L)) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - C18180wK.A05(C28161tl.A04(userSession), "last_session_survey_notification_seen_timestamp_ms")) < 90) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        C10390iG r0 = this.A01;
        if (r0 != null) {
            C691847d.A03(r0);
        }
        this.A09.clear();
    }

    public AnonymousClass49G(UserSession userSession, Context context) {
        this.A08 = userSession;
        this.A07 = context;
    }
}
