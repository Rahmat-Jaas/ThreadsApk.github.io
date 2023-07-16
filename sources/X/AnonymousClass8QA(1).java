package X;

import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClient;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import com.instagram.service.session.UserSession;

/* renamed from: X.8QA  reason: invalid class name */
public final class AnonymousClass8QA extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QA A00 = new AnonymousClass8QA();

    public AnonymousClass8QA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserSession userSession = (UserSession) obj;
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36312535445144673L)) {
            return DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        }
        return DGWRequestStreamClient.getInstance(userSession);
    }
}
