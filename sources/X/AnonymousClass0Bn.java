package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.0Bn  reason: invalid class name */
public final class AnonymousClass0Bn extends C12140lP {
    public final /* synthetic */ C09030ek A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Bn(C09030ek r3) {
        super("profiloSessionInit", 431438835);
        this.A00 = r3;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A00;
        boolean z = !AnonymousClass2SV.A00(userSession).booleanValue();
        String A04 = C09140ev.A02.A04(C10600ic.A00);
        if (A04 == null) {
            A04 = "";
        }
        if (C08290d7.A01) {
            C08000cZ.A00().A08(new C09020eh(userSession, A04, z));
        }
        boolean A0O = KJ8.A00().A0O();
        AnonymousClass0Vt.A00().A04("IgProfiloInitializer", "Config update after cold start");
        C08300d8 r0 = C08290d7.A00;
        if (r0 != null) {
            r0.A02(userSession, A0O);
        }
    }
}
