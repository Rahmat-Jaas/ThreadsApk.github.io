package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3SW  reason: invalid class name */
public final class AnonymousClass3SW {
    public final UserSession A00;
    public final Context A01;

    public static final void A00(AnonymousClass3SW r15, List list) {
        UserSession userSession = r15.A00;
        User A0R = C18250wR.A0R(userSession);
        C84674tf A0Z = A0R.A0Z();
        if (A0Z != null) {
            C210118m D2g = A0Z.D2g();
            Integer Ac1 = D2g.Ac1();
            String Ahm = D2g.Ahm();
            Boolean AmO = D2g.AmO();
            Boolean BTI = D2g.BTI();
            Boolean BUb = D2g.BUb();
            Boolean BUc = D2g.BUc();
            Boolean BXf = D2g.BXf();
            Boolean BYv = D2g.BYv();
            Boolean BYw = D2g.BYw();
            C84454tA ArU = D2g.ArU();
            D2g.B5a();
            A0R.A1r(C33252Ez.A00(D2g, ArU, AmO, BTI, BUb, BUc, BXf, BYv, BYw, Ac1, D2g.B94(), Ahm, D2g.B93(), list));
            A0R.A1t(userSession);
            AnonymousClass24O[] values = AnonymousClass24O.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (C63193gy.A05(userSession, values[i])) {
                        break;
                    }
                    i++;
                } else {
                    C63433hT.A02();
                    C696349j.A03(userSession).A0I();
                    break;
                }
            }
            C696349j.A03(userSession).A0L();
        }
    }

    public AnonymousClass3SW(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
    }
}
