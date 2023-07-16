package X;

/* renamed from: X.72Y  reason: invalid class name */
public final class AnonymousClass72Y {
    public static final C122747Tr A00 = new C122747Tr(AnonymousClass6aT.A01, 15, 0);

    public static final C142668fO A00(C147188nY r4, float f, int i, long j, boolean z) {
        r4.Cvb(1635163520);
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = AnonymousClass7KE.A06;
        }
        C81784oM A01 = C115806vw.A01(r4, C86134wK.A0I(j));
        boolean A10 = C147188nY.A10(r4, Boolean.valueOf(z), C134847yT.A00(f), 511388516);
        AnonymousClass7W3 r42 = (AnonymousClass7W3) r4;
        Object A13 = r42.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new C874652v(A01, f, z);
            r42.A14(A13);
        }
        AnonymousClass7W3.A0w(r42, false);
        AnonymousClass7U9 r1 = (AnonymousClass7U9) A13;
        AnonymousClass7W3.A0w(r42, false);
        return r1;
    }
}
