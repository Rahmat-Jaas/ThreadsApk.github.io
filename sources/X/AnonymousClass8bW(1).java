package X;

import java.util.Collection;
import java.util.ListIterator;

/* renamed from: X.8bW  reason: invalid class name */
public final class AnonymousClass8bW<E> extends AnonymousClass8AI<E> implements AnonymousClass8s2<E> {
    public static final AnonymousClass8bW A01 = new AnonymousClass8bW(C86164wN.A1T());
    public final Object[] A00;

    public final C148878sK A5a(Collection collection) {
        C04220Ms.A0B(collection, 0);
        if (size() + collection.size() <= 32) {
            Object[] A1b = C86124wJ.A1b(this.A00, size() + collection.size());
            int size = size();
            for (Object obj : collection) {
                A1b[size] = obj;
                size++;
            }
            return new AnonymousClass8bW(A1b);
        }
        AnonymousClass8AO r0 = new AnonymousClass8AO(this, this.A00);
        r0.addAll(collection);
        return r0.AB7();
    }

    public final int indexOf(Object obj) {
        return AnonymousClass8AP.A01(this.A00, obj);
    }

    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.A00;
        int length = objArr.length - 1;
        if (obj == null) {
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] != null) {
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    } else {
                        return length;
                    }
                }
            }
        } else if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!obj.equals(objArr[length])) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return length;
                }
            }
        }
        return -1;
    }

    public AnonymousClass8bW(Object[] objArr) {
        this.A00 = objArr;
    }

    public final Object get(int i) {
        AnonymousClass7C1.A00(i, size());
        return this.A00[i];
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass7C1.A01(i, size());
        return new AnonymousClass8bR(this.A00, i, size());
    }
}
