package X;

import java.util.HashMap;

/* renamed from: X.6OG  reason: invalid class name */
public final class AnonymousClass6OG {
    public static final AnonymousClass9V6 A00(C130667qT r2) {
        C04220Ms.A0B(r2, 0);
        HashMap hashMap = AnonymousClass9V6.A06;
        AnonymousClass9V6 r0 = (AnonymousClass9V6) hashMap.get(r2);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass9V6 r02 = new AnonymousClass9V6(r2);
        hashMap.put(r2, r02);
        return r02;
    }
}
