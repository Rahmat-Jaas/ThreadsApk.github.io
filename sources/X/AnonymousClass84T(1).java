package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.84T  reason: invalid class name */
public final class AnonymousClass84T<K, V> implements Map<K, V>, C145738l0, AnonymousClass0WC {
    public C113516rY A00;
    public final Collection A01 = new AnonymousClass53N(this);
    public final Set A02 = new AnonymousClass53L(this);
    public final Set A03 = new AnonymousClass53M(this);

    public final void putAll(Map map) {
        AnonymousClass8s3 r1;
        int i;
        Snapshot A002;
        boolean z;
        C04220Ms.A0B(map, 0);
        do {
            Object obj = C102706Wf.A00;
            synchronized (obj) {
                C113516rY r0 = this.A00;
                AnonymousClass53S A0H = C86134wK.A0H(r0, r0);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            C41627MVz A003 = AnonymousClass89P.A00(r1);
            A003.putAll(map);
            AnonymousClass8s3 AB2 = A003.AB2();
            if (!C04220Ms.A0I(AB2, r1)) {
                C113516rY r02 = this.A00;
                C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C122127Kl.A04) {
                    A002 = C122127Kl.A00();
                    AnonymousClass53S r2 = (AnonymousClass53S) C122127Kl.A02(A002, this, r02);
                    synchronized (obj) {
                        int i2 = r2.A00;
                        z = true;
                        if (i2 == i) {
                            r2.A01 = AB2;
                            r2.A00 = i2 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                C122127Kl.A0C(A002, this);
            } else {
                return;
            }
        } while (!z);
    }

    public final AnonymousClass53S A00() {
        C113516rY r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (AnonymousClass53S) C122127Kl.A05(this, r1);
    }

    public final C113516rY Ail() {
        return this.A00;
    }

    public final void clear() {
        Snapshot A002;
        C113516rY r0 = this.A00;
        C04220Ms.A0C(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C41622MVu mVu = C41622MVu.A02;
        C04220Ms.A0C(mVu, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (mVu != ((AnonymousClass53S) C122127Kl.A06(r0)).A01) {
            C113516rY r02 = this.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53S r2 = (AnonymousClass53S) C122127Kl.A02(A002, this, r02);
                synchronized (C102706Wf.A00) {
                    C04220Ms.A0B(mVu, 0);
                    r2.A01 = mVu;
                    r2.A00++;
                }
            }
            C122127Kl.A0C(A002, this);
        }
    }

    public final /* bridge */ Set entrySet() {
        return this.A02;
    }

    public final /* bridge */ Set keySet() {
        return this.A03;
    }

    public final Object put(Object obj, Object obj2) {
        AnonymousClass8s3 r1;
        int i;
        Object put;
        Snapshot A002;
        boolean z;
        do {
            Object obj3 = C102706Wf.A00;
            synchronized (obj3) {
                C113516rY r0 = this.A00;
                AnonymousClass53S A0H = C86134wK.A0H(r0, r0);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            C41627MVz A003 = AnonymousClass89P.A00(r1);
            put = A003.put(obj, obj2);
            AnonymousClass8s3 AB2 = A003.AB2();
            if (C04220Ms.A0I(AB2, r1)) {
                break;
            }
            C113516rY r02 = this.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53S r2 = (AnonymousClass53S) C122127Kl.A02(A002, this, r02);
                synchronized (obj3) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A01 = AB2;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return put;
    }

    public final Object remove(Object obj) {
        AnonymousClass8s3 r1;
        int i;
        Object remove;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C102706Wf.A00;
            synchronized (obj2) {
                C113516rY r0 = this.A00;
                AnonymousClass53S A0H = C86134wK.A0H(r0, r0);
                r1 = A0H.A01;
                i = A0H.A00;
            }
            C41627MVz A003 = AnonymousClass89P.A00(r1);
            remove = A003.remove(obj);
            AnonymousClass8s3 AB2 = A003.AB2();
            if (C04220Ms.A0I(AB2, r1)) {
                break;
            }
            C113516rY r02 = this.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53S r2 = (AnonymousClass53S) C122127Kl.A02(A002, this, r02);
                synchronized (obj2) {
                    int i2 = r2.A00;
                    z = true;
                    if (i2 == i) {
                        r2.A01 = AB2;
                        r2.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return remove;
    }

    public final /* bridge */ Collection values() {
        return this.A01;
    }

    public AnonymousClass84T() {
        C41622MVu mVu = C41622MVu.A02;
        C04220Ms.A0C(mVu, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.A00 = new AnonymousClass53S(mVu);
    }

    public final boolean containsKey(Object obj) {
        return A00().A01.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return A00().A01.containsValue(obj);
    }

    public final Object get(Object obj) {
        return A00().A01.get(obj);
    }

    public final boolean isEmpty() {
        return A00().A01.isEmpty();
    }

    public final /* bridge */ int size() {
        return A00().A01.size();
    }

    public final void CXd(C113516rY r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ C113516rY Bg8(C113516rY r2, C113516rY r3, C113516rY r4) {
        return null;
    }
}
