package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Ww  reason: invalid class name and case insensitive filesystem */
public final class C140558Ww extends C02220Ah implements AnonymousClass0YP {
    public static final C140558Ww A00 = new C140558Ww();

    public C140558Ww() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C141748ct r7 = (C141748ct) obj;
        AnonymousClass83Y r8 = (AnonymousClass83Y) obj2;
        AnonymousClass0wJ.A1N(r7, r8);
        List list = r8.A01;
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0t.add(C1192274b.A00(C1192274b.A07, r7, list.get(i)));
        }
        return A0t;
    }
}
