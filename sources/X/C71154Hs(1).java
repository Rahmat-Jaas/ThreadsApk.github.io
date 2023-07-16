package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hs  reason: invalid class name and case insensitive filesystem */
public final class C71154Hs implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A0A;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            String queryParameter = uri.getQueryParameter("source_promotion");
            C63473hX A012 = C63473hX.A01(userSession);
            AnonymousClass3DE r12 = new AnonymousClass3DE(queryParameter, (String) null);
            r12.A04 = "qp_upsell_clicked";
            r12.A05 = "upsell";
            A012.A08(r12);
            Bundle A06 = C18180wK.A06();
            A06.putString("qp_source_upsell", queryParameter);
            Fragment fragment = this.A00;
            C63863iT A02 = C63863iT.A02(fragment.requireActivity(), A06, userSession, ModalActivity.class, "interop_upgrade");
            A02.A0F();
            A02.A0J(fragment, 14165);
        }
    }

    public C71154Hs(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
