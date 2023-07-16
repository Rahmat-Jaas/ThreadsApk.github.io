package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HD  reason: invalid class name */
public final class AnonymousClass4HD implements C82924qU {
    public C67263zF A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("is_enabled", false);
        C67263zF r2 = this.A00;
        if (r2 == null) {
            r2 = C60303Om.A00(this.A01);
            this.A00 = r2;
        }
        r2.A04(this.A01, "upsell", booleanQueryParameter);
    }

    public AnonymousClass4HD(UserSession userSession) {
        this.A01 = userSession;
    }
}
