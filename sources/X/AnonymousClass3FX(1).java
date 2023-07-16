package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3FX  reason: invalid class name */
public final class AnonymousClass3FX {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Fragment A02;

    public AnonymousClass3FX(Fragment fragment, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = fragment.requireActivity();
    }

    public final void A00(List list) {
        AnonymousClass4MA.A04(this, list, 96, 2131835532);
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36324277884035480L)) {
            AnonymousClass4MA.A04(this, list, 97, 2131835534);
        }
        if (C63803iN.A0E(r2, userSession, 36321537694899082L)) {
            list.add(AnonymousClass4MA.A00(C18200wM.A0R(userSession, this.A00, 170), 2131824752));
        }
    }
}
