package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7W5  reason: invalid class name */
public final class AnonymousClass7W5 implements C147318p9 {
    public final int A00;
    public final AnonymousClass7W5 A01;
    public AnonymousClass7EA A02;
    public AnonymousClass0YP A03;
    public boolean A04;
    public boolean A05;
    public final C146498mL A06;
    public final AnonymousClass7W3 A07;
    public final C115506vH A08;
    public final C134927yb A09;
    public final C121227Ew A0A;
    public final C121227Ew A0B;
    public final C121227Ew A0C;
    public final Object A0D = C86144wL.A0d();
    public final HashSet A0E;
    public final HashSet A0F;
    public final List A0G;
    public final List A0H;
    public final AtomicReference A0I = new AtomicReference((Object) null);

    public /* synthetic */ AnonymousClass7W5(C146498mL r12, C115506vH r13) {
        C115506vH r5 = r13;
        this.A08 = r13;
        this.A06 = r12;
        HashSet A0u = C18200wM.A0u();
        this.A0E = A0u;
        C134927yb r7 = new C134927yb();
        this.A09 = r7;
        this.A0B = new C121227Ew();
        this.A0F = C18200wM.A0u();
        this.A0A = new C121227Ew();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A0G = A0v;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        this.A0H = A0v2;
        this.A0C = new C121227Ew();
        this.A02 = new AnonymousClass7EA((DefaultConstructorMarker) null, 0, 1);
        AnonymousClass7W3 r3 = new AnonymousClass7W3(r12, r5, this, r7, A0v, A0v2, A0u);
        if (r13 instanceof AnonymousClass530) {
            ((AnonymousClass530) r5).A03.add(r3);
        }
        this.A07 = r3;
        this.A03 = C549731d.A00;
    }

