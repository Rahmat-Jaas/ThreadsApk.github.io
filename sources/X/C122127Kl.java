package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Kl  reason: invalid class name and case insensitive filesystem */
public final class C122127Kl {
    public static int A00;
    public static C134947yd A01;
    public static final C40948Lsi A02 = new C40948Lsi();
    public static final AnonymousClass76Y A03 = new AnonymousClass76Y();
    public static final Object A04 = C86144wL.A0d();
    public static final List A05 = AnonymousClass0wJ.A0v();
    public static final List A06 = AnonymousClass0wJ.A0v();
    public static final AtomicReference A07;
    public static final AnonymousClass0YY A08 = C77904hZ.A00;
    public static final Snapshot A09;

    public static final Snapshot A01(Snapshot snapshot, AnonymousClass0YY r4, boolean z) {
        AnonymousClass53I r1;
        Snapshot snapshot2 = snapshot;
        AnonymousClass0YY r2 = r4;
        if (snapshot instanceof AnonymousClass53I) {
            r1 = (AnonymousClass53I) snapshot2;
        } else if (snapshot != null) {
            return new AnonymousClass53H(snapshot, r4, z);
        } else {
            r1 = null;
        }
        return new AnonymousClass53E(r1, r2, (AnonymousClass0YY) null, false, z);
    }

    public static final C113516rY A02(Snapshot snapshot, C145738l0 r5, C113516rY r6) {
        C113516rY A042;
        AnonymousClass0wJ.A1M(r6, 0, snapshot);
        if (snapshot.A0J()) {
            snapshot.A0I(r5);
        }
        C113516rY A032 = Snapshot.A03(snapshot, r6);
        if (A032 == null) {
            throw C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        } else if (A032.A00 == snapshot.A04()) {
            return A032;
        } else {
            synchronized (A04) {
                A042 = A04(r5, A032);
                A042.A02(A032);
                A042.A00 = snapshot.A04();
            }
            C113516rY r3 = A042;
            snapshot.A0I(r5);
            return r3;
        }
    }

