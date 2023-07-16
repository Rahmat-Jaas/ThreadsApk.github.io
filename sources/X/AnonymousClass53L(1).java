package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.53L  reason: invalid class name */
public final class AnonymousClass53L<K, V> extends AnonymousClass84a<K, V, Map.Entry<K, V>> {
    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.A00.remove(C18180wK.A0o(it).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        AnonymousClass8s3 r8;
        int i;
        boolean z;
        Snapshot A00;
        C04220Ms.A0B(collection, 0);
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(collection, 10)));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C18210wN.A1Q(A0v, C18180wK.A0o(it));
        }
        AnonymousClass84T r6 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C102706Wf.A00;
            synchronized (obj) {
                C113516rY r0 = r6.A00;
                AnonymousClass53S A0H = C86134wK.A0H(r0, r0);
                r8 = A0H.A01;
                i = A0H.A00;
            }
            C41627MVz A002 = AnonymousClass89P.A00(r8);
            Iterator it2 = r6.entrySet().iterator();
            z = true;
            while (it2.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it2);
                if (!A0v.containsKey(A0o.getKey()) || !C04220Ms.A0I(A0v.get(A0o.getKey()), A0o.getValue())) {
                    A002.remove(A0o.getKey());
                    z2 = true;
                }
            }
            AnonymousClass8s3 AB2 = A002.AB2();
            if (C04220Ms.A0I(AB2, r8)) {
                break;
            }
            C113516rY r02 = r6.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C122127Kl.A04) {
                A00 = C122127Kl.A00();
                AnonymousClass53S r1 = (AnonymousClass53S) C122127Kl.A02(A00, r6, r02);
                synchronized (obj) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        r1.A01 = AB2;
                        r1.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A00, r6);
        } while (!z);
        return z2;
    }

    public final Iterator iterator() {
        AnonymousClass84T r2 = this.A00;
        return new AnonymousClass53O(r2, ((AnonymousClass8s5) r2.A00().A01.entrySet()).iterator());
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!C03940Lk.A07(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        return C04220Ms.A0I(this.A00.get(entry.getKey()), entry.getValue());
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

    public final /* bridge */ boolean remove(Object obj) {
        if (!C03940Lk.A07(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        return AnonymousClass0wJ.A1W(this.A00.remove(entry.getKey()));
    }

    public AnonymousClass53L(AnonymousClass84T r1) {
        super(r1);
    }
}
