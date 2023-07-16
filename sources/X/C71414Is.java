package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape1S0210000_1_I2;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Is  reason: invalid class name and case insensitive filesystem */
public final class C71414Is implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        C04220Ms.A0B(uri, 0);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("should_hide_like_and_view_count", false);
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("accounts/set_like_and_view_counts/");
        if (booleanQueryParameter) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0O.A0O("hide_like_and_view_counts", str);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
        A0T.A00 = new IDxACallbackShape1S0210000_1_I2(1, userSession, fragmentActivity, booleanQueryParameter);
        C31155GhB.A03(A0T);
    }

    public C71414Is(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
