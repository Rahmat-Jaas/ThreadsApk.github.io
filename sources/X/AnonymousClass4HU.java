package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HU  reason: invalid class name */
public final class AnonymousClass4HU implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        C63863iT.A02(fragment.requireActivity(), bundle, this.A01, ModalActivity.class, "on_device_nudity_detection_inbox_nux").A0I(fragment.getContext());
    }

    public AnonymousClass4HU(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
