package X;

import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.6r1  reason: invalid class name and case insensitive filesystem */
public final class C113266r1 {
    public final File A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        File A0U = C86154wM.A0U(ITF.A00().AOC((C109746kY) null, 861573803), AnonymousClass00U.A0L(C63803iN.A0C(AnonymousClass0TJ.A05, userSession, 36882335869960475L), "_shared"));
        if (!A0U.exists()) {
            A0U.mkdirs();
        }
        return A0U;
    }

    public final File A00(UserSession userSession) {
        File A0U = C86154wM.A0U(ITF.A00().AOC((C109746kY) null, 861573803), AnonymousClass00U.A0N(C63803iN.A0C(AnonymousClass0TJ.A06, userSession, 36882335869960475L), userSession.getUserId(), '_'));
        if (!A0U.exists()) {
            A0U.mkdirs();
        }
        return A0U;
    }
}
