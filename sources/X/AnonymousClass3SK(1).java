package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3SK  reason: invalid class name */
public final class AnonymousClass3SK {
    public final AnonymousClass14S A00;
    public final C13330nS A01;

    public static final void A00(AnonymousClass29V r4, AnonymousClass3SK r5) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r5.A01, "ufix_ig_support_resources_csom_qp_event"), 2778);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0P(r5.A00, "core");
            AnonymousClass14T r2 = new AnonymousClass14T();
            r2.A04(r4, "event");
            r2.A04(AnonymousClass28B.QUICK_PROMOTION, "entry_point");
            A0I.A0P(r2, "support_resources_csom_qp");
            A0I.Bb4();
        }
    }

    public AnonymousClass3SK(C11630kW r4, UserSession userSession, String str) {
        this.A01 = C13330nS.A01(r4, userSession);
        AnonymousClass14S r2 = new AnonymousClass14S();
        r2.A0A(C63833iQ.A03(), str);
        r2.A04(C40322Lcc.EXECUTION_DONE, "event_step");
        r2.A04(AnonymousClass29P.SUPPORT_RESOURCES_CSOM, "event_source");
        r2.A0A("entity_id", userSession.getUserId());
        this.A00 = r2;
    }
}
