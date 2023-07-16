package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public final class C58323Ez {
    public final C11630kW A00 = AnonymousClass44E.A00;
    public final UserSession A01;

    public C58323Ez(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(List list, List list2, List list3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, this.A01), "instagram_af_filter_events_v2"), 1686);
        C18230wP.A1G(A0I, "filters_applied");
        if (list2 == null) {
            list2 = AnonymousClass0ZV.A00;
        }
        A0I.A0U("current_filters", list2);
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        A0I.A0U("clicked_filters", list);
        if (list3 == null) {
            list3 = AnonymousClass0ZV.A00;
        }
        A0I.A0U("filters", list3);
        A0I.Bb4();
    }
}
