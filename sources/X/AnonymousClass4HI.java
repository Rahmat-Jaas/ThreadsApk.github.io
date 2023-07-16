package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HI  reason: invalid class name */
public final class AnonymousClass4HI implements C82924qU {
    public final C34640IcN A00;
    public final UserSession A01;

    public AnonymousClass4HI(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(icN, 1);
        this.A00 = icN;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("entry_point", C314927v.TEMPLATE_BROWSER_ENTRY_POINT_DEEPLINK);
        UserSession userSession = this.A01;
        C34640IcN icN = this.A00;
        C35042Lw.A00(icN.requireActivity(), icN.requireContext(), A06, userSession);
    }
}
