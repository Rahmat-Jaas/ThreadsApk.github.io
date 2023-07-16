package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J0  reason: invalid class name */
public final class AnonymousClass4J0 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0a = false;
        C37383Jqm A002 = A0L.A00();
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass3WJ.A02();
        C37383Jqm.A00(fragmentActivity, C62853b1.A01(C18190wL.A0N(userSession), C63743iE.A02("com.bloks.www.ig_subscriptions.creator_experience.welcome_message_send", AnonymousClass0wJ.A0y())), A002);
    }

    public AnonymousClass4J0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
