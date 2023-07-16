package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.4Gv  reason: invalid class name and case insensitive filesystem */
public final class C70924Gv implements C82924qU {
    public final Context A00;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("package_name");
        if (queryParameter == null) {
            queryParameter = uri.getQueryParameter("id");
        }
        C09650fs.A01(this.A00, queryParameter, uri.getQueryParameter("referrer"));
    }

    public C70924Gv(Context context) {
        this.A00 = context;
    }
}
