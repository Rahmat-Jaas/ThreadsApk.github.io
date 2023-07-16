package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.6EH  reason: invalid class name */
public final class AnonymousClass6EH {
    public static final C115506vH A00(C147188nY r4) {
        AnonymousClass7WJ r1;
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r4, -1165786124);
        AnonymousClass7W3.A0s(A0Z, AnonymousClass7J4.A05, (Object) null, HttpStatus.SC_PARTIAL_CONTENT, 0);
        if (A0Z.A0P) {
            AnonymousClass7W3.A0h(A0Z);
        }
        Object A13 = A0Z.A13();
        if (!(A13 instanceof AnonymousClass7WJ) || (r1 = (AnonymousClass7WJ) A13) == null) {
            r1 = new AnonymousClass7WJ(new AnonymousClass530(A0Z, A0Z.A02, A0Z.A0N));
            A0Z.A14(r1);
        }
        AnonymousClass530 r2 = r1.A00;
        AnonymousClass8s3 A05 = AnonymousClass7W3.A05(A0Z);
        C04220Ms.A0B(A05, 0);
        r2.A02.CrC(A05);
        AnonymousClass7W3.A0w(A0Z, false);
        AnonymousClass7W3.A0w(A0Z, false);
        return r2;
    }
}
