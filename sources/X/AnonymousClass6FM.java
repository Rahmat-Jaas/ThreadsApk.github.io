package X;

/* renamed from: X.6FM  reason: invalid class name */
public final class AnonymousClass6FM {
    public static final long A00(int i, int i2) {
        boolean A1S = C86114wI.A1S(i);
        String A00 = AnonymousClass000.A00(512);
        if (!A1S) {
            throw C18190wL.A0a(AnonymousClass00U.A0P("start cannot be negative. [start: ", A00, ']', i, i2));
        } else if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0P("end cannot be negative. [start: ", A00, ']', i, i2));
        }
    }
}
