package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8MC  reason: invalid class name */
public final class AnonymousClass8MC extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MC A00 = new AnonymousClass8MC();

    public AnonymousClass8MC() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        List list = (List) obj;
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C141738cs r2 = C1192274b.A07;
            Object obj3 = null;
            if (!C18190wL.A1Z(obj2, false) && obj2 != null) {
                obj3 = AnonymousClass7Wc.A00(r2, obj2);
            }
            C04220Ms.A0A(obj3);
            A0t.add(obj3);
        }
        return new AnonymousClass83Y(A0t);
    }
}
