package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JJ  reason: invalid class name */
public final class AnonymousClass4JJ implements C82924qU {
    public final Fragment A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        AnonymousClass3h4.A02(this.A00, this.A01, userSession, AnonymousClass006.A0N);
    }

    public AnonymousClass4JJ(Fragment fragment, C11630kW r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
