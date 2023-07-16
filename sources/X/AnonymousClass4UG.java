package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4UG  reason: invalid class name */
public final class AnonymousClass4UG implements C04560Oe {
    public final /* synthetic */ C28321u4 A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ UserSession A03;

    public AnonymousClass4UG(Fragment fragment, C11630kW r2, C28321u4 r3, UserSession userSession) {
        this.A00 = r3;
        this.A01 = fragment;
        this.A03 = userSession;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Fragment fragment = this.A01;
        UserSession userSession = this.A03;
        C11630kW r2 = this.A02;
        if ((fragment instanceof C34640IcN) || (fragment instanceof I5x)) {
            return C130667qT.A01(fragment, r2, userSession, (C30938GbW) null);
        }
        throw C18190wL.A0a("fragment type not supported");
    }
}
