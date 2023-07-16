package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.89L  reason: invalid class name */
public abstract class AnonymousClass89L<E> extends AbstractList<E> implements List<E>, AnonymousClass028 {
    public abstract void add(int i, Object obj);

    public abstract Object set(int i, Object obj);

    public final /* bridge */ int size() {
        if (this instanceof AnonymousClass8AO) {
            return ((AnonymousClass8AO) this).A01;
        }
        if (this instanceof AnonymousClass8AN) {
            return ((AnonymousClass8AN) this).A00;
        }
        if (this instanceof AnonymousClass8AK) {
            return ((AnonymousClass8AK) this).A00.size();
        }
        if (this instanceof AnonymousClass8AL) {
            return ((AnonymousClass8AL) this).A01;
        }
        return ((AnonymousClass8AM) this).A01;
    }

    public static int A00(int i, int i2) {
        if (i > 32) {
            return i - ((i - 1) & -32);
        }
        return i2;
    }

    public static Object[] A02(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        return objArr;
    }

    public Object A0P(int i) {
        if (this instanceof AnonymousClass8AN) {
            AnonymousClass8AN r1 = (AnonymousClass8AN) this;
            AnonymousClass8AN.A09(r1);
            C120667By.A00(i, r1.A00);
            return AnonymousClass8AN.A04(r1, r1.A01 + i);
        } else if (this instanceof AnonymousClass8AK) {
            AnonymousClass8AK r0 = (AnonymousClass8AK) this;
            return r0.A00.remove(AnonymousClass00Z.A0n(r0, i));
        } else {
            AnonymousClass8AL r4 = (AnonymousClass8AL) this;
            C120667By.A00(i, r4.size());
            if (i == C86104wH.A0B(r4)) {
                return r4.A0V();
            }
            if (i == 0) {
                return r4.A0U();
            }
            int i2 = r4.A00 + i;
            Object[] objArr = r4.A02;
            int length = objArr.length;
            if (i2 >= length) {
                i2 -= length;
            }
            Object obj = objArr[i2];
            int size = r4.size() >> 1;
            int i3 = r4.A00;
            if (i < size) {
                if (i2 >= i3) {
                    Object[] objArr2 = r4.A02;
                    AnonymousClass8AQ.A0G(objArr2, objArr2, i3 + 1, i3, i2);
                } else {
                    Object[] objArr3 = r4.A02;
                    AnonymousClass8AQ.A0G(objArr3, objArr3, 1, 0, i2);
                    Object[] objArr4 = r4.A02;
                    int length2 = objArr4.length - 1;
                    objArr4[0] = objArr4[length2];
                    int i4 = r4.A00;
                    System.arraycopy(objArr4, i4, objArr4, i4 + 1, length2 - i4);
                }
                Object[] objArr5 = r4.A02;
                int i5 = r4.A00;
                objArr5[i5] = null;
                int length3 = objArr5.length - 1;
                int i6 = i5 + 1;
                if (i5 == length3) {
                    i6 = 0;
                }
                r4.A00 = i6;
            } else {
                int A0B = i3 + C86104wH.A0B(r4);
                Object[] objArr6 = r4.A02;
                int length4 = objArr6.length;
                if (A0B >= length4) {
                    A0B -= length4;
                }
                int i7 = i2 + 1;
                if (i2 <= A0B) {
                    System.arraycopy(objArr6, i7, objArr6, i2, (A0B + 1) - i7);
                } else {
                    System.arraycopy(objArr6, i7, objArr6, i2, length4 - i7);
                    Object[] objArr7 = r4.A02;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    System.arraycopy(objArr7, 1, objArr7, 0, (A0B + 1) - 1);
                }
                r4.A02[A0B] = null;
            }
            r4.A01 = r4.size() - 1;
            return obj;
        }
    }

    public static int A01(AbstractCollection abstractCollection, Collection collection) {
        return abstractCollection.size() + collection.size();
    }

    public final /* bridge */ Object remove(int i) {
        return A0P(i);
    }
}
