package X;

import java.util.List;

/* renamed from: X.6NF  reason: invalid class name */
public final class AnonymousClass6NF {
    public static /* synthetic */ void A00(C110966mZ r7, String str, String str2, List<C106926fr> list, AnonymousClass0YC r11, int i) {
        AnonymousClass0ZV<AnonymousClass7EZ> r6 = null;
        if ((i & 4) != 0) {
            list = AnonymousClass0ZV.A00;
        }
        if ((i & 8) != 0) {
            r6 = AnonymousClass0ZV.A00;
        }
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1Q(str2, list);
        C04220Ms.A0B(r6, 4);
        AnonymousClass591 r3 = new AnonymousClass591((AnonymousClass59F) r7.A05.A00(C1200478h.A01.A00(AnonymousClass59F.class)), r11);
        r3.A03(str);
        for (C106926fr r0 : list) {
            String str3 = r0.A01;
            C115106uW r1 = r0.A00;
            AnonymousClass0wJ.A1N(str3, r1);
            r3.A03.put(str3, r1);
        }
        for (AnonymousClass7EZ A02 : r6) {
            r3.A02(A02);
        }
        C1200077z r2 = new C1200077z();
        r2.A00 = AnonymousClass7A8.A0A;
        r2.A01 = str2;
        r2.A02 = true;
        r2.A03 = false;
        C115106uW A01 = r2.A01();
        AnonymousClass0wJ.A1N("analytics_module_name", A01);
        r3.A03.put("analytics_module_name", A01);
        r7.A07.add(r3);
    }
}
