package X;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.2HK  reason: invalid class name */
public final class AnonymousClass2HK {
    public static final Object A00(AnonymousClass601 r16, C63893iY r17) {
        Context context;
        AnonymousClass601 r13 = r16;
        C63893iY r3 = r17;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r13);
        Object A0B = C63893iY.A0B(r3, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r3, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        List list = r3.A00;
        String A0q = C18190wL.A0q(list, 2);
        String A0q2 = C18190wL.A0q(list, 3);
        String A0q3 = C18190wL.A0q(list, 4);
        String str3 = (String) C63893iY.A0C(r3, "null cannot be cast to non-null type kotlin.String", 5);
        C109326jp A06 = C63893iY.A06(r3, 6);
        C109326jp A062 = C63893iY.A06(r3, 7);
        C109326jp A063 = C63893iY.A06(r3, 8);
        C109326jp A064 = C63893iY.A06(r3, 9);
        Bundle A065 = C18180wK.A06();
        AnonymousClass3W9.A01(A065, C63913ic.A0F(r13));
        C04220Ms.A0B(str, 0);
        C04220Ms.A0B(str2, A1Z);
        AnonymousClass3HX r0 = r13.A00;
        if (r0 == null || (context = r0.A00) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C121107Ed.A00.A02(context, A065, new C1196176d(r13, A06, A062, A063, A064), str2, str, A0q, A0q2, A0q3, str3);
        return null;
    }
}
