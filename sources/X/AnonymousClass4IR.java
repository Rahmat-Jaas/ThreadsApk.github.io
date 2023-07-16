package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4IR  reason: invalid class name */
public final class AnonymousClass4IR implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A0L;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("trigger", uri.getQueryParameter("trigger"));
            C63743iE.A08(this.A00, C18190wL.A0N(userSession), C63743iE.A02("com.instagram.bullying.privacy.evergreen_safety_check_screen", A0y), 2131826907);
        }
    }

    public AnonymousClass4IR(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
