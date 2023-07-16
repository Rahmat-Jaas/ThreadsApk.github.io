package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.53I  reason: invalid class name */
public class AnonymousClass53I extends Snapshot {
    public int A00 = 1;
    public C134947yd A01 = C134947yd.A04;
    public boolean A02;
    public int[] A03 = new int[0];
    public Set A04;
    public final AnonymousClass0YY A05;
    public final AnonymousClass0YY A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53I(C134947yd r2, AnonymousClass0YY r3, AnonymousClass0YY r4, int i) {
        super(r2, i);
        C04220Ms.A0B(r2, 2);
        this.A05 = r3;
        this.A06 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass53I A0K(X.AnonymousClass0YY r15, X.AnonymousClass0YY r16) {
        /*
            r14 = this;
            r9 = r14
            r11 = r15
            r7 = r16
            boolean r0 = r14 instanceof X.AnonymousClass53E
            if (r0 == 0) goto L_0x003b
            r4 = r9
            X.53E r4 = (X.AnonymousClass53E) r4
            X.0YY r0 = r4.A05
            r8 = 0
            r3 = 0
            X.0YY r6 = A01(r15, r0, r15)
            X.0YY r2 = r4.A06
            if (r16 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0026
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x0026
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1
            r0.<init>((X.AnonymousClass0YY) r7, (X.AnonymousClass0YY) r2, (int) r1)
            r7 = r0
        L_0x0026:
            boolean r1 = r4.A00
            X.53I r0 = X.AnonymousClass53E.A00(r4)
            if (r1 != 0) goto L_0x00d8
            X.53I r5 = r0.A0K(r3, r7)
            r9 = 1
            X.53E r4 = new X.53E
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0038:
            return r4
        L_0x0039:
            r7 = r2
            goto L_0x0026
        L_0x003b:
            boolean r0 = r14 instanceof X.AnonymousClass53C
            if (r0 == 0) goto L_0x0054
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r1 = new kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1
            r1.<init>((X.AnonymousClass0YY) r15, (X.AnonymousClass0YY) r7, (int) r0)
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r0 = X.C86154wM.A10(r1, r0)
            java.lang.Object r4 = X.C122127Kl.A08(r0)
            androidx.compose.runtime.snapshots.Snapshot r4 = (androidx.compose.runtime.snapshots.Snapshot) r4
            X.53I r4 = (X.AnonymousClass53I) r4
            return r4
        L_0x0054:
            boolean r0 = r14.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x0069
            int r0 = r14.A00
            if (r0 >= 0) goto L_0x0069
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0069:
            int r0 = r14.A04()
            r14.A0P(r0)
            java.lang.Object r3 = X.C122127Kl.A04
            monitor-enter(r3)
            int r13 = X.C122127Kl.A00     // Catch:{ all -> 0x00fc }
            int r0 = r13 + 1
            X.C122127Kl.A00 = r0     // Catch:{ all -> 0x00fc }
            X.7yd r0 = X.C122127Kl.A01     // Catch:{ all -> 0x00fc }
            X.7yd r0 = r0.A01(r13)     // Catch:{ all -> 0x00fc }
            X.C122127Kl.A01 = r0     // Catch:{ all -> 0x00fc }
            X.7yd r10 = r14.A07()     // Catch:{ all -> 0x00fc }
            X.7yd r0 = r10.A01(r13)     // Catch:{ all -> 0x00fc }
            r14.A0H(r0)     // Catch:{ all -> 0x00fc }
            int r0 = r14.A04()     // Catch:{ all -> 0x00fc }
        L_0x0090:
            int r0 = r0 + 1
            if (r0 >= r13) goto L_0x0099
            X.7yd r10 = r10.A01(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x0090
        L_0x0099:
            X.0YY r2 = r14.A05     // Catch:{ all -> 0x00fc }
            r1 = r2
            if (r15 == 0) goto L_0x00ac
            if (r2 == 0) goto L_0x00ad
            boolean r0 = r15.equals(r2)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x00ad
            r0 = 4
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r2 = new kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1     // Catch:{ all -> 0x00fc }
            r2.<init>((X.AnonymousClass0YY) r15, (X.AnonymousClass0YY) r1, (int) r0)     // Catch:{ all -> 0x00fc }
        L_0x00ac:
            r11 = r2
        L_0x00ad:
            X.0YY r2 = r14.A06     // Catch:{ all -> 0x00fc }
            if (r16 == 0) goto L_0x00c1
            if (r2 == 0) goto L_0x00c2
            boolean r0 = r7.equals(r2)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x00c2
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1     // Catch:{ all -> 0x00fc }
            r0.<init>((X.AnonymousClass0YY) r7, (X.AnonymousClass0YY) r2, (int) r1)     // Catch:{ all -> 0x00fc }
            r7 = r0
            goto L_0x00c2
        L_0x00c1:
            r7 = r2
        L_0x00c2:
            X.53D r4 = new X.53D     // Catch:{ all -> 0x00fc }
            r8 = r4
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x0038
            int r0 = r14.A04()
            monitor-enter(r3)
            goto L_0x00dd
        L_0x00d8:
            X.53I r4 = r0.A0K(r6, r7)
            return r4
        L_0x00dd:
            A02(r14)     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)
            X.7yd r3 = r14.A07()
            int r2 = r0 + 1
            int r1 = r14.A04()
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
        L_0x00ef:
            if (r2 >= r1) goto L_0x00f8
            X.7yd r3 = r3.A01(r2)
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x00f8:
            r14.A0H(r3)
            return r4
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ff:
            java.lang.String r0 = "Cannot use a disposed snapshot"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53I.A0K(X.0YY, X.0YY):X.53I");
    }

    public final AnonymousClass6EP A0M(C134947yd r11, Map map, int i) {
        C113516rY A032;
        Object obj;
        C04220Ms.A0B(r11, 2);
        C134947yd A033 = A07().A01(A04()).A03(this.A01);
        Set<C145738l0> A0N = A0N();
        C04220Ms.A0A(A0N);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (C145738l0 r6 : A0N) {
            C113516rY Ail = r6.Ail();
            C113516rY A034 = C122127Kl.A03(r11, Ail, i);
            if (!(A034 == null || (A032 = C122127Kl.A03(A033, Ail, A04())) == null || A034.equals(A032))) {
                C113516rY A035 = Snapshot.A03(this, Ail);
                if (A035 == null) {
                    throw C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                } else if ((map == null || (obj = map.get(A034)) == null) && (obj = r6.Bg8(A032, A034, A035)) == null) {
                    return new AnonymousClass53J(this);
                } else {
                    if (!obj.equals(A035)) {
                        if (obj.equals(A034)) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass0wJ.A0v();
                            }
                            arrayList.add(C18180wK.A0p(r6, A034.A01()));
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass0wJ.A0v();
                            }
                            arrayList2.add(r6);
                        } else {
                            if (arrayList == null) {
                                arrayList = AnonymousClass0wJ.A0v();
                            }
                            if (obj.equals(A032)) {
                                obj = A032.A01();
                            }
                            arrayList.add(C18180wK.A0p(r6, obj));
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            A0O();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) arrayList.get(i2);
                C145738l0 r62 = (C145738l0) pair.A00;
                C113516rY r5 = (C113516rY) pair.A01;
                r5.A00 = A04();
                synchronized (C122127Kl.A04) {
                    r5.A01 = r62.Ail();
                    r62.CXd(r5);
                }
            }
        }
        if (arrayList2 != null) {
            A0N.removeAll(arrayList2);
        }
        return AnonymousClass53K.A00;
    }

    public static AnonymousClass0YY A01(AnonymousClass0YY r2, AnonymousClass0YY r3, AnonymousClass0YY r4) {
        if (r2 == null) {
            return r3;
        }
        if (r3 == null || r2.equals(r3)) {
            return r4;
        }
        return new KtLambdaShape40S0200000_I2_1(r2, r3, 4);
    }

    public static void A02(Snapshot snapshot) {
        int i = C122127Kl.A00;
        C122127Kl.A00 = i + 1;
        snapshot.A0G(i);
        C122127Kl.A01 = C122127Kl.A01.A01(snapshot.A04());
    }

    public void A0A() {
        if (!this.A01) {
            super.A0A();
            A0C();
        }
    }

    public final void A0E() {
        for (int A0A : this.A03) {
            C122127Kl.A0A(A0A);
        }
        super.A0E();
    }

    public final AnonymousClass6EP A0L() {
        Object obj;
        AnonymousClass6EP r1;
        Map map;
        Pair pair;
        Map map2;
        if (this instanceof AnonymousClass53E) {
            return AnonymousClass53E.A00((AnonymousClass53E) this).A0L();
        }
        if (this instanceof AnonymousClass53D) {
            AnonymousClass53D r7 = (AnonymousClass53D) this;
            AnonymousClass53I r6 = r7.A01;
            if (r6.A02 || r6.A01) {
                return new AnonymousClass53J(r7);
            }
            Set A0N = r7.A0N();
            int A042 = r7.A04();
            if (A0N != null) {
                map2 = C122127Kl.A09(r6, r7, r6.A07());
            } else {
                map2 = null;
            }
            obj = C122127Kl.A04;
            synchronized (obj) {
                C122127Kl.A0B(r7);
                if (A0N == null || A0N.size() == 0) {
                    r7.A0F();
                } else {
                    r1 = r7.A0M(r6.A07(), map2, r6.A04());
                    if (C04220Ms.A0I(r1, AnonymousClass53K.A00)) {
                        Set A0N2 = r6.A0N();
                        if (A0N2 == null) {
                            A0N2 = C18200wM.A0u();
                            r6.A0Q(A0N2);
                        }
                        A0N2.addAll(A0N);
                    }
                }
                if (r6.A04() < A042) {
                    r6.A0O();
                }
                r6.A0H(r6.A07().A00(A042).A02(r7.A01));
                r6.A0P(A042);
                int i = r7.A00;
                r7.A00 = -1;
                if (i >= 0) {
                    int[] iArr = r6.A03;
                    C04220Ms.A0B(iArr, 0);
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    r6.A03 = copyOf;
                }
                C134947yd r12 = r7.A01;
                C04220Ms.A0B(r12, 0);
                r6.A01 = r6.A01.A03(r12);
                int[] iArr2 = r7.A03;
                C04220Ms.A0B(iArr2, 0);
                int length2 = iArr2.length;
                if (length2 != 0) {
                    int[] iArr3 = r6.A03;
                    int length3 = iArr3.length;
                    if (length3 != 0) {
                        int[] copyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                        System.arraycopy(iArr2, 0, copyOf2, length3, length2);
                        C04220Ms.A06(copyOf2);
                        iArr2 = copyOf2;
                    }
                    r6.A03 = iArr2;
                }
            }
            r7.A02 = true;
            if (!r7.A00) {
                r7.A00 = true;
                r6.A0C();
            }
            return AnonymousClass53K.A00;
        } else if (this instanceof AnonymousClass53C) {
            throw C18180wK.A0a("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
        } else {
            Set<C145738l0> A0N3 = A0N();
            if (A0N3 != null) {
                AtomicReference atomicReference = C122127Kl.A07;
                map = C122127Kl.A09((AnonymousClass53I) C86154wM.A0e(atomicReference), this, C122127Kl.A01.A00(((Snapshot) atomicReference.get()).A04()));
            } else {
                map = null;
            }
            obj = C122127Kl.A04;
            synchronized (obj) {
                C122127Kl.A0B(this);
                if (A0N3 == null || A0N3.size() == 0) {
                    A09();
                    AnonymousClass53C r13 = (AnonymousClass53C) C122127Kl.A07.get();
                    C04220Ms.A04(r13);
                    C122127Kl.A07(r13, C122127Kl.A08);
                    Set A0N4 = r13.A0N();
                    if (A0N4 == null || !C18190wL.A1a(A0N4)) {
                        pair = C18180wK.A0p(AnonymousClass0ZV.A00, (Object) null);
                    } else {
                        pair = C18180wK.A0p(C18200wM.A0s(C122127Kl.A05), A0N4);
                    }
                } else {
                    AnonymousClass53C r3 = (AnonymousClass53C) C122127Kl.A07.get();
                    r1 = A0M(C122127Kl.A01.A00(r3.A04()), map, C122127Kl.A00);
                    if (C04220Ms.A0I(r1, AnonymousClass53K.A00)) {
                        A09();
                        C122127Kl.A07(r3, C122127Kl.A08);
                        Set A0N5 = r3.A0N();
                        A0Q((Set) null);
                        r3.A0Q((Set) null);
                        pair = C18180wK.A0p(C18200wM.A0s(C122127Kl.A05), A0N5);
                    }
                }
            }
            List list = (List) pair.A00;
            Collection<C145738l0> collection = (Collection) pair.A01;
            this.A02 = true;
            if (collection != null && !collection.isEmpty()) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AnonymousClass0YP) list.get(i2)).invoke(collection, this);
                }
            }
            if (A0N3 != null && !A0N3.isEmpty()) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((AnonymousClass0YP) list.get(i3)).invoke(A0N3, this);
                }
            }
            synchronized (obj) {
                A0E();
                if (collection != null) {
                    for (C145738l0 A0D : collection) {
                        C122127Kl.A0D(A0D);
                    }
                }
                if (A0N3 != null) {
                    for (C145738l0 A0D2 : A0N3) {
                        C122127Kl.A0D(A0D2);
                    }
                }
            }
            return AnonymousClass53K.A00;
        }
        return r1;
    }

    public final Set A0N() {
        if (this instanceof AnonymousClass53E) {
            return AnonymousClass53E.A00((AnonymousClass53E) this).A0N();
        }
        return this.A04;
    }

    public final void A0P(int i) {
        synchronized (C122127Kl.A04) {
            this.A01 = this.A01.A01(i);
        }
    }

    public final void A0Q(Set set) {
        if (this instanceof AnonymousClass53E) {
            throw C18240wQ.A0j();
        }
        this.A04 = set;
    }

    public final void A0O() {
        A0P(A04());
        if (!this.A02 && !this.A01) {
            int A042 = A04();
            synchronized (C122127Kl.A04) {
                A02(this);
            }
            C134947yd A07 = A07();
            int A043 = A04();
            C04220Ms.A0B(A07, 0);
            for (int i = A042 + 1; i < A043; i++) {
                A07 = A07.A01(i);
            }
            A0H(A07);
        }
    }
}
