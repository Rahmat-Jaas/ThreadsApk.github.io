package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J5  reason: invalid class name */
public final class AnonymousClass4J5 implements C82924qU {
    public final C34640IcN A00;
    public final C567438j A01;
    public final UserSession A02;

    public AnonymousClass4J5(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(icN, 1);
        this.A00 = icN;
        this.A02 = userSession;
        this.A01 = new C567438j(icN, userSession);
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C567438j r5 = this.A01;
        C35762Os.A00().A00(r5.A00, r5.A01, new IDxAListenerShape459S0100000_1_I2(r5, 9)).A06("ig_fb_profile_link_integration");
    }
}
