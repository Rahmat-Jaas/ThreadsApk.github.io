package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape2S0510000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0210000_I2;

/* renamed from: X.6Dw  reason: invalid class name and case insensitive filesystem */
public final class C98026Dw {
    public static final Modifier A00(C967266l r13, C147308p8 r14, C146268lw r15, C147188nY r16, Modifier modifier, boolean z, boolean z2) {
        KtLambdaShape10S0300000_I2 ktLambdaShape10S0300000_I2;
        Modifier modifier2 = modifier;
        boolean A1Z = AnonymousClass0wJ.A1Z(modifier2, r14);
        int A07 = C86124wJ.A07(2, r15, r13);
        C147188nY r10 = r16;
        r10.Cvb(290103779);
        r10.Cvb(773894976);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r10);
        Object A13 = A0Y.A13();
        Object obj = AnonymousClass7GN.A00;
        C83224qz A01 = AnonymousClass7WN.A01(A0Y, C86104wH.A0b(r10, A0Y, A13, obj, A13));
        Object[] A132 = C147188nY.A13(r10, r14, r15, r13, Boolean.valueOf(z));
        int i = 0;
        boolean z3 = false;
        do {
            z3 = C147188nY.A12(r10, A132[i], z3);
            i++;
        } while (i < 4);
        Object A133 = A0Y.A13();
        if (z3 || A133 == obj) {
            boolean A1Z2 = C18180wK.A1Z(r13, C967266l.Vertical);
            KtLambdaShape146S0100000_I2_1 A0z = C86154wM.A0z(r14, 5);
            C112326pO r7 = new C112326pO(C86154wM.A12(r15, 19), C86164wN.A0v(r14, r15, A07), z2);
            KtLambdaShape6S0210000_I2 ktLambdaShape6S0210000_I2 = null;
            if (z) {
                ktLambdaShape6S0210000_I2 = new KtLambdaShape6S0210000_I2(A1Z ? 1 : 0, r15, A01, A1Z2);
                ktLambdaShape10S0300000_I2 = C86154wM.A0y(A01, r15, r14, 13);
            } else {
                ktLambdaShape10S0300000_I2 = null;
            }
            A133 = AnonymousClass6FI.A00(Modifier.A00, new KtLambdaShape2S0510000_I2(r7, ktLambdaShape10S0300000_I2, ktLambdaShape6S0210000_I2, A0z, r15.ADc(), A1Z, A1Z2), false);
            A0Y.A14(A133);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        Modifier Cx6 = modifier2.Cx6((Modifier) A133);
        AnonymousClass7W3.A0w(A0Y, false);
        return Cx6;
    }
}
