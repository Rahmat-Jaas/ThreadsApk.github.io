package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2HQ  reason: invalid class name */
public final class AnonymousClass2HQ {
    public static final Object A00(C63893iY r10) {
        C04220Ms.A0B(r10, 0);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r10, 0));
        Object A0B = C63893iY.A0B(r10, 1);
        Object A0B2 = C63893iY.A0B(r10, 2);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) A0B2;
        C10300i6 A0E = C63913ic.A0E(C63893iY.A01(r10, 3));
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3BN r2 = (AnonymousClass3BN) userSession.A01(AnonymousClass3BN.class, C18250wR.A0d(userSession, AnonymousClass3WS.A01(userSession), 21));
        Integer num = AnonymousClass006.A00(3)[A04];
        C04220Ms.A0B(list, 1);
        C04220Ms.A0B(num, 2);
        if (A0B == null) {
            return null;
        }
        HashMap hashMap = r2.A01;
        Runnable runnable = (Runnable) hashMap.get(A0B);
        hashMap.clear();
        if (num.intValue() == 2) {
            AnonymousClass34N r5 = r2.A00;
            for (Object next : list) {
                C28161tl r0 = r5.A00;
                C04220Ms.A0B(next, 0);
                HashSet A0u = C18200wM.A0u();
                SharedPreferences sharedPreferences = r0.A00;
                Set<String> stringSet = sharedPreferences.getStringSet("minor_education_acknowledged_users", A0u);
                C04220Ms.A06(stringSet);
                stringSet.add(next);
                C18250wR.A0p(sharedPreferences.edit(), "minor_education_acknowledged_users", stringSet);
            }
        }
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
