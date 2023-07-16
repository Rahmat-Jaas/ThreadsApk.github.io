package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1fJ  reason: invalid class name */
public final class AnonymousClass1fJ extends I4A {
    public final AnonymousClass1g5 A00;
    public final AnonymousClass1g6 A01;
    public final List A02 = AnonymousClass0wJ.A0v();
    public final Map A03 = AnonymousClass0wJ.A0y();
    public final Set A04 = C18200wM.A0u();

    public final void A09(String str, boolean z) {
        AnonymousClass378 r0 = (AnonymousClass378) this.A03.get(str);
        if (r0 != null) {
            r0.A00 = z;
            Set set = this.A04;
            if (z) {
                set.add(str);
            } else {
                set.remove(str);
            }
            D92();
        }
    }

    public final void A0A(List list) {
        List<Object> list2 = this.A02;
        list2.clear();
        Map map = this.A03;
        map.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72144Mm r0 = (C72144Mm) it.next();
                AnonymousClass378 r1 = new AnonymousClass378(r0);
                list2.add(r1);
                map.put(r0.A01(), r1);
            }
            A03();
            for (Object A05 : list2) {
                A05(this.A00, A05);
            }
            A04();
        }
    }

    public AnonymousClass1fJ(FragmentActivity fragmentActivity, AnonymousClass1cB r4, AnonymousClass1cB r5, C11630kW r6) {
        AnonymousClass1g6 r1 = new AnonymousClass1g6(fragmentActivity, r5);
        this.A01 = r1;
        AnonymousClass1g5 r0 = new AnonymousClass1g5(r4, r6);
        this.A00 = r0;
        A08(r0, r1);
    }
}