    public static final C113516rY A03(C134947yd r4, C113516rY r5, int i) {
        C113516rY r2 = null;
        while (r5 != null) {
            int i2 = r5.A00;
            if (i2 != 0 && i2 <= i && !r4.A04(i2) && (r2 == null || r2.A00 < r5.A00)) {
                r2 = r5;
            }
            r5 = r5.A01;
        }
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    public static final C113516rY A05(C145738l0 r4, C113516rY r5) {
        C04220Ms.A0B(r5, 0);
        Snapshot A002 = A00();
        AnonymousClass0YY A082 = A002.A08();
        if (A082 != null) {
            A082.invoke(r4);
        }
        C113516rY A032 = Snapshot.A03(A002, r5);
        if (A032 == null) {
            synchronized (A04) {
                Snapshot A003 = A00();
                C113516rY Ail = r4.Ail();
                C04220Ms.A0C(Ail, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
                A032 = Snapshot.A03(A003, Ail);
                if (A032 == null) {
                    throw C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return A032;
    }

    public static final C113516rY A06(C113516rY r3) {
        C04220Ms.A0B(r3, 0);
        C113516rY A032 = Snapshot.A03(A00(), r3);
        if (A032 == null) {
            synchronized (A04) {
                Snapshot A002 = A00();
                A032 = A03(A002.A07(), r3, A002.A04());
            }
            if (A032 == null) {
                throw C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return A032;
    }

    public static final void A0C(Snapshot snapshot, C145738l0 r2) {
        AnonymousClass0YY r0;
        C04220Ms.A0B(snapshot, 0);
        if (!(snapshot instanceof AnonymousClass53H) && !(snapshot instanceof AnonymousClass53G) && !(snapshot instanceof AnonymousClass53F) && (r0 = ((AnonymousClass53I) snapshot).A06) != null) {
            r0.invoke(r2);
        }
    }

    static {
        C134947yd r3 = C134947yd.A04;
        A01 = r3;
        A00 = 1;
        A00 = 2;
        AnonymousClass53C r2 = new AnonymousClass53C(r3, 1);
        A01 = A01.A01(r2.A04());
        AtomicReference atomicReference = new AtomicReference(r2);
        A07 = atomicReference;
        A09 = (Snapshot) C86154wM.A0e(atomicReference);
    }

    public static final Snapshot A00() {
        Snapshot snapshot = (Snapshot) A02.A00();
        if (snapshot == null) {
            return (Snapshot) C86154wM.A0e(A07);
        }
        return snapshot;
    }

    public static final Object A07(Snapshot snapshot, AnonymousClass0YY r7) {
        Object invoke = r7.invoke(A01.A00(snapshot.A04()));
        synchronized (A04) {
            int i = A00;
            A00 = i + 1;
            C134947yd A002 = A01.A00(snapshot.A04());
            A01 = A002;
            A07.set(new AnonymousClass53C(A002, i));
            snapshot.A0A();
            A01 = A01.A01(i);
        }
        return invoke;
    }

    public static final Object A08(AnonymousClass0YY r8) {
        Object A0e;
        Object A072;
        ArrayList A0s;
        C04220Ms.A0C(A09, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj = A04;
        synchronized (obj) {
            A0e = C86154wM.A0e(A07);
            A072 = A07((Snapshot) A0e, r8);
        }
        Set<C145738l0> A0N = ((AnonymousClass53I) A0e).A0N();
        if (A0N != null) {
            synchronized (obj) {
                A0s = C18200wM.A0s(A05);
            }
            int size = A0s.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass0YP) A0s.get(i)).invoke(A0N, A0e);
            }
        }
        synchronized (obj) {
            if (A0N != null) {
                for (C145738l0 A0D : A0N) {
                    A0D(A0D);
                }
            }
        }
        return A072;
    }

    public static final void A0A(int i) {
        AnonymousClass76Y r8 = A03;
        int[] iArr = r8.A02;
        int i2 = iArr[i];
        int i3 = r8.A01 - 1;
        AnonymousClass76Y.A00(r8, i2, i3);
        r8.A01 = i3;
        int i4 = i2;
        int[] iArr2 = r8.A04;
        int i5 = iArr2[i2];
        while (i4 > 0) {
            int i6 = ((i4 + 1) >> 1) - 1;
            if (iArr2[i6] <= i5) {
                break;
            }
            AnonymousClass76Y.A00(r8, i6, i4);
            i4 = i6;
        }
        int i7 = i3 >> 1;
        while (i2 < i7) {
            int i8 = (i2 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < i3 && iArr2[i8] < iArr2[i9]) {
                if (iArr2[i8] >= iArr2[i2]) {
                    break;
                }
                AnonymousClass76Y.A00(r8, i8, i2);
                i2 = i8;
            } else if (iArr2[i9] >= iArr2[i2]) {
                break;
            } else {
                AnonymousClass76Y.A00(r8, i9, i2);
                i2 = i9;
            }
        }
        iArr[i] = r8.A00;
        r8.A00 = i;
    }

    public static final void A0B(Snapshot snapshot) {
        if (!A01.A04(snapshot.A04())) {
            throw C18180wK.A0a("Snapshot is not open");
        }
    }

    public static final C113516rY A04(C145738l0 r5, C113516rY r6) {
        C113516rY Ail = r5.Ail();
        AnonymousClass76Y r2 = A03;
        int i = A00;
        if (r2.A01 > 0) {
            i = r2.A04[0];
        }
        int i2 = i - 1;
        C134947yd r1 = C134947yd.A04;
        C113516rY r22 = null;
        while (Ail != null) {
            if (Ail.A00 != 0) {
                int i3 = Ail.A00;
                if (i3 != 0 && i3 <= i2 && !r1.A04(i3)) {
                    if (r22 == null) {
                        r22 = Ail;
                    } else if (Ail.A00 >= r22.A00) {
                        Ail = r22;
                    }
                }
                Ail = Ail.A01;
            }
            Ail.A00 = Integer.MAX_VALUE;
            return Ail;
        }
        C113516rY A012 = r6.A01();
        A012.A00 = Integer.MAX_VALUE;
        A012.A01 = r5.Ail();
        r5.CXd(A012);
        return A012;
    }

    public static final Map A09(AnonymousClass53I r9, AnonymousClass53I r10, C134947yd r11) {
        C113516rY A032;
        Set<C145738l0> A0N = r10.A0N();
        int A042 = r9.A04();
        if (A0N == null) {
            return null;
        }
        C134947yd A033 = r10.A07().A01(r10.A04()).A03(r10.A01);
        HashMap hashMap = null;
        for (C145738l0 r4 : A0N) {
            C113516rY Ail = r4.Ail();
            C113516rY A034 = A03(r11, Ail, A042);
            if (!(A034 == null || (A032 = A03(A033, Ail, A042)) == null || A034.equals(A032))) {
                C113516rY A035 = Snapshot.A03(r10, Ail);
                if (A035 != null) {
                    C113516rY Bg8 = r4.Bg8(A032, A034, A035);
                    if (Bg8 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = AnonymousClass0wJ.A0y();
                    }
                    hashMap.put(A034, Bg8);
                } else {
                    throw C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return hashMap;
    }

    public static final void A0D(C145738l0 r5) {
        AnonymousClass76Y r1 = A03;
        int i = A00;
        if (r1.A01 > 0) {
            i = r1.A04[0];
        }
        int i2 = i - 1;
        C113516rY r4 = null;
        for (C113516rY Ail = r5.Ail(); Ail != null; Ail = Ail.A01) {
            int i3 = Ail.A00;
            if (i3 != 0 && i3 <= i2) {
                if (r4 == null) {
                    r4 = Ail;
                } else {
                    C113516rY r12 = Ail;
                    if (Ail.A00 < r4.A00) {
                        r12 = r4;
                        r4 = Ail;
                    }
                    r4.A00 = 0;
                    r4.A02(r12);
                    r4 = r12;
                }
            }
        }
    }
}
