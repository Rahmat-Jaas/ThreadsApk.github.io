package X;

import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7H6  reason: invalid class name */
public final class AnonymousClass7H6 {
    public final C81194nK A00;
    public final AnonymousClass3S1 A01 = AnonymousClass32A.A0F;

    public static AnonymousClass32J A00(InstantExperiencesParameters instantExperiencesParameters) {
        if (!(instantExperiencesParameters instanceof IGInstantExperiencesParameters)) {
            return null;
        }
        AnonymousClass32J r0 = new AnonymousClass32J();
        synchronized (r0) {
        }
        synchronized (r0) {
        }
        synchronized (r0) {
        }
        synchronized (r0) {
        }
        return r0;
    }

    public static AnonymousClass7H6 A01(UserSession userSession) {
        return (AnonymousClass7H6) C86134wK.A0f(userSession, AnonymousClass7H6.class, 6);
    }

    public final void A04(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, Map map) {
        AnonymousClass32J A002 = A00(instantExperiencesJSBridgeCall.A01);
        synchronized (A002) {
        }
        synchronized (A002) {
        }
        A02(A002, map);
        synchronized (this.A00) {
        }
    }

    public AnonymousClass7H6(UserSession userSession) {
        this.A00 = C131607sT.A00(userSession).A00;
    }

    public static void A02(AnonymousClass32J r3, Map map) {
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            Object obj = map.get(A0x.next());
            if (obj == null || (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Boolean)) {
                synchronized (r3) {
                }
            }
        }
    }

    public final void A03(InstantExperiencesParameters instantExperiencesParameters, Map map) {
        A02(A00(instantExperiencesParameters), map);
        synchronized (this.A00) {
        }
    }
}
