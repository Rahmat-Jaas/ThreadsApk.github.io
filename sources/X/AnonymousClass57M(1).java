package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2;
import com.instagram.barcelona.onboarding.data.OnboardingRespository;
import com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0400000_I2;

/* renamed from: X.57M  reason: invalid class name */
public final class AnonymousClass57M extends C62793ak {
    public final C109946ks A00;
    public final OnboardingRespository A01;
    public final ProfilePictureDelegateImpl A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final C86094wG A05;

    public /* synthetic */ AnonymousClass57M(C121177En r12, C107856hQ r13, C11630kW r14, UserSession userSession) {
        C109946ks r2 = new C109946ks(userSession);
        OnboardingRespository A002 = AnonymousClass6NJ.A00(userSession);
        C105546db r9 = (C105546db) userSession.A01(C105546db.class, AnonymousClass8HV.A00);
        C86104wH.A1P(A002, 6, r9);
        this.A04 = userSession;
        this.A03 = r14;
        this.A00 = r2;
        this.A01 = A002;
        ProfilePictureDelegateImpl profilePictureDelegateImpl = new ProfilePictureDelegateImpl(r12, r13, A002, r9, AnonymousClass3J5.A00(this));
        this.A02 = profilePictureDelegateImpl;
        C84714tk A022 = C25807DsL.A02(new KtSLambdaShape2S0400000_I2(this, (C146958n9) null, 0), r2.A03, A002.A09, profilePictureDelegateImpl.A04);
        this.A05 = C25753DrP.A04(new KtCSuperShape0S0410000_I2(new KtCSuperShape0S3310000_I2()), AnonymousClass3J5.A00(this), A022, AnonymousClass74I.A00);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 13), AnonymousClass3J5.A00(this), 3);
    }
}
