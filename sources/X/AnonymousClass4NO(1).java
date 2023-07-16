package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4NO  reason: invalid class name */
public final class AnonymousClass4NO implements C84414t6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public final boolean Cs6() {
        return true;
    }

    public AnonymousClass4NO(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void Bgx() {
        C63183gx.A04(this.A00, this.A01);
    }

    public final void BhM() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C63183gx.A05(fragmentActivity, userSession);
        C54502zY.A00(C13330nS.A01((C11630kW) null, userSession), userSession, (User) null, "comments", "click", "cant_mention_alert_nux_go_to_settings");
    }

    public final boolean Cs7() {
        return AnonymousClass0wJ.A1W(this.A00);
    }
}
