package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;

/* renamed from: X.0eI  reason: invalid class name and case insensitive filesystem */
public final class C08790eI {
    public static C08800eK A00(MMo mMo) {
        C08800eK r2 = new C08800eK();
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

    public static void A03(MMo mMo, C08800eK r2, String str) {
        if ("10".equals(str)) {
            r2.A00 = mMo.A0b();
        } else if ("25".equals(str)) {
            r2.A01 = mMo.A0b();
        } else if ("50".equals(str)) {
            r2.A02 = mMo.A0b();
        } else if ("75".equals(str)) {
            r2.A03 = mMo.A0b();
        }
    }

    public static C08800eK parseFromJson(MMo mMo) {
        return (C08800eK) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(8));
    }

    public static void A02(MMp mMp, C08800eK r6) {
        mMp.A0J();
        C08810eL r2 = r6.A05;
        C03710Kk r4 = r6.A04;
        mMp.A0c("10", Math.max(r2.A00(r4.now()), r6.A00));
        mMp.A0c("25", Math.max(r6.A06.A00(r4.now()), r6.A01));
        mMp.A0c("50", Math.max(r6.A07.A00(r4.now()), r6.A02));
        mMp.A0c("75", Math.max(r6.A08.A00(r4.now()), r6.A03));
        mMp.A0G();
    }
}
