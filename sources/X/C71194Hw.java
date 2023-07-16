package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hw  reason: invalid class name and case insensitive filesystem */
public final class C71194Hw implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        if (uri != null) {
            C37081JkD.A00(uri, this.A00, MapEntryPoint.MAIN_FEED_QP, this.A01, C18180wK.A0e());
        }
    }

    public C71194Hw(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
