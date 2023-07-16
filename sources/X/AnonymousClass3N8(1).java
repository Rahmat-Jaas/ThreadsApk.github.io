package X;

/* renamed from: X.3N8  reason: invalid class name */
public final class AnonymousClass3N8 {
    public static void A00(MMo mMo, AnonymousClass1TP r2, String str) {
        if ("two_factor_required".equals(str)) {
            r2.A02 = mMo.A12();
        } else if ("two_factor_info".equals(str)) {
            r2.A01 = C36122Qc.parseFromJson(mMo);
        } else if ("phone_verification_settings".equals(str)) {
            r2.A00 = C36102Qa.parseFromJson(mMo);
        } else {
            AnonymousClass3Za.A01(mMo, r2, str);
        }
    }

    public static AnonymousClass1TP parseFromJson(MMo mMo) {
        return (AnonymousClass1TP) AnonymousClass0wJ.A0h(mMo, 39);
    }
}
