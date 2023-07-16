package X;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.2HJ  reason: invalid class name */
public final class AnonymousClass2HJ {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        Context context;
        AnonymousClass601 r10 = r13;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        String A0E = C63893iY.A0E(r14, 0);
        List list = r14.A00;
        String A0q = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0q2 = C18190wL.A0q(list, 2);
        String A0q3 = C18190wL.A0q(list, 3);
        String A0q4 = C18190wL.A0q(list, 4);
        C109326jp A0R = C18190wL.A0R(list, 5);
        C109326jp A0R2 = C18190wL.A0R(list, 6);
        C109326jp A0R3 = C18190wL.A0R(list, 7);
        C109326jp A0R4 = C18190wL.A0R(list, 8);
        Bundle A06 = C18180wK.A06();
        AnonymousClass3W9.A01(A06, C63913ic.A0F(r10));
        C04220Ms.A0B(A0E, 0);
        AnonymousClass3HX r0 = r10.A00;
        if (r0 == null || (context = r0.A00) == null) {
            return null;
        }
        C121107Ed.A00(context, A06, new AnonymousClass1Pu(r10, A0R, A0R2, A0R3, A0R4), A0E, A0q, A0q2, A0q3, A0q4, (String) null);
        return null;
    }
}
