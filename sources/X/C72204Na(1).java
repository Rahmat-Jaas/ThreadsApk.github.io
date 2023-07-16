package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Na  reason: invalid class name and case insensitive filesystem */
public final class C72204Na implements C83964sH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass2AC A01;
    public final /* synthetic */ C34640IcN A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C67233zC A04;

    public final void onAuthorizeFail() {
    }

    public C72204Na(FragmentActivity fragmentActivity, AnonymousClass2AC r2, C34640IcN icN, UserSession userSession, C67233zC r5) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = icN;
        this.A01 = r2;
        this.A04 = r5;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        C34640IcN icN = this.A02;
        AnonymousClass2AC r7 = this.A01;
        C67233zC r3 = this.A04;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36328096110029079L)) {
            AnonymousClass1v3.A06.A03(fragmentActivity, icN.getContext(), r7, userSession, new AnonymousClass4LA(r7, r3), C18200wM.A1Z(r7));
        }
    }
}
