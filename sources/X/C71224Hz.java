package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hz  reason: invalid class name and case insensitive filesystem */
public final class C71224Hz implements C82924qU {
    public UserSession A00;
    public final Fragment A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        Fragment fragment = this.A01;
        C63863iT.A0D(fragment, C63863iT.A04(fragment.requireActivity(), A06, this.A00, ModalActivity.class, "settings_notifications"));
    }

    public C71224Hz(Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A00 = userSession;
    }
}
