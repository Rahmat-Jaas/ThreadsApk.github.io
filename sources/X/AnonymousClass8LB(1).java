package X;

import androidx.compose.foundation.pager.PagerState;
import java.util.List;

/* renamed from: X.8LB  reason: invalid class name */
public final class AnonymousClass8LB extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8LB A00 = new AnonymousClass8LB();

    public AnonymousClass8LB() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C04220Ms.A0B(list, 0);
        Object obj2 = list.get(0);
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Int");
        int A04 = AnonymousClass0wJ.A04(obj2);
        Object A0k = C86134wK.A0k(list);
        C04220Ms.A0C(A0k, "null cannot be cast to non-null type kotlin.Float");
        return new PagerState(A04, C18240wQ.A00(A0k));
    }
}
