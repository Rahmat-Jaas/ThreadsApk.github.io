package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4IY  reason: invalid class name */
public final class AnonymousClass4IY implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A0M;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            String queryParameter = uri.getQueryParameter("content_version");
            if (queryParameter != null) {
                Integer.parseInt(queryParameter);
            }
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "0");
            C63743iE.A09(this.A00, C18190wL.A0N(userSession), C63743iE.A02("com.instagram.bullying.privacy.limits_entrypoint", A0y), 2131829644);
        }
    }

    public AnonymousClass4IY(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
