package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.redex.IDxHelperShape66S0000000_I2;

/* renamed from: X.0jk  reason: invalid class name and case insensitive filesystem */
public final class C11220jk {
    public static C11270jp parseFromJson(MMo mMo) {
        return (C11270jp) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(3));
    }

    public static C11270jp A00(MMo mMo) {
        C11270jp r2 = new C11270jp();
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
        r2.A0A();
        return r2;
    }

    public static void A02(MMo mMo, C11270jp r4, String str) {
        String str2 = null;
        if ("app_data".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A01 = str2;
        } else if ("checksum".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A05 = str2;
        } else if (DexStore.CONFIG_FILENAME.equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A02 = str2;
        } else if ("config_owner_id".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A06 = str2;
        } else if ("qpl_version".equals(str)) {
            if (mMo.A0f() != C40318LcR.VALUE_NULL) {
                str2 = mMo.A0p();
            }
            r4.A03 = str2;
        }
    }
}
