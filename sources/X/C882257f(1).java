package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2;
import com.facebook.redex.IDxBListenerShape743S0100000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.57f  reason: invalid class name and case insensitive filesystem */
public final class C882257f extends C62793ak {
    public final C86074wE A00;
    public final C86094wG A01;
    public final C38039KHq A02;
    public final C82394pY A03;
    public final C27713Es3 A04;

    public final void onCleared() {
        this.A02.A02(this.A03, E6T.class);
    }

    public C882257f(UserSession userSession) {
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        this.A02 = A002;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0010000_I2(0));
        this.A00 = A0z;
        this.A01 = A0z;
        IDxBListenerShape743S0100000_2_I2 iDxBListenerShape743S0100000_2_I2 = new IDxBListenerShape743S0100000_2_I2(this, 1);
        this.A04 = iDxBListenerShape743S0100000_2_I2;
        C131417rv r2 = new C131417rv(this, userSession);
        this.A03 = r2;
        AnonymousClass3NS.A01(userSession).A01(AnonymousClass2AP.A05).A00(iDxBListenerShape743S0100000_2_I2);
        A002.A01(r2, E6T.class);
    }
}
