package X;

import java.util.ArrayList;

/* renamed from: X.3WP  reason: invalid class name */
public final class AnonymousClass3WP {
    public static void A00(MMo mMo, AnonymousClass1U4 r4, String str) {
        if ("verified".equals(str)) {
            r4.A04 = mMo.A12();
        } else if ("errors".equals(str)) {
            r4.A00 = C32692Cv.A00(mMo);
        } else {
            ArrayList arrayList = null;
            if ("backup_codes".equals(str)) {
                if (mMo.A0f() == C40318LcR.START_ARRAY) {
                    arrayList = AnonymousClass0wJ.A0v();
                    while (mMo.A0g() != C40318LcR.END_ARRAY) {
                        AnonymousClass0wJ.A1F(mMo, arrayList);
                    }
                }
                r4.A03 = arrayList;
            } else if (C63383hO.A04(str)) {
                r4.A01 = AnonymousClass0wJ.A0r(mMo);
            } else if ("trusted_device_nonce".equals(str)) {
                r4.A02 = AnonymousClass0wJ.A0r(mMo);
            } else {
                AnonymousClass3Za.A01(mMo, r4, str);
            }
        }
    }

    public static AnonymousClass1U4 parseFromJson(MMo mMo) {
        return (AnonymousClass1U4) AnonymousClass0wJ.A0h(mMo, 43);
    }
}
