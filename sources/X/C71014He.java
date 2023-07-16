package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4He  reason: invalid class name and case insensitive filesystem */
public final class C71014He implements C82924qU {
    public UserSession A00;
    public final Context A01;

    public final void BN1(Uri uri, Bundle bundle) {
        if (!C62513aA.A01(this.A01, this.A00, uri.toString(), "ExternalUrlActionHandler")) {
            AnonymousClass3RZ.A00();
            uri.toString();
        }
    }

    public C71014He(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
    }
}
