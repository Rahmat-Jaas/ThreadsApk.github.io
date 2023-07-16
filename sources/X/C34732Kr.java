package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Kr  reason: invalid class name and case insensitive filesystem */
public final class C34732Kr {
    public static final boolean A00(UserSession userSession, boolean z) {
        boolean z2;
        C04220Ms.A0B(userSession, 0);
        if (AnonymousClass0wJ.A0Y(userSession).A0e() != C169839tz.PrivacyStatusPublic) {
            return false;
        }
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession, 36319656499615018L)) {
            return false;
        }
        boolean A0E = C63803iN.A0E(r3, userSession, 36315155373558182L);
        if (!z) {
            AnonymousClass0TJ r4 = AnonymousClass0TJ.A06;
            if (A0E) {
                return C63803iN.A0E(r4, userSession, 36315155373623719L);
            }
            if (C63803iN.A0E(r4, userSession, 36312578393113706L)) {
                return true;
            }
            z2 = C63803iN.A0E(r4, userSession, 36314790301272214L);
        } else if (A0E) {
            return C63803iN.A0E(r3, userSession, 36315155373623719L);
        } else {
            if (C63803iN.A0E(r3, userSession, 36312578393113706L)) {
                return true;
            }
            z2 = C63803iN.A0E(r3, userSession, 36314790301272214L);
        }
        return z2 || C63803iN.A0E(r3, userSession, 36315155373492645L);
    }
}
