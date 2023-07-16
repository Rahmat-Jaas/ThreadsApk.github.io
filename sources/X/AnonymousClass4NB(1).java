package X;

import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.4NB  reason: invalid class name */
public final class AnonymousClass4NB implements C83184qv {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4NB(C11630kW r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void CNQ(boolean z) {
        UserSession userSession = this.A01;
        C63823iP.A0A(userSession);
        C11630kW r0 = this.A00;
        AnonymousClass0wJ.A1N(userSession, r0);
        AnonymousClass3Ui.A00(new AnonymousClass3Ui(r0, userSession), C63823iP.A05(userSession), true, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_toggled", this.A02, (Map) null, 176);
    }
}
