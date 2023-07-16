package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4HV  reason: invalid class name */
public final class AnonymousClass4HV implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass268 r1 = AnonymousClass268.A0F;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A02(obj)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("usecase", "ecm_filtered_content_management");
            C63743iE A02 = C63743iE.A02("com.bloks.www.bloks.prcx.identity.selection", A0y);
            FragmentActivity fragmentActivity = this.A00;
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            A0N.A0S = "";
            C63743iE.A07(fragmentActivity, A0N, A02);
        }
    }

    public AnonymousClass4HV(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
