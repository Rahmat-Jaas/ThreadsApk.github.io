package X;

import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2;

/* renamed from: X.103  reason: invalid class name */
public final class AnonymousClass103 extends C62793ak {
    public final MonetizationRepository A00;
    public final UserSession A01;
    public final C86064wD A02;
    public final C84714tk A03;
    public final C86074wE A04 = C18190wL.A0z(AnonymousClass0ZV.A00);

    public AnonymousClass103(MonetizationRepository monetizationRepository, UserSession userSession) {
        C04220Ms.A0B(monetizationRepository, 2);
        this.A01 = userSession;
        this.A00 = monetizationRepository;
        C27441EnX enX = new C27441EnX();
        this.A02 = enX;
        this.A03 = AnonymousClass7C4.A02(enX);
        UserSession userSession2 = this.A01;
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A06, userSession2, 36327207051732899L);
        boolean A0E2 = C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36319914199684622L);
        if (A0E || A0E2) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0221000_I2(this, (C146958n9) null, 3, A0E, A0E2), AnonymousClass3J5.A00(this), 3);
        }
    }
}
