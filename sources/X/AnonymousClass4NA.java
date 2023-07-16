package X;

import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.4NA  reason: invalid class name */
public final class AnonymousClass4NA implements C83184qv {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4NA(C11630kW r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void CNQ(boolean z) {
        UserSession userSession = this.A01;
        C63823iP.A0A(userSession);
        C11630kW r0 = this.A00;
        AnonymousClass0wJ.A1N(userSession, r0);
        AnonymousClass3Ui r4 = new AnonymousClass3Ui(r0, userSession);
        AnonymousClass3DJ A06 = C63823iP.A06(userSession, C696349j.A03(userSession).A0G());
        String str = this.A02;
        if (str == null) {
            str = "unknown";
        }
        AnonymousClass3Ui.A00(r4, A06, true, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_toggled", str, (Map) null, 176);
    }
}
