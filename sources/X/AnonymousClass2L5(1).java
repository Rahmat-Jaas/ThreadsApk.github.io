package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2L5  reason: invalid class name */
public final class AnonymousClass2L5 {
    public static final List A00(UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 0);
        try {
            List A02 = C18250wR.A0h(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(str, 0);
            ArrayList A0w = AnonymousClass0wJ.A0w(A02);
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                List A022 = C18250wR.A0h("_").A02(C18180wK.A0k(it), 0);
                StringBuilder A0r = C18200wM.A0r();
                Iterator it2 = A022.iterator();
                while (it2.hasNext()) {
                    A0r.appendCodePoint(Integer.parseInt(C18180wK.A0k(it2), 16));
                }
                A0w.add(C18190wL.A0n(A0r));
            }
            return A0w;
        } catch (Exception unused) {
            C18250wR.A13(C10770iu.A00(), "Exception when parsing inline emoji set from launcher.", 817896325);
            return AnonymousClass0ZV.A00;
        }
    }
}
