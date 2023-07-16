package X;

import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.7AM  reason: invalid class name */
public abstract class AnonymousClass7AM {
    public static final AnonymousClass8bG A00 = new AnonymousClass8bG();
    public static final AnonymousClass7AM A01;

    static {
        AnonymousClass7AM r0;
        Integer num;
        if (!(AnonymousClass6Z4.A00 instanceof AnonymousClass8DH) || ((num = AnonymousClass6Z6.A00) != null && num.intValue() < 34)) {
            r0 = new C141428bE();
        } else {
            r0 = new AnonymousClass8bD();
        }
        A01 = r0;
    }

    public final float A00() {
        if (this instanceof AnonymousClass8bG) {
            return A01.A00();
        }
        return ((AnonymousClass8bF) this).A07().nextFloat();
    }

    public final int A01() {
        if (this instanceof AnonymousClass8bG) {
            return A01.A01();
        }
        return ((AnonymousClass8bF) this).A07().nextInt();
    }

    public final int A02(int i) {
        if (this instanceof AnonymousClass8bG) {
            return A01.A02(i);
        }
        return (((AnonymousClass8bF) this).A07().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public final int A03(int i) {
        if (this instanceof AnonymousClass8bG) {
            return A01.A03(i);
        }
        return ((AnonymousClass8bF) this).A07().nextInt(i);
    }

    public final int A04(int i, int i2) {
        int A012;
        int i3;
        if (this instanceof AnonymousClass8bD) {
            return ThreadLocalRandom.current().nextInt(i, i2);
        }
        if (this instanceof AnonymousClass8bG) {
            return A01.A04(i, i2);
        }
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                if (((-i4) & i4) == i4) {
                    i3 = A02(31 - Integer.numberOfLeadingZeros(i4));
                } else {
                    do {
                        A012 = A01() >>> 1;
                        i3 = A012 % i4;
                    } while ((A012 - i3) + (i4 - 1) < 0);
                }
                return i + i3;
            }
            while (true) {
                int A013 = A01();
                if (i <= A013 && A013 < i2) {
                    return A013;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            StringBuilder A0s = C18190wL.A0s("Random range is empty: [");
            A0s.append(valueOf);
            C86144wL.A1T(A0s);
            A0s.append(valueOf2);
            throw C18190wL.A0a(C18180wK.A0i(").", A0s));
        }
    }

    public final long A05() {
        if (this instanceof AnonymousClass8bG) {
            return A01.A05();
        }
        return ((AnonymousClass8bF) this).A07().nextLong();
    }

    public final long A06(long j, long j2) {
        long A05;
        long j3;
        int A012;
        long j4 = j2;
        long j5 = j;
        if (this instanceof AnonymousClass8bD) {
            return ThreadLocalRandom.current().nextLong(j5, j4);
        }
        if (this instanceof AnonymousClass8bG) {
            return A01.A06(j5, j4);
        }
        if (j2 > j) {
            long j6 = j2 - j;
            if (j6 > 0) {
                if (((-j6) & j6) == j6) {
                    int i = (int) j6;
                    int i2 = (int) (j6 >>> 32);
                    if (i != 0) {
                        A012 = A02(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        A012 = A01();
                    } else {
                        j3 = (((long) A02(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) A01()) & 4294967295L);
                    }
                    j3 = ((long) A012) & 4294967295L;
                } else {
                    do {
                        A05 = A05() >>> 1;
                        j3 = A05 % j6;
                    } while ((A05 - j3) + (j6 - 1) < 0);
                }
                return j + j3;
            }
            while (true) {
                long A052 = A05();
                if (j <= A052 && A052 < j2) {
                    return A052;
                }
            }
        } else {
            Long valueOf = Long.valueOf(j5);
            Long valueOf2 = Long.valueOf(j4);
            StringBuilder A0s = C18190wL.A0s("Random range is empty: [");
            A0s.append(valueOf);
            C86144wL.A1T(A0s);
            A0s.append(valueOf2);
            throw C18190wL.A0a(C18180wK.A0i(").", A0s));
        }
    }
}
