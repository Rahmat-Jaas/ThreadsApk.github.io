package X;

import kotlin.jvm.internal.KtLambdaShape174S0100000_I2;

/* renamed from: X.72M  reason: invalid class name */
public final class AnonymousClass72M {
    public static final C146288ly A00;

    static {
        Integer num = AnonymousClass006.A01;
        float BD3 = AnonymousClass7J3.A07.BD3();
        C142878fk r1 = AnonymousClass7KV.A02;
        C04220Ms.A0B(r1, 0);
        A00 = new C123597Xs(new C873852k(r1), num, AnonymousClass006.A00, AnonymousClass8b8.A00, BD3);
    }

    public static final C146288ly A00(C145058jl r9, C147188nY r10, C142878fk r11) {
        C146288ly r3;
        boolean A1Y = AnonymousClass0wJ.A1Y(r9, r11);
        r10.Cvb(1089876336);
        if (!r9.equals(AnonymousClass7J3.A07) || !r11.equals(AnonymousClass7KV.A02)) {
            boolean A10 = C147188nY.A10(r10, r9, r11, 511388516);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r10;
            Object A13 = r1.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new C123597Xs(new C873852k(r11), AnonymousClass006.A01, AnonymousClass006.A00, new KtLambdaShape174S0100000_I2(r9, A1Y ? 1 : 0), r9.BD3());
                r1.A14(A13);
            }
            AnonymousClass7W3.A0w(r1, A1Y);
            r3 = (C146288ly) A13;
        } else {
            r3 = A00;
        }
        AnonymousClass7W3.A0z(r10, A1Y);
        return r3;
    }
}
