package X;

/* renamed from: X.6G9  reason: invalid class name */
public final class AnonymousClass6G9 {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "media_type = 1";
        }
        if (intValue == 1) {
            return "media_type = 3";
        }
        if (intValue == 2) {
            return AnonymousClass00U.A0e("(", A00(AnonymousClass006.A00), " OR ", A00(AnonymousClass006.A01), ')');
        }
        throw AnonymousClass4VZ.A00();
    }
}
