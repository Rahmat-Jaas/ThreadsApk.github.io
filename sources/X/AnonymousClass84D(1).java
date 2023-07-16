package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.KtLambdaShape23S0101000_I2;

/* renamed from: X.84D  reason: invalid class name */
public final class AnonymousClass84D<T> implements List<T>, C145738l0, AnonymousClass028 {
    public C113516rY A00 = new AnonymousClass53T(AnonymousClass53A.A01);

    public final boolean addAll(int i, Collection collection) {
        C04220Ms.A0B(collection, 1);
        return A00(new KtLambdaShape23S0101000_I2(i, 2, collection));
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return A02().A01.containsAll(collection);
    }

    public final boolean removeAll(Collection collection) {
        int i;
        C147378pF r0;
        boolean z;
        Snapshot A002;
        C04220Ms.A0B(collection, 0);
        do {
            Object obj = C1187272a.A00;
            synchronized (obj) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF CbO = r0.CbO(collection);
            z = false;
            if (C04220Ms.A0I(CbO, r0)) {
                return false;
            }
            C113516rY r03 = this.A00;
            C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r1 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                synchronized (obj) {
                    if (r1.A00 == i) {
                        AnonymousClass53T.A00(CbO, r1);
                        z = true;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return A00(C86154wM.A10(collection, 14));
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    private final boolean A00(AnonymousClass0YY r10) {
        int i;
        C147378pF r1;
        Object invoke;
        Snapshot A002;
        boolean z;
        do {
            Object obj = C1187272a.A00;
            synchronized (obj) {
                C113516rY r0 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r0, r0);
                i = A0N.A00;
                r1 = A0N.A01;
            }
            C04220Ms.A0A(r1);
            AnonymousClass8s0 ABS = r1.ABS();
            invoke = r10.invoke(ABS);
            C147378pF AB1 = ABS.AB1();
            if (C04220Ms.A0I(AB1, r1)) {
                break;
            }
            C113516rY r02 = this.A00;
            C04220Ms.A0C(r02, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r2 = (AnonymousClass53T) C122127Kl.A02(A002, this, r02);
                synchronized (obj) {
                    z = true;
                    if (r2.A00 == i) {
                        AnonymousClass53T.A00(AB1, r2);
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return AnonymousClass0wJ.A1X(invoke);
    }

    public final int A01() {
        C113516rY r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((AnonymousClass53T) C122127Kl.A06(r1)).A00;
    }

    public final AnonymousClass53T A02() {
        C113516rY r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (AnonymousClass53T) C122127Kl.A05(this, r1);
    }

    public final C113516rY Ail() {
        return this.A00;
    }

    public final void CXd(C113516rY r2) {
        r2.A01 = this.A00;
        this.A00 = r2;
    }

    public final void add(int i, Object obj) {
        int i2;
        C147378pF r0;
        Snapshot A002;
        boolean z;
        do {
            Object obj2 = C1187272a.A00;
            synchronized (obj2) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i2 = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF A5V = r0.A5V(obj, i);
            if (!C04220Ms.A0I(A5V, r0)) {
                C113516rY r03 = this.A00;
                C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C122127Kl.A04) {
                    A002 = C122127Kl.A00();
                    AnonymousClass53T r2 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                    synchronized (obj2) {
                        z = true;
                        if (r2.A00 == i2) {
                            AnonymousClass53T.A00(A5V, r2);
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

    public final void clear() {
        Snapshot A002;
        C113516rY r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (C122127Kl.A04) {
            A002 = C122127Kl.A00();
            AnonymousClass53T r2 = (AnonymousClass53T) C122127Kl.A02(A002, this, r1);
            synchronized (C1187272a.A00) {
                r2.A01 = AnonymousClass53A.A01;
                r2.A00++;
            }
        }
        C122127Kl.A0C(A002, this);
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass84Q(this, i);
    }

    public final List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new AnonymousClass84J(this, i, i2);
        }
        throw C18190wL.A0a("Failed requirement.");
    }

    public final boolean contains(Object obj) {
        return A02().A01.contains(obj);
    }

    public final Object get(int i) {
        return A02().A01.get(i);
    }

    public final int indexOf(Object obj) {
        return A02().A01.indexOf(obj);
    }

    public final boolean isEmpty() {
        return A02().A01.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        return A02().A01.lastIndexOf(obj);
    }

    public final /* bridge */ Object remove(int i) {
        int i2;
        C147378pF r0;
        Snapshot A002;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = C1187272a.A00;
            synchronized (obj2) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i2 = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF CbV = r0.CbV(i);
            if (C04220Ms.A0I(CbV, r0)) {
                return obj;
            }
            C113516rY r03 = this.A00;
            C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r2 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                synchronized (obj2) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i2) {
                        r2.A01 = CbV;
                        r2.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return obj;
    }

    public final Object set(int i, Object obj) {
        int i2;
        C147378pF r0;
        Snapshot A002;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = C1187272a.A00;
            synchronized (obj3) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i2 = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF ChP = r0.ChP(obj, i);
            if (C04220Ms.A0I(ChP, r0)) {
                return obj2;
            }
            C113516rY r03 = this.A00;
            C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r2 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                synchronized (obj3) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i2) {
                        r2.A01 = ChP;
                        r2.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return obj2;
    }

    public final /* bridge */ int size() {
        return A02().A01.size();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final /* synthetic */ C113516rY Bg8(C113516rY r2, C113516rY r3, C113516rY r4) {
        return null;
    }

    public final boolean add(Object obj) {
        int i;
        C147378pF r0;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C1187272a.A00;
            synchronized (obj2) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF A5J = r0.A5J(obj);
            z = false;
            if (C04220Ms.A0I(A5J, r0)) {
                return false;
            }
            C113516rY r03 = this.A00;
            C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r1 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                synchronized (obj2) {
                    if (r1.A00 == i) {
                        AnonymousClass53T.A00(A5J, r1);
                        z = true;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
        L_0x0004:
            java.lang.Object r9 = X.C1187272a.A00
            monitor-enter(r9)
            X.6rY r0 = r10.A00     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            X.53T r0 = X.C86124wJ.A0N(r0, r0)     // Catch:{ all -> 0x009a }
            int r6 = r0.A00     // Catch:{ all -> 0x009a }
            X.8pF r8 = r0.A01     // Catch:{ all -> 0x009a }
            monitor-exit(r9)
            X.C04220Ms.A0A(r8)
            boolean r0 = r8 instanceof X.AnonymousClass53A
            if (r0 == 0) goto L_0x0057
            r3 = r8
            X.53A r3 = (X.AnonymousClass53A) r3
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            r0 = 32
            if (r1 > r0) goto L_0x0052
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            java.lang.Object[] r4 = X.C86124wJ.A1b(r2, r1)
            int r3 = r3.size()
            java.util.Iterator r2 = r11.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            r4[r3] = r1
            r3 = r0
            goto L_0x0042
        L_0x0052:
            X.8s0 r0 = r3.ABS()
            goto L_0x005b
        L_0x0057:
            X.8s0 r0 = r8.ABS()
        L_0x005b:
            r0.addAll(r11)
            X.8pF r5 = r0.AB1()
            goto L_0x0068
        L_0x0063:
            X.53A r5 = new X.53A
            r5.<init>(r4)
        L_0x0068:
            boolean r0 = X.C04220Ms.A0I(r5, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0099
            X.6rY r0 = r10.A00
            X.C04220Ms.A0C(r0, r7)
            java.lang.Object r3 = X.C122127Kl.A04
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.Snapshot r2 = X.C122127Kl.A00()     // Catch:{ all -> 0x0096 }
            X.6rY r1 = X.C122127Kl.A02(r2, r10, r0)     // Catch:{ all -> 0x0096 }
            X.53T r1 = (X.AnonymousClass53T) r1     // Catch:{ all -> 0x0096 }
            monitor-enter(r9)     // Catch:{ all -> 0x0096 }
            int r0 = r1.A00     // Catch:{ all -> 0x0093 }
            if (r0 != r6) goto L_0x008a
            X.AnonymousClass53T.A00(r5, r1)     // Catch:{ all -> 0x0093 }
            r4 = 1
        L_0x008a:
            monitor-exit(r9)     // Catch:{ all -> 0x0096 }
            monitor-exit(r3)
            X.C122127Kl.A0C(r2, r10)
            if (r4 == 0) goto L_0x0004
            r4 = 1
            return r4
        L_0x0093:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0099:
            return r4
        L_0x009a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84D.addAll(java.util.Collection):boolean");
    }

    public final ListIterator listIterator() {
        return new AnonymousClass84Q(this, 0);
    }

    public final boolean remove(Object obj) {
        int i;
        C147378pF r0;
        boolean z;
        Snapshot A002;
        do {
            Object obj2 = C1187272a.A00;
            synchronized (obj2) {
                C113516rY r02 = this.A00;
                AnonymousClass53T A0N = C86124wJ.A0N(r02, r02);
                i = A0N.A00;
                r0 = A0N.A01;
            }
            C04220Ms.A0A(r0);
            C147378pF CbG = r0.CbG(obj);
            z = false;
            if (C04220Ms.A0I(CbG, r0)) {
                return false;
            }
            C113516rY r03 = this.A00;
            C04220Ms.A0C(r03, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass53T r1 = (AnonymousClass53T) C122127Kl.A02(A002, this, r03);
                synchronized (obj2) {
                    int i2 = r1.A00;
                    if (i2 == i) {
                        r1.A01 = CbG;
                        r1.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            C122127Kl.A0C(A002, this);
        } while (!z);
        return true;
    }
}
