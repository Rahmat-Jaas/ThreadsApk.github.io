package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hc  reason: invalid class name and case insensitive filesystem */
public final class C70994Hc implements C82924qU {
    public final Context A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        H1T A0N = AnonymousClass0wJ.A0N(this.A01);
        A0N.A0J("video_call/change_notification_settings/");
        A0N.A0K("push_option", 2);
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
        C63873iU.A0E(A0S, this, 122);
        C31155GhB.A03(A0S);
    }

    public C70994Hc(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
