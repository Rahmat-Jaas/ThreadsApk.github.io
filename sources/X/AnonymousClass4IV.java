package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4IV  reason: invalid class name */
public final class AnonymousClass4IV implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public AnonymousClass4IV(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        UserSession userSession = this.A01;
        C63863iT.A0C(C62853b1.A00(C18190wL.A0N(userSession), C63743iE.A02("com.instagram.group_chat_commerce.messaging_guidance.gcc_messaging_hub.MessagingHubScreen", A0y)), this.A00, userSession);
    }
}
