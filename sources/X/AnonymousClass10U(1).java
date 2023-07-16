package X;

import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1111000_I2;

/* renamed from: X.10U  reason: invalid class name */
public final class AnonymousClass10U extends C62793ak {
    public final M5J A00;
    public final IncentivePlatformApi A01;
    public final MonetizationRepository A02;
    public final UserSession A03;
    public final C86064wD A04;
    public final C84714tk A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86094wG A0A;
    public final C86094wG A0B;
    public final C86094wG A0C;
    public final C86094wG A0D;

    public AnonymousClass10U(IncentivePlatformApi incentivePlatformApi, MonetizationRepository monetizationRepository, UserSession userSession) {
        C04220Ms.A0B(monetizationRepository, 2);
        C04220Ms.A0B(incentivePlatformApi, 3);
        this.A03 = userSession;
        this.A02 = monetizationRepository;
        this.A01 = incentivePlatformApi;
        Boolean A0X = C18180wK.A0X();
        C27457Enn A0z = C18190wL.A0z(A0X);
        this.A07 = A0z;
        this.A0B = A0z;
        C27457Enn A0z2 = C18190wL.A0z(A0X);
        this.A08 = A0z2;
        this.A0C = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(A0X);
        this.A09 = A0z3;
        this.A0D = A0z3;
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        C27457Enn A0z4 = C18190wL.A0z(new AnonymousClass3BB(A0X, r1, r1, r1));
        this.A06 = A0z4;
        this.A0A = A0z4;
        this.A00 = C29110FiC.A00((C27952Ew2) null, C25807DsL.A04(new AnonymousClass4Xj(this), A0z3, monetizationRepository.A0E, A0z, A0z2, A0z4), 3);
        C27441EnX enX = new C27441EnX();
        this.A04 = enX;
        this.A05 = AnonymousClass7C4.A02(enX);
    }

    public static final void A00(AnonymousClass10U r8, String str) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1111000_I2(r8, str, (C146958n9) null, 6, false), AnonymousClass3J5.A00(r8), 3);
    }
}
