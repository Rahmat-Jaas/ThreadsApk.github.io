package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0WK  reason: invalid class name */
public final class AnonymousClass0WK {
    public C09350fH A00;
    public C09780gf A01;
    public C12020lB A02;
    public AnonymousClass0e1 A03;
    public final C03720Kl A04;
    public final AnonymousClass0W1 A05;
    public final AnonymousClass0WD A06;
    public final AnonymousClass0WD A07;
    public final AnonymousClass0Jz A08 = new C12400lq();
    public final C12410lr A09;
    public final C12440lu A0A;

    public static long A00(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    public static AnonymousClass0Jz A01(AnonymousClass0WA r18, AnonymousClass0WK r19, int i, int i2, long j) {
        long nowNanos;
        AnonymousClass0WK r9 = r19;
        C09780gf r8 = r9.A01;
        C12400lq r4 = null;
        if (!(r8 == null || j == 0)) {
            C08640dy A032 = r9.A03.A03();
            AnonymousClass0WA r10 = r18;
            if (r18 == null) {
                nowNanos = 0;
            } else {
                nowNanos = r9.A04.nowNanos();
            }
            for (int i3 : r8.A01) {
                if ((j & (1 << (i3 - 1))) != 0) {
                    AnonymousClass0W6 A002 = r8.A00(i3);
                    if (A002.BTR(A032)) {
                        if (r4 == null) {
                            r4 = new C12400lq();
                        }
                        r4.put(A002.B52(), A002.Cuj(i, i2));
                        if (r18 != null) {
                            long nowNanos2 = r9.A04.nowNanos();
                            r10.A0O.add(Integer.valueOf(i3));
                            r10.A0P.add(Long.valueOf(nowNanos2 - nowNanos));
                            nowNanos = nowNanos2;
                        }
                    }
                }
            }
        }
        return r4;
    }

    public static void A03(AnonymousClass0WK r12, AnonymousClass0Jz r13, long j) {
        Object obj;
        C09780gf r6 = r12.A01;
        if (r6 != null && j != 0) {
            C08640dy A032 = r12.A03.A03();
            for (int i : r6.A01) {
                if (((1 << (i - 1)) & j) != 0) {
                    AnonymousClass0W6 A002 = r6.A00(i);
                    if (A002.BTR(A032)) {
                        int B52 = A002.B52();
                        if (r13 != null) {
                            obj = r13.get(B52);
                        } else {
                            obj = null;
                        }
                        A002.Cw1(obj);
                    }
                }
            }
        }
    }

    public final AnonymousClass0Jz A05(AnonymousClass0WA r19, int i, int i2, long j) {
        long nowNanos;
        C09780gf r8 = this.A01;
        if (r8 == null || j == 0) {
            return null;
        }
        C12400lq r7 = new C12400lq();
        AnonymousClass0WA r9 = r19;
        if (r19 == null) {
            nowNanos = 0;
        } else {
            nowNanos = this.A04.nowNanos();
        }
        for (int i3 : r8.A01) {
            C08640dy A032 = this.A03.A03();
            if ((j & (1 << (i3 - 1))) != 0) {
                AnonymousClass0W6 A002 = r8.A00(i3);
                if (A002.BTR(A032)) {
                    r7.put(A002.B52(), A002.CuR(i, i2));
                    if (r19 != null) {
                        long nowNanos2 = this.A04.nowNanos();
                        r9.A0O.add(Integer.valueOf(i3));
                        r9.A0P.add(Long.valueOf(nowNanos2 - nowNanos));
                        nowNanos = nowNanos2;
                    }
                }
            }
        }
        return r7;
    }

    public final List A06(int i) {
        ReentrantLock reentrantLock;
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock2 = this.A06.A01;
        reentrantLock2.lock();
        ReentrantLock reentrantLock3 = this.A07.A01;
        reentrantLock3.lock();
        try {
            AnonymousClass0W1 r3 = this.A05;
            reentrantLock = r3.A04.A01;
            reentrantLock.lock();
            int size = r3.A05.size();
            reentrantLock.unlock();
            for (int i2 = 0; i2 < size; i2++) {
                C09350fH A012 = r3.A01(i2);
                if (A012.A03 == i || (A012.A0H != null && A012.A0H.A00 == i)) {
                    arrayList.add(Integer.valueOf(A012.A02));
                }
            }
            reentrantLock3.unlock();
            reentrantLock2.unlock();
            return arrayList;
        } catch (Throwable th) {
            reentrantLock3.unlock();
            reentrantLock2.unlock();
            throw th;
        }
    }

    public final void A08(AnonymousClass0WA r39, AnonymousClass0WQ r40, AnonymousClass0WW r41, String str, TimeUnit timeUnit, int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        long j2;
        int i6;
        long j3;
        boolean z2;
        boolean z3;
        int i7 = i;
        int i8 = i2;
        long A002 = A00(i7, i8);
        AnonymousClass0WD r9 = this.A06;
        AnonymousClass0WA r0 = r39;
        r9.A00(r0);
        try {
            AnonymousClass0W1 r15 = this.A05;
            C09350fH A032 = r15.A03(r0, A002);
            if (r39 != null) {
                r0.A03 = this.A04.nowNanos();
            }
            boolean z4 = z;
            AnonymousClass0WQ r18 = r40;
            AnonymousClass0WW r37 = r41;
            String str2 = str;
            TimeUnit timeUnit2 = timeUnit;
            int i9 = i3;
            long j4 = j;
            if (A032 != null) {
                A032.A06 = i5;
                j2 = timeUnit2.toNanos(j4) - A032.A0B;
                j3 = A032.A09;
                i6 = A032.A07;
                if (r39 != null) {
                    r0.A0A = this.A04.nowNanos();
                }
                if (j3 == 0 || i4 == 0) {
                    z3 = true;
                    A032.A01(r18, (AnonymousClass0Jz) null, str2, TimeUnit.NANOSECONDS, i9, j2);
                    if (r39 != null) {
                        r0.A09 = this.A04.nowNanos();
                    }
                    r37.A01(r0, r18, A032, str2, i9, timeUnit2.toMillis(j4), timeUnit2.toNanos(j4), z4);
                    if (r39 != null) {
                        r0.A04 = this.A04.nowNanos();
                    }
                    z2 = false;
                } else {
                    z3 = true;
                    z2 = true;
                }
                if (r39 != null) {
                    r0.A0L = z3;
                }
            } else {
                j2 = 0;
                j3 = 0;
                z2 = false;
                i6 = 0;
            }
            if (z2) {
                AnonymousClass0Jz A052 = A05(r0, i7, i8, j3);
                r9.A00(r0);
                C09350fH A033 = r15.A03(r0, A002);
                if (A033 != null && A033.A07 == i6 && AnonymousClass0W1.A00(r37, A033)) {
                    A033.A01(r18, A052, str2, TimeUnit.NANOSECONDS, i9, j2);
                    r37.A01(r0, r18, A033, str2, i9, timeUnit2.toMillis(j4), timeUnit2.toNanos(j4), z4);
                }
                r9.A01(r0);
            }
        } finally {
            r9.A01(r0);
        }
    }

    public final void A09(AnonymousClass0WA r3, AnonymousClass0WW r4, C09350fH r5, String str, String str2, int i) {
        AnonymousClass0WD r1 = this.A06;
        r1.A00(r3);
        try {
            r5.A06 = i;
            r5.A8X(str, str2);
            r4.A02(r3, r5);
            if (r3 != null) {
                r3.A0L = true;
            }
        } finally {
            r1.A01(r3);
        }
    }

    public final void A0C(AnonymousClass0WW r11, int i) {
        C09350fH A002 = C09350fH.A00(TimeUnit.NANOSECONDS, 36315086, 0, 0, 0, 0, this.A04.nowNanos(), true, false);
        A002.A03("original_marker_id", i);
        ReentrantLock reentrantLock = this.A06.A01;
        reentrantLock.lock();
        try {
            r11.A03((AnonymousClass0WA) null, A002);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A0E(C05810Wd r7) {
        ReentrantLock reentrantLock = this.A06.A01;
        reentrantLock.lock();
        try {
            AnonymousClass0W1 r1 = this.A05;
            reentrantLock = r1.A04.A01;
            reentrantLock.lock();
            AnonymousClass08V r3 = r1.A05;
            int size = r3.size();
            for (int i = 0; i < size; i++) {
                r7.AKm((C09350fH) r3.valueAt(i));
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }

    public AnonymousClass0WK(C03720Kl r3, AnonymousClass0e1 r4, C12410lr r5, C12440lu r6) {
        this.A04 = r3;
        this.A06 = new AnonymousClass0WD(r3);
        AnonymousClass0WD r1 = new AnonymousClass0WD(r3);
        this.A07 = r1;
        this.A03 = r4;
        this.A09 = r5;
        this.A0A = r6;
        this.A05 = new AnonymousClass0W1(r1);
    }

    public static void A02(AnonymousClass0WK r4, C09350fH r5, TimeUnit timeUnit, long j, short s) {
        r5.A08 = timeUnit.toNanos(j) - r5.A0B;
        if (r5.A0Q) {
            List list = (List) r4.A08.get((short) (r5.A03 >> 16));
            if (list != null && !list.isEmpty()) {
                r5.A0a.addAll(list);
            }
        }
        r5.A0O = s;
    }

    public final C09350fH A04(AnonymousClass0WW r6, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        long A002 = A00(i, i2);
        ReentrantLock reentrantLock = this.A06.A01;
        reentrantLock.lock();
        try {
            C09350fH A022 = this.A05.A02(A002);
            if (A022 != null) {
                AnonymousClass0Jz r2 = A022.A0I;
                if (r2 != null) {
                    A03(this, r2, A022.A09);
                }
                A022.A06 = i3;
                A022.A0A = timeUnit.toNanos(j);
                C09420fP r1 = r6.A03;
                if (r1 != null) {
                    C09420fP.A00((AnonymousClass0WA) null, A022, r1, 4);
                }
            }
            return A022;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A0A(AnonymousClass0WA r6, AnonymousClass0WW r7, String str, int i, int i2, int i3, int i4) {
        long A002 = A00(i, i2);
        AnonymousClass0W1 r4 = this.A05;
        if (r4.A05(r6, r7, A002)) {
            if (r6 != null) {
                r6.A03 = this.A04.nowNanos();
            }
            AnonymousClass0WD r2 = this.A06;
            r2.A00(r6);
            try {
                C09350fH A032 = r4.A03(r6, A002);
                if (AnonymousClass0W1.A00(r7, A032)) {
                    if (r6 != null) {
                        r6.A0A = this.A04.nowNanos();
                    }
                    A032.A06 = i4;
                    A032.A03(str, i3);
                    if (r6 != null) {
                        r6.A01 = this.A04.nowNanos();
                    }
                    r7.A02(r6, A032);
                    if (r6 != null) {
                        r6.A0L = true;
                        r6.A04 = this.A04.nowNanos();
                    }
                }
            } finally {
                r2.A01(r6);
            }
        }
    }

    public final void A0B(AnonymousClass0WA r6, AnonymousClass0WW r7, String str, String str2, int i, int i2, int i3) {
        long A002 = A00(i, i2);
        AnonymousClass0W1 r4 = this.A05;
        if (r4.A05(r6, r7, A002)) {
            if (r6 != null) {
                r6.A03 = this.A04.nowNanos();
            }
            AnonymousClass0WD r2 = this.A06;
            r2.A00(r6);
            try {
                C09350fH A032 = r4.A03(r6, A002);
                if (AnonymousClass0W1.A00(r7, A032)) {
                    if (r6 != null) {
                        r6.A0A = this.A04.nowNanos();
                    }
                    A032.A06 = i3;
                    A032.A8X(str, str2);
                    if (r6 != null) {
                        r6.A01 = this.A04.nowNanos();
                    }
                    r7.A02(r6, A032);
                    if (r6 != null) {
                        r6.A0L = true;
                        r6.A04 = this.A04.nowNanos();
                    }
                }
            } finally {
                r2.A01(r6);
            }
        }
    }

    public final void A0D(AnonymousClass0WW r6, String str, int i, int i2) {
        long A002 = A00(i, i2);
        AnonymousClass0W1 r4 = this.A05;
        if (r4.A05((AnonymousClass0WA) null, r6, A002)) {
            ReentrantLock reentrantLock = this.A06.A01;
            reentrantLock.lock();
            try {
                C09350fH A032 = r4.A03((AnonymousClass0WA) null, A002);
                if (AnonymousClass0W1.A00(r6, A032)) {
                    A032.A0a.add(str);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void A07(AnonymousClass0WA r30, AnonymousClass0WQ r31, AnonymousClass0WW r32, C09350fH r33, String str, TimeUnit timeUnit, int i, int i2, int i3, long j, boolean z) {
        boolean z2;
        AnonymousClass0WD r4 = this.A06;
        AnonymousClass0WA r11 = r30;
        r4.A00(r11);
        C09350fH r13 = r33;
        try {
            r13.A06 = i3;
            TimeUnit timeUnit2 = timeUnit;
            long j2 = j;
            long nanos = timeUnit2.toNanos(j2) - r13.A0B;
            long j3 = r13.A09;
            AnonymousClass0WQ r12 = r31;
            AnonymousClass0WW r10 = r32;
            String str2 = str;
            int i4 = i;
            boolean z3 = z;
            if (j3 == 0 || i2 == 0) {
                r13.A01(r12, (AnonymousClass0Jz) null, str2, TimeUnit.NANOSECONDS, i4, nanos);
                r10.A01(r11, r12, r13, str2, i4, timeUnit2.toMillis(j2), timeUnit2.toNanos(j2), z3);
                z2 = false;
            } else {
                z2 = true;
            }
            if (r30 != null) {
                r11.A0L = true;
            }
            if (z2) {
                AnonymousClass0Jz A052 = A05(r11, r13.A03, r13.A02, j3);
                r4.A00(r11);
                r13.A01(r12, A052, str2, TimeUnit.NANOSECONDS, i4, nanos);
                r10.A01(r11, r12, r13, str2, i4, timeUnit2.toMillis(j2), timeUnit2.toNanos(j2), z3);
                r4.A01(r11);
            }
        } finally {
            r4.A01(r11);
        }
    }
}
