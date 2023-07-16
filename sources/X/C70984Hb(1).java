package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hb  reason: invalid class name and case insensitive filesystem */
public final class C70984Hb implements C82924qU {
    public final Context A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        H1T A0O = AnonymousClass0wJ.A0O(this.A01);
        A0O.A0J("users/set_message_settings_v2/");
        A0O.A0O("ig_followers", "primary");
        A0O.A0O("others_on_ig", "primary");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1TE.class, C60273Oj.class);
        C63873iU.A0E(A0T, this, 121);
        C31155GhB.A03(A0T);
    }

    public C70984Hb(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
