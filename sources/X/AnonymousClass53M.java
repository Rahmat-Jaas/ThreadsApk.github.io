package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.53M  reason: invalid class name */
public final class AnonymousClass53M<K, V> extends AnonymousClass84a<K, V, K> {
    public final boolean removeAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.A00.remove(it.next()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        AnonymousClass8s3 r9;
        int i;
        boolean z;
        Snapshot A00;
        C04220Ms.A0B(collection, 0);
        Set A0c = AnonymousClass00J.A0c(collection);
        AnonymousClass84T r5 = this.A00;
        boolean z2 = false;
        do {
            Object obj = C102706Wf.A00;
            synchronized (obj) {
                C113516rY r0 = r5.A00;
                AnonymousClass53S A0H = C86134wK.A0H(r0, r0);
                r9 = A0H.A01;
                i = A0H.A00;
            }
            C41627MVz A002 = AnonymousClass89P.A00(r9);
            Iterator it = r5.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                if (!A0c.contains(A0o.getKey())) {
                    A002.remove(A0o.getKey());
                    z2 = true;
                }
            }
            AnonymousClass8s3 AB2 = A002.AB2();
            if (C04220Ms.A0I(AB2, r9)) {
                break;
            }
            C113516rY r02 = r5.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C122127Kl.A04) {
                A00 = C122127Kl.A00();
                AnonymousClass53S r1 = (AnonymousClass53S) C122127Kl.A02(A00, r5, r02);
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
            C122127Kl.A0C(A00, r5);
        } while (!z);
        return z2;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        AnonymousClass84T r2 = this.A00;
        return new AnonymousClass53P(r2, ((AnonymousClass8s5) r2.A00().A01.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        return AnonymousClass0wJ.A1W(this.A00.remove(obj));
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        throw C18240wQ.A0j();
    }

    public final boolean containsAll(Collection collection) {
        if (C86144wL.A1Z(collection)) {
            return true;
        }
        for (Object containsKey : collection) {
            if (!this.A00.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass53M(AnonymousClass84T r1) {
        super(r1);
    }
}
