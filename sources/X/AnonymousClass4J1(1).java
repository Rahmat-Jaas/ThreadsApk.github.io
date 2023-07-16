package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J1  reason: invalid class name */
public final class AnonymousClass4J1 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass4J1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        A06.putString("csom_session_id", uri.getQueryParameter(C63833iQ.A03()));
        C63863iT.A08(this.A00, A06, this.A01, ModalActivity.class, "support_resources_csom_interstitial");
    }
}
