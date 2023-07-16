package X;

/* renamed from: X.3WO  reason: invalid class name */
public final class AnonymousClass3WO {
    public static void A00(MMo mMo, AnonymousClass1U3 r2, String str) {
        if ("errors".equals(str)) {
            r2.A00 = C32692Cv.A00(mMo);
        } else if ("phone_number_valid".equals(str)) {
            r2.A02 = mMo.A12();
        } else if ("phone_verification_settings".equals(str)) {
            r2.A01 = C36102Qa.parseFromJson(mMo);
        } else {
            AnonymousClass3Za.A01(mMo, r2, str);
        }
    }

    public static AnonymousClass1U3 parseFromJson(MMo mMo) {
        return (AnonymousClass1U3) AnonymousClass0wJ.A0h(mMo, 35);
    }
}
