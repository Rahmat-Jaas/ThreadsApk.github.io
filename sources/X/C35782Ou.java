package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.HashMap;

/* renamed from: X.2Ou  reason: invalid class name and case insensitive filesystem */
public final class C35782Ou {
    public static final void A00(AnonymousClass2A5 r3, C10300i6 r4, String str, HashMap hashMap) {
        Long l;
        C04220Ms.A0B(r3, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "fx_sso"), 689);
        C18220wO.A1D(r3, A0I);
        A0I.A0V("debug_data", hashMap);
        if (str != null) {
            l = AnonymousClass0wJ.A0d(str);
        } else {
            l = null;
        }
        A0I.A0S("initiator_account_id", l);
        A0I.Bb4();
    }
}
