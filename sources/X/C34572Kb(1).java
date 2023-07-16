package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Kb  reason: invalid class name and case insensitive filesystem */
public final class C34572Kb {
    public static final C84834tw A00(C304921n r3, UserSession userSession) {
        C84834tw r0;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r3);
        int ordinal = r3.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            r0 = new AnonymousClass42y(r3, userSession);
        } else if (ordinal == A1Z) {
            r0 = new AnonymousClass42z(r3, userSession);
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return r0;
    }
}
