package X;

import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7tH  reason: invalid class name and case insensitive filesystem */
public final class C132077tH implements AnonymousClass0i4 {
    public final Map A00 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());
    public final UserSession A01;

    public final void A00(String str, Integer num, String str2) {
        AnonymousClass0TJ r2;
        long j;
        String str3 = str;
        String str4 = str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(str3, str4);
        Integer num2 = num;
        C04220Ms.A0B(num2, 2);
        UserSession userSession = this.A01;
        B8L b8l = new B8L(userSession, str3);
        if (b8l.B2g(userSession) == AnonymousClass006.A0C) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = b8l.A00;
            Map map = this.A00;
            Number A0j = C86124wJ.A0j(str3, map);
            if (A0j == null || currentTimeMillis - A0j.longValue() > j2) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36321314358237920L;
                } else if (intValue == A1Z) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36321314357910235L;
                } else if (intValue == 2) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36321314358303457L;
                } else if (intValue == 3) {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36321314356992720L;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
                if (C63803iN.A0E(r2, userSession, j)) {
                    b8l.AIV(userSession, str4, false);
                    C04220Ms.A05(map);
                    map.put(str3, Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public C132077tH(UserSession userSession) {
        this.A01 = userSession;
    }
}
