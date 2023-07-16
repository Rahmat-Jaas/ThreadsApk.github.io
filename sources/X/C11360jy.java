package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;

/* renamed from: X.0jy  reason: invalid class name and case insensitive filesystem */
public final class C11360jy {
    public static C11390k1 parseFromJson(MMo mMo) {
        return (C11390k1) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(0));
    }

    public static C11390k1 A00(MMo mMo) {
        C11390k1 r2 = new C11390k1();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A02(mMo, r2, A0o);
            mMo.A0x();
        }
        return r2;
    }

    public static void A02(MMo mMo, C11390k1 r2, String str) {
        if ("instagram_ad".equals(str)) {
            r2.A00 = C11300js.parseFromJson(mMo);
        } else if ("instagram_validation".equals(str)) {
            r2.A01 = C11280jq.parseFromJson(mMo);
        }
    }
}
