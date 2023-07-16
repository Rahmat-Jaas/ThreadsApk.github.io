package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.4AR  reason: invalid class name */
public final class AnonymousClass4AR implements C39549KvX {
    public UserSession A00;
    public final C13330nS A01;
    public final String A02;

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        String str;
        String str2 = ((C38110KMa) jnx.A02).A05;
        Integer BLJ = c2r.BLJ(jnx);
        Integer num = AnonymousClass006.A00;
        if (BLJ == num) {
            if (str2.equals(I17.A00(45))) {
                UserSession userSession = this.A00;
                C28161tl A012 = AnonymousClass3WS.A01(userSession);
                AnonymousClass0wJ.A12(C28161tl.A02(A012), "alternate_topic_nudge_last_seen_time", System.currentTimeMillis());
                C60573Pq.A01(userSession, num, System.currentTimeMillis() / 1000);
            }
            if (str2.equals("take_a_break_nudge")) {
                AnonymousClass3WS.A01(this.A00).A0J(System.currentTimeMillis() / 1000);
            }
        } else if (c2r.BLJ(jnx) == AnonymousClass006.A0C) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "discover_media_chaining_alt_topic_nudge"), 560);
            C18210wN.A1A(A0I, "vpvd_impression");
            if (str2.equals("take_a_break_nudge")) {
                num = AnonymousClass006.A01;
            } else if (!str2.equals(I17.A00(45))) {
                str = "Unknown";
                A0I.A0T("nudge_name", str);
                A0I.A0T(I17.A00(544), this.A02);
                A0I.A0R("dwell_time", Double.valueOf(((double) c2r.Af5(jnx)) / 1000.0d));
                A0I.Bb4();
            }
            str = C54432zR.A00(num);
            A0I.A0T("nudge_name", str);
            A0I.A0T(I17.A00(544), this.A02);
            A0I.A0R("dwell_time", Double.valueOf(((double) c2r.Af5(jnx)) / 1000.0d));
            A0I.Bb4();
        }
    }

    public AnonymousClass4AR(UserSession userSession, String str, String str2) {
        this.A00 = userSession;
        this.A02 = str2;
        this.A01 = C13330nS.A01(new C684043q(str), userSession);
    }
}
