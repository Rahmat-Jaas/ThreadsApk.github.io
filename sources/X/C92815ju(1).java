package X;

import android.os.Bundle;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.service.session.UserSession;

/* renamed from: X.5ju  reason: invalid class name and case insensitive filesystem */
public final class C92815ju extends C882957m {
    public FBPayLoggerData A00;
    public final M5J A01;
    public final M5J A02;
    public final C143688h9 A03;
    public final UserSession A04;

    public C92815ju(C107356gc r4, C143688h9 r5, UserSession userSession) {
        this.A03 = r5;
        M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape326S0100000_2_I2((Object) r4, 43), r4.A00);
        this.A01 = C86114wI.A0H(A002, this, 24);
        C880856r.A05(A002, this.A03, this, 240);
        this.A02 = C86114wI.A0H(A002, this, 25);
        this.A04 = userSession;
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A00 = C86104wH.A0Q(bundle);
    }
}
