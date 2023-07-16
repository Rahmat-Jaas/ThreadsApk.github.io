package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IX  reason: invalid class name */
public final class AnonymousClass4IX implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        Bundle A06 = C18180wK.A06();
        C18230wP.A13(uri, A06, "should_show_promotion_content");
        C18190wL.A12(uri, A06, "entry_point");
        C18190wL.A12(uri, A06, "media_id");
        C18190wL.A12(uri, A06, "dummy_param_random_uuid");
        C18230wP.A13(uri, A06, "has_relaunched_from_main_activity");
        C63753iH.A06(A06, this.A00.getActivity(), this.A01);
    }

    public AnonymousClass4IX(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
