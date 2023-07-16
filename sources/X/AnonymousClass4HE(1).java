package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HE  reason: invalid class name */
public final class AnonymousClass4HE implements C82924qU {
    public final Activity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Activity activity;
        int i;
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r2, userSession, 36321443206208299L)) {
            activity = this.A00;
            i = 2131825725;
        } else if (C63803iN.A0E(r2, userSession, 36321443206535984L)) {
            activity = this.A00;
            i = 2131825726;
        } else {
            if (bundle == null) {
                bundle = C18180wK.A06();
            }
            bundle.putString("waitlistJoinSourceKey", "QUICK_PROMOTION");
            C63863iT.A08(this.A00, bundle, userSession, ModalActivity.class, "direct_broadcast_channel_waitlist_join");
            return;
        }
        C25828Dsm A0W = C18190wL.A0W(activity);
        C18180wK.A1M(A0W);
        A0W.A0K(i);
        AnonymousClass0wJ.A1K(A0W);
    }

    public AnonymousClass4HE(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
