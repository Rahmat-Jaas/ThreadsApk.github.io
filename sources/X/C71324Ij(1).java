package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4Ij  reason: invalid class name and case insensitive filesystem */
public final class C71324Ij implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public C71324Ij(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        UserSession userSession = this.A01;
        C63863iT.A0C(C62853b1.A00(C18190wL.A0N(userSession), C63743iE.A02("com.instagram.appointment.messaging_guidance.appt_messaging_hub.MessagingHubScreen", A0y)), this.A00, userSession);
    }
}
