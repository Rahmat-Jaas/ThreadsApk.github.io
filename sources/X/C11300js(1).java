package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;
import java.util.ArrayList;

/* renamed from: X.0js  reason: invalid class name and case insensitive filesystem */
public final class C11300js {
    public static C11350jx parseFromJson(MMo mMo) {
        return (C11350jx) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(1));
    }

    public static C11350jx A00(MMo mMo) {
        C11350jx r2 = new C11350jx();
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

    public static void A02(MMo mMo, C11350jx r4, String str) {
        String A0p;
        if ("view_tags".equals(str)) {
            ArrayList arrayList = null;
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = new ArrayList();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    if (!(mMo.A0f() == C40318LcR.VALUE_NULL || (A0p = mMo.A0p()) == null)) {
                        arrayList.add(A0p);
                    }
                }
            }
            r4.A00 = arrayList;
        }
    }
}
