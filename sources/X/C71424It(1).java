package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4It  reason: invalid class name and case insensitive filesystem */
public final class C71424It implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        uri.getQueryParameter("entrypoint");
        String queryParameter = uri.getQueryParameter("sticker_id");
        uri.getBooleanQueryParameter("is_suggested_sticker", false);
        C18180wK.A0v(C28161tl.A03(this.A01), "sticker_id_added_via_feed_megaphone", queryParameter);
        Fragment fragment = this.A00;
        if (fragment instanceof C34640IcN) {
            ((C34640IcN) fragment).getRootActivity();
        }
    }

    public C71424It(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
