package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I3  reason: invalid class name */
public final class AnonymousClass4I3 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass4I3(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("ReelSettingsFragment.ARGUMENT_CAMERA_SETTINGS_MODE", AnonymousClass22K.LIVE);
        C63863iT.A08(this.A00, A06, this.A01, ModalActivity.class, "camera_settings");
    }
}
