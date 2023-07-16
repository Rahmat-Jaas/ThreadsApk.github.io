package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4NN  reason: invalid class name */
public final class AnonymousClass4NN implements C84414t6 {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ C26291E7x A01;

    public final void Bgx() {
    }

    public final boolean Cs6() {
        return false;
    }

    public AnonymousClass4NN(C34640IcN icN, C26291E7x e7x) {
        this.A01 = e7x;
        this.A00 = icN;
    }

    public final void BhM() {
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01.A0B;
        C63183gx.A05(requireActivity, userSession);
        C54502zY.A00(C13330nS.A01((C11630kW) null, userSession), userSession, (User) null, "post_caption", "click", "cant_mention_alert_nux_go_to_settings");
    }

    public final boolean Cs7() {
        return AnonymousClass0wJ.A1W(this.A00.getActivity());
    }
}
