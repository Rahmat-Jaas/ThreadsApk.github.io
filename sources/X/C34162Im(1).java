package X;

import android.content.Context;
import com.facebook.redex.IDxRCallbackShape39S0400000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.2Im  reason: invalid class name and case insensitive filesystem */
public final class C34162Im {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        AnonymousClass601 r3 = r13;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        Object A0B = C63893iY.A0B(r14, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Boolean");
        boolean A1X = AnonymousClass0wJ.A1X(A0B);
        C109326jp A06 = C63893iY.A06(r14, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r14, 2);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r3));
        Context A08 = C18230wP.A08();
        if (C63803iN.A0E(C18250wR.A0D(A02, 0), A02, 36315700834929367L)) {
            if (AnonymousClass2NN.A00(A02).A00 == null) {
                AnonymousClass2NN.A00(A02).A00();
            }
            GJS gjs = AnonymousClass2NN.A00(A02).A00;
            if (gjs == null) {
                return null;
            }
            gjs.A01(A1X, new KtLambdaShape4S0110000_I2(10, A02, A1X));
            return null;
        }
        C63493hb.A06(A08, AnonymousClass06E.A00(C63913ic.A05(r3)), A02, new IDxRCallbackShape39S0400000_1_I2(r3, A06, A062, A02, 0), "disabled", A1X);
        return null;
    }
}
