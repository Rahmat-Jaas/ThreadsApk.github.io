package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.623  reason: invalid class name */
public final class AnonymousClass623 extends AnonymousClass4DQ {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ C30857GZr A01;

    public AnonymousClass623(C11630kW r1, C30857GZr gZr) {
        this.A01 = gZr;
        this.A00 = r1;
    }

    public final void CPS(C25918DvM dvM) {
        UserSession userSession = this.A01.A07;
        USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(C18220wO.A0V(this.A00, userSession));
        A0I.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        C18190wL.A1I(A0I, "story_postcapture_tooltip");
        C86104wH.A1J(A0I, "view");
        A0I.A0Q("is_support_partner_enabled", Boolean.valueOf(AnonymousClass7G1.A03(userSession)));
        A0I.Bb4();
    }
}
