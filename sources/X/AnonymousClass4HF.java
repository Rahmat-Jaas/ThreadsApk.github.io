package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HF  reason: invalid class name */
public final class AnonymousClass4HF implements C82924qU {
    public final Activity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321443206208299L)) {
            if (bundle == null) {
                bundle = C18180wK.A06();
            }
            bundle.putString("interest_based_channel_entry_point", "broadcast_chat_nux");
            int i = 1;
            if (C548530j.A00.A05(userSession)) {
                i = 2;
            }
            bundle.putInt("interest_based_channel_implicit_audience_type", i);
            C35292Mw.A00(bundle, AnonymousClass20y.Broadcast);
            C04220Ms.A0B(C305421t.WaitlistPending, 1);
            bundle.putString("BroadcastChannelNuxActionType", "WaitlistPending");
            bundle.putSerializable("social_channel_creation_source", AnonymousClass24S.QUICK_PROMOTION);
            C63863iT.A08(this.A00, bundle, userSession, ModalActivity.class, "direct_interest_channel_info");
        }
    }

    public AnonymousClass4HF(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
