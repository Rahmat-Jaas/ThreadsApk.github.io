package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6QS  reason: invalid class name */
public final class AnonymousClass6QS {
    public static final void A00(C147188nY r3, C34640IcN icN, AnonymousClass0YP r5, int i) {
        AnonymousClass0wJ.A1N(icN, r5);
        r3.Cvd(-2063316581);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r3;
        Object A13 = r1.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = C18180wK.A0W(icN, AnonymousClass0RA.A0C);
            r1.A14(A13);
        }
        String moduleName = icN.getModuleName();
        C04220Ms.A06(moduleName);
        C101206Qh.A00(r3, (UserSession) A13, moduleName, r5, ((i << 3) & 896) | 64);
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r5, icN, i, 20);
        }
    }
}
