package X;

import com.google.common.collect.EvictingQueue;
import com.instagram.service.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.KtLambdaShape84S0100000_I2_64;

/* renamed from: X.62B  reason: invalid class name */
public final class AnonymousClass62B extends C27021rj {
    public final EvictingQueue A00 = new EvictingQueue(200);
    public final AnonymousClass01V A01 = AnonymousClass01V.A0p;
    public final AnonymousClass7pR A02;
    public final IgU A03;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(10);
        timeUnit.toMillis(10);
    }

    public final Set A00() {
        HashSet A0u = C18200wM.A0u();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0u.add(A0k);
            if (A0k.equals("FEED_REQUEST_STARTED")) {
                A0u.clear();
            }
        }
        return A0u;
    }

    public final void A01(String str) {
        AnonymousClass01V r2 = this.A01;
        if (r2.isMarkerOn(974462634, 0)) {
            r2.markerPoint(974462634, str);
            r2.markerEnd(974462634, 2);
        }
        this.A03.A04("SHIMMER_END", str);
    }

    public AnonymousClass62B(IgU igU, UserSession userSession) {
        AnonymousClass7pR r0;
        if (C19573AyZ.A03(userSession)) {
            r0 = (AnonymousClass7pR) userSession.A01(AnonymousClass7pR.class, new KtLambdaShape84S0100000_I2_64(userSession, 33));
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A03 = igU;
    }

    public final void onScrollStateChanged(C24 c24, int i) {
        int A032 = C14030oh.A03(-1067362993);
        if (i == 0) {
            c24.BRQ();
        }
        C14030oh.A0A(1722668555, A032);
    }
}
