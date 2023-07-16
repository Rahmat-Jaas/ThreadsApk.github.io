package X;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: X.6QA  reason: invalid class name */
public final class AnonymousClass6QA {
    public static final C127397h3 A00(C127397h3 r16, C127397h3 r17, C110026l0 r18) {
        Pair pair;
        List list;
        C127397h3 A00;
        C127397h3 r4 = r16;
        C127397h3 r6 = r17;
        if ((r4.A00 & 2) == 0) {
            return r16;
        }
        C110026l0 r5 = r18;
        C107206gM r8 = r5.A00;
        Object obj = r8.A01;
        Object obj2 = obj;
        if (obj != null) {
            AnonymousClass3HX r2 = (AnonymousClass3HX) obj2;
            if (r17 != null && r6.A05 == r4 && r5.A01.isEmpty()) {
                return r17;
            }
            int[] A02 = AnonymousClass794.A00().A02.A02(r4.A03);
            int length = A02.length;
            C127397h3 r3 = r4;
            int i = 0;
            while (true) {
                C127397h3 r7 = null;
                if (i >= length) {
                    break;
                }
                int i2 = A02[i];
                C127397h3 A0K = r3.A0K(i2);
                if (A0K != null) {
                    if (r17 != null) {
                        r7 = r6.A0K(i2);
                    }
                    r3 = AnonymousClass70E.A00(r3, r4, A00(A0K, r7, r5), i2);
                }
                i++;
            }
            for (int i3 : AnonymousClass7H4.A00(r3)) {
                List A0Q = r3.A0Q(i3);
                C04220Ms.A06(A0Q);
                if (r6 != null) {
                    list = r6.A0Q(i3);
                } else {
                    list = null;
                }
                int size = A0Q.size();
                List list2 = A0Q;
                for (int i4 = 0; i4 < size; i4++) {
                    C127397h3 A0Q2 = C86154wM.A0Q(A0Q, i4);
                    if (!(A0Q2 == null || (A00 = A00(A0Q2, AnonymousClass70E.A01(A0Q2, list, i4), r5)) == A0Q2)) {
                        if (list2 == A0Q) {
                            list2 = C18200wM.A0s(A0Q);
                        }
                        list2.set(i4, A00);
                    }
                }
                if (list2 != A0Q) {
                    r3 = AnonymousClass70E.A00(r3, r4, list2, i3);
                }
            }
            if (r6 != null && r6.A05 == r4 && r3 == r4 && !C86114wI.A1Z(r5.A03, r4.A02)) {
                return r6;
            }
            Map map = r5.A02;
            Integer valueOf = Integer.valueOf(r4.A02);
            Object obj3 = map.get(valueOf);
            C04220Ms.A0C(AnonymousClass794.A00().A09, "null cannot be cast to non-null type com.instagram.common.bloks.component.ComponentMapper");
            int i5 = r3.A03;
            if (i5 != 13326) {
                if (i5 == 13336) {
                    if (obj != null) {
                        pair = new Pair(new C90905fH(r8, r2, r3, (String) obj3), obj3);
                    } else {
                        throw C18190wL.A0a("Required value was null.");
                    }
                }
                return r3;
            }
            pair = new Pair(new C90895fG((long) r3.A02), (Object) null);
            Object obj4 = pair.first;
            if (obj4 != null) {
                r3 = AnonymousClass70E.A00(r3, r4, obj4, 156);
            }
            Object obj5 = pair.second;
            if (obj5 != null || map.containsKey(valueOf)) {
                map.put(valueOf, obj5);
            }
            return r3;
        }
        throw C18190wL.A0a("Required value was null.");
    }
}
