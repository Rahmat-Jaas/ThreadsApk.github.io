package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6zb  reason: invalid class name and case insensitive filesystem */
public final class C118006zb {
    public static C15680ri A00(Map map) {
        String str;
        C15680ri r4 = new C15680ri();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0M = C63913ic.A0M(A0o.getKey());
            Object A01 = A01(A0o.getValue());
            if (A01 == null) {
                str = null;
            } else if (A01 instanceof C15560rW) {
                r4.A08((C15560rW) A01, A0M);
            } else if (A01 instanceof C15680ri) {
                r4.A07((C15680ri) A01, A0M);
            } else if (A01 instanceof Long) {
                r4.A0C(A0M, (Long) A01);
            } else if (A01 instanceof Boolean) {
                r4.A0A(A0M, (Boolean) A01);
            } else {
                str = (String) A01;
            }
            r4.A0D(A0M, str);
        }
        return r4;
    }

    public static Object A01(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            C15560rW r3 = new C15560rW();
            for (Object A01 : (List) obj) {
                Object A012 = A01(A01);
                if (A012 == null) {
                    str = null;
                } else if ((A012 instanceof C15560rW) || (A012 instanceof C15680ri)) {
                    r3.A00.add(A012);
                } else if (A012 instanceof Long) {
                    r3.A02(C18190wL.A08(A012));
                } else if (A012 instanceof Boolean) {
                    r3.A05(AnonymousClass0wJ.A1X(A012));
                } else {
                    str = (String) A012;
                }
                r3.A04(str);
            }
            return r3;
        } else if (obj instanceof Map) {
            return A00((Map) obj);
        } else {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Number) {
                Number number = (Number) obj;
                long longValue = number.longValue();
                double doubleValue = number.doubleValue();
                if (doubleValue == ((double) ((long) doubleValue))) {
                    return Long.valueOf(longValue);
                }
            }
            return C63913ic.A0M(obj);
        }
    }
}
