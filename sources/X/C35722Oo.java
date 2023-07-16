package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Oo  reason: invalid class name and case insensitive filesystem */
public final class C35722Oo {
    public static final void A00(C318729h r2, AnonymousClass2A9 r3, AnonymousClass2A8 r4, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, r4);
        C04220Ms.A0B(r2, 3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C15720rm("fx_upsells_product"), userSession), "fx_upsells_product"), 692);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(r4, A0I);
            A0I.A0O(r3, "upsell_flow_entry_point");
            A0I.A0O(r2, "upsell_type");
            A0I.Bb4();
        }
    }
}
