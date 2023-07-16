package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.7uO  reason: invalid class name and case insensitive filesystem */
public final class C132717uO implements C39549KvX {
    public final C21839C2o A00;
    public final UserSession A01;

    public C132717uO(C21839C2o c2o, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c2o;
    }

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        AnonymousClass0wJ.A1N(jnx, c2r);
        if (c2r.BLJ(jnx) == AnonymousClass006.A00) {
            BKU bku = (BKU) jnx.A02;
            Object obj = jnx.A03;
            if (bku != null && obj != null) {
                Iterator A0t = C86134wK.A0t(bku.A3O());
                while (A0t.hasNext()) {
                    String id = C18220wO.A0c(A0t).getId();
                    UserSession userSession = this.A01;
                    if (C18250wR.A1J(userSession, id)) {
                        C21839C2o c2o = this.A00;
                        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(c2o, userSession), "coauthor_invite_cta_impression"), HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
                        String str = bku.A0N;
                        C04220Ms.A06(str);
                        A0I.A0S("media_id", AnonymousClass0wJ.A0d(str));
                        C86104wH.A1L(A0I, c2o, bku, userSession, C86134wK.A0p(bku.A2Z(userSession)));
                        return;
                    }
                }
            }
        }
    }
}
