package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.4I5  reason: invalid class name */
public final class AnonymousClass4I5 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass4I5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        String queryParameter = uri.getQueryParameter("scroll_to_auto_save");
        if (queryParameter == null) {
            queryParameter = "";
        }
        A06.putBoolean("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS", "true".equals(queryParameter.toLowerCase(Locale.ENGLISH).trim()));
        C63863iT.A08(this.A00, A06, this.A01, ModalActivity.class, "reel_settings");
    }
}
