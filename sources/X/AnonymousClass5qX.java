package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.5qX  reason: invalid class name */
public abstract class AnonymousClass5qX extends AnonymousClass89B implements List, RandomAccess {
    public static final AnonymousClass5qS A00 = new AnonymousClass5qR(AnonymousClass5qW.A02, 0);

    public static AnonymousClass5qX A01(Object[] objArr) {
        return A02(objArr, objArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (AnonymousClass6J5.A00(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (hasNext2) {
                            if (!AnonymousClass6J5.A00(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!obj.equals(get(size)));
            return size;
        }
        return -1;
    }

    public static AnonymousClass5qX A00() {
        return AnonymousClass5qW.A02;
    }

    public static AnonymousClass5qX A02(Object[] objArr, int i) {
        if (i == 0) {
            return AnonymousClass5qW.A02;
        }
        return new AnonymousClass5qW(objArr, i);
    }

    public int A06(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    /* renamed from: A07 */
    public final AnonymousClass5qS listIterator(int i) {
        C121287Fi.A02(i, size());
        if (isEmpty()) {
            return A00;
        }
        return new AnonymousClass5qR(this, i);
    }

    /* renamed from: A08 */
    public AnonymousClass5qX subList(int i, int i2) {
        C121287Fi.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return AnonymousClass5qW.A02;
        }
        return new AnonymousClass5qV(this, i, i3);
    }

    public final void add(int i, Object obj) {
        throw C18240wQ.A0j();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18240wQ.A0j();
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1S(indexOf(obj));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = C18220wO.A06(get(i2), i * 31);
        }
        return i;
    }

    public final Object remove(int i) {
        throw C18240wQ.A0j();
    }

    public final Object set(int i, Object obj) {
        throw C18240wQ.A0j();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
