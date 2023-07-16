package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JN  reason: invalid class name */
public final class AnonymousClass4JN implements C82924qU {
    public final Fragment A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        C11630kW r0 = this.A01;
        C61083Rv.A00(AnonymousClass29Z.WELCOME_MESSAGE_SETTINGS_QP_SETUP_BUTTON_CLICK, new C61083Rv(r0, userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, "source_qp", (String) null);
        C35112Md.A00(r0, userSession).A00();
        Bundle A06 = C18180wK.A06();
        A06.putString("entry_point", "inbox_qp");
        Fragment fragment = this.A00;
        C63863iT.A02(fragment.requireActivity(), A06, userSession, ModalActivity.class, "direct_greeting_setting_fragment").A0J(fragment, 13685);
    }

    public AnonymousClass4JN(Fragment fragment, C11630kW r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
