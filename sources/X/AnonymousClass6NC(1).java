package X;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;

/* renamed from: X.6NC  reason: invalid class name */
public final class AnonymousClass6NC {
    public static final C884958x A00(C147188nY r9, C10300i6 r10, C114586tX[] r11) {
        C04220Ms.A0B(r10, 0);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r9, 97146458);
        Object A13 = A0Z.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass59E(r10);
            A0Z.A14(A13);
        }
        ArrayList A0k = C18240wQ.A0k(2);
        A0k.add(A13);
        AnonymousClass0Lm.A00(r11, A0k);
        C114586tX[] r7 = (C114586tX[]) A0k.toArray(new C114586tX[A0k.size()]);
        C04220Ms.A0B(r7, 0);
        r9.Cvb(-312215566);
        Object A0o = C147188nY.A0o(r9);
        Object[] copyOf = Arrays.copyOf(r7, r6);
        AnonymousClass8XH r1 = AnonymousClass8XH.A00;
        KtLambdaShape148S0100000_I2_3 A0q = C86164wN.A0q(A0o, 11);
        AnonymousClass0wJ.A1N(r1, A0q);
        C884958x r3 = (C884958x) AnonymousClass6EN.A00(r9, new AnonymousClass7Wc(A0q, r1), new KtLambdaShape22S0100000_I2_2(A0o, 3), copyOf, 4);
        for (C114586tX A01 : r7) {
            r3.A07.A01(A01);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        AnonymousClass7W3.A0w(A0Z, false);
        return r3;
    }
}
