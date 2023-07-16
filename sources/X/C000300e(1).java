package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.00e  reason: invalid class name and case insensitive filesystem */
public class C000300e extends C001300p {
    public static final Object A0o(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0p(List list) {
        C04220Ms.A0B(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final void A0r(Iterable iterable, Collection collection) {
        C04220Ms.A0B(collection, 0);
        C04220Ms.A0B(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final void A0s(Iterable iterable, AnonymousClass0YY r2) {
        C04220Ms.A0B(iterable, 0);
        C04220Ms.A0B(r2, 1);
        A0t(iterable, r2, true);
    }

    public static final void A0u(Collection collection, Object[] objArr) {
        C04220Ms.A0B(collection, 0);
        C04220Ms.A0B(objArr, 1);
        List asList = Arrays.asList(objArr);
        C04220Ms.A06(asList);
        collection.addAll(asList);
    }

    public static final void A0v(AnonymousClass0YY r1, List list) {
        C04220Ms.A0B(list, 0);
        C04220Ms.A0B(r1, 1);
        A0w(r1, list);
    }

    public static final void A0w(AnonymousClass0YY r6, List list) {
        int i;
        if (list instanceof RandomAccess) {
            C1367083z A03 = new AnonymousClass8bH(0, list.size() - 1).iterator();
            int i2 = 0;
            while (A03.hasNext()) {
                int A00 = A03.A00();
                Object obj = list.get(A00);
                if (!((Boolean) r6.invoke(obj)).booleanValue()) {
                    if (i2 != A00) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
            }
            if (i2 < list.size() && i2 <= list.size() - 1) {
                while (true) {
                    list.remove(i);
                    if (i != i2) {
                        i--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(list instanceof C03740Kn) || (list instanceof C05850Wm)) {
            A0t(list, r6, true);
        } else {
            C03940Lk.A04(list, "kotlin.collections.MutableIterable");
            throw null;
        }
    }

    public static final Object A0q(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void A0t(Iterable iterable, AnonymousClass0YY r2, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) r2.invoke(it.next())).booleanValue() == z) {
                it.remove();
            }
        }
    }
}
