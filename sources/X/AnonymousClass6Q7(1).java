package X;

/* renamed from: X.6Q7  reason: invalid class name */
public final class AnonymousClass6Q7 {
    public static C1194175f A00(C147078nM r4) {
        C1194175f r3 = new C1194175f();
        if (r4.CWR() != AnonymousClass006.A0C) {
            r4.CuL();
            return null;
        }
        while (r4.Bhu() != AnonymousClass006.A0N) {
            String CWO = r4.CWO();
            boolean A1U = C86114wI.A1U(AnonymousClass6Q5.A00(CWO), 32);
            r4.Bhu();
            if (!A1U) {
                if (C18220wO.A1S(CWO)) {
                    r3.A01 = C147078nM.A00(r4);
                } else if ("payload".equals(CWO)) {
                    r3.A00 = AnonymousClass6Q9.A00(r4);
                }
            }
            r4.CuL();
        }
        return r3;
    }
}
