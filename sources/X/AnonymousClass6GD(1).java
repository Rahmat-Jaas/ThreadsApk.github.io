package X;

import android.animation.Animator;
import java.util.List;

/* renamed from: X.6GD  reason: invalid class name */
public final class AnonymousClass6GD {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        C109326jp r4;
        Animator r1;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonymousClass3HX r5 = r9.A00;
        if (r5 == null) {
            return null;
        }
        Object A0B = C63893iY.A0B(r10, 0);
        if (A0B == null) {
            r4 = null;
        } else {
            r4 = ((C105916eC) A0B).A00;
        }
        float A00 = C18240wQ.A00(C63893iY.A0A(r10, A1Z ? 1 : 0));
        Object A09 = C63893iY.A09(r10);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List<Animator> list = (List) A09;
        long j = (long) (A00 * ((float) AnonymousClass7Jm.A00));
        C04220Ms.A0B(list, A1Z);
        if (list.size() == A1Z) {
            r1 = (Animator) AnonymousClass00J.A0C(list);
            AnonymousClass7Jm.A02(r1, j);
        } else {
            for (Animator animator : list) {
                AnonymousClass7K7.A06(animator, r5);
                AnonymousClass7Jm.A02(animator, j);
            }
            r1 = new AnonymousClass4wP(AnonymousClass006.A00, list);
        }
        if (r4 == null) {
            return r1;
        }
        C04220Ms.A0B(r1, 0);
        r1.addListener(new C18290wW(r5, r9, r4));
        return r1;
    }
}
