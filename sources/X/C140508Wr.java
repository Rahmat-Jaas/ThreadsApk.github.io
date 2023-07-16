package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Wr  reason: invalid class name and case insensitive filesystem */
public final class C140508Wr extends C02220Ah implements AnonymousClass0YP {
    public static final C140508Wr A00 = new C140508Wr();

    public C140508Wr() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C141748ct r6 = (C141748ct) obj;
        List list = (List) obj2;
        AnonymousClass0wJ.A1N(r6, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0t.add(C1192274b.A00(C1192274b.A02, r6, list.get(i)));
        }
        return A0t;
    }
}