    public final void CZU(Object obj) {
        AnonymousClass7WO A12;
        Object[] objArr;
        C04220Ms.A0B(obj, 0);
        AnonymousClass7W3 r1 = this.A07;
        if (r1.A00 <= 0 && (A12 = r1.A12()) != null) {
            A12.A01 |= 1;
            this.A0B.A04(obj, A12);
            boolean z = obj instanceof C147358pD;
            if (z) {
                C121227Ew r7 = this.A0A;
                r7.A03(obj);
                C123267Wf r3 = (C123267Wf) ((C147358pD) obj);
                AnonymousClass7EA r0 = C123267Wf.A00((AnonymousClass53U) C122127Kl.A06(r3.A00), r3, C122127Kl.A00(), r3.A01, false).A01;
                if (r0 != null) {
                    objArr = r0.A01;
                } else {
                    objArr = new Object[0];
                }
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        break;
                    }
                    r7.A04(obj2, obj);
                }
            }
            if ((A12.A01 & 32) == 0) {
                C112306pM r12 = A12.A04;
                if (r12 == null) {
                    r12 = new C112306pM();
                    A12.A04 = r12;
                }
                r12.A00(obj, A12.A00);
                if (z) {
                    AnonymousClass7EA r2 = A12.A05;
                    if (r2 == null) {
                        r2 = new AnonymousClass7EA((DefaultConstructorMarker) null, 0, 1);
                        A12.A05 = r2;
                    }
                    r2.A01(obj, ((C147358pD) obj).Abn());
                }
            }
        }
    }

    public final void CZW(Object obj) {
        C04220Ms.A0B(obj, 0);
        synchronized (this.A0D) {
            A07(obj);
            C121227Ew r1 = this.A0A;
            int A002 = C121227Ew.A00(r1, obj);
            if (A002 >= 0) {
                AnonymousClass84Z A012 = C121227Ew.A01(r1, A002);
                int size = A012.size();
                for (int i = 0; i < size; i++) {
                    A07((C147358pD) A012.A01(i));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (r0 < r1) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r10 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        if (r4 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        return r4.A00(r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        r11.A08.A08(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009a, code lost:
        if (r11.A07.A0Q == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        return X.AnonymousClass006.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a1, code lost:
        return X.AnonymousClass006.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer A00(X.C104036b8 r12, X.AnonymousClass7WO r13, java.lang.Object r14) {
        /*
            r11 = this;
            java.lang.Object r3 = r11.A0D
            monitor-enter(r3)
            X.7W5 r4 = r11.A01     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r4 == 0) goto L_0x0049
            X.7yb r8 = r11.A09     // Catch:{ all -> 0x00a2 }
            int r6 = r11.A00     // Catch:{ all -> 0x00a2 }
            boolean r0 = r8.A05     // Catch:{ all -> 0x00a2 }
            r10 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0040
            int r9 = r8.A00     // Catch:{ all -> 0x00a2 }
            if (r6 >= r9) goto L_0x0043
            int r7 = r12.A00     // Catch:{ all -> 0x00a2 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L_0x0031
            r5 = 1
            java.util.ArrayList r1 = r8.A04     // Catch:{ all -> 0x00a2 }
            int r0 = X.C121627Hb.A02(r1, r7, r9)     // Catch:{ all -> 0x00a2 }
            if (r0 < 0) goto L_0x0031
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00a2 }
            boolean r0 = X.C04220Ms.A0I(r0, r12)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x008d
            int[] r0 = r8.A06     // Catch:{ all -> 0x00a2 }
            int r1 = X.C86154wM.A03(r6, r0)     // Catch:{ all -> 0x00a2 }
            int r1 = r1 + r6
            int r0 = r12.A00     // Catch:{ all -> 0x00a2 }
            if (r6 > r0) goto L_0x008d
            goto L_0x0081
        L_0x0040:
            java.lang.String r0 = "Writer is active"
            goto L_0x0045
        L_0x0043:
            java.lang.String r0 = "Invalid group index"
        L_0x0045:
            X.AnonymousClass7J4.A02(r0)     // Catch:{ all -> 0x00a2 }
            throw r2     // Catch:{ all -> 0x00a2 }
        L_0x0049:
            r4 = r2
            X.7W3 r1 = r11.A07     // Catch:{ all -> 0x00a2 }
            boolean r0 = r1.A0Q     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r1.A15(r13, r14)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x00a2 }
            goto L_0x008f
        L_0x0059:
            if (r14 != 0) goto L_0x0061
            X.7EA r0 = r11.A02     // Catch:{ all -> 0x00a2 }
            r0.A01(r13, r2)     // Catch:{ all -> 0x00a2 }
            goto L_0x0085
        L_0x0061:
            X.7EA r2 = r11.A02     // Catch:{ all -> 0x00a2 }
            int r1 = X.AnonymousClass7EA.A00(r2, r13)     // Catch:{ all -> 0x00a2 }
            if (r1 < 0) goto L_0x0075
            java.lang.Object[] r0 = r2.A02     // Catch:{ all -> 0x00a2 }
            r0 = r0[r1]     // Catch:{ all -> 0x00a2 }
            X.84Z r0 = (X.AnonymousClass84Z) r0     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0085
            r0.add(r14)     // Catch:{ all -> 0x00a2 }
            goto L_0x0085
        L_0x0075:
            X.84Z r0 = new X.84Z     // Catch:{ all -> 0x00a2 }
            r0.<init>()     // Catch:{ all -> 0x00a2 }
            r0.add(r14)     // Catch:{ all -> 0x00a2 }
            r2.A01(r13, r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x0085
        L_0x0081:
            if (r0 >= r1) goto L_0x008d
        L_0x0083:
            if (r10 == 0) goto L_0x0049
        L_0x0085:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0091
            java.lang.Integer r0 = r4.A00(r12, r13, r14)
            return r0
        L_0x008d:
            r10 = 0
            goto L_0x0083
        L_0x008f:
            monitor-exit(r3)
            return r0
        L_0x0091:
            X.6vH r0 = r11.A08
            r0.A08(r11)
            X.7W3 r0 = r11.A07
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x009f
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            return r0
        L_0x009f:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            return r0
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7W5.A00(X.6b8, X.7WO, java.lang.Object):java.lang.Integer");
    }

    private final void A01() {
        C121227Ew r5 = this.A0A;
        int i = r5.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = r5.A01[i3];
            AnonymousClass84Z r8 = r5.A02[i4];
            C04220Ms.A0A(r8);
            int size = r8.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = r8.A01[i6];
                C04220Ms.A0C(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                C121227Ew r1 = this.A0B;
                C04220Ms.A0B(obj, 0);
                if (!(!C86114wI.A1S(C121227Ew.A00(r1, obj)))) {
                    if (i5 != i6) {
                        r8.A01[i5] = obj;
                    }
                    i5++;
                }
            }
            int size2 = r8.size();
            for (int i7 = i5; i7 < size2; i7++) {
                r8.A01[i7] = null;
            }
            r8.A00 = i5;
            if (r8.size() > 0) {
                if (i2 != i3) {
                    int[] iArr = r5.A01;
                    int i8 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i8;
                }
                i2++;
            }
        }
        int i9 = r5.A00;
        for (int i10 = i2; i10 < i9; i10++) {
            r5.A03[r5.A01[i10]] = null;
        }
        r5.A00 = i2;
        Iterator it = this.A0F.iterator();
        C04220Ms.A06(it);
        while (it.hasNext()) {
            if (((AnonymousClass7WO) it.next()).A05 == null) {
                it.remove();
            }
        }
    }

    public static void A02(AnonymousClass7W5 r1) {
        HashSet hashSet = r1.A0E;
        if (!hashSet.isEmpty()) {
            new AnonymousClass7WI(hashSet).A00();
        }
    }

    public static final void A03(AnonymousClass7W5 r2) {
        r2.A0I.set((Object) null);
        r2.A0G.clear();
        r2.A0H.clear();
        r2.A0E.clear();
    }

    public static final void A04(AnonymousClass7W5 r5) {
        String str;
        AtomicReference atomicReference = r5.A0I;
        Object obj = C102676Wc.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                str = "pending composition has not been applied";
            } else if (andSet instanceof Set) {
                r5.A09((Set) andSet, true);
                return;
            } else if (andSet instanceof Object[]) {
                for (Set A092 : (Set[]) andSet) {
                    r5.A09(A092, true);
                }
                return;
            } else {
                str = AnonymousClass0wJ.A0t("corrupt pendingModifications drain: ", atomicReference);
            }
            AnonymousClass7J4.A02(str);
            throw null;
        }
    }

    public static final void A05(AnonymousClass7W5 r5) {
        String A0t;
        AtomicReference atomicReference = r5.A0I;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (C04220Ms.A0I(andSet, C102676Wc.A00)) {
            return;
        }
        if (andSet instanceof Set) {
            r5.A09((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set A092 : (Set[]) andSet) {
                r5.A09(A092, false);
            }
        } else {
            if (andSet == null) {
                A0t = "calling recordModificationsOf and applyChanges concurrently is not supported";
            } else {
                A0t = AnonymousClass0wJ.A0t("corrupt pendingModifications drain: ", atomicReference);
            }
            AnonymousClass7J4.A02(A0t);
            throw null;
        }
    }

    public static final void A06(AnonymousClass7W5 r6, Object obj, AnonymousClass0MJ r8, boolean z) {
        Integer num;
        AbstractCollection abstractCollection;
        C121227Ew r1 = r6.A0B;
        int A002 = C121227Ew.A00(r1, obj);
        if (A002 >= 0) {
            AnonymousClass84Z A012 = C121227Ew.A01(r1, A002);
            int size = A012.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7WO r2 = (AnonymousClass7WO) A012.A01(i);
                if (!r6.A0C.A05(obj, r2)) {
                    AnonymousClass7W5 r0 = r2.A03;
                    if (r0 == null || (num = r0.A0A(r2, obj)) == null) {
                        num = AnonymousClass006.A00;
                    }
                    if (num != AnonymousClass006.A00) {
                        if (r2.A05 == null || z) {
                            abstractCollection = (AbstractCollection) r8.A00;
                            if (abstractCollection == null) {
                                abstractCollection = C18200wM.A0u();
                                r8.A00 = abstractCollection;
                            }
                        } else {
                            abstractCollection = r6.A0F;
                        }
                        abstractCollection.add(r2);
                    }
                }
            }
        }
    }

    private final void A07(Object obj) {
        Integer num;
        C121227Ew r1 = this.A0B;
        int A002 = C121227Ew.A00(r1, obj);
        if (A002 >= 0) {
            AnonymousClass84Z A012 = C121227Ew.A01(r1, A002);
            int size = A012.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7WO r2 = (AnonymousClass7WO) A012.A01(i);
                AnonymousClass7W5 r0 = r2.A03;
                if (r0 == null || (num = r0.A0A(r2, obj)) == null) {
                    num = AnonymousClass006.A00;
                }
                if (num == AnonymousClass006.A0N) {
                    this.A0C.A04(obj, r2);
                }
            }
        }
    }

    private final void A08(List list) {
        C122137Ks A022;
        C104036b8 r0;
        C147098nO r02;
        AnonymousClass7WI r4 = new AnonymousClass7WI(this.A0E);
        List list2 = list;
        try {
            if (!list2.isEmpty()) {
                C13790oJ.A01("Compose:applyChanges", 1854082573);
                try {
                    C146498mL r7 = this.A06;
                    A022 = this.A09.A02();
                    int size = list2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AnonymousClass0YM) list2.get(i2)).invoke(r7, A022, r4);
                    }
                    list2.clear();
                    A022.A0K();
                    AnonymousClass7W1 r72 = (AnonymousClass7W1) r7;
                    if ((r72 instanceof C874952z) && (r02 = ((AnonymousClass7Y3) r72.A01).A0A) != null) {
                        r02.BwF();
                    }
                    C13790oJ.A00(1166705813);
                    r4.A02();
                    r4.A01();
                    List list3 = r4.A04;
                    if (C18190wL.A1a(list3)) {
                        C13790oJ.A01("Compose:sideeffects", 1854082573);
                        int size2 = list3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C18240wQ.A1G(list3.get(i3));
                        }
                        list3.clear();
                        C13790oJ.A00(1166705813);
                    }
                    if (this.A04) {
                        C13790oJ.A01("Compose:unobserve", 1854082573);
                        this.A04 = false;
                        C121227Ew r6 = this.A0B;
                        int i4 = r6.A00;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = r6.A01[i5];
                            AnonymousClass84Z r9 = r6.A02[i6];
                            C04220Ms.A0A(r9);
                            int size3 = r9.size();
                            int i7 = 0;
                            for (int i8 = 0; i8 < size3; i8++) {
                                Object obj = r9.A01[i8];
                                C04220Ms.A0C(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                AnonymousClass7WO r1 = (AnonymousClass7WO) obj;
                                if (!(r1.A03 == null || (r0 = r1.A02) == null || r0.A00 == Integer.MIN_VALUE)) {
                                    if (i7 != i8) {
                                        r9.A01[i7] = obj;
                                    }
                                    i7++;
                                }
                            }
                            int size4 = r9.size();
                            for (int i9 = i7; i9 < size4; i9++) {
                                r9.A01[i9] = null;
                            }
                            r9.A00 = i7;
                            if (r9.size() > 0) {
                                if (i != i5) {
                                    int[] iArr = r6.A01;
                                    int i10 = iArr[i];
                                    iArr[i] = i6;
                                    iArr[i5] = i10;
                                }
                                i++;
                            }
                        }
                        int i11 = r6.A00;
                        for (int i12 = i; i12 < i11; i12++) {
                            r6.A03[r6.A01[i12]] = null;
                        }
                        r6.A00 = i;
                        A01();
                        C13790oJ.A00(1166705813);
                    }
                } catch (Throwable th) {
                    th = th;
                    C13790oJ.A00(1166705813);
                    throw th;
                }
            }
            if (this.A0H.isEmpty()) {
                r4.A00();
            }
        } catch (Throwable th2) {
            if (this.A0H.isEmpty()) {
                r4.A00();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r1 = r0.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A0A(X.AnonymousClass7WO r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r1 = r6.A01
            r0 = r1 & 2
            if (r0 == 0) goto L_0x000a
            r0 = r1 | 4
            r6.A01 = r0
        L_0x000a:
            X.6b8 r4 = r6.A02
            if (r4 == 0) goto L_0x0037
            X.7yb r0 = r5.A09
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r2) goto L_0x0037
            java.util.ArrayList r1 = r0.A04
            int r0 = r0.A00
            int r0 = X.C121627Hb.A02(r1, r3, r0)
            if (r0 < 0) goto L_0x0037
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0037
            int r0 = r4.A00
            if (r0 == r2) goto L_0x0037
            X.0YP r0 = r6.A06
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r0 = r5.A00(r4, r6, r7)
            return r0
        L_0x0037:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7W5.A0A(X.7WO, java.lang.Object):java.lang.Integer");
    }

    public final void A8s() {
        synchronized (this.A0D) {
            try {
                A08(this.A0G);
                A05(this);
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    public final void A8w() {
        synchronized (this.A0D) {
            try {
                List list = this.A0H;
                if (C18190wL.A1a(list)) {
                    A08(list);
                }
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    public final boolean Alt() {
        boolean A1X;
        synchronized (this.A0D) {
            A1X = C18180wK.A1X(this.A02.A00);
        }
        return A1X;
    }

    public final boolean BSt() {
        return this.A05;
    }

    public final void CjK(AnonymousClass0YP r2) {
        if (!this.A05) {
            this.A03 = r2;
            this.A08.A0A(this, r2);
            return;
        }
        throw C18180wK.A0a("The composition is disposed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (X.C18250wR.A1K(r6.A0E) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r6 = this;
            java.lang.Object r2 = r6.A0D
            monitor-enter(r2)
            boolean r0 = r6.A05     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00ac
            r0 = 1
            r6.A05 = r0     // Catch:{ all -> 0x00b3 }
            X.0YP r0 = X.C549731d.A01     // Catch:{ all -> 0x00b3 }
            r6.A03 = r0     // Catch:{ all -> 0x00b3 }
            X.7W3 r4 = r6.A07     // Catch:{ all -> 0x00b3 }
            java.util.List r0 = r4.A0L     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0017
            r6.A08(r0)     // Catch:{ all -> 0x00b3 }
        L_0x0017:
            X.7yb r5 = r6.A09     // Catch:{ all -> 0x00b3 }
            int r0 = r5.A00     // Catch:{ all -> 0x00b3 }
            r3 = 1
            if (r0 > 0) goto L_0x0027
            r3 = 0
            java.util.HashSet r0 = r6.A0E     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C18250wR.A1K(r0)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0048
        L_0x0027:
            java.util.HashSet r0 = r6.A0E     // Catch:{ all -> 0x00b3 }
            X.7WI r1 = new X.7WI     // Catch:{ all -> 0x00b3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0045
            X.7Ks r0 = r5.A02()     // Catch:{ all -> 0x00b3 }
            X.AnonymousClass7J4.A01(r1, r0)     // Catch:{ all -> 0x00a7 }
            r0.A0K()     // Catch:{ all -> 0x00b3 }
            X.8mL r0 = r6.A06     // Catch:{ all -> 0x00b3 }
            r0.clear()     // Catch:{ all -> 0x00b3 }
            r1.A02()     // Catch:{ all -> 0x00b3 }
            r1.A01()     // Catch:{ all -> 0x00b3 }
        L_0x0045:
            r1.A00()     // Catch:{ all -> 0x00b3 }
        L_0x0048:
            java.lang.String r1 = "Compose:Composer.dispose"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.C13790oJ.A01(r1, r0)     // Catch:{ all -> 0x00b3 }
            X.6vH r5 = r4.A0c     // Catch:{ all -> 0x009f }
            boolean r0 = r5 instanceof X.AnonymousClass530     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x007b
            X.530 r5 = (X.AnonymousClass530) r5     // Catch:{ all -> 0x009f }
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x009f }
        L_0x0060:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x009f }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x009f }
            X.7yb r0 = r4.A0g     // Catch:{ all -> 0x009f }
            r1.remove(r0)     // Catch:{ all -> 0x009f }
            goto L_0x0060
        L_0x0072:
            java.util.Set r0 = r5.A03     // Catch:{ all -> 0x009f }
            java.util.Collection r0 = X.C03940Lk.A00(r0)     // Catch:{ all -> 0x009f }
            r0.remove(r4)     // Catch:{ all -> 0x009f }
        L_0x007b:
            X.6bC r0 = r4.A0i     // Catch:{ all -> 0x009f }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
            java.util.List r0 = r4.A0m     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
            java.util.List r0 = r4.A0K     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
            X.6bD r0 = r4.A0k     // Catch:{ all -> 0x009f }
            android.util.SparseArray r0 = r0.A00     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
            X.8mL r0 = r4.A0b     // Catch:{ all -> 0x009f }
            r0.clear()     // Catch:{ all -> 0x009f }
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ac
        L_0x009f:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.C13790oJ.A00(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ab
        L_0x00a7:
            r1 = move-exception
            r0.A0K()     // Catch:{ all -> 0x00b3 }
        L_0x00ab:
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00ac:
            monitor-exit(r2)
            X.6vH r0 = r6.A08
            r0.A09(r6)
            return
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7W5.dispose():void");
    }

    private final void A09(Set set, boolean z) {
        AbstractCollection abstractCollection;
        AnonymousClass0MJ A17 = C86144wL.A17();
        Iterator it = set.iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof AnonymousClass7WO) {
                AnonymousClass7WO r2 = (AnonymousClass7WO) next;
                AnonymousClass7W5 r0 = r2.A03;
                if (r0 != null) {
                    r0.A0A(r2, (Object) null);
                }
            } else {
                A06(this, next, A17, z2);
                C121227Ew r1 = this.A0A;
                int A002 = C121227Ew.A00(r1, next);
                if (A002 >= 0) {
                    AnonymousClass84Z A012 = C121227Ew.A01(r1, A002);
                    int size = A012.size();
                    for (int i = 0; i < size; i++) {
                        A06(this, A012.A01(i), A17, z2);
                    }
                }
            }
        }
        if (z) {
            HashSet hashSet = this.A0F;
            if (!hashSet.isEmpty()) {
                C121227Ew r6 = this.A0B;
                int i2 = r6.A00;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = r6.A01[i4];
                    AnonymousClass84Z r13 = r6.A02[i5];
                    C04220Ms.A0A(r13);
                    int size2 = r13.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size2; i7++) {
                        Object obj = r13.A01[i7];
                        C04220Ms.A0C(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet.contains(obj) && ((abstractCollection = (AbstractCollection) A17.A00) == null || !abstractCollection.contains(obj))) {
                            if (i6 != i7) {
                                r13.A01[i6] = obj;
                            }
                            i6++;
                        }
                    }
                    int size3 = r13.size();
                    for (int i8 = i6; i8 < size3; i8++) {
                        r13.A01[i8] = null;
                    }
                    r13.A00 = i6;
                    if (r13.size() > 0) {
                        if (i3 != i4) {
                            int[] iArr = r6.A01;
                            int i9 = iArr[i3];
                            iArr[i3] = i5;
                            iArr[i4] = i9;
                        }
                        i3++;
                    }
                }
                int i10 = r6.A00;
                for (int i11 = i3; i11 < i10; i11++) {
                    r6.A03[r6.A01[i11]] = null;
                }
                r6.A00 = i3;
                A01();
                hashSet.clear();
                return;
            }
        }
        AbstractCollection abstractCollection2 = (AbstractCollection) A17.A00;
        if (abstractCollection2 != null) {
            C121227Ew r62 = this.A0B;
            int i12 = r62.A00;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = r62.A01[i14];
                AnonymousClass84Z r11 = r62.A02[i15];
                C04220Ms.A0A(r11);
                int size4 = r11.size();
                int i16 = 0;
                for (int i17 = 0; i17 < size4; i17++) {
                    Object obj2 = r11.A01[i17];
                    C04220Ms.A0C(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!abstractCollection2.contains(obj2)) {
                        if (i16 != i17) {
                            r11.A01[i16] = obj2;
                        }
                        i16++;
                    }
                }
                int size5 = r11.size();
                for (int i18 = i16; i18 < size5; i18++) {
                    r11.A01[i18] = null;
                }
                r11.A00 = i16;
                if (r11.size() > 0) {
                    if (i13 != i14) {
                        int[] iArr2 = r62.A01;
                        int i19 = iArr2[i13];
                        iArr2[i13] = i15;
                        iArr2[i14] = i19;
                    }
                    i13++;
                }
            }
            int i20 = r62.A00;
            for (int i21 = i13; i21 < i20; i21++) {
                r62.A03[r62.A01[i21]] = null;
            }
            r62.A00 = i13;
            A01();
        }
    }
}
