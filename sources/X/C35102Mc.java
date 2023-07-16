package X;

import com.facebook.redex.IDxComparatorShape302S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Mc  reason: invalid class name and case insensitive filesystem */
public final class C35102Mc {
    public static final boolean A00(UserSession userSession) {
        if (!C35092Mb.A00(userSession)) {
            return false;
        }
        KK0 A00 = KK0.A00(userSession);
        C63643hy.A02();
        ArrayList A0s = C18200wM.A0s(A00.A05.values());
        Collections.sort(A0s, new IDxComparatorShape302S0100000_1_I2((Object) A00, 2));
        List unmodifiableList = Collections.unmodifiableList(A0s);
        C04220Ms.A06(unmodifiableList);
        if (!C18190wL.A1a(unmodifiableList) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316740216425784L)) {
            return false;
        }
        return true;
    }
}
