package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4GN  reason: invalid class name */
public final class AnonymousClass4GN implements C82884qQ {
    public final AnonymousClass0BO A00;
    public final boolean A01;

    public final boolean CW4(C58743Gz r3) {
        return AnonymousClass0wJ.A1T(this.A00.A0L() ? 1 : 0, this.A01 ? 1 : 0);
    }

    public AnonymousClass4GN(UserSession userSession, boolean z) {
        this.A00 = userSession.multipleAccountHelper;
        this.A01 = z;
    }
}
