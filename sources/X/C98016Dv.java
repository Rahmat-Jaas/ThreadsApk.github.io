package X;

import android.view.View;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;

/* renamed from: X.6Dv  reason: invalid class name and case insensitive filesystem */
public final class C98016Dv {
    public static final void A00(C113626rp r7, C111656o6 r8, C147188nY r9, C1195976a r10, int i) {
        C113626rp r6 = r7;
        C111656o6 r72 = r8;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r6);
        C1195976a r82 = r10;
        C04220Ms.A0B(r10, 2);
        r9.Cvd(1113453182);
        View view = (View) r9.AEA(AnonymousClass7DA.A05);
        boolean A12 = C147188nY.A12(r9, view, C147188nY.A10(r9, r10, r72, 1618982084));
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r9;
        Object A13 = r2.A13();
        if (A12 || A13 == AnonymousClass7GN.A00) {
            r2.A14(new AnonymousClass83S(view, r6, r72, r10));
        }
        AnonymousClass7W3.A0w(r2, false);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape18S0301000_I2(i, A1Z ? 1 : 0, r6, r72, r82);
        }
    }
}
