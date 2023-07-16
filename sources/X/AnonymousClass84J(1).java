package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.84J  reason: invalid class name */
public final class AnonymousClass84J<T> implements List<T>, AnonymousClass028 {
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass84D A03;

    public final boolean addAll(int i, Collection collection) {
        C04220Ms.A0B(collection, 1);
        A00();
        AnonymousClass84D r3 = this.A03;
        boolean addAll = r3.addAll(i + this.A02, collection);
        if (addAll) {
            this.A01 = size() + collection.size();
            this.A00 = r3.A01();
        }
        return addAll;
    }

    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        C147378pF r2;
        Snapshot A002;
        boolean z;
        C04220Ms.A0B(collection, 0);
        A00();
        AnonymousClass84D r8 = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = r8.size();
        do {
            Object obj = C1187272a.A00;
            synchronized (obj) {
                C113516rY r0 = r8.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r0, r0);
                i = A0N.A00;
                r2 = A0N.A01;
            }
            C04220Ms.A0A(r2);
            AnonymousClass8s0 ABS = r2.ABS();
            ABS.subList(i2, size).retainAll(collection);
            C147378pF AB1 = ABS.AB1();
            if (C04220Ms.A0I(AB1, r2)) {
                break;
            }
            C113516rY r02 = r8.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r22 = (AnonymousClass53T) C122127Kl.A02(A002, r8, r02);
                synchronized (obj) {
                    z = true;
                    if (r22.A00 == i) {
                        AnonymousClass53T.A00(AB1, r22);
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, r8);
        } while (!z);
        int size3 = size2 - r8.size();
        if (size3 <= 0) {
            return false;
        }
        this.A00 = r8.A01();
        this.A01 = size() - size3;
        return true;
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    private final void A00() {
        if (this.A03.A01() != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ int size() {
        return this.A01;
    }

    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw C18190wL.A0a("Failed requirement.");
        }
        A00();
        AnonymousClass84D r1 = this.A03;
        int i3 = this.A02;
        return new AnonymousClass84J(r1, i + i3, i2 + i3);
    }

    public AnonymousClass84J(AnonymousClass84D r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = i;
        this.A00 = r2.A01();
        this.A01 = i2 - i;
    }

    public final void add(int i, Object obj) {
        A00();
        AnonymousClass84D r1 = this.A03;
        r1.add(this.A02 + i, obj);
        this.A01 = size() + 1;
        this.A00 = r1.A01();
    }

    public final void clear() {
        int i;
        C147378pF r2;
        Snapshot A002;
        boolean z;
        if (size() > 0) {
            A00();
            AnonymousClass84D r8 = this.A03;
            int i2 = this.A02;
            int size = size() + i2;
            do {
                Object obj = C1187272a.A00;
                synchronized (obj) {
                    C113516rY r0 = r8.A00;
                    AnonymousClass53T A0N = C86124wJ.A0N(r0, r0);
                    i = A0N.A00;
                    r2 = A0N.A01;
                }
                C04220Ms.A0A(r2);
                AnonymousClass8s0 ABS = r2.ABS();
                ABS.subList(i2, size).clear();
                C147378pF AB1 = ABS.AB1();
                if (C04220Ms.A0I(AB1, r2)) {
                    break;
                }
                C113516rY r02 = r8.A00;
                C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C122127Kl.A04) {
                    A002 = C122127Kl.A00();
                    AnonymousClass53T r22 = (AnonymousClass53T) C122127Kl.A02(A002, r8, r02);
                    synchronized (obj) {
                        z = true;
                        if (r22.A00 == i) {
                            AnonymousClass53T.A00(AB1, r22);
                        } else {
                            z = false;
                        }
                    }
                }
                C122127Kl.A0C(A002, r8);
            } while (!z);
            this.A01 = 0;
            this.A00 = r8.A01();
        }
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1S(indexOf(obj));
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

    public final Object get(int i) {
        A00();
        C1187272a.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    public final int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator it = AnonymousClass8bI.A0C(i, size() + i).iterator();
        while (it.hasNext()) {
            int A002 = ((C1367083z) it).A00();
            if (C04220Ms.A0I(obj, this.A03.get(A002))) {
                return A002 - i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!C04220Ms.A0I(obj, this.A03.get(size)));
        return size - i;
    }

    public final ListIterator listIterator(int i) {
        A00();
        AnonymousClass0MZ r1 = new AnonymousClass0MZ();
        r1.A00 = i - 1;
        return new AnonymousClass84O(this, r1);
    }

    public final /* bridge */ Object remove(int i) {
        A00();
        AnonymousClass84D r2 = this.A03;
        Object remove = r2.remove(this.A02 + i);
        this.A01 = size() - 1;
        this.A00 = r2.A01();
        return remove;
    }

    public final Object set(int i, Object obj) {
        C1187272a.A00(i, size());
        A00();
        AnonymousClass84D r2 = this.A03;
        Object obj2 = r2.set(i + this.A02, obj);
        this.A00 = r2.A01();
        return obj2;
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final boolean add(Object obj) {
        A00();
        AnonymousClass84D r2 = this.A03;
        r2.add(this.A02 + size(), obj);
        this.A01 = size() + 1;
        this.A00 = r2.A01();
        return true;
    }

    public final boolean addAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return addAll(size(), collection);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
