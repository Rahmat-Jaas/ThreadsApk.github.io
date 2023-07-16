package X;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3W7  reason: invalid class name */
public final class AnonymousClass3W7 {
    public static Object A00(C41836MeS meS, Iterable iterable) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (meS.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static boolean A02(C41836MeS meS, Iterable iterable) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C19245AtA.A01(meS, iterable.iterator());
        }
        List list = (List) iterable;
        meS.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!meS.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size <= i) {
                                break;
                            } else if (meS.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        while (true) {
                            i--;
                            if (i < i2) {
                                return true;
                            }
                            list.remove(i);
                        }
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    public static String A01(Iterable iterable) {
        StringBuilder A0s = C18190wL.A0s("[");
        boolean z = true;
        for (Object append : iterable) {
            if (!z) {
                A0s.append(", ");
            }
            z = false;
            A0s.append(append);
        }
        A0s.append(']');
        return A0s.toString();
    }
}
