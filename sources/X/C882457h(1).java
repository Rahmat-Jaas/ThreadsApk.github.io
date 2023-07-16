package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.57h  reason: invalid class name and case insensitive filesystem */
public final class C882457h extends C62793ak {
    public final M5J A00;
    public final C880856r A01;
    public final C37010Jil A02 = C37010Jil.A00();
    public final MonetizationRepository A03;
    public final C86064wD A04;
    public final C84714tk A05;
    public final UserSession A06;

    public final void onCleared() {
        this.A02.A01();
    }

    public C882457h(MonetizationRepository monetizationRepository, UserSession userSession) {
        this.A03 = monetizationRepository;
        this.A06 = userSession;
        C27441EnX enX = new C27441EnX();
        this.A04 = enX;
        this.A05 = AnonymousClass7C4.A02(enX);
        C880856r A042 = C880856r.A04(new KtCSuperShape0S2050000_I2());
        this.A01 = A042;
        this.A00 = A042;
    }
}
