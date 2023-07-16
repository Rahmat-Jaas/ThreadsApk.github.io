package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IG  reason: invalid class name */
public final class AnonymousClass4IG implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00.requireActivity(), this.A01);
        C24016D5r.A00();
        A0Q.A03 = new C25802DsG().A06();
        A0Q.A05();
    }

    public AnonymousClass4IG(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
