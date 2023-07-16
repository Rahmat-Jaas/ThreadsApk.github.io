package X;

import android.app.Application;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;

/* renamed from: X.0zX  reason: invalid class name and case insensitive filesystem */
public final class C19240zX extends AnonymousClass10X {
    public final AnonymousClass495 A00;
    public final AnonymousClass3HY A01;
    public final FanClubSettingsRepository A02;
    public final C62723ab A03;
    public final MonetizationRepository A04;
    public final UserSession A05;
    public final C86064wD A06;
    public final C84714tk A07;
    public final C84714tk A08;
    public final C86074wE A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19240zX(Application application, AnonymousClass3HY r10, FanClubSettingsRepository fanClubSettingsRepository, UserSession userSession, String str, boolean z) {
        super(application);
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
        MonetizationRepository A003 = AnonymousClass2RN.A00(userSession);
        C62723ab r1 = new C62723ab(r10, userSession, str);
        C04220Ms.A0B(A002, 7);
        C04220Ms.A0B(A003, 8);
        this.A05 = userSession;
        this.A01 = r10;
        this.A02 = fanClubSettingsRepository;
        this.A0A = z;
        this.A00 = A002;
        this.A04 = A003;
        this.A03 = r1;
        C27441EnX enX = new C27441EnX();
        this.A06 = enX;
        this.A08 = AnonymousClass7C4.A02(enX);
        C27457Enn A0z = C18190wL.A0z(false);
        this.A09 = A0z;
        C86094wG r12 = fanClubSettingsRepository.A02.A0E;
        C86094wG r3 = fanClubSettingsRepository.A04;
        C86094wG r4 = fanClubSettingsRepository.A05;
        FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository = fanClubSettingsRepository.A01;
        this.A07 = new IDxFlowShape93S0200000_1_I2(20, (Object) this, (Object) new C84714tk[]{r12, A0z, r3, r4, fanClubSettingsRecommendationsRepository.A01, fanClubSettingsRecommendationsRepository.A02, fanClubSettingsRepository.A00.A02});
    }

    public static final void A00(C19240zX r4, String str) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(r4, str, (C146958n9) null, 7), AnonymousClass3J5.A00(r4), 3);
    }
}
