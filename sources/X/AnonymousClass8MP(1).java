package X;

import java.util.List;

/* renamed from: X.8MP  reason: invalid class name */
public final class AnonymousClass8MP extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MP A00 = new AnonymousClass8MP();

    public AnonymousClass8MP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C134747yH r0;
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        Object obj2 = list.get(0);
        C141738cs r2 = C1192274b.A00;
        C121767Ia r1 = null;
        if (C04220Ms.A0I(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (C134747yH) AnonymousClass7Wc.A00(r2, obj2);
        }
        C04220Ms.A0A(r0);
        Object A0k = C86134wK.A0k(list);
        C141738cs r3 = C1192274b.A0F;
        if (!C04220Ms.A0I(A0k, false) && A0k != null) {
            r1 = (C121767Ia) AnonymousClass7Wc.A00(r3, A0k);
        }
        C04220Ms.A0A(r1);
        return new AnonymousClass7HD(r0, (C121767Ia) null, r1.A00);
    }
}
