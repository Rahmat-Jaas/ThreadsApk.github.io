package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;

/* renamed from: X.3Lk  reason: invalid class name and case insensitive filesystem */
public final class C59593Lk {
    public static KtCSuperShape0S2100000_I2 parseFromJson(MMo mMo) {
        return (KtCSuperShape0S2100000_I2) AnonymousClass0wJ.A0e(mMo, 97);
    }

    public static void A00(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, MMp mMp) {
        mMp.A0J();
        String str = ktCSuperShape0S2100000_I2.A02;
        if (str != null) {
            mMp.A0d("source_id", str);
        }
        Number number = (Number) ktCSuperShape0S2100000_I2.A00;
        if (number != null) {
            mMp.A0c("media_id", number.longValue());
        }
        String str2 = ktCSuperShape0S2100000_I2.A01;
        if (str2 != null) {
            mMp.A0d("reel_type", str2);
        }
        mMp.A0G();
    }
}
