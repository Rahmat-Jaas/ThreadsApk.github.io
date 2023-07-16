package androidx.compose.runtime;

import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass53I;
import X.AnonymousClass53J;
import X.AnonymousClass68B;
import X.AnonymousClass7J4;
import X.AnonymousClass7W3;
import X.AnonymousClass7W5;
import X.AnonymousClass7WG;
import X.AnonymousClass84Z;
import X.AnonymousClass8Zj;
import X.AnonymousClass8s9;
import X.C000300e;
import X.C04220Ms;
import X.C104056bA;
import X.C104066bB;
import X.C115506vH;
import X.C121637Hc;
import X.C147318p9;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C27217EgB;
import X.C27437EnT;
import X.C27952Ew2;
import X.C86074wE;
import X.C86134wK;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C97666Ch;
import X.C97716Cm;
import android.util.Log;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class Recomposer extends C115506vH {
    public static final C86074wE A0J = C18190wL.A0z(C27217EgB.A03);
    public static final AtomicReference A0K = new AtomicReference(C18180wK.A0X());
    public long A00;
    public Throwable A01;
    public Set A02 = C86134wK.A0u();
    public AnonymousClass8s9 A03;
    public C148838sG A04;
    public C104056bA A05;
    public List A06;
    public final AnonymousClass7WG A07;
    public final C104066bB A08;
    public final Object A09 = C86144wL.A0d();
    public final List A0A = AnonymousClass0wJ.A0v();
    public final List A0B = AnonymousClass0wJ.A0v();
    public final List A0C = AnonymousClass0wJ.A0v();
    public final List A0D = AnonymousClass0wJ.A0v();
    public final Map A0E = C18220wO.A0y();
    public final Map A0F = C18220wO.A0y();
    public final C27952Ew2 A0G;
    public final C86074wE A0H = C18190wL.A0z(AnonymousClass68B.Inactive);
    public final C27437EnT A0I;

    public Recomposer(C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 1);
        AnonymousClass7WG r2 = new AnonymousClass7WG(C86154wM.A13(this, 10));
        this.A07 = r2;
        C27437EnT enT = new C27437EnT(C148838sG.A00(ew2));
        enT.BQv(C86154wM.A10(this, 4));
        this.A0I = enT;
        this.A0G = ew2.CWl(r2).CWl(enT);
        this.A08 = new C104066bB(this);
    }

    public static final List A00(Recomposer recomposer, AnonymousClass84Z r18, List list) {
        ArrayList A0t;
        List list2;
        List list3 = list;
        HashMap hashMap = new HashMap(list3.size());
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            Object obj = list3.get(i);
            Object obj2 = hashMap.get((Object) null);
            if (obj2 == null) {
                obj2 = AnonymousClass0wJ.A0v();
                hashMap.put((Object) null, obj2);
            }
            ((AbstractCollection) obj2).add(obj);
        }
        Iterator A0u = C18190wL.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            C147318p9 r2 = (C147318p9) A0o.getKey();
            List list4 = (List) A0o.getValue();
            AnonymousClass7W5 r4 = (AnonymousClass7W5) r2;
            AnonymousClass7W3 r5 = r4.A07;
            AnonymousClass7J4.A04(!r5.A0Q);
            AnonymousClass53I A002 = C121637Hc.A00(C86154wM.A10(r2, 5), C86164wN.A11(r18, r2, 1));
            try {
                Snapshot A052 = A002.A05();
                Recomposer recomposer2 = recomposer;
                try {
                    synchronized (recomposer2.A09) {
                        try {
                            A0t = C18200wM.A0t(list4);
                            int size2 = list4.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                C97716Cm r13 = (C97716Cm) list4.get(i2);
                                Map map = recomposer2.A0F;
                                Object obj3 = null;
                                C04220Ms.A0B(map, 0);
                                List list5 = (List) map.get((Object) null);
                                if (list5 != null) {
                                    obj3 = C000300e.A0o(list5);
                                    if (list5.isEmpty()) {
                                        map.remove((Object) null);
                                    }
                                }
                                A0t.add(C18180wK.A0p(r13, obj3));
                            }
                        } catch (Throwable th) {
                            e = th;
                            throw e;
                        }
                    }
                    boolean z = false;
                    if (0 < A0t.size()) {
                        A0t.get(0);
                    } else {
                        z = true;
                    }
                    AnonymousClass7J4.A04(z);
                    try {
                        List list6 = r5.A0M;
                        list2 = r5.A0K;
                        r5.A0K = list6;
                        list6.add(AnonymousClass7J4.A08);
                        if (0 < A0t.size()) {
                            A0t.get(0);
                            throw new NullPointerException("anchorIndex");
                        }
                        AnonymousClass7W3.A0r(r5, AnonymousClass8Zj.A00);
                        r5.A09 = 0;
                        r5.A0K = list2;
                        try {
                            AnonymousClass7W3.A0j(r5);
                        } catch (Throwable th2) {
                            try {
                                AnonymousClass7W5.A02(r4);
                                throw th2;
                            } catch (Exception e) {
                                e = e;
                                AnonymousClass7W5.A03(r4);
                                throw e;
                            }
                        }
                    } catch (Throwable th3) {
                        AnonymousClass7W3.A0i(r5);
                        throw th3;
                    }
                } finally {
                    C86144wL.A1N(A052);
                }
            } finally {
                A04(A002);
            }
        }
        return AnonymousClass00J.A0N(hashMap.keySet());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass8s9 A01(androidx.compose.runtime.Recomposer r4) {
        /*
            X.4wE r2 = r4.A0H
            java.lang.Object r1 = r2.getValue()
            X.68B r1 = (X.AnonymousClass68B) r1
            X.68B r0 = X.AnonymousClass68B.ShuttingDown
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L_0x0039
            java.util.List r0 = r4.A0D
            r0.clear()
            java.util.LinkedHashSet r0 = X.C86134wK.A0u()
            r4.A02 = r0
            java.util.List r0 = r4.A0A
            r0.clear()
            java.util.List r0 = r4.A0C
            r0.clear()
            java.util.List r0 = r4.A0B
            r0.clear()
            r4.A06 = r1
            X.8s9 r0 = r4.A03
            if (r0 == 0) goto L_0x0034
            r0.AC9(r1)
        L_0x0034:
            r4.A03 = r1
            r4.A05 = r1
        L_0x0038:
            return r1
        L_0x0039:
            X.6bA r0 = r4.A05
            if (r0 != 0) goto L_0x0090
            X.8sG r0 = r4.A04
            if (r0 != 0) goto L_0x0062
            java.util.LinkedHashSet r0 = X.C86134wK.A0u()
            r4.A02 = r0
            java.util.List r0 = r4.A0A
            r0.clear()
            X.7WG r0 = r4.A07
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0090
            X.68B r3 = X.AnonymousClass68B.InactivePendingWork
        L_0x0056:
            r2.CrC(r3)
            X.68B r0 = X.AnonymousClass68B.PendingWork
            if (r3 != r0) goto L_0x0038
            X.8s9 r0 = r4.A03
            r4.A03 = r1
            return r0
        L_0x0062:
            java.util.List r0 = r4.A0A
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x008d
            java.util.Set r0 = r4.A02
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x008d
            java.util.List r0 = r4.A0C
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x008d
            java.util.List r0 = r4.A0B
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x008d
            X.7WG r0 = r4.A07
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x008d
            X.68B r3 = X.AnonymousClass68B.Idle
            goto L_0x0056
        L_0x008d:
            X.68B r3 = X.AnonymousClass68B.PendingWork
            goto L_0x0056
        L_0x0090:
            X.68B r3 = X.AnonymousClass68B.Inactive
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A01(androidx.compose.runtime.Recomposer):X.8s9");
    }

    public static final void A02(C147318p9 r3, Recomposer recomposer, Exception exc) {
        if (!AnonymousClass0wJ.A1X(C86154wM.A0e(A0K)) || (exc instanceof C97666Ch)) {
            throw exc;
        }
        synchronized (recomposer.A09) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            recomposer.A0C.clear();
            recomposer.A0A.clear();
            recomposer.A02 = C86134wK.A0u();
            recomposer.A0B.clear();
            recomposer.A0F.clear();
            recomposer.A0E.clear();
            recomposer.A05 = new C104056bA(exc);
            if (r3 != null) {
                List list = recomposer.A06;
                if (list == null) {
                    list = AnonymousClass0wJ.A0v();
                    recomposer.A06 = list;
                }
                if (!list.contains(r3)) {
                    list.add(r3);
                }
                recomposer.A0D.remove(r3);
            }
            A01(recomposer);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.util.Set[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(androidx.compose.runtime.Recomposer r11) {
        /*
            java.util.Set r10 = r11.A02
            boolean r0 = X.C18190wL.A1a(r10)
            if (r0 == 0) goto L_0x008e
            java.util.List r9 = r11.A0D
            r8 = 0
            int r7 = r9.size()
        L_0x000f:
            if (r8 >= r7) goto L_0x007b
            java.lang.Object r6 = r9.get(r8)
            X.8p9 r6 = (X.C147318p9) r6
            X.7W5 r6 = (X.AnonymousClass7W5) r6
            r5 = 0
        L_0x001a:
            java.util.concurrent.atomic.AtomicReference r4 = r6.A0I
            java.lang.Object r3 = r4.get()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r0 = X.C102676Wc.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006b
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L_0x0057
            r0 = r3
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set[] r0 = new java.util.Set[]{r0, r10}
        L_0x0035:
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0044
            java.lang.Object r1 = r6.A0D
            monitor-enter(r1)
            X.AnonymousClass7W5.A05(r6)     // Catch:{ all -> 0x006d }
            monitor-exit(r1)
        L_0x0044:
            X.4wE r0 = r11.A0H
            java.lang.Object r1 = r0.getValue()
            X.68B r1 = (X.AnonymousClass68B) r1
            X.68B r0 = X.AnonymousClass68B.ShuttingDown
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x007b
            int r8 = r8 + 1
            goto L_0x000f
        L_0x0057:
            boolean r0 = r3 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0070
            r2 = r3
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.C04220Ms.A0B(r2, r5)
            int r1 = r2.length
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r0[r1] = r10
            goto L_0x0035
        L_0x006b:
            r0 = r10
            goto L_0x0035
        L_0x006d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0070:
            java.lang.String r0 = "corrupt pendingModifications: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r4)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x007b:
            java.util.LinkedHashSet r0 = X.C86134wK.A0u()
            r11.A02 = r0
            X.8s9 r0 = A01(r11)
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A03(androidx.compose.runtime.Recomposer):void");
    }

    public static final boolean A05(Recomposer recomposer) {
        boolean z;
        synchronized (recomposer.A09) {
            z = true;
            if (!(!recomposer.A02.isEmpty()) && !C18190wL.A1a(recomposer.A0A) && !recomposer.A07.A00()) {
                z = false;
            }
        }
        return z;
    }

    public final void A0B() {
        synchronized (this.A09) {
            C86074wE r2 = this.A0H;
            if (((AnonymousClass68B) r2.getValue()).compareTo(AnonymousClass68B.Idle) >= 0) {
                r2.CrC(AnonymousClass68B.ShuttingDown);
            }
        }
        this.A0I.AC7((CancellationException) null);
    }

    public static final void A04(AnonymousClass53I r1) {
        try {
            if (r1.A0L() instanceof AnonymousClass53J) {
                throw C18180wK.A0a("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            r1.A0A();
        }
    }
}
