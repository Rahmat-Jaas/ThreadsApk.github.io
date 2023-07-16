package X;

/* renamed from: X.05y  reason: invalid class name and case insensitive filesystem */
public final class C012805y {
    public static final AnonymousClass060 A00(AnonymousClass061 r1) {
        C04220Ms.A0B(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            return AnonymousClass060.ON_DESTROY;
        }
        if (ordinal == 3) {
            return AnonymousClass060.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return AnonymousClass060.ON_PAUSE;
    }
}
