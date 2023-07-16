package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;

/* renamed from: X.2GP  reason: invalid class name */
public final class AnonymousClass2GP {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonymousClass3HX A01 = C63893iY.A01(r10, 0);
        Object A0B = C63893iY.A0B(r10, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        C109326jp A06 = C63893iY.A06(r10, 3);
        C10300i6 A0F = C63913ic.A0F(r9);
        Context context = A01.A00;
        C04220Ms.A06(context);
        AnonymousClass3T3 r6 = new AnonymousClass3T3(context, A0F, (String) C63893iY.A0C(r10, "null cannot be cast to non-null type kotlin.String", 2), (String) C63893iY.A0C(r10, "null cannot be cast to non-null type kotlin.String", 4));
        C04220Ms.A0B(str, A1Z);
        C58683Gs r7 = new C58683Gs(r9, A06);
        C83224qz A00 = AnonymousClass3T3.A00(r9);
        if (A00 == null) {
            r7.A00();
        } else {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(r6, r7, str, (C146958n9) null, 24), A00, 3);
        }
        return Unit.A00;
    }
}
