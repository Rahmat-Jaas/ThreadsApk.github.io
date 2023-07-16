package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8WE  reason: invalid class name */
public final class AnonymousClass8WE extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8WE A00 = new AnonymousClass8WE();

    public AnonymousClass8WE() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7WZ r7 = (AnonymousClass7WZ) obj2;
        C04220Ms.A0B(r7, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(r7.A02);
        Iterator A0z = C86144wL.A0z(r7.A01);
        while (A0z.hasNext()) {
            C109646kL r2 = (C109646kL) A0z.next();
            if (r2.A00) {
                Map CWd = r2.A01.CWd();
                if (CWd.isEmpty()) {
                    linkedHashMap.remove(r2.A02);
                } else {
                    linkedHashMap.put(r2.A02, CWd);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
