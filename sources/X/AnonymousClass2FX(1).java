package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2FX  reason: invalid class name */
public final class AnonymousClass2FX {
    public static final void A00(C11630kW r3, BKU bku, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, r3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, userSession), "ig_archive_event"), 796);
        A0I.A00.A6J("m_t", Integer.valueOf(bku.Aup().A00));
        A0I.A0T("m_pk", bku.A0f.A4Y);
        C18230wP.A1G(A0I, str);
        A0I.Bb4();
    }
}
