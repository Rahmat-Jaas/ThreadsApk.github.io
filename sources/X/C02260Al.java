package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Al  reason: invalid class name and case insensitive filesystem */
public class C02260Al extends C06750aI {
    public static final int A0z(Iterable iterable, int i) {
        C04220Ms.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final List A10(Iterable iterable) {
        C04220Ms.A0B(iterable, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C000300e.A0r((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
