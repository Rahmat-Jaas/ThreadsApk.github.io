package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J6  reason: invalid class name */
public final class AnonymousClass4J6 implements C82924qU {
    public final FragmentActivity A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        new AnonymousClass3Fj(this.A00, this.A01, this.A02).A00();
    }

    public AnonymousClass4J6(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
