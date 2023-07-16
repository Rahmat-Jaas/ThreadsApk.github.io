package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4UK  reason: invalid class name */
public final class AnonymousClass4UK implements C04560Oe {
    public final AnonymousClass0e5 A00;
    public final UserSession A01;
    public final boolean A02;

    public AnonymousClass4UK(AnonymousClass0e5 r2, UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = z;
    }

    public final Object get() {
        boolean z = this.A02;
        AnonymousClass0e5 r1 = this.A00;
        UserSession userSession = this.A01;
        if (z) {
            return r1.A02(userSession);
        }
        return r1.A01(userSession);
    }

    public static AnonymousClass47S A00(UserSession userSession, long j, boolean z) {
        return new AnonymousClass47S(new AnonymousClass4UK(AnonymousClass0e5.A00(j), userSession, z));
    }
}
