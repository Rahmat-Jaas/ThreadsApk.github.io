package X;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: X.53A  reason: invalid class name */
public final class AnonymousClass53A<E> extends AnonymousClass8AD<E> implements C148748rx<E> {
    public static final AnonymousClass53A A01 = new AnonymousClass53A(C86164wN.A1T());
    public final Object[] A00;

    public final C147378pF CbP(AnonymousClass0YY r10) {
        C04220Ms.A0B(r10, 0);
        Object[] objArr = this.A00;
        Object[] objArr2 = objArr;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr2[i];
            if (AnonymousClass0wJ.A1X(r10.invoke(obj))) {
                if (!z) {
                    objArr = C86124wJ.A1b(objArr2, objArr2.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        C102556Vq.A00(size, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, size);
        C04220Ms.A06(copyOfRange);
        return new AnonymousClass53A(copyOfRange);
    }

    public final AnonymousClass8s0 ABS() {
        return new AnonymousClass8AM(this, (Object[]) null, this.A00, 0);
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

    public AnonymousClass53A(Object[] objArr) {
        this.A00 = objArr;
    }

    public final C147378pF A5J(Object obj) {
        if (size() < 32) {
            Object[] A1b = C86124wJ.A1b(this.A00, size() + 1);
            A1b[size()] = obj;
            return new AnonymousClass53A(A1b);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new AnonymousClass53B(this.A00, objArr, size() + 1, 0);
    }

    public final C147378pF A5V(Object obj, int i) {
        C120407Al.A01(i, size());
        if (i == size()) {
            return A5J(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[(size() + 1)];
            Object[] objArr2 = this.A00;
            AnonymousClass8AQ.A0G(objArr2, objArr, 0, 0, i);
            AnonymousClass8AQ.A0G(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new AnonymousClass53A(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] A1b = C86124wJ.A1b(objArr3, objArr3.length);
        AnonymousClass8AQ.A0G(objArr3, A1b, i + 1, i, size() - 1);
        A1b[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new AnonymousClass53B(A1b, objArr4, size() + 1, 0);
    }

    public final C147378pF CbV(int i) {
        C120407Al.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] A1b = C86124wJ.A1b(objArr, size() - 1);
        AnonymousClass8AQ.A0G(objArr, A1b, i, i + 1, size());
        return new AnonymousClass53A(A1b);
    }

    public final C147378pF ChP(Object obj, int i) {
        C120407Al.A00(i, size());
        Object[] objArr = this.A00;
        Object[] A1b = C86124wJ.A1b(objArr, objArr.length);
        A1b[i] = obj;
        return new AnonymousClass53A(A1b);
    }

    public final Object get(int i) {
        C120407Al.A00(i, size());
        return this.A00[i];
    }

    public final ListIterator listIterator(int i) {
        C120407Al.A01(i, size());
        return new AnonymousClass535(this.A00, i, size());
    }
}
