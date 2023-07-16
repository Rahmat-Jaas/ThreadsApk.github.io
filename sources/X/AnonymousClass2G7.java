package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2G7  reason: invalid class name */
public final class AnonymousClass2G7 {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        Map A00;
        AnonymousClass601 r3 = r6;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C127397h3 r4 = (C127397h3) A0B;
        Object A0B2 = C63893iY.A0B(r7, A1Z ? 1 : 0);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A0B2;
        List list = r7.A00;
        C127397h3 r1 = (C127397h3) list.get(2);
        List list2 = (List) list.get(3);
        AnonymousClass3HX A01 = C131677sb.A01(r3, r7, 4);
        if (r1 != null) {
            A00 = C63763iI.A0B(r3, r1, 35);
        } else {
            A00 = AnonymousClass4To.A00();
        }
        M6q.A0D(C63913ic.A08(r3), A01, r3, r4, list2, map, A00);
        return null;
    }
}
