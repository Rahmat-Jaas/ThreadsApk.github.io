package X;

/* renamed from: X.2LL  reason: invalid class name */
public final class AnonymousClass2LL {
    public static boolean A00(Object obj, boolean z) {
        if (obj == null) {
            return z;
        }
        if (obj instanceof Boolean) {
            return AnonymousClass0wJ.A1X(obj);
        }
        if (obj instanceof Number) {
            return C18230wP.A1V(AnonymousClass0wJ.A04(obj));
        }
        C30967GcS.A02("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
        return z;
    }
}
