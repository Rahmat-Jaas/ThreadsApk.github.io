package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.84G  reason: invalid class name */
public final class AnonymousClass84G<T> implements List<T>, C03740Kn {
    public int A00 = -1;
    public int A01;
    public long[] A02 = new long[16];
    public Object[] A03 = new Object[16];

    public final void clear() {
        this.A00 = -1;
        int i = 0;
        int A0B = C86104wH.A0B(this);
        if (0 <= A0B) {
            while (true) {
                this.A03[i] = null;
                if (i == A0B) {
                    break;
                }
                i++;
            }
        }
        this.A01 = this.A00 + 1;
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        return new AnonymousClass84M(this, 0, 0, size());
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass84M(this, i, 0, size());
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public static final long A00(AnonymousClass84G r7) {
        long floatToIntBits = 0 | (((long) Float.floatToIntBits(Float.POSITIVE_INFINITY)) << 32);
        int i = r7.A00 + 1;
        int A0B = C86104wH.A0B(r7);
        if (i <= A0B) {
            while (true) {
                long j = r7.A02[i];
                if (C98276Ew.A00(j, floatToIntBits) < 0) {
                    floatToIntBits = j;
                }
                if ((C86124wJ.A02(floatToIntBits) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && C86104wH.A08(floatToIntBits) != 0) || i == A0B) {
                    break;
                }
                i++;
            }
        }
        return floatToIntBits;
    }

    public final void A01(Object obj, AnonymousClass0ZU r11, float f, boolean z) {
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        Object[] objArr = this.A03;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            this.A03 = C86124wJ.A1b(objArr, i3);
            long[] copyOf = Arrays.copyOf(this.A02, i3);
            C04220Ms.A06(copyOf);
            this.A02 = copyOf;
        }
        Object[] objArr2 = this.A03;
        int i4 = this.A00;
        objArr2[i4] = obj;
        this.A02[i4] = (C86114wI.A09(z ? 1 : 0) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32);
        int i5 = i4 + 1;
        int A0B = C86104wH.A0B(this);
        if (i5 <= A0B) {
            while (true) {
                this.A03[i5] = null;
                if (i5 == A0B) {
                    break;
                }
                i5++;
            }
        }
        this.A01 = this.A00 + 1;
        r11.invoke();
        this.A00 = i;
    }

    public final Object get(int i) {
        return this.A03[i];
    }

    public final /* bridge */ int size() {
        return this.A01;
    }

    public final List subList(int i, int i2) {
        return new AnonymousClass84F(this, i, i2);
    }

    public final void add(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1T(indexOf(obj), -1);
    }

    public final int indexOf(Object obj) {
        int A0B = C86104wH.A0B(this);
        int i = 0;
        if (A0B < 0) {
            return -1;
        }
        while (!C04220Ms.A0I(this.A03[i], obj)) {
            int i2 = i;
            i++;
            if (i2 == A0B) {
            }
        }
        return i;
        return -1;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final int lastIndexOf(Object obj) {
        for (int A0B = C86104wH.A0B(this); -1 < A0B; A0B--) {
            if (C04220Ms.A0I(this.A03[A0B], obj)) {
                return A0B;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final Object set(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final void sort(Comparator comparator) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final ListIterator listIterator() {
        return new AnonymousClass84M(this, 0, 0, size());
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }
}
