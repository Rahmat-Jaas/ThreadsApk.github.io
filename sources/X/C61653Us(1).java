package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Us  reason: invalid class name and case insensitive filesystem */
public final class C61653Us {
    public static final long A06 = (((long) 6) * TimeUnit.DAYS.toMillis(7));
    public boolean A00;
    public final UserSession A01;
    public final AtomicBoolean A02 = new AtomicBoolean(true);
    public final AtomicBoolean A03 = new AtomicBoolean(true);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    public final void A00(AnonymousClass2AD r4) {
        AtomicBoolean atomicBoolean;
        C04220Ms.A0B(r4, 0);
        AnonymousClass3WS.A01(this.A01);
        if (r4.ordinal() != 32) {
            atomicBoolean = this.A05;
        } else {
            atomicBoolean = this.A04;
        }
        atomicBoolean.set(false);
    }

    public C61653Us(UserSession userSession) {
        this.A01 = userSession;
    }
}
