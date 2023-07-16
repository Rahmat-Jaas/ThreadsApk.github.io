package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ic  reason: invalid class name and case insensitive filesystem */
public final class C71254Ic implements C82924qU {
    public Fragment A00;
    public UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass2L1.A00(this.A00.requireActivity(), C312224t.UNKNOWN, this.A01);
    }

    public C71254Ic(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
