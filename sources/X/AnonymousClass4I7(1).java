package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I7  reason: invalid class name */
public final class AnonymousClass4I7 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("monetization_type");
        String queryParameter2 = uri.getQueryParameter("entry_point");
        String queryParameter3 = uri.getQueryParameter("upl_session_id");
        C25786Drz A0Q = C18180wK.A0Q(this.A00, this.A01);
        A0Q.A03 = AnonymousClass6S1.A00(AnonymousClass2FJ.A00(queryParameter), AnonymousClass2SD.A00(queryParameter2), (String) null, queryParameter3, true);
        A0Q.A05();
    }

    public AnonymousClass4I7(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
