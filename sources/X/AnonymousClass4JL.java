package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JL  reason: invalid class name */
public final class AnonymousClass4JL implements C82924qU {
    public final FragmentActivity A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        Object obj;
        if (bundle != null && (obj = bundle.get("target_thread_id")) != null) {
            AnonymousClass3LY.A00(this.A02).CWx(new C688845v((String) obj));
        }
    }

    public AnonymousClass4JL(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
