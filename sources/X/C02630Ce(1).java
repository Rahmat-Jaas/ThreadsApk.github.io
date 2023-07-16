package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Ce  reason: invalid class name and case insensitive filesystem */
public final class C02630Ce implements Runnable {
    public final /* synthetic */ C13080my A00;
    public final /* synthetic */ C17810va A01;

    public C02630Ce(C13080my r1, C17810va r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass0v1 r3 = (AnonymousClass0v1) this.A01.A04.A00();
        C13080my r5 = this.A00;
        C000200d r4 = r5.A01;
        C11070jQ r2 = r4.A0H;
        C04220Ms.A0B(r3.toString(), 0);
        List list = r2.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onMqttNetworkConnectionFailed");
            }
        }
        if (r3.equals(AnonymousClass0v1.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || r3.equals(AnonymousClass0v1.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            C17030uB r22 = r4.A0T;
            synchronized (r22) {
                r22.A0A = true;
            }
        }
        if (r4.A0s == r5.A00) {
            Integer num = AnonymousClass006.A00;
            if (r3.equals(AnonymousClass0v1.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                r4.A0I.clear();
            } else if (r3.equals(AnonymousClass0v1.FAILED_CONNECTION_REFUSED_REVOKED_PUBLIC_KEY)) {
                r4.A0R.CWb();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C000200d.A01(new C12760mR(r3), r4, num);
        }
        ((C12880me) r4.A0D.A05(C03100Ei.class)).A02(C12870md.A06, r3.name());
    }
}
