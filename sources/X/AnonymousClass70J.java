package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.70J  reason: invalid class name */
public final class AnonymousClass70J {
    public static Object A00(C147078nM r3) {
        if (r3.CWR() == AnonymousClass006.A0C) {
            return A01(r3);
        }
        Integer CWR = r3.CWR();
        Integer num = AnonymousClass006.A00;
        if (CWR == num) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            if (r3.CWR() != num) {
                return A0v;
            }
            while (r3.Bhu() != AnonymousClass006.A01) {
                A0v.add(A00(r3));
            }
            return A0v;
        } else if (r3.CWR() == AnonymousClass006.A1L) {
            return null;
        } else {
            if (r3.CWR() == AnonymousClass006.A1C) {
                return Boolean.valueOf(r3.CWS().AAu());
            }
            if (r3.CWR() == AnonymousClass006.A15) {
                Number BiQ = r3.CWS().BiQ();
                if (BiQ instanceof Long) {
                    return Long.valueOf(BiQ.longValue());
                }
                return Double.valueOf(BiQ.doubleValue());
            } else if (r3.CWR() == AnonymousClass006.A0j) {
                return r3.CWS().CwM();
            } else {
                throw C18180wK.A0a(AnonymousClass00U.A0L("unsupported token type ", AnonymousClass6Q4.A00(r3.CWR())));
            }
        }
    }

    public static Map A01(C147078nM r3) {
        if (r3.CWR() != AnonymousClass006.A0C) {
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        while (r3.Bhu() != AnonymousClass006.A0N) {
            String CWO = r3.CWO();
            r3.Bhu();
            A0y.put(CWO, A00(r3));
        }
        return A0y;
    }
}
