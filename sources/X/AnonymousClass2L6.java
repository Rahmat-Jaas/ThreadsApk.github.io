package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.2L6  reason: invalid class name */
public final class AnonymousClass2L6 {
    public static final boolean A00(UserSession userSession, Long l) {
        long A03;
        C04220Ms.A0B(userSession, 1);
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A06;
        boolean A0E = C63803iN.A0E(r4, userSession, 36313342897751502L);
        if (l != null) {
            A03 = l.longValue();
        } else {
            A03 = C63803iN.A03(r4, userSession, 36594817875642258L);
        }
        if (!A0E) {
            return false;
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313342898472406L)) {
            AnonymousClass144 r0 = new AnonymousClass144();
            r0.A01 = A03;
            r0.A01();
            throw AnonymousClass0wJ.A0Z(userSession);
        }
        Context A08 = C18230wP.A08();
        HashMap A0y = AnonymousClass0wJ.A0y();
        new BitSet(0);
        M4x.A03(A08, new C210718u(userSession), "com.bloks.www.bloks.cxf.cpdp", (String) null, C37067Jjv.A02(A0y), A03);
        return true;
    }
}
