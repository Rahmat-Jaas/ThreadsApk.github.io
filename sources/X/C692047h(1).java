package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29;

/* renamed from: X.47h  reason: invalid class name and case insensitive filesystem */
public final class C692047h implements C10390iG {
    public final UserSession A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape49S0100000_I2_29(this, 31));
    public final C84734tm A02;

    public C692047h(C84734tm r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final void onAppBackgrounded() {
        C14030oh.A0A(-325436357, C14030oh.A03(-1507087573));
    }

    public final void onAppForegrounded() {
        int i;
        int A03 = C14030oh.A03(608399724);
        UserSession userSession = this.A00;
        String str = KK7.A00(userSession).A09;
        if (str != null && C18220wO.A1V("clips_viewer", 1, str)) {
            i = 302149916;
        } else if (!AnonymousClass0wJ.A1X(this.A01.getValue()) || C19363Av6.A00(userSession)) {
            this.A02.DB0();
            i = -857147100;
        } else {
            i = 267064650;
        }
        C14030oh.A0A(i, A03);
    }
}
