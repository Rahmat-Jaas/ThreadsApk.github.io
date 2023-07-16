package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.3Qy  reason: invalid class name and case insensitive filesystem */
public final class C60893Qy {
    public static final Map A00 = C18220wO.A0y();

    public static final C83214qy A00(C81464nq r3, AnonymousClass0A5 r4) {
        C04220Ms.A0B(r4, 1);
        Map map = A00;
        Object obj = map.get(r3);
        if (obj == null) {
            obj = AnonymousClass84Y.A00;
            map.put(r3, obj);
        }
        map.put(r3, AnonymousClass4WL.A03(((C02240Aj) r4).name, (Set) obj));
        return new AnonymousClass4Ul();
    }
}
