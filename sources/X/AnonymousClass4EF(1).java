package X;

import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4EF  reason: invalid class name */
public final class AnonymousClass4EF implements C83664rm {
    public final UserSession A00;
    public final AtomicBoolean A01 = C18230wP.A0w();

    public final void AD2(C83654rl r1) {
    }

    public final void ASn(C83654rl r7, AnonymousClass35K r8, AnonymousClass17J r9) {
        C04220Ms.A0B(r7, 0);
        AnonymousClass2AP r4 = AnonymousClass2AP.A0Q;
        if (r7 == r4) {
            UserSession userSession = this.A00;
            int A002 = C59363Kn.A00(userSession);
            if (C63793iM.A0D(userSession)) {
                A002 += C550931s.A01.A01(userSession, C63793iM.A0B(userSession));
            }
            r8.A00.resumeWith(new AnonymousClass17J(r4, (List) null, A002, A002));
            if (A002 > 0 && !this.A01.getAndSet(true)) {
                AnonymousClass17J r42 = new AnonymousClass17J(AnonymousClass2AP.A0S, (List) null, 1, 1);
                AnonymousClass25R r3 = AnonymousClass25R.BOTTOM_NAVIGATION_BAR;
                AnonymousClass25P r2 = AnonymousClass25P.DOT;
                AnonymousClass3NS.A00(userSession).A03(r2, r3, r42, AnonymousClass006.A00);
                AnonymousClass3NS.A00(userSession).A03(r2, r3, r42, AnonymousClass006.A0j);
            }
        }
    }

    public AnonymousClass4EF(UserSession userSession) {
        this.A00 = userSession;
    }
}
