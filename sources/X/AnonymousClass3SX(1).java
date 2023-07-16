package X;

import android.content.Context;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3SX  reason: invalid class name */
public final class AnonymousClass3SX {
    public final UserSession A00;
    public final Context A01;

    public static final void A00(C210318o r17, AnonymousClass3SX r18, Integer num, Integer num2) {
        C84454tA ArU;
        XFBYPRequestStatus BDh;
        String id;
        UserSession userSession = r18.A00;
        User A0R = C18250wR.A0R(userSession);
        C84674tf A0Z = A0R.A0Z();
        if (A0Z != null) {
            C210118m D2g = A0Z.D2g();
            D2g.Ac1();
            String Ahm = D2g.Ahm();
            Boolean AmO = D2g.AmO();
            Boolean BTI = D2g.BTI();
            Boolean BUb = D2g.BUb();
            Boolean BUc = D2g.BUc();
            Boolean BXf = D2g.BXf();
            Boolean BYv = D2g.BYv();
            Boolean BYw = D2g.BYw();
            D2g.ArU();
            List B5a = D2g.B5a();
            String B93 = D2g.B93();
            D2g.B94();
            A0R.A1r(C33252Ez.A00(D2g, r17, AmO, BTI, BUb, BUc, BXf, BYv, BYw, num2, num, Ahm, B93, B5a));
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
                    C696349j.A03(userSession).A0H();
                    C696349j.A03(userSession).A0I();
                    break;
                }
            }
            C696349j.A03(userSession).A0L();
            C696349j A03 = C696349j.A03(userSession);
            UserSession userSession2 = A03.A02;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36322370918554945L) && C63043bN.A02(userSession2)) {
                C04620Ok r0 = C06810aP.A01;
                C04220Ms.A0A(userSession2);
                C84674tf A0Z2 = r0.A01(userSession2).A0Z();
                if (A0Z2 != null && (ArU = A0Z2.ArU()) != null && (BDh = ArU.BDh()) != null && BDh.equals(XFBYPRequestStatus.REJECTED) && (id = ArU.getId()) != null && !C62803am.A01(C63043bN.A01, userSession2).getBoolean(AnonymousClass00U.A0L("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", id), false)) {
                    AnonymousClass4S4 r2 = new AnonymousClass4S4(A03, id);
                    C63643hy.A03(r2);
                    C63643hy.A06(r2, 2000);
                }
            }
        }
    }

    public AnonymousClass3SX(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
    }
}
