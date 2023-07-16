package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hf  reason: invalid class name and case insensitive filesystem */
public final class C71024Hf implements C82924qU {
    public final Context A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        Context context = this.A00;
        if (C19573AyZ.A03(this.A01)) {
            C37412JrW.A01(context, uri.toString());
        }
    }

    public C71024Hf(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
