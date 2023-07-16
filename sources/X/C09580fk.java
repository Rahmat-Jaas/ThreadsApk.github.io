package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;
import java.util.ArrayList;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public final class C09580fk {
    public static C11380k0 parseFromJson(MMo mMo) {
        return (C11380k0) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(5));
    }

    public static C11380k0 A00(MMo mMo) {
        C11380k0 r2 = new C11380k0();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A03(mMo, r2, A0o);
            mMo.A0x();
        }
        return r2;
    }

    public static void A03(MMo mMo, C11380k0 r4, String str) {
        if ("colors".equals(str)) {
            ArrayList arrayList = null;
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = new ArrayList();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    Integer valueOf = Integer.valueOf(mMo.A0X());
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                }
            }
            C04220Ms.A0B(arrayList, 0);
            r4.A01 = arrayList;
        } else if ("orientation".equals(str)) {
            r4.A00 = mMo.A0X();
        }
    }

    public static void A02(MMp mMp, C11380k0 r3) {
        mMp.A0J();
        mMp.A0U("colors");
        mMp.A0I();
        for (Number number : r3.A01) {
            if (number != null) {
                mMp.A0N(number.intValue());
            }
        }
        mMp.A0F();
        mMp.A0b("orientation", r3.A00);
        mMp.A0G();
    }
}
