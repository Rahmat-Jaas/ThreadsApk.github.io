package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6lc  reason: invalid class name and case insensitive filesystem */
public final class C110396lc {
    public final long A00;
    public final C31027Gdr A01;
    public final AtomicBoolean A02 = C18230wP.A0w();
    public final AtomicLong A03;
    public final UserSession A04;

    public C110396lc(UserSession userSession) {
        this.A04 = userSession;
        this.A01 = new C31027Gdr(userSession);
        this.A03 = new AtomicLong((long) 17638221);
        this.A00 = C63803iN.A03(AnonymousClass0TJ.A06, userSession, 36605181630484866L);
    }
}
