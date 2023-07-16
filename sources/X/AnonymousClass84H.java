package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.84H  reason: invalid class name */
public final class AnonymousClass84H<T> implements List<T>, AnonymousClass028 {
    public final AnonymousClass84X A00;

    public final boolean addAll(int i, Collection collection) {
        C04220Ms.A0B(collection, 1);
        return this.A00.A0B(i, collection);
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        AnonymousClass84X r3 = this.A00;
        for (Object A0D : collection) {
            if (!r3.A0D(A0D)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        return new AnonymousClass84N(this, 0);
    }

    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        AnonymousClass84X r4 = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = r4.A00;
        for (Object A0E : collection) {
            r4.A0E(A0E);
        }
        if (i != r4.A00) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        AnonymousClass84X r4 = this.A00;
        int i = r4.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(r4.A01[i2])) {
                r4.A03(i2);
            }
        }
        if (i == r4.A00) {
            return false;
        }
        return true;
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final void add(int i, Object obj) {
        this.A00.A08(i, obj);
    }

    public final void clear() {
        this.A00.A05();
    }

    public final boolean contains(Object obj) {
        return this.A00.A0D(obj);
    }

    public final int indexOf(Object obj) {
        AnonymousClass84X r0 = this.A00;
        int i = r0.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r0.A01;
            while (!C04220Ms.A0I(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(this.A00.A00);
    }

    public final int lastIndexOf(Object obj) {
        AnonymousClass84X r1 = this.A00;
        int i = r1.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = r1.A01;
            while (!C04220Ms.A0I(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                }
            }
            return i2;
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass84N(this, i);
    }

    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public AnonymousClass84H(AnonymousClass84X r1) {
        this.A00 = r1;
    }

    public final Object get(int i) {
        C115816vx.A00(this, i);
        return this.A00.A01[i];
    }

    public final /* bridge */ Object remove(int i) {
        C115816vx.A00(this, i);
        return this.A00.A03(i);
    }

    public final Object set(int i, Object obj) {
        C115816vx.A00(this, i);
        Object[] objArr = this.A00.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        C115816vx.A01(this, i, i2);
        return new AnonymousClass84I(this, i, i2);
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final boolean add(Object obj) {
        return this.A00.A0C(obj);
    }

    public final boolean addAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        AnonymousClass84X r1 = this.A00;
        return r1.A0B(r1.A00, collection);
    }

    public final ListIterator listIterator() {
        return new AnonymousClass84N(this, 0);
    }

    public final boolean remove(Object obj) {
        return this.A00.A0E(obj);
    }
}
