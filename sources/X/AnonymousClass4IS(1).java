package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IS  reason: invalid class name */
public final class AnonymousClass4IS implements C82924qU {
    public final C26141q7 A00;
    public final AnonymousClass3z4 A01;

    public final void BN1(Uri uri, Bundle bundle) {
        synchronized (AnonymousClass4IS.class) {
            AnonymousClass3z4.A00(this.A01, 7, false, false);
            this.A00.A06("ig_fb_reauth");
        }
    }

    public AnonymousClass4IS(Fragment fragment, UserSession userSession) {
        this.A01 = new AnonymousClass3z4(userSession);
        this.A00 = C35762Os.A00().A00(fragment, userSession, new IDxAListenerShape459S0100000_1_I2(this, 11));
    }
}
