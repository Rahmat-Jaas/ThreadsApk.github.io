package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4F5  reason: invalid class name */
public final class AnonymousClass4F5 implements C82834qL {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass0MJ A02;

    public AnonymousClass4F5(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass0MJ r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = fragmentActivity;
    }

    public final void onFinished() {
        UserSession userSession = this.A01;
        C54142yy.A00(userSession, (C313625r) this.A02.A00);
        C67323zM.A08(this.A00, AnonymousClass445.A00, userSession);
    }
}
