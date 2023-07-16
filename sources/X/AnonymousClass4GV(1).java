package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4GV  reason: invalid class name */
public final class AnonymousClass4GV implements C82884qQ {
    public C09810gi A00;
    public final UserSession A01;
    public final Integer A02;

    public final boolean CW4(C58743Gz r6) {
        return C18180wK.A1X(((C18240wQ.A09(C18180wK.A05(C28161tl.A04(this.A01), "last_interop_interstitial_presentation_timestamp")) / 1000) > ((long) this.A02.intValue()) ? 1 : ((C18240wQ.A09(C18180wK.A05(C28161tl.A04(this.A01), "last_interop_interstitial_presentation_timestamp")) / 1000) == ((long) this.A02.intValue()) ? 0 : -1)));
    }

    public AnonymousClass4GV(C09810gi r1, UserSession userSession, Integer num) {
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = r1;
    }
}
