package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Fn  reason: invalid class name and case insensitive filesystem */
public final class C121337Fn {
    public static final void A00(C110966mZ r12, String str, String str2, List list, List list2, AnonymousClass0YY r17, AnonymousClass0YY r18, AnonymousClass0YY r19, AnonymousClass0YY r20, AnonymousClass0YC r21) {
        AnonymousClass0YY r7 = r17;
        AnonymousClass0YY r8 = r18;
        AnonymousClass0YY r9 = r19;
        AnonymousClass0YY r10 = r20;
        C885158z r5 = new C885158z((AnonymousClass59E) r12.A05.A00(C1200478h.A01.A00(AnonymousClass59E.class)), r7, r8, r9, r10, AnonymousClass7WY.A01(new C141298aa(str2, r21), -1356396416, true));
        r5.A03(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C106926fr r0 = (C106926fr) it.next();
            String str3 = r0.A01;
            C115106uW r1 = r0.A00;
            AnonymousClass0wJ.A1N(str3, r1);
            r5.A03.put(str3, r1);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            r5.A02((AnonymousClass7EZ) it2.next());
        }
        C1200077z r13 = new C1200077z();
        r13.A00 = AnonymousClass7A8.A0A;
        r13.A01 = str2;
        r13.A02 = true;
        r13.A03 = false;
        C115106uW A01 = r13.A01();
        AnonymousClass0wJ.A1N("analytics_module_name", A01);
        r5.A03.put("analytics_module_name", A01);
        r12.A07.add(r5);
    }

    public static final void A01(C110966mZ r9, String str, String str2, List list, List list2, AnonymousClass0YC r14) {
        AnonymousClass0wJ.A1O(str, str2);
        A00(r9, str, str2, list, list2, C103966b1.A0C, C103966b1.A0D, C103966b1.A08, C103966b1.A09, r14);
    }

    public static /* synthetic */ void A02(C110966mZ r9, String str, String str2, List list, List list2, AnonymousClass0YC r14, int i) {
        List list3 = list2;
        List list4 = list;
        if ((i & 4) != 0) {
            list4 = AnonymousClass0ZV.A00;
        }
        if ((i & 8) != 0) {
            list3 = AnonymousClass0ZV.A00;
        }
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(list4, list3);
        A00(r9, str, str2, list4, list3, C103966b1.A02, C103966b1.A03, C103966b1.A06, C103966b1.A07, r14);
    }

    public static /* synthetic */ void A03(C110966mZ r9, String str, String str2, AnonymousClass0YC r12) {
        AnonymousClass0ZV r3 = AnonymousClass0ZV.A00;
        AnonymousClass0wJ.A1O(str, str2);
        A00(r9, str, str2, r3, r3, C103966b1.A0E, C103966b1.A0F, C103966b1.A0A, C103966b1.A0B, r12);
    }
}
