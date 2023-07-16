package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;
import java.util.ArrayList;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
public final class C08970eb {
    public static C08980ec parseFromJson(MMo mMo) {
        return (C08980ec) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(6));
    }

    public static C08980ec A00(MMo mMo) {
        C08980ec r2 = new C08980ec();
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

    public static void A03(MMo mMo, C08980ec r4, String str) {
        if ("objects".equals(str)) {
            ArrayList arrayList = null;
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = new ArrayList();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    C08890eT parseFromJson = C08880eS.parseFromJson(mMo);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            r4.A00 = arrayList;
        }
    }

    public static void A02(MMp mMp, C08980ec r3) {
        mMp.A0J();
        if (r3.A00 != null) {
            mMp.A0U("objects");
            mMp.A0I();
            for (C08890eT r0 : r3.A00) {
                if (r0 != null) {
                    C08880eS.A04(mMp, r0);
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
