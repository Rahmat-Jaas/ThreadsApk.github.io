package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HC  reason: invalid class name */
public final class AnonymousClass4HC implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass4HC(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C18190wL.A10();
        C29081wh r2 = new C29081wh();
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, this.A01);
        A0Q.A03 = r2;
        A0Q.A05();
    }
}
