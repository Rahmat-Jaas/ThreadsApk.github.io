package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.2BU  reason: invalid class name */
public final class AnonymousClass2BU {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        Map A00;
        String str;
        AnonymousClass601 r7 = r17;
        C63893iY r4 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r7);
        Object A0B = C63893iY.A0B(r4, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C127397h3 r8 = (C127397h3) A0B;
        List list = r4.A00;
        Map map = (Map) list.get(A1Z ? 1 : 0);
        if (map == null) {
            map = AnonymousClass4To.A00();
        }
        C127397h3 r1 = (C127397h3) list.get(2);
        List list2 = (List) list.get(3);
        if (list2 == null) {
            list2 = AnonymousClass0ZV.A00;
        }
        Object A0B2 = C63893iY.A0B(r4, 4);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        AnonymousClass3HX r6 = (AnonymousClass3HX) A0B2;
        if (r1 != null) {
            A00 = C63763iI.A0B(r7, r1, 35);
        } else {
            A00 = AnonymousClass4To.A00();
        }
        C37383Jqm A06 = M6q.A06(r7);
        C10300i6 A0E = C63913ic.A0E(r6);
        FragmentActivity A04 = C63913ic.A04(r6);
        if (A06 == null && (A06 = M6q.A05(A04, A0E)) == null) {
            C30967GcS.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside controller");
            return null;
        }
        C130667qT A08 = C63913ic.A08(r7);
        AnonymousClass3TP A002 = C62863b2.A00((AnonymousClass4nQ) null, r6, C63763iI.A03(r8));
        C23221cn A01 = M6q.A01(A08, A002, r6, r7, r8, list2, map, A00);
        A01.A0C = A06;
        C127397h3 A003 = AnonymousClass3J6.A00(list2);
        try {
            str = C63763iI.A09(r8);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        A06.A0A(A01, M6q.A07(A04, A01, A002, r6, r7, A003, str), A1Z);
        return null;
    }
}
