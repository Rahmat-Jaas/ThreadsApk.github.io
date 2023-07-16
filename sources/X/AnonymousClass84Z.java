package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.84Z  reason: invalid class name */
public final class AnonymousClass84Z<T> implements Set<T>, C03740Kn {
    public int A00;
    public Object[] A01 = new Object[16];

    public final boolean add(Object obj) {
        int i;
        C04220Ms.A0B(obj, 0);
        if (size() > 0) {
            i = A00(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (size == length) {
            Object[] objArr2 = new Object[(length << 1)];
            System.arraycopy(objArr, i2, objArr2, i2 + 1, size - i2);
            AnonymousClass8AQ.A0G(this.A01, objArr2, 0, 0, i2);
            this.A01 = objArr2;
        } else {
            System.arraycopy(objArr, i2, objArr, i2 + 1, size - i2);
        }
        this.A01[i2] = obj;
        this.A00 = size() + 1;
        return true;
    }

    public final boolean contains(Object obj) {
        return obj != null && A00(obj) >= 0;
    }

    public final boolean remove(Object obj) {
        int A002;
        boolean z = false;
        if (obj != null && (A002 = A00(obj)) >= 0) {
            int size = size();
            z = true;
            if (A002 < size - 1) {
                Object[] objArr = this.A01;
                AnonymousClass8AQ.A0G(objArr, objArr, A002, A002 + 1, size);
            }
            this.A00 = size() - 1;
            this.A01[size()] = null;
        }
        return z;
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final Object A01(int i) {
        if (i < 0 || i >= size()) {
            throw C86114wI.A0a("Index ", ", size ", i, size());
        }
        Object obj = this.A01[i];
        C04220Ms.A0C(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    public final void clear() {
        Object[] objArr = this.A01;
        Arrays.fill(objArr, 0, objArr.length, (Object) null);
        this.A00 = 0;
    }

    public final Iterator iterator() {
        return new AnonymousClass841(this);
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    private final int A00(Object obj) {
        int size = size() - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (i + size) >>> 1;
            Object A012 = A01(i2);
            int identityHashCode2 = System.identityHashCode(A012);
            if (identityHashCode2 < identityHashCode) {
                i = i2 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size = i2 - 1;
            } else if (A012 == obj) {
                return i2;
            } else {
                int i3 = i2 - 1;
                while (-1 < i3) {
                    Object obj2 = this.A01[i3];
                    if (obj2 != obj) {
                        i3--;
                        if (System.identityHashCode(obj2) != identityHashCode) {
                            break;
                        }
                    } else {
                        return i3;
                    }
                }
                i = i2 + 1;
                int size2 = size();
                while (true) {
                    if (i >= size2) {
                        i = size2;
                        break;
                    }
                    Object obj3 = this.A01[i];
                    if (obj3 != obj) {
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                        i++;
                    } else {
                        return i;
                    }
                }
            }
        }
        return -(i + 1);
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean containsAll(Collection collection) {
        if (C86144wL.A1Z(collection)) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }
}
