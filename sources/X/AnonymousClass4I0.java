package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I0  reason: invalid class name */
public final class AnonymousClass4I0 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        Bundle A06 = C18180wK.A06();
        C18190wL.A12(uri, A06, "effect_id");
        C63863iT.A08(this.A00, A06, this.A01, ModalActivity.class, "effects_page");
    }

    public AnonymousClass4I0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
