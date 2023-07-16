package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;

/* renamed from: X.582  reason: invalid class name */
public final class AnonymousClass582 extends C62793ak {
    public C148838sG A00;
    public final OnboardingSuggestedFollowingRepository A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86094wG A06;
    public final C86094wG A07;

    public AnonymousClass582(OnboardingSuggestedFollowingRepository onboardingSuggestedFollowingRepository, C11630kW r8, UserSession userSession, boolean z) {
        String str;
        this.A03 = userSession;
        this.A02 = r8;
        this.A01 = onboardingSuggestedFollowingRepository;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S1200000_I2());
        this.A04 = A0z;
        this.A06 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(DIV.A01);
        this.A05 = A0z2;
        this.A07 = A0z2;
        if (z) {
            str = "persistent_suggested_followers_view";
        } else {
            str = "suggested_follow_view";
        }
        AnonymousClass7ET.A01.A01(this.A02, this.A03, str);
        A00(this, true);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 18), AnonymousClass3J5.A00(this), 3);
    }

    public final void A01() {
        OnboardingSuggestedFollowingRepository onboardingSuggestedFollowingRepository = this.A01;
        onboardingSuggestedFollowingRepository.A03.clear();
        onboardingSuggestedFollowingRepository.A02.clear();
        C86094wG r3 = onboardingSuggestedFollowingRepository.A04;
        Iterable<AnonymousClass5IJ> iterable = (Iterable) ((KtCSuperShape0S1200000_I2) ((KtCSuperShape0S0400000_I2) r3.getValue()).A03).A01;
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (AnonymousClass5IJ r0 : iterable) {
            A0w.add(new AnonymousClass5IJ(r0.A00, r0.A02, r0.A03, r0.A01, true, r0.A07, r0.A04, r0.A05));
        }
        OnboardingSuggestedFollowingRepository.A00(C86134wK.A0M(AnonymousClass7C0.A00(A0w), r3), onboardingSuggestedFollowingRepository, C970767v.UnselectAll);
        AnonymousClass7ET.A01.A02(this.A02, this.A03, "follow_all");
    }

    public final void A02() {
        OnboardingSuggestedFollowingRepository onboardingSuggestedFollowingRepository = this.A01;
        AnonymousClass6NJ.A00(this.A03).A08(C86114wI.A0T(onboardingSuggestedFollowingRepository.A04), AnonymousClass00J.A0J(onboardingSuggestedFollowingRepository.A02), AnonymousClass00J.A0J(onboardingSuggestedFollowingRepository.A03));
    }

    public static final void A00(AnonymousClass582 r4, boolean z) {
        r4.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) r4, (C146958n9) null, 7, z), AnonymousClass3J5.A00(r4), 3);
    }
}
