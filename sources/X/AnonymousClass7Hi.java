package X;

/* renamed from: X.7Hi  reason: invalid class name */
public final class AnonymousClass7Hi {
    public static final long A01(double d) {
        return A02((float) d, 4294967296L);
    }

    public static final long A03(int i) {
        return A02((float) i, 4294967296L);
    }

    public static long A00() {
        return A03(14);
    }

    public static final long A02(float f, long j) {
        return j | (((long) Float.floatToIntBits(f)) & 4294967295L);
    }

    public static final boolean A04(long j) {
        return C18180wK.A1W(((j & 1095216660480L) > 0 ? 1 : ((j & 1095216660480L) == 0 ? 0 : -1)));
    }
}
