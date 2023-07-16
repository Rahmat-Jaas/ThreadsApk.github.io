package X;

import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.493  reason: invalid class name */
public final class AnonymousClass493 implements AnonymousClass0i4 {
    public C32165H8c A00;
    public C32165H8c A01;
    public AnonymousClass1aY A02;
    public Boolean A03;
    public String A04 = "";
    public String A05 = "";
    public final IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 50);
    public final IDxACallbackShape111S0100000_1_I2 A07 = C63873iU.A06(this, 51);
    public final C61083Rv A08;
    public final C559235c A09;
    public final UserSession A0A;
    public final C11630kW A0B;

    public final void A00() {
        synchronized (this) {
            H1T A0P = AnonymousClass0wJ.A0P(this.A0A);
            A0P.A0J("direct_v2/welcome_message/get/");
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1RX.class, AnonymousClass3KC.class);
            this.A01 = A0T;
            A0T.A00 = this.A07;
            C31155GhB.A03(A0T);
        }
    }

    public final void onSessionWillEnd() {
        this.A0A.A03(AnonymousClass493.class);
    }

    public AnonymousClass493(C11630kW r2, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r2);
        this.A0A = userSession;
        this.A0B = r2;
        this.A09 = AnonymousClass2SO.A00(userSession);
        this.A08 = new C61083Rv(r2, userSession);
    }
}
