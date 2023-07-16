package X;

import java.util.List;

/* renamed from: X.8M6  reason: invalid class name */
public final class AnonymousClass8M6 extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8M6 A00 = new AnonymousClass8M6();

    public AnonymousClass8M6() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        C04220Ms.A0B(obj, 0);
        List list3 = (List) obj;
        Object A0k = C86134wK.A0k(list3);
        C141738cs r7 = C1192274b.A01;
        List list4 = null;
        if (C04220Ms.A0I(A0k, false) || A0k == null) {
            list = null;
        } else {
            list = (List) AnonymousClass7Wc.A00(r7, A0k);
        }
        Object obj2 = list3.get(2);
        if (C04220Ms.A0I(obj2, false) || obj2 == null) {
            list2 = null;
        } else {
            list2 = (List) AnonymousClass7Wc.A00(r7, obj2);
        }
        Object obj3 = list3.get(0);
        if (obj3 != null) {
            str = (String) obj3;
        } else {
            str = null;
        }
        C04220Ms.A0A(str);
        if (list == null) {
            list = null;
        } else if (list.isEmpty()) {
            list = null;
        }
        if (list2 == null) {
            list2 = null;
        } else if (list2.isEmpty()) {
            list2 = null;
        }
        Object obj4 = list3.get(3);
        if (!C04220Ms.A0I(obj4, false) && obj4 != null) {
            list4 = (List) AnonymousClass7Wc.A00(r7, obj4);
        }
        return new C134747yH(str, list, list2, list4);
    }
}
