package X;

import android.content.Context;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7Hz  reason: invalid class name and case insensitive filesystem */
public final class C121757Hz {
    public static L30 A02(UserSession userSession) {
        List A04 = A04(userSession);
        int A00 = A00(userSession);
        Context context = C10600ic.A00;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        return new FeedCacheCoordinator(context, userSession, A04, A00, AnonymousClass7GL.A00(userSession) * 3, C63803iN.A03(r4, userSession, 36593108477805378L) * 1000, C63803iN.A03(r4, userSession, 36593108477739841L) * 1000);
    }

    public static int A00(UserSession userSession) {
        long j;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36324252114493840L)) {
            return 0;
        }
        C37791K4m.A02();
        if (C37791K4m.A02().A0A()) {
            j = 36593108477281084L;
        } else {
            j = 36593108477215547L;
        }
        return C63803iN.A01(r2, userSession, j);
    }

    public static L30 A03(UserSession userSession) {
        List A04 = A04(userSession);
        int A00 = A00(userSession);
        return new FeedCacheCoordinator(C10600ic.A00, userSession, A04, A00, 50, 0, Long.MAX_VALUE);
    }

    public static C147008nE A01(UserSession userSession, boolean z) {
        AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
        if (C63803iN.A0E(A0J, userSession, 36324252114231692L) || (!z && !C63803iN.A0E(A0J, userSession, 36324784690176678L))) {
            return C147008nE.A00;
        }
        boolean A0E = C63803iN.A0E(A0J, userSession, 36327396030294015L);
        Context context = C10600ic.A00;
        if (A0E) {
            return new C130597qL(userSession, context, z);
        }
        return new C130587qK(userSession, context, z);
    }

    public static List A04(UserSession userSession) {
        Object r0;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        HashMap A0y = AnonymousClass0wJ.A0y();
        C35393Iu1 iu1 = C35393Iu1.A0D;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        A0y.put(iu1, C63803iN.A07(r4, userSession, 36597798581373674L));
        A0y.put(C35393Iu1.A0T, C63803iN.A07(r4, userSession, 36600315432406488L));
        A0y.put(C35393Iu1.A0S, C63803iN.A07(r4, userSession, 36593108477412158L));
        A0v.add(new C129907nb(C63803iN.A03(r4, userSession, 36593108477412158L), A0y));
        A0v.add(new B6L(userSession));
        A0v.add(new AnonymousClass7nZ(C132457tv.A00(C10600ic.A00, userSession)));
        if (C63803iN.A0E(r4, userSession, 2342154642714919594L)) {
            r0 = new AnonymousClass7nY(C63803iN.A0E(r4, userSession, 36318840455435021L));
        } else {
            r0 = new AnonymousClass7nX();
        }
        A0v.add(r0);
        return A0v;
    }
}
