package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3GV  reason: invalid class name */
public final class AnonymousClass3GV {
    public static AnonymousClass3GV A00;

    public final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass0wJ.A1M(str, 0, userSession);
        C34462Jq.A00(userSession).A05(str, (String) null, (String) null);
        String string = bundle.getString("coupon_offer_id");
        String string2 = bundle.getString("dummy_param_random_uuid");
        String string3 = bundle.getString("entry_point");
        if (TextUtils.isEmpty(string3)) {
            string3 = "DEEP_LINK";
        }
        if (string2 == null) {
            Uri.Builder authority = C18220wO.A0D().authority("active_promotions");
            authority.appendQueryParameter("entry_point", string3);
            if (string != null) {
                authority.appendQueryParameter("coupon_offer_id", string);
            }
            authority.appendQueryParameter("dummy_param_random_uuid", C18180wK.A0e());
            C10650ih.A02(fragmentActivity, C62333Yi.A00(fragmentActivity).setData(authority.build()));
        }
        fragmentActivity.finish();
    }

    public final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A1O(fragmentActivity, userSession);
        C34462Jq.A00(userSession).A05(str, (String) null, (String) null);
        C62883b4.A03();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("coupon_offer_id", str2);
        C34620Ibt ibt = new C34620Ibt();
        ibt.setArguments(A0E);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A03 = ibt;
        A0Q.A08();
        if (z) {
            A0Q.A0C = false;
        }
        A0Q.A05();
    }
}
