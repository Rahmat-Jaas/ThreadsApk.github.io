package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hy  reason: invalid class name and case insensitive filesystem */
public final class C71214Hy implements C82924qU {
    public UserSession A00;
    public final FragmentActivity A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        FragmentActivity fragmentActivity = this.A01;
        C63863iT.A04(fragmentActivity, A06, this.A00, ModalActivity.class, "direct_pick_video_call_recipients").A0I(fragmentActivity);
    }

    public C71214Hy(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = userSession;
    }
}
