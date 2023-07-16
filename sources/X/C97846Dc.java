package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierNodeElement;
import kotlin.jvm.internal.KtLambdaShape0S1502001_I2;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.6Dc  reason: invalid class name and case insensitive filesystem */
public final class C97846Dc {
    public static final void A00(C147188nY r17, Alignment alignment, Modifier modifier, C104136bI r20, C115286uo r21, C146878n1 r22, String str, float f, int i, int i2) {
        C104136bI r14 = r20;
        float f2 = f;
        C146878n1 r13 = r22;
        Alignment alignment2 = alignment;
        C115286uo r10 = r21;
        C04220Ms.A0B(r10, 0);
        C147188nY r8 = r17;
        int i3 = i2;
        Modifier A0c = C147188nY.A0c(r8, modifier, 1142754848, i3);
        if ((i2 & 8) != 0) {
            alignment2 = AnonymousClass7KV.A09;
        }
        if ((i2 & 16) != 0) {
            r13 = AnonymousClass74L.A01;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 64) != 0) {
            r14 = null;
        }
        Modifier A02 = Modifier.A02(r8, -816794123);
        String str2 = str;
        if (str != null) {
            boolean A0y = C147188nY.A0y(r8, str2);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r8;
            Object A13 = r3.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape6S1000000_I2(str2, 0);
                r3.A14(A13);
            }
            A02 = AnonymousClass6FI.A00(A02, AnonymousClass7W3.A0B(r3, A13, false), false);
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r8, false);
        Modifier A00 = C115826vy.A00(A0c.Cx6(A02));
        C04220Ms.A0B(A00, 0);
        AnonymousClass0wJ.A1R(alignment2, r13);
        Modifier Cx6 = A00.Cx6(new PainterModifierNodeElement(alignment2, r14, r10, r13, f2));
        AnonymousClass7Xk r9 = AnonymousClass7Xk.A00;
        Object A0p = C147188nY.A0p(r8);
        Object A0n = C147188nY.A0n(r8);
        Object A0m = C147188nY.A0m(r8);
        AnonymousClass0ZU r0 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(Cx6);
        C147188nY.A0w(r8, A04, r0);
        C147188nY.A0x(r8, AnonymousClass7KP.A02(r8, r9, A0p, A0n, A0m), A002, 0);
        AnonymousClass7W3.A0d(A04);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1502001_I2(r10, A0c, alignment2, r13, r14, str2, f2, i, i3, 0));
        }
    }
}
