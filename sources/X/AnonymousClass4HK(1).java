package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HK  reason: invalid class name */
public final class AnonymousClass4HK implements C82924qU {
    public UserSession A00;
    public final FragmentActivity A01;

    public final void BN1(Uri uri, Bundle bundle) {
        new AnonymousClass433(this.A01, this.A00).BaO(C312224t.DIRECT_INBOX_FILTER_QP);
    }

    public AnonymousClass4HK(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = userSession;
    }
}
