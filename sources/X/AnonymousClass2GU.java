package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3;

/* renamed from: X.2GU  reason: invalid class name */
public final class AnonymousClass2GU {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        AnonymousClass601 r7 = r15;
        C63893iY r2 = r16;
        int A1Z = AnonymousClass0wJ.A1Z(r2, r15);
        AnonymousClass3HX A01 = C63893iY.A01(r2, 0);
        Object A0B = C63893iY.A0B(r2, A1Z);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        C109326jp A06 = C63893iY.A06(r2, 2);
        C10300i6 A0F = C63913ic.A0F(r15);
        Context context = A01.A00;
        C04220Ms.A06(context);
        AnonymousClass3T3 r4 = new AnonymousClass3T3(context, A0F, (String) A0B, (String) C63893iY.A0C(r2, "null cannot be cast to non-null type kotlin.String", 3));
        C58683Gs r3 = new C58683Gs(r15, A06);
        AnonymousClass3YA r9 = r4.A02;
        if (r9 == null) {
            C18240wQ.A0p();
            throw null;
        }
        r9.A02("client_start_check_feo2_availability", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        AnonymousClass3UX r0 = r4.A00;
        if (r0 == null) {
            C04220Ms.A0E("feO2ApiLevel");
            throw null;
        }
        if (r0.A00() >= A1Z) {
            r9.A02("client_check_is_feo2_available", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            C83224qz A00 = AnonymousClass3T3.A00(r7);
            if (A00 != null) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape17S0201000_I2_3(r4, r3, (C146958n9) null, 7), A00, 3);
            }
            r3.A00();
        } else {
            r9.A02("client_check_is_feo2_unavailable", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            r3.A00();
        }
        return Unit.A00;
    }
}
