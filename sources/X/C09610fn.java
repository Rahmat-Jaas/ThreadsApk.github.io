package X;

import com.facebook.redex.IDxHelperShape66S0000000_I2;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.0fn  reason: invalid class name and case insensitive filesystem */
public final class C09610fn {
    public static BackgroundGradientColors A00(MMo mMo) {
        BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(0, 0);
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A03(mMo, backgroundGradientColors, A0o);
            mMo.A0x();
        }
        return backgroundGradientColors;
    }

    public static BackgroundGradientColors parseFromJson(MMo mMo) {
        return (BackgroundGradientColors) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(4));
    }

    public static void A03(MMo mMo, BackgroundGradientColors backgroundGradientColors, String str) {
        if ("top_color".equals(str)) {
            backgroundGradientColors.A01 = mMo.A0X();
        } else if ("bottom_color".equals(str)) {
            backgroundGradientColors.A00 = mMo.A0X();
        }
    }

    public static void A02(MMp mMp, BackgroundGradientColors backgroundGradientColors) {
        mMp.A0J();
        mMp.A0b("top_color", backgroundGradientColors.A01);
        mMp.A0b("bottom_color", backgroundGradientColors.A00);
        mMp.A0G();
    }
}
