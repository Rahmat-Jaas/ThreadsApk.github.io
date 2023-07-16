package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ib  reason: invalid class name and case insensitive filesystem */
public final class C71244Ib implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C71244Ib(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        C18230wP.A13(uri, A06, "scroll_to_message_access_toggle");
        String queryParameter = uri.getQueryParameter("entry_point");
        if (queryParameter != null) {
            A06.putString("entry_point", queryParameter);
        }
        FragmentActivity fragmentActivity = this.A00;
        C63863iT.A04(fragmentActivity, A06, this.A01, ModalActivity.class, "reachability_settings").A0I(fragmentActivity);
    }
}
