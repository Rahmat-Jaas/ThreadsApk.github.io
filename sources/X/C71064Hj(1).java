package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hj  reason: invalid class name and case insensitive filesystem */
public final class C71064Hj implements C82924qU {
    public UserSession A00;
    public final FragmentActivity A01;

    public C71064Hj(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C18190wL.A10();
        AnonymousClass1wH r2 = new AnonymousClass1wH();
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A01, this.A00);
        A0Q.A03 = r2;
        A0Q.A05();
    }
}
