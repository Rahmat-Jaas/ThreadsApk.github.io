package X;

import java.util.Map;

/* renamed from: X.6pC  reason: invalid class name and case insensitive filesystem */
public final class C112216pC {
    public final Object A00 = C86144wL.A0d();
    public final Map A01 = AnonymousClass0wJ.A0y();

    public final int A00(C127397h3 r5, C127397h3 r6, String str) {
        int incrementAndGet;
        AnonymousClass3H8 r3 = new AnonymousClass3H8(r6.A02, r5.A02, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(r3);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = AnonymousClass6YG.A00.incrementAndGet();
                C86154wM.A1T(r3, map, incrementAndGet);
            }
        }
        return incrementAndGet;
    }
}
