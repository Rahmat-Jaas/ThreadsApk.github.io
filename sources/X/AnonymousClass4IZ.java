package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IZ  reason: invalid class name */
public final class AnonymousClass4IZ implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00, this.A01);
        C18190wL.A10();
        A0Q.A03 = new AnonymousClass1wM();
        A0Q.A05();
    }

    public AnonymousClass4IZ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
