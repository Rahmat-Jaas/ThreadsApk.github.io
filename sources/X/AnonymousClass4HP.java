package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HP  reason: invalid class name */
public final class AnonymousClass4HP implements C82924qU {
    public final Activity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AnonymousClass0BO r2 = userSession.multipleAccountHelper;
        Activity activity = this.A00;
        AnonymousClass0R6 A0C = r2.A0C(activity, userSession, (String) null, true);
        if (A0C.A01) {
            AnonymousClass3YR.A00.A03(activity, A0C.A00, userSession, false);
        }
    }

    public AnonymousClass4HP(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
