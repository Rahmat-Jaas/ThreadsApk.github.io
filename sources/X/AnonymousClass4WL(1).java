package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4WL  reason: invalid class name */
public final class AnonymousClass4WL extends AnonymousClass4WM {
    public static final Set A02(Object obj, Set set) {
        C04220Ms.A0B(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(set.size()));
        boolean z = false;
        for (Object next : set) {
            if (z || !C04220Ms.A0I(next, obj)) {
                linkedHashSet.add(next);
            } else {
                z = true;
            }
        }
        return linkedHashSet;
    }

    public static final Set A03(Object obj, Set set) {
        C04220Ms.A0B(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Set A00(Iterable iterable, Set set) {
        LinkedHashSet linkedHashSet;
        AnonymousClass0wJ.A1N(set, iterable);
        if (!(iterable instanceof Collection)) {
            iterable = AnonymousClass00J.A0N(iterable);
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return AnonymousClass00J.A0c(set);
        }
        if (collection instanceof Set) {
            for (Object next : set) {
                if (!collection.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        linkedHashSet = new LinkedHashSet(set);
        linkedHashSet.removeAll(collection);
        return linkedHashSet;
    }

    public static final Set A01(Iterable iterable, Set set) {
        int size;
        AnonymousClass0wJ.A1N(set, iterable);
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (Integer.valueOf(size2) != null) {
                size = set.size() + size2;
                LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(size));
                linkedHashSet.addAll(set);
                C000300e.A0r(iterable, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = set.size() << 1;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AnonymousClass4WK.A0N(size));
        linkedHashSet2.addAll(set);
        C000300e.A0r(iterable, linkedHashSet2);
        return linkedHashSet2;
    }
}
