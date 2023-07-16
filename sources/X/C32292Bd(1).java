package X;

import java.util.List;

/* renamed from: X.2Bd  reason: invalid class name and case insensitive filesystem */
public final class C32292Bd {
    public static C127397h3 A00(C127397h3 r5) {
        int i = r5.A03;
        if (i != 13690) {
            if (i == 13785) {
                List<C127397h3> list = (List) r5.A04.get(40);
                if (list != null && !list.isEmpty()) {
                    for (C127397h3 r1 : list) {
                        if (r1 != null && r1.A03 == 13890) {
                            return r1;
                        }
                    }
                }
            } else {
                C30967GcS.A02("BloksScreenNavbarUtils", "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2");
            }
        }
        return null;
    }
}
