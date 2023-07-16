package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.IDxObjectShape236S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5E1  reason: invalid class name */
public final class AnonymousClass5E1 extends C1200678j {
    public final UserSession A00;

    public AnonymousClass5E1(C91225fq r2, UserSession userSession) {
        super(r2, AnonymousClass7H6.A01(userSession));
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        super.A02(instantExperiencesJSBridgeCall);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put(AnonymousClass69E.PAYMENT_ID, instantExperiencesJSBridgeCall.A00("paymentId"));
        A0y.put(AnonymousClass69E.ERROR_MESSAGE, String.valueOf(instantExperiencesJSBridgeCall.A00("errorMessage")));
        UserSession userSession = this.A00;
        AnonymousClass3S6 r3 = (AnonymousClass3S6) userSession.A01(AnonymousClass3S6.class, new IDxObjectShape236S0100000_1_I2(userSession, 10));
        Iterator A0x = C18220wO.A0x(A0y);
        while (A0x.hasNext()) {
            Object next = A0x.next();
            if (A0y.get(next) != null) {
                A0y.get(next);
            }
        }
        C81194nK r0 = r3.A00;
        synchronized (r0) {
        }
        synchronized (r0) {
        }
    }
}
