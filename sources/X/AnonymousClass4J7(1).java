package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J7  reason: invalid class name */
public final class AnonymousClass4J7 implements C82924qU {
    public final boolean A00;
    public final Activity A01;
    public final UserSession A02;

    public AnonymousClass4J7(Activity activity, UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 2);
        this.A01 = activity;
        this.A02 = userSession;
        this.A00 = z;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Integer num;
        Class<ModalActivity> cls;
        Activity activity;
        String str;
        Activity activity2;
        int i;
        C04220Ms.A0B(uri, 0);
        UserSession userSession = this.A02;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r3, userSession, 36321443206208299L)) {
            activity2 = this.A01;
            i = 2131825725;
        } else if (C63803iN.A0E(r3, userSession, 36321443206535984L)) {
            activity2 = this.A01;
            i = 2131825726;
        } else {
            if (bundle == null) {
                bundle = C18180wK.A06();
            }
            if (AnonymousClass268.A03.A02(uri.toString())) {
                num = AnonymousClass006.A00;
            } else {
                num = AnonymousClass006.A01;
            }
            AnonymousClass3M9.A01(bundle, num);
            if (C63803iN.A0E(r3, userSession, 36321443206470447L)) {
                cls = ModalActivity.class;
                activity = this.A01;
                str = "direct_broadcast_channel_waitlist_video_intro";
            } else {
                bundle.putString("interest_based_channel_entry_point", "broadcast_chat_nux");
                int i2 = 1;
                if (C548530j.A00.A05(userSession)) {
                    i2 = 2;
                }
                bundle.putInt("interest_based_channel_implicit_audience_type", i2);
                C35292Mw.A00(bundle, AnonymousClass20y.Broadcast);
                C04220Ms.A0B(C305421t.JoinWaitlist, 1);
                bundle.putString("BroadcastChannelNuxActionType", "JoinWaitlist");
                bundle.putSerializable("social_channel_creation_source", AnonymousClass24S.QUICK_PROMOTION);
                cls = ModalActivity.class;
                activity = this.A01;
                str = "direct_interest_channel_info";
            }
            C63863iT.A08(activity, bundle, userSession, cls, str);
            return;
        }
        C25828Dsm A0W = C18190wL.A0W(activity2);
        C18190wL.A1R(A0W, activity2, this, 48, 2131831976);
        A0W.A0K(i);
        AnonymousClass0wJ.A1K(A0W);
    }
}
