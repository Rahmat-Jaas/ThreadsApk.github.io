package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4Hi  reason: invalid class name and case insensitive filesystem */
public final class C71054Hi implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("event_source", "quick_promotion");
        C63743iE A02 = C63743iE.A02("com.instagram.topics.preferences.browse_topics.screen", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(fragmentActivity, A0N, 2131821165);
        A0N.A0h = true;
        A02.A0C(fragmentActivity, A0N);
    }

    public C71054Hi(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
