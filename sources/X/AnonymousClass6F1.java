package X;

/* renamed from: X.6F1  reason: invalid class name */
public final class AnonymousClass6F1 {
    public static final Object A00(C147778pt r3, int i) {
        AnonymousClass7YG r32 = ((AnonymousClass7YG) r3).A03.A02;
        if (r32 != null && (r32.A00 & i) != 0) {
            do {
                int i2 = r32.A01;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) != 0) {
                    return r32;
                } else {
                    r32 = r32.A02;
                }
            } while (r32 != null);
        }
        return null;
    }
}
