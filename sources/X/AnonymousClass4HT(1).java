package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HT  reason: invalid class name */
public final class AnonymousClass4HT implements C82924qU {
    public UserSession A00;
    public final Fragment A01;

    public final void BN1(Uri uri, Bundle bundle) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("scrollToVideo", false);
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("scroll_to_video_chat", booleanQueryParameter);
        Fragment fragment = this.A01;
        C63863iT.A0D(fragment, C63863iT.A04(fragment.requireActivity(), A06, this.A00, ModalActivity.class, "direct_settings_notification"));
    }

    public AnonymousClass4HT(Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A00 = userSession;
    }
}
