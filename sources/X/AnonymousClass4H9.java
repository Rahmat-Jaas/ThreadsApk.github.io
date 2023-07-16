package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape222S0200000_1_I2;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4H9  reason: invalid class name */
public final class AnonymousClass4H9 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        Map map;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass43D r3 = new AnonymousClass43D();
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("referer", "settings_ad_options");
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312226205860731L)) {
            str = "com.bloks.www.fx.settings.individual_setting.async";
            map = C63753iH.A01();
        } else {
            str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
            map = A0y;
        }
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        supportFragmentManager.A0v(new IDxCListenerShape222S0200000_1_I2(fragmentActivity, supportFragmentManager, 3));
        C130667qT A0T = C18220wO.A0T(fragmentActivity, r3, userSession);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession, str, map);
        A002.A00 = new IDxACallbackShape103S0100000_1_I2(A0T, 12);
        C31155GhB.A03(A002);
    }

    public AnonymousClass4H9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
