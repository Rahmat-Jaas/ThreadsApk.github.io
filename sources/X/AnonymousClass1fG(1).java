package X;

import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1fG  reason: invalid class name */
public final class AnonymousClass1fG extends I4A {
    public final AnonymousClass1gH A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final void A09(List list) {
        List<Object> list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, AnonymousClass31V.A00);
        A03();
        for (Object A05 : list2) {
            A05(this.A00, A05);
        }
        A04();
    }

    public AnonymousClass1fG(C11630kW r2, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        AnonymousClass1gH r0 = new AnonymousClass1gH(r2, oneTapLoginLandingFragment);
        this.A00 = r0;
        A08(r0);
    }
}
