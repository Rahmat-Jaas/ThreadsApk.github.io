package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Y6  reason: invalid class name */
public final class AnonymousClass3Y6 {
    public List A00 = AnonymousClass0wJ.A0v();
    public final Map A01 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());

    public static synchronized void A00(C62303Ye r2, AnonymousClass3Y6 r3, String str) {
        synchronized (r3) {
            C62303Ye r1 = (C62303Ye) r3.A01.put(str, r2);
            if (r1 != null) {
                r3.A00.remove(r1);
            }
            r3.A00.add(r2);
        }
    }

    public final synchronized void A01(C62303Ye r3) {
        A00(r3, this, AnonymousClass00U.A0L(r3.A02, r3.A01));
    }

    public AnonymousClass3Y6(AnonymousClass3Y6 r4) {
        synchronized (r4) {
            for (C62303Ye r1 : r4.A00) {
                A01(new C62303Ye(r1));
            }
        }
    }

    public AnonymousClass3Y6() {
    }
}
