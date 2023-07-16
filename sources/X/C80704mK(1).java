package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4mK  reason: invalid class name and case insensitive filesystem */
public final class C80704mK extends C02220Ah implements AnonymousClass0YP {
    public static final C80704mK A00 = new C80704mK();

    public C80704mK() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        C04220Ms.A0B(collection2, 1);
        if (collection == null) {
            return collection2;
        }
        ArrayList A0s = C18200wM.A0s(collection);
        A0s.addAll(collection2);
        return A0s;
    }
}
