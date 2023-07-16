package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;

/* renamed from: X.4J4  reason: invalid class name */
public final class AnonymousClass4J4 implements C82924qU {
    public final C34640IcN A00;
    public final C567438j A01;
    public final UserSession A02;

    public AnonymousClass4J4(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(icN, 1);
        this.A00 = icN;
        this.A02 = userSession;
        this.A01 = new C567438j(icN, userSession);
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C567438j r3 = this.A01;
        UserSession userSession = r3.A01;
        IDxRImplShape188S0000000_1_I2 iDxRImplShape188S0000000_1_I2 = new IDxRImplShape188S0000000_1_I2(r3, 15);
        C32165H8c A06 = C63503hc.A06(userSession);
        C63873iU.A0E(A06, iDxRImplShape188S0000000_1_I2, 119);
        C31155GhB.A03(A06);
    }
}
