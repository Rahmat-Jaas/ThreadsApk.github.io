package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BN  reason: invalid class name */
public final class AnonymousClass4BN implements C83514rX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;

    public final void Bsb(String str) {
        C04220Ms.A0B(str, 0);
        C61873Wd.A01(this.A00.getSupportFragmentManager());
        AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
        throw null;
    }

    public AnonymousClass4BN(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void Bsa(Throwable th) {
        FragmentActivity fragmentActivity = this.A00;
        C61873Wd.A01(fragmentActivity.getSupportFragmentManager());
        C10450iM.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
        C63813iO.A09(fragmentActivity);
    }
}
