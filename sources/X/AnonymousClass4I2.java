package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I2  reason: invalid class name */
public final class AnonymousClass4I2 implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        C63493hb.A01(fragment.getActivity(), AnonymousClass25S.APPIRATER_FEEDBACK, this.A01, fragment.getString(2131835484), fragment.getString(2131828982));
    }

    public AnonymousClass4I2(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
