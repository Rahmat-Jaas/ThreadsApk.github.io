package X;

/* renamed from: X.3QO  reason: invalid class name */
public final class AnonymousClass3QO {
    public static final Integer[] A00 = C18240wQ.A1Z();

    public static Integer A00(String str) {
        String str2;
        for (Integer num : A00) {
            switch (num.intValue()) {
                case 1:
                    str2 = "enabled";
                    break;
                case 2:
                    str2 = "disabled";
                    break;
                default:
                    str2 = "auto";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        C30967GcS.A02("CdsOpenScreenConfig", AnonymousClass00U.A0L("Error finding DimmedBackgroundTapToDismiss enum value for: ", str));
        return AnonymousClass006.A00;
    }
}
