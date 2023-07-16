package X;

import android.content.Context;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.6vi  reason: invalid class name and case insensitive filesystem */
public final class C115666vi {
    public static final C146058lZ A00(C147188nY r5) {
        C146058lZ r1;
        r5.Cvb(1809802212);
        r5.Cvb(-81138291);
        Context A0T = C147188nY.A0T(r5);
        C114476tM r3 = (C114476tM) r5.AEA(AnonymousClass6WP.A00);
        if (r3 != null) {
            boolean A10 = C147188nY.A10(r5, A0T, r3, 511388516);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r5;
            Object A13 = r2.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new AndroidEdgeEffectOverscrollEffect(A0T, r3);
                r2.A14(A13);
            }
            AnonymousClass7W3.A0w(r2, false);
            r1 = (C146058lZ) A13;
        } else {
            r1 = AnonymousClass7UG.A00;
        }
        AnonymousClass7W3.A0g((AnonymousClass7W3) r5);
        return r1;
    }

    public static final C142708fS A01(C147188nY r3) {
        r3.Cvb(1107739818);
        AnonymousClass8cU A00 = AnonymousClass72K.A00(r3);
        boolean A0y = C147188nY.A0y(r3, A00);
        AnonymousClass7W3 r32 = (AnonymousClass7W3) r3;
        Object A13 = r32.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass7UR(A00);
            r32.A14(A13);
        }
        AnonymousClass7W3.A0w(r32, false);
        AnonymousClass7UR r1 = (AnonymousClass7UR) A13;
        AnonymousClass7W3.A0w(r32, false);
        return r1;
    }
}
