package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4KH  reason: invalid class name */
public final class AnonymousClass4KH implements C04860Pl {
    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r11, AnonymousClass0PT r12) {
        AnonymousClass4KT r122 = (AnonymousClass4KT) r12;
        String str = C61793Vp.A00(userSession).A04;
        AnonymousClass0PF r2 = new AnonymousClass0PF(r122.A01, r11);
        C34640IcN icN = r122.A00;
        if (icN.isVisible()) {
            C32165H8c A00 = AnonymousClass2TR.A00(icN.getContext(), r122.A02, r122.A03, r122.A04, r122.A05, str);
            A00.A00 = r2;
            icN.schedule(A00);
            return;
        }
        C10450iM.A03("SecondaryAccountCreationNonLinkingOperation", "IgFragment in SecondaryAccountCreationNonLinkingOperation cannot be null!");
    }
}
