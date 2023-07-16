package X;

/* renamed from: X.2KG  reason: invalid class name */
public final class AnonymousClass2KG {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C18240wQ.A1a()) {
            switch (num.intValue()) {
                case 1:
                    str2 = "ppp_based";
                    break;
                case 2:
                    str2 = "default_and_max_ppp";
                    break;
                case 3:
                    str2 = "current_default";
                    break;
                default:
                    str2 = "cpa_based";
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A0N;
    }
}
