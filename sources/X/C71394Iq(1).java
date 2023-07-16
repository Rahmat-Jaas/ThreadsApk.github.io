package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Iq  reason: invalid class name and case insensitive filesystem */
public final class C71394Iq implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C71394Iq(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("direct_is_creating_secret_conversation", true);
        C63863iT.A0A(this.A00, A06, this.A01, "direct_pick_recipients_redesign");
    }
}
