package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0001000_I2;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.57L  reason: invalid class name */
public final class AnonymousClass57L extends C62793ak {
    public final C110926mV A00;
    public final C21839C2o A01;
    public final UserSession A02;
    public final C86074wE A03;
    public final C86094wG A04;

    public /* synthetic */ AnonymousClass57L(C21839C2o c2o, UserSession userSession) {
        C110926mV A002 = C33462Fu.A00(userSession);
        C04220Ms.A0B(A002, 3);
        this.A02 = userSession;
        this.A01 = c2o;
        this.A00 = A002;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0001000_I2(AnonymousClass0wJ.A04(A002.A05.getValue()), 0));
        this.A03 = A0z;
        this.A04 = C18230wP.A0x((C148838sG) null, A0z);
        c2o.getModuleName();
        long currentTimeMillis = System.currentTimeMillis();
        C86094wG r1 = A002.A04;
        long j = 0;
        if (C18190wL.A08(r1.getValue()) > 0 && currentTimeMillis >= C18190wL.A08(r1.getValue())) {
            j = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - C18190wL.A08(r1.getValue()));
        }
        C63583hq.A05(userSession, "take_break", j);
    }
}
