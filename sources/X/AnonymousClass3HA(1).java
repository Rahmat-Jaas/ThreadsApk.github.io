package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3HA  reason: invalid class name */
public final class AnonymousClass3HA {
    public final FragmentActivity A00;
    public final C58783Hg A01;
    public final UserSession A02;

    public final void A00(boolean z) {
        C18180wK.A17(AnonymousClass2OG.A00(16, true, false, false, z, false), C18180wK.A0Q(this.A00, this.A02));
    }

    public final void A01(boolean z) {
        C18180wK.A17(AnonymousClass2OG.A00(16, false, true, false, z, false), C18180wK.A0Q(this.A00, this.A02));
    }

    public /* synthetic */ AnonymousClass3HA(FragmentActivity fragmentActivity, UserSession userSession) {
        DDJ.A00();
        C58783Hg A002 = AnonymousClass3WJ.A00();
        C18180wK.A1Q(userSession, 1, A002);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = A002;
    }
}
