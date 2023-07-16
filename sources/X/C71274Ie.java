package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* renamed from: X.4Ie  reason: invalid class name and case insensitive filesystem */
public final class C71274Ie implements C82924qU {
    public final FragmentActivity A00;
    public final C10300i6 A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        FragmentActivity fragmentActivity = this.A00;
        C10300i6 r4 = this.A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (uri == null || (str = uri.getQueryParameter("origin")) == null || str.length() == 0) {
            str = "deep_link";
        }
        A0y.put("origin", str);
        C63753iH.A0B(fragmentActivity, r4, A0y);
    }

    public C71274Ie(FragmentActivity fragmentActivity, C10300i6 r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
