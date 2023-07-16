package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Iz  reason: invalid class name and case insensitive filesystem */
public final class C71484Iz implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        FragmentActivity fragmentActivity = this.A00;
        C63863iT.A06(fragmentActivity, A06, this.A01, TransparentModalActivity.class, "REEL_USER_PAY_SUBSCRIBE_STORY_STICKER").A0I(fragmentActivity);
    }

    public C71484Iz(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
