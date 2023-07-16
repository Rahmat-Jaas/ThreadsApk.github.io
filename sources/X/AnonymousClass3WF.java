package X;

/* renamed from: X.3WF  reason: invalid class name */
public final class AnonymousClass3WF {
    public static Number A00(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static boolean A02(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            return C18180wK.A1V(AnonymousClass0wJ.A04(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass0wJ.A1X(obj);
        }
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.toString();
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Expected Number or Boolean: ", obj2));
    }

    public static boolean A01(C63893iY r0, int i) {
        return A02(r0.A0H(i));
    }
}
