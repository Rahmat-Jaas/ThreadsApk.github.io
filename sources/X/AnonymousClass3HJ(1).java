package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3HJ  reason: invalid class name */
public final class AnonymousClass3HJ {
    public int A00;
    public final List A01 = AnonymousClass0wJ.A0v();
    public final C81464nq A02;
    public final Map A03;

    public AnonymousClass3HJ(C81464nq r2, Map map) {
        C04220Ms.A0B(map, 2);
        this.A02 = r2;
        this.A03 = map;
    }

    public final void A00(AnonymousClass0YY r5) {
        C62773ah r0 = new C62773ah(this.A02, "control", this.A03);
        r5.invoke(r0);
        this.A01.add(r0.A02());
    }

    public final void A01(AnonymousClass0YY r5) {
        int i = this.A00 + 1;
        this.A00 = i;
        C62773ah r0 = new C62773ah(this.A02, AnonymousClass00U.A0J("test_", i), this.A03);
        r5.invoke(r0);
        this.A01.add(r0.A02());
    }
}
