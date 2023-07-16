package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6TA  reason: invalid class name */
public final class AnonymousClass6TA {
    public static final List A00(List list, List list2) {
        C04220Ms.A0B(list, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C41836MeS) it.next()).apply(next)) {
                        break;
                    }
                } else {
                    A0v.add(next);
                    break;
                }
            }
        }
        return A0v;
    }
}
