package X;

/* renamed from: X.3Ws  reason: invalid class name and case insensitive filesystem */
public final class C62003Ws {
    public static final Integer[] A00 = AnonymousClass006.A00(5);

    public static Integer A00(String str) {
        for (Integer num : A00) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        C30967GcS.A02("CdsOpenScreenConfig", AnonymousClass00U.A0L("Error finding Mode enum value for ", str));
        return AnonymousClass006.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "half_sheet";
            case 2:
                return "auto_sheet";
            case 3:
                return "full_screen";
            case 4:
                return "flexible_sheet";
            default:
                return "full_sheet";
        }
    }
}
