package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.5q8  reason: invalid class name */
public abstract class AnonymousClass5q8 extends AnonymousClass89A implements List, RandomAccess {
    public static final AnonymousClass5qE A00 = new AnonymousClass5qD(AnonymousClass5q7.A02, 0);

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
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
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
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
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
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

    public final int A03(Object[] objArr, int i) {
        if (this instanceof AnonymousClass5q7) {
            AnonymousClass5q7 r0 = (AnonymousClass5q7) this;
            Object[] objArr2 = r0.A01;
            int i2 = r0.A00;
            System.arraycopy(objArr2, 0, objArr, 0, i2);
            return i2;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    /* renamed from: A05 */
    public final AnonymousClass5q8 subList(int i, int i2) {
        if (this instanceof AnonymousClass5q6) {
            AnonymousClass5q6 r2 = (AnonymousClass5q6) this;
            AnonymousClass7BR.A02(i, i2, r2.A01);
            AnonymousClass5q8 r1 = r2.A02;
            int i3 = r2.A00;
            return r1.subList(i + i3, i2 + i3);
        }
        AnonymousClass7BR.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return AnonymousClass5q7.A02;
        }
        return new AnonymousClass5q6(this, i, i4);
    }

    /* renamed from: A06 */
    public final AnonymousClass5qE listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AnonymousClass7BR.A00("index", i, size));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new AnonymousClass5qD(this, i);
        }
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
