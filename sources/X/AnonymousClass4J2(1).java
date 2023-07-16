package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J2  reason: invalid class name */
public final class AnonymousClass4J2 implements C82924qU {
    public final Context A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(context, 186);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("users/turn_off_message_requests/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1TE.class, C60273Oj.class);
        A0T.A00 = A06;
        C31155GhB.A05(A0T, 1206419101, 3, true, false);
    }

    public AnonymousClass4J2(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
