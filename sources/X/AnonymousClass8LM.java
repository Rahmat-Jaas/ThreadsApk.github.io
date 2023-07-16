package X;

import java.util.List;

/* renamed from: X.8LM  reason: invalid class name */
public final class AnonymousClass8LM extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8LM A00 = new AnonymousClass8LM();

    public AnonymousClass8LM() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C967266l r2;
        List list = (List) obj;
        C04220Ms.A0B(list, 0);
        Object A0k = C86134wK.A0k(list);
        C04220Ms.A0C(A0k, "null cannot be cast to non-null type kotlin.Boolean");
        if (AnonymousClass0wJ.A1X(A0k)) {
            r2 = C967266l.Vertical;
        } else {
            r2 = C967266l.Horizontal;
        }
        Object obj2 = list.get(0);
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new AnonymousClass7EJ(r2, C18240wQ.A00(obj2));
    }
}
