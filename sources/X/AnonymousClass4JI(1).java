package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JI  reason: invalid class name */
public final class AnonymousClass4JI implements C82924qU {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("email");
        UserSession userSession = this.A02;
        Integer num = AnonymousClass006.A01;
        Context context = this.A00;
        C32165H8c A022 = C63503hc.A02(context, userSession, num, queryParameter);
        C63873iU.A0E(A022, this, 124);
        C31155GhB.A01(context, this.A01, A022);
    }

    public AnonymousClass4JI(Context context, AnonymousClass06E r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
